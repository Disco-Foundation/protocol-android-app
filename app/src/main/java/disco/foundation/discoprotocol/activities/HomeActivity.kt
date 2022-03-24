package disco.foundation.discoprotocol.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import disco.foundation.discoprotocol.R

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun goToCheckIn(){
        val intent = Intent(this, CheckInActivity::class.java)
        startActivity(intent)
    }

    fun goToRecharge(){
        val intent = Intent(this, RechargeActivity::class.java)
        startActivity(intent)
    }

    fun goToPurchase(){
        val intent = Intent(this, PurchaseActivity::class.java)
        startActivity(intent)
    }

    fun goToViewInfo(){
        val intent = Intent(this, ViewInfoActivity::class.java)
        startActivity(intent)
    }

    fun goToReadQr(){
        val intent = Intent(this, ReadQrCamera::class.java)
        startActivity(intent)
    }
}