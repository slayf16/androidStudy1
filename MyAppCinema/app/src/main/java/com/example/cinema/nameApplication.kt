package com.example.cinema

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cinema.databinding.ActivityMainBinding
import com.example.cinema.databinding.FragmentNameApplicationBinding

class nameApplication : Fragment() {

    private var binding: FragmentNameApplicationBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_name_application, container, false)
    }
}