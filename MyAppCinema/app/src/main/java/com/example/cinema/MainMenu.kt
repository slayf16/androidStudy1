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
        binding = MainMenuBinding.inflate(inflater,container,false)
        binding?.menuDialog?.setNavigationItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.Avengers -> {
                    val startHome = Intent(context, contentActivity::class.java)
                    startHome.putExtra("key", 0)
                    startActivity(startHome)

                }
                R.id.Millers -> {

                }
                R.id.StarWars -> {

                }
                R.id.Ted -> {

                }
                R.id.Supernatural -> {

                }
                R.id.WhiteCollars -> {

                }
                R.id.GameOfThrone -> {

                }
                R.id.Chernobyl -> {

                }
            }
            true
        }
        return binding?.root

        // Inflate the layout for this fragment
/*
        return inflater.inflate(R.layout.main_menu, container, false)
*/
    }

}