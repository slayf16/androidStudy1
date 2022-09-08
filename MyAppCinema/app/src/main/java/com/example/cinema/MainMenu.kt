package com.example.cinema

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cinema.databinding.MainMenuBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class MainMenu : BottomSheetDialogFragment() {
    private var binding: MainMenuBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val startActivity = Intent(context, contentActivity::class.java)
        binding = MainMenuBinding.inflate(inflater,container,false)
        binding?.menuDialog?.setNavigationItemSelectedListener { menuItem ->

            when(menuItem.itemId){
                R.id.Avengers -> {
                    startActivity.putExtra("key", 0)
                }
                R.id.Millers -> {
                    startActivity.putExtra("key", 1)
                }
                R.id.StarWars -> {
                    startActivity.putExtra("key", 2)
                }
                R.id.Ted -> {
                    startActivity.putExtra("key", 3)
                }
                R.id.Supernatural -> {
                    startActivity.putExtra("key", 4)
                }
                R.id.WhiteCollars -> {
                    startActivity.putExtra("key", 5)
                }
                R.id.GameOfThrone -> {
                    startActivity.putExtra("key", 6)
                }
                R.id.Chernobyl -> {
                    startActivity.putExtra("key", 7)
                }
            }
            startActivity(startActivity)
            true
        }
        return binding?.root

        // Inflate the layout for this fragment
/*
        return inflater.inflate(R.layout.main_menu, container, false)
*/
    }

}