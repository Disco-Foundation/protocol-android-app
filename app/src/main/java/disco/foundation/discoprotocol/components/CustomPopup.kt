package disco.foundation.discoprotocol.components

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.graphics.*
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import android.view.Window
import androidx.core.content.ContextCompat
import disco.foundation.discoprotocol.R
import disco.foundation.discoprotocol.utils.setIndeterminateTintCompat
import kotlinx.android.synthetic.main.sample_custom_popup.*


class CustomPopup(context: Context) : Dialog(context) {

    private var _messageText: String = ""
    private var _color: Int = R.color.neon_blue

    private var messageText: String
        get() = _messageText
        set(value) {
            _messageText = value
            setupMessage()
        }

    var color: Int
        get() = _color
        set(value) {
            _color = value
            setupButton()
        }

    init {
        setCancelable(false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.sample_custom_popup)
        this.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    }

    fun showPopup(message: String, colorInt: Int, showButton: Boolean, buttonText: String? = null, action: (() -> Unit)? = null){
        super.show()

        // Popup text message
        messageText = message
        // Progress Bar Color
        color = colorInt
        // Show Widget
        if (showButton){
            initButton(buttonText!!, action!!)
        } else {
            showProgressBar()
        }

    }

    fun updatePopup(message: String, showButton: Boolean, buttonText: String? = null, action: (() -> Unit)? = null){
        // Popup text message
        if(isShowing) {
            messageText = message
            // Show Widget
            if (showButton) {
                initButton(buttonText!!, action!!)
            } else {
                showProgressBar()
            }
        } else {
            showPopup(message, color,showButton,buttonText, action)
        }
    }

    private fun setupMessage(){
        message.text = _messageText
        message.setTextColor(Color.WHITE)
    }

    @SuppressLint("ResourceType")
    private fun setupButton(){
        popup_btn.setTextColor(ContextCompat.getColor(context, _color))
    }

    @SuppressLint("ResourceType")
    private fun setupProgressBar(){
        val desiredColor = ContextCompat.getColor(context, _color)
        progressBar.setIndeterminateTintCompat(desiredColor)
    }

    private fun showButton(){
        progressBar.visibility = View.GONE
        popup_btn.visibility = View.VISIBLE
    }

    private fun showProgressBar(){
        progressBar.visibility = View.VISIBLE
        popup_btn.visibility = View.GONE
        setupProgressBar()
    }

    private fun setupButtonAction(cb: () -> Unit){
        popup_btn.setOnClickListener { cb() }
    }

    private fun setupButtonText(text: String){
        popup_btn.text = text
    }

    private fun initButton(text: String, action: (() -> Unit)){
        showButton()
        setupButtonAction(action)
        setupButtonText(text)
    }


}