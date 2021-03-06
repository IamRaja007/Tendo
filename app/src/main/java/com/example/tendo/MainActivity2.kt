package com.example.tendo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.tendo.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    lateinit var binding:ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main2)

        supportActionBar?.hide()

        val bottomNav=binding.bottomNavView

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.fragmentContainerMain) as NavHostFragment
        val navController = navHostFragment.navController

        bottomNav.setupWithNavController(navController = navController )
    }
}