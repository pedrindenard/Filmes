package com.app.filme.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.app.filme.R
import com.app.filme.ui.main.MainActivity
import kotlinx.android.synthetic.main.activity_splash.*

@Suppress("DEPRECATION")
class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val maxSplashTime: Long = 5000
        var progressSplash: Long = 0
        val percentResult = maxSplashTime / 101

        for (x in 0..100) {
            Handler().postDelayed({
                progressSplashBar.progress = x
            }, progressSplash)
            progressSplash += percentResult
        }

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, maxSplashTime)
    }
}

