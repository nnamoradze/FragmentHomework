package com.example.fragmenthomework

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val navView = findViewById<BottomNavigationView>(R.id.bottomNavMenu)

        val controller = findNavController(R.id.navHomeFragment)

        val appBarConfig = AppBarConfiguration(
            setOf(

                R.id.firstFragment,
                R.id.secondFragment,
                R.id.thirdFragment,
                R.id.fourthFragment

            )
        )

        setupActionBarWithNavController(controller,appBarConfig)
        navView.setupWithNavController(controller)

    }
}