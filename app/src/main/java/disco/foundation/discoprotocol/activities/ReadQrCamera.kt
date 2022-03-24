package disco.foundation.discoprotocol.activities

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Size
import android.view.LayoutInflater
import android.view.WindowInsets
import android.view.WindowManager
import androidx.camera.core.CameraSelector
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.Preview
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider
import disco.foundation.discoprotocol.R
import disco.foundation.discoprotocol.databinding.ActivityReadQrCameraBinding
import disco.foundation.discoprotocol.utils.CAMERA_PERMISSION_CODE
import disco.foundation.discoprotocol.utils.ImageAnalyzer
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import com.google.common.util.concurrent.ListenableFuture
import disco.foundation.discoprotocol.api.RequestStatus
import disco.foundation.discoprotocol.components.CustomPopup
import disco.foundation.discoprotocol.data.ProtoDataStoreManager
import disco.foundation.discoprotocol.viewModels.ReadQRCameraViewModel

class ReadQrCamera : AppCompatActivity() {

    private lateinit var cameraProviderFuture: ListenableFuture<ProcessCameraProvider>
    private lateinit var cameraExecutor: ExecutorService
    private lateinit var analyzer: ImageAnalyzer
    private lateinit var binding: ActivityReadQrCameraBinding
    private lateinit var viewModel: ReadQRCameraViewModel
    private lateinit var progressDialog : CustomPopup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReadQrCameraBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            @Suppress("DEPRECATION")
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }
        viewModel = ViewModelProvider(
            this,
            ReadQRCameraViewModel.FACTORY(ProtoDataStoreManager(this))
        )[ReadQRCameraViewModel::class.java]

        progressDialog = CustomPopup(this)
        askPermission()
        subscribeToData()
    }

    private fun askPermission() {
        if(ContextCompat.checkSelfPermission(applicationContext,android.Manifest.permission.CAMERA) !=
            PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,
                arrayOf(android.Manifest.permission.CAMERA),
                CAMERA_PERMISSION_CODE)
        } else {
            startCamera()
        }
    }

    private fun startCamera() {
        analyzer = ImageAnalyzer()
        analyzer.onReadBarCode = ::onReadCodeAction
        cameraExecutor = Executors.newSingleThreadExecutor()
        cameraProviderFuture = ProcessCameraProvider.getInstance(this)

        cameraProviderFuture.addListener({
            val cameraProvider = cameraProviderFuture.get()
            bindPreview(cameraProvider)
        }, ContextCompat.getMainExecutor(this))
    }


    override fun onRequestPermissionsResult(requestCode: Int,
                                            permissions: Array<String>,
                                            grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            startCamera()
        } else {
            askPermission()
        }
    }

    @SuppressLint("UnsafeExperimentalUsageError")
    private fun bindPreview(cameraProvider: ProcessCameraProvider) {
        val preview: Preview = Preview.Builder()
            .build()
        val cameraSelector: CameraSelector = CameraSelector.Builder()
            .requireLensFacing(CameraSelector.LENS_FACING_BACK)
            .build()
        preview.setSurfaceProvider(binding.previewView.surfaceProvider)

        val imageAnalysis = ImageAnalysis.Builder()
            .setTargetResolution(Size(1280, 720))
            .setBackpressureStrategy(ImageAnalysis.STRATEGY_KEEP_ONLY_LATEST)
            .build()
        imageAnalysis.setAnalyzer(cameraExecutor, analyzer)

        cameraProvider.bindToLifecycle(
            this as LifecycleOwner,
            cameraSelector,
            imageAnalysis,
            preview
        )
    }

    private fun onReadCodeAction(value: String){
        viewModel.setupEvent(value)
    }

    private fun subscribeToData(){
        viewModel.loading.observe(this){
            when (it){
                RequestStatus.LOADING -> {
                    progressDialog.showPopup(
                        getString(R.string.loading),
                        R.color.neon_blue,
                        false)
                }
                RequestStatus.ERROR -> {
                    progressDialog.updatePopup(getString(R.string.invalid_event),
                    true,
                    getString(R.string.try_again)){
                        progressDialog.dismiss()
                    }
                }
                else -> {
                    progressDialog.updatePopup(getString(R.string.event_setup_successful),
                        true,
                        getString(R.string.ok)){
                        progressDialog.dismiss()
                        finish()
                    }
                }
            }
        }
    }
}