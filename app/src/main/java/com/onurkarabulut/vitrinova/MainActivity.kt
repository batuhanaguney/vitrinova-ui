package com.onurkarabulut.vitrinova

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.onurkarabulut.vitrinova.View.DiscoverFragment
import com.onurkarabulut.vitrinova.View.NotificationsFragment
import com.onurkarabulut.vitrinova.View.ProductsFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var navController : NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navHost = supportFragmentManager.findFragmentById(R.id.navHostFrag) as NavHostFragment
        navController = navHost.findNavController()
        bottomNav.setupWithNavController(navController)


    }




}