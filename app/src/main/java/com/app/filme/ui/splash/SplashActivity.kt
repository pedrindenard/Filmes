package com.app.filme.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.app.filme.R
import com.app.filme.ui.main.MainActivity
import kotlinx.android.synthetic.main.activity_splash.*

@Suppress("DEPRECATION")
class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var progressSplash: Long = 0
        val percentResult = 5000 / 101

        for (time in 0..100) {
            Handler().postDelayed({
                progressSplashBar.progress = time
            }, progressSplash)
            progressSplash += percentResult
        }

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 5000)
    }
}