package disco.foundation.discoprotocol.utils

import android.content.res.ColorStateList
import android.graphics.LinearGradient
import android.graphics.Shader
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.RectShape
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.annotation.ColorInt
import androidx.annotation.LayoutRes
import androidx.core.content.ContextCompat
import disco.foundation.discoprotocol.R
import java.lang.Exception
import java.math.BigInteger
import java.math.RoundingMode
import java.text.DecimalFormat


fun CharSequence.isPasswordValid(pwd: String): Boolean {
    val pwdLen = this.length
    val bub = pwd.substring(0,pwdLen)
    return bub == this.toString()
}

fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
}

fun View.backgroundGradientDrawable(@ColorInt startColor: Int, @ColorInt endColor: Int) {
    val h = 30.toFloat()
    val shapeDrawable = ShapeDrawable(RectShape())
    shapeDrawable.paint.shader =
        LinearGradient(0f, 0f, 0f, h, startColor, endColor, Shader.TileMode.REPEAT)
    this.background = shapeDrawable
}

fun ProgressBar.setIndeterminateTintCompat(@ColorInt color: Int) {
    indeterminateTintList = ColorStateList.valueOf(color)
}

fun Int.getShadow(): Int{
    return when (this) {
        R.color.neon_blue -> R.color.shadow_blue
        R.color.neon_purple -> R.color.shadow_purple
        R.color.neon_green -> R.color.shadow_green
        R.color.neon_pink -> R.color.shadow_pink
        else -> {
            this
        }
    }
}

fun View.setShadowBackground(color: Int) {
    when (color) {
        R.color.neon_blue -> this.setBackgroundResource(R.drawable.blue_shadow_cell)
        R.color.neon_green -> this.setBackgroundResource(R.drawable.green_shadow_cell)
        R.color.neon_pink -> this.setBackgroundResource(R.drawable.pink_shadow_cell)
        R.color.neon_purple -> this.setBackgroundResource(R.drawable.purple_shadow_cell)
    }
}

fun Int.isColorResource(view: View): Boolean {
    return try {
        ContextCompat.getColor(view.context, this)
        true
    } catch (e: Exception) {
        false
    }
}

fun ImageView.setCartIcon(color: Int){
    when (color) {
        R.color.neon_green -> this.setBackgroundResource(R.drawable.green_cart)
        R.color.neon_pink -> this.setBackgroundResource(R.drawable.pink_cart)
    }
}

fun ImageView.setNFCIcon(color: Int){
    when (color) {
        R.color.neon_blue -> this.setBackgroundResource(R.drawable.blue_nfc)
        R.color.neon_green -> this.setBackgroundResource(R.drawable.green_nfc)
        R.color.neon_pink -> this.setBackgroundResource(R.drawable.pink_nfc)
        R.color.neon_purple -> this.setBackgroundResource(R.drawable.purple_nfc)
    }
}

enum class ModuleType {
    CHECK_IN{
        override val color = R.color.neon_blue
        override val title  = R.string.check_in
            },
    RECHARGE {
        override val color = R.color.neon_green
        override val title = R.string.recharge
             },
    PURCHASE{
        override val color = R.color.neon_pink
        override val title = R.string.purchase
            },
    VIEW_INFO {
        override val color = R.color.neon_purple
        override val title = R.string.view_info
    };

    open val color = R.color.white
    open val title = R.string.check_in

}
fun androidx.appcompat.widget.Toolbar.setColorResources(toolbarColor: Int) {
    when(toolbarColor){
        R.color.neon_blue -> {
            this.setBackgroundResource(R.drawable.blue_toolbar_line)
            this.setNavigationIcon(R.drawable.blue_back)
        }
        R.color.neon_green -> {
            this.setBackgroundResource(R.drawable.green_toolbar_line)
            this.setNavigationIcon(R.drawable.green_back)
        }
        R.color.neon_pink -> {
            this.setBackgroundResource(R.drawable.pink_toolbar_line)
            this.setNavigationIcon(R.drawable.pink_back)
        }
        R.color.neon_purple -> {
            this.setBackgroundResource(R.drawable.purple_toolbar_line)
            this.setNavigationIcon(R.drawable.purple_back)
        }
    }
}

fun Double.twoDecimalDouble(): Double {
    val df = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.CEILING
    return df.format(this).toDouble()
}

fun String.toBigIntegerString(): String {
    val bi = BigInteger(this,16)
    return bi.toString()
}