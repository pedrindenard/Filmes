package com.app.filme.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.app.filme.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configNavigationController()
    }

    private fun configNavigationController() {
        val navigationView: BottomNavigationView = findViewById(R.id.navigation_View)
        val navigationHostFragment = supportFragmentManager
            .findFragmentById(R.id.navigation_host_fragment) as NavHostFragment
        val navigationController = navigationHostFragment.navController

        navigationView.setupWithNavController(navigationController)
    }
}