package com.example.cinema

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import com.example.cinema.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        supportFragmentManager.beginTransaction().replace(R.id.content, nameApplication()).commit()

        setSupportActionBar(binding?.topAppBar)

        binding?.bottomNavigation?.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.homeButton -> supportFragmentManager.beginTransaction().replace(R.id.content, nameApplication()).commit()
                R.id.backIcon -> supportFragmentManager.beginTransaction().replace(R.id.content, nameApplication()).commit()
            }
            return@setOnItemSelectedListener true
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home ->{
                val mainMenu = MainMenu()
                mainMenu.show(
                    supportFragmentManager,
                    "main_menu"
                )
            }
        }
        return true

    }

    override fun onClick(view: View) {


    }
}