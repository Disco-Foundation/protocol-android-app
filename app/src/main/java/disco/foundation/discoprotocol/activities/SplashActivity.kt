package disco.foundation.discoprotocol.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import disco.foundation.discoprotocol.R

class SplashActivity : AppCompatActivity() {
    companion object {
        const val TIME_SPLASH_SCREEN = 1200L
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        exitSplashScreen()

    }

    private fun exitSplashScreen() {
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }, TIME_SPLASH_SCREEN)
    }
}