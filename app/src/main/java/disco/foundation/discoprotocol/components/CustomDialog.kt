package disco.foundation.discoprotocol.components

import android.app.Dialog
import android.content.Context
import android.graphics.*
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.Window
import androidx.core.content.ContextCompat
import disco.foundation.discoprotocol.databinding.SampleCustomDialogBinding
import disco.foundation.discoprotocol.utils.setIndeterminateTintCompat


class CustomDialog @JvmOverloads constructor(context: Context) : Dialog(context) {

    private var binding = SampleCustomDialogBinding.inflate(LayoutInflater.from(context))

    init {
        setCancelable(false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(binding.root)
        this.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    }

    fun update(message: String, color: Int, showButton: Boolean, buttonText: String? = null, action: (() -> Unit)? = null){

        binding.message.text = message
        print(message)
        if (showButton && action != null) {
            binding.popupBtn.text = buttonText
            binding.popupBtn.setOnClickListener { action() }
            binding.popupBtn.setTextColor(ContextCompat.getColor(context, color))
            showButton()
        } else {
            val desiredColor = ContextCompat.getColor(context, color)
            binding.progressBar.setIndeterminateTintCompat(desiredColor)
            showProgressBar()
        }

        if(!isShowing) { super.show() }
    }

    private fun showButton(){
        binding.progressBar.visibility = View.GONE
        binding.popupBtn.visibility = View.VISIBLE
    }

    private fun showProgressBar(){
        binding.progressBar.visibility = View.VISIBLE
        binding.popupBtn.visibility = View.GONE
    }

}