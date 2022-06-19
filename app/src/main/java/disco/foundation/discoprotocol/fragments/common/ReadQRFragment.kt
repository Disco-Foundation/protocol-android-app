package disco.foundation.discoprotocol.fragments.common

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import disco.foundation.discoprotocol.R
import disco.foundation.discoprotocol.api.RequestStatus
import disco.foundation.discoprotocol.components.CustomDialog
import disco.foundation.discoprotocol.data.ProtoDataStoreManager
import disco.foundation.discoprotocol.databinding.ReadQRFragmentBinding
import disco.foundation.discoprotocol.fragments.recharge.EnterBalanceFragmentDirections
import disco.foundation.discoprotocol.utils.setIndeterminateTintCompat
import disco.foundation.discoprotocol.viewModels.ReadQrViewModel

class ReadQrFragment : BaseFragment() {

    private val args: ReadQrFragmentArgs by navArgs()

    private lateinit var binding: ReadQRFragmentBinding
    private lateinit var viewModel: ReadQrViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate fragment view
        binding = ReadQRFragmentBinding.inflate(layoutInflater, container,false)
        return binding.root 
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(
            this,
            ReadQrViewModel.FACTORY(ProtoDataStoreManager(requireContext()))
        )[ReadQrViewModel::class.java]
        viewModel.module = args.module
        setupViewContent()
    }

    override fun onResume() {
        super.onResume()
        viewModel.startTransaction()
    }

    private fun setupViewContent(){
        binding.customToolbar.setupToolbar(viewModel.module.color, getString(viewModel.module.title))
        binding.qrTextBox.setupTextBoxView(getString(viewModel.getTextBoxResource()),viewModel.module.color)
        binding.transactionProgressBar.setIndeterminateTintCompat(ContextCompat.getColor(requireContext(), viewModel.module.color))
        //setupButton()
        subscribeToEventData()
    }

    private fun setupQRCode(code: String){
        val bitmap = viewModel.generateQRCode(code,ContextCompat.getColor(requireContext(),R.color.white))
        binding.qrImageView.setImageBitmap(bitmap)
    }

    /*private fun setupButton(){
        binding.finalizeBtn.color = viewModel.module.color
        binding.finalizeBtn.setupAnimation { activity?.finish() }
    }*/

    private fun subscribeToEventData(){
        viewModel.link.observe(viewLifecycleOwner) {
            setupQRCode(it)
        }

        viewModel.waitingStatus.observe(viewLifecycleOwner){
            when (it) {
                RequestStatus.ERROR -> {
                    hideTransactionLoading()
                    dialog.update(
                        getString(R.string.something_went_wrong),
                        viewModel.module.color,
                        true,
                        getString(R.string.ok)
                    ) {
                        findNavController().navigate(ReadQrFragmentDirections
                            .actionReadQrFragmentToNext(viewModel.module))
                    }
                }
                RequestStatus.SUCCESS -> {
                    hideTransactionLoading()
                    dialog.update(
                        getString(viewModel.getSuccessText()),
                        viewModel.module.color,
                        true,
                        getString(R.string.ok)
                    ) {
                        findNavController().navigate(ReadQrFragmentDirections
                                .actionReadQrFragmentToNext(viewModel.module))
                    }
                }
                else -> { }
            }
        }

        viewModel.rechargeText.observe(viewLifecycleOwner){
            if(it != null){
                binding.rechargeText.visibility = View.VISIBLE
                binding.rechargeText.text = it
            }
        }
    }


    private fun hideTransactionLoading(){

        binding.transactionProgressBar.visibility = GONE
        binding.transactionProgressText.visibility = GONE
    }

}
