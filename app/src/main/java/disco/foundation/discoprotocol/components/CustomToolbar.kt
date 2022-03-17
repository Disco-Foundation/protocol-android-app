package disco.foundation.discoprotocol.components

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.navigation.findNavController
import disco.foundation.discoprotocol.R
import disco.foundation.discoprotocol.databinding.SampleCustomToolbarBinding
import disco.foundation.discoprotocol.utils.setCartIcon
import disco.foundation.discoprotocol.utils.setColorResources

@SuppressLint("ResourceAsColor")
class CustomToolbar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : Toolbar(context, attrs, defStyleAttr) {

    private var _toolbarTitle: String = ""
    private var _toolbarColor: Int = R.color.white
    private var _showRightIcon: Boolean = false
    private var binding: SampleCustomToolbarBinding =
        SampleCustomToolbarBinding.inflate(LayoutInflater.from(context), this, true)

    private var toolbarTitle: String
        get() = _toolbarTitle
        set(value) {
            _toolbarTitle = value
            setupTitle()
        }

    private var toolbarColor: Int
        get() = _toolbarColor
        set(value) {
            _toolbarColor = value
            setupColorViews()
        }

    private var showRightIcon: Boolean
        get() = _showRightIcon
        set(value) {
            _showRightIcon = value
            setupCart()
        }


    init {
        // Load attributes
        val a = context.obtainStyledAttributes(
            attrs, R.styleable.CustomToolbar, defStyleAttr, 0
        )

        _toolbarTitle = a.getString(
            R.styleable.CustomToolbar_toolbar_title
        ).toString()

        _toolbarColor = a.getColor(
            R.styleable.CustomToolbar_toolbar_color,
            toolbarColor
        )
        _showRightIcon = a.getBoolean(
            R.styleable.CustomToolbar_show_right_icon,
            showRightIcon
        )

        a.recycle()

        binding.toolbar.setNavigationOnClickListener { this.findNavController().popBackStack() }

    }

    private fun hideCart(){
        binding.cartContainer.visibility = GONE
    }

    private fun showCart(){
        binding.cartContainer.visibility = VISIBLE
    }

    private fun setupCart(){
        if (showRightIcon){
            showCart()
        } else {
            hideCart()
        }
    }

    private fun setupTitle(){
        binding.toolbarTitle.text = toolbarTitle
    }

    private fun setupColorViews(){
        binding.toolbar.setColorResources(toolbarColor)
        binding.toolbarTitle.setTextColor(ContextCompat.getColor(context,toolbarColor))
        binding.cartIcon.setCartIcon(toolbarColor)
    }

    fun setupToolbar(color: Int, title: String){
        toolbarColor = color
        toolbarTitle = title
    }

    fun setListener(cb: () -> Unit){
        binding.toolbar.setNavigationOnClickListener{
            cb()
        }
    }

}


