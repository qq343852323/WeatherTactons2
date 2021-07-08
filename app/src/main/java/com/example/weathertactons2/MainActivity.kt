package com.example.weathertactons2

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.Toast
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        setContentView(R.layout.instruction_fragment)
//
//        Handler(Looper.getMainLooper()).postDelayed(
//            {setContentView(R.layout.estimation_fragment)},1000
//        )

        val host: NavHostFragment = supportFragmentManager
            .findFragmentById(R.id.my_nav_host_fragment) as NavHostFragment? ?: return

        val navController = host.navController

//        navController.addOnDestinationChangedListener { _, destination, _ ->
//            val dest: String = try {
//                resources.getResourceName(destination.id)
//            } catch (e: Resources.NotFoundException) {
//                Integer.toString(destination.id)
//            }
//
//            Toast.makeText(this@MainActivity, "Navigated to $dest",
//                Toast.LENGTH_SHORT).show()
//            Log.d("NavigationActivity", "Navigated to $dest")
//        }
    }
}