package disco.foundation.discoprotocol.components

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.drawable.Animatable2
import android.graphics.drawable.AnimatedVectorDrawable
import android.graphics.drawable.Drawable
import android.os.Build
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import disco.foundation.discoprotocol.R
import disco.foundation.discoprotocol.databinding.SampleCustomButtonBinding
import disco.foundation.discoprotocol.utils.isColorResource

@SuppressLint("ResourceAsColor", "CustomViewStyleable")
class CustomButton@JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : FrameLayout(context, attrs, defStyle) {

    private var _buttonText: String = ""
    private var _color: Int = R.color.neon_blue
    private var _backgroundVector: Int = R.drawable.animated_blue_border
    private var binding: SampleCustomButtonBinding =
        SampleCustomButtonBinding.inflate(LayoutInflater.from(context),this, true)

    var buttonText: String
        get() = _buttonText
        set(value) {
            _buttonText = value
            setText()
        }

    var color : Int
        get() = _color
        set(value) {
            _color = value
            setText()
            setBackgroundVector()
        }

    private var backgroundVector: Int
        get() = _backgroundVector
        set(value) {
            _backgroundVector = value
            setImage()
        }

    init {
        // Load attributes
        val a = context.obtainStyledAttributes(
            attrs, R.styleable.CustomButton, defStyle, 0
        )
        color = a.getColor(R.styleable.CustomButton_color, _color)
        backgroundVector = a.getResourceId(R.styleable.CustomButton_backgroundVector, _backgroundVector)

        buttonText = a.getString(
            R.styleable.CustomButton_buttonText
        ).toString()

        a.recycle()
    }

    @SuppressLint("ResourceType")
    fun setText(){
        binding.buttonTitle.text = buttonText
        if (color.isColorResource(this)){
            binding.buttonTitle.setTextColor(ContextCompat.getColor(context,color))
        } else {
            binding.buttonTitle.setTextColor(color)
        }
    }

    private fun setImage(){
        binding.buttonImageView.setBackgroundResource(_backgroundVector)
        val bg: AnimatedVectorDrawable? = (binding.buttonImageView.background as? AnimatedVectorDrawable)
        this.setOnLongClickListener{
            bg?.start()
            return@setOnLongClickListener true
        }
        this.setOnClickListener{
            bg?.start()
        }
    }

    fun setupAnimation(cb: () -> Unit){
        val bg: AnimatedVectorDrawable? = (binding.buttonImageView.background as? AnimatedVectorDrawable)
        val value: Animatable2.AnimationCallback =
        object : Animatable2.AnimationCallback() {

            override fun onAnimationStart(drawable: Drawable?) {
                super.onAnimationStart(drawable)
            }

            /** Called when the animation ends*/
            override fun onAnimationEnd(drawable: Drawable) {
                cb()
                bg?.reset()
            }
        }
        bg?.registerAnimationCallback(value)
    }

    private fun setBackgroundVector(){
        when(color){
            R.color.neon_blue -> backgroundVector = R.drawable.animated_blue_border
            R.color.neon_green -> backgroundVector = R.drawable.animated_green_border
            R.color.neon_pink -> backgroundVector = R.drawable.animated_pink_border
            R.color.neon_purple -> backgroundVector = R.drawable.animated_purple_border
        }
    }

}