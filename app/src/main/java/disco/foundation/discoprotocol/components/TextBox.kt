package disco.foundation.discoprotocol.components

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import disco.foundation.discoprotocol.R
import disco.foundation.discoprotocol.utils.backgroundGradientDrawable
import disco.foundation.discoprotocol.utils.getShadow
import kotlinx.android.synthetic.main.sample_text_box.view.*

@SuppressLint("ResourceAsColor", "CustomViewStyleable")
class TextBox @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyle, defStyleRes) {

    private var _contentText: String = ""
    private var _color: Int = R.color.neon_blue

    var color: Int
        get() = _color
        set(value) {
            _color = value
            setupGradients()
        }

    private var contentText: String
        get() = _contentText
        set(value) {
            _contentText = value
            setupText()
        }

    init {
        LayoutInflater.from(context).inflate(R.layout.sample_text_box, this, true)

        // Load attributes
        val a = context.obtainStyledAttributes(
            attrs, R.styleable.PrimaryButton, defStyle, 0
        )

        contentText = a.getString(
            R.styleable.TextBox_contentText
        ).toString()

        color = a.getColor(
            R.styleable.TextBox_shadowColor,
            _color
        )

        a.recycle()
    }


    fun setupTextBoxView(text: String, newColor: Int, showSecondTex: Boolean = false, secondText: String = ""){
        color = newColor
        _contentText = text
        setupView()

        if (showSecondTex){
            setupSecondText(secondText)
        } else {
            text_box_secondary_text_view.visibility = GONE
        }
    }

    private fun setupView(){
        setupGradients()
        setupText()
    }

    @SuppressLint("ResourceType")
    private fun setupGradients(){
        top_gradient_view.backgroundGradientDrawable(Color.TRANSPARENT, ContextCompat.getColor(context,color.getShadow()))
        bottom_gradient_view.backgroundGradientDrawable(ContextCompat.getColor(context,color.getShadow()), Color.TRANSPARENT)
    }

    private fun setupText(){
        text_box_text_view.text = _contentText
    }

    private fun setupSecondText(text: String){
        text_box_secondary_text_view.visibility = VISIBLE
        text_box_secondary_text_view.text = text
    }

}