package com.example.cinema

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.cinema.databinding.ActivityContentBinding


class contentActivity : AppCompatActivity() {

    private var binding: ActivityContentBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContentBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        var stringId = intent.getIntExtra("key", 0)

        var imageView: ImageView? = findViewById(R.id.imageContent)

        when(stringId){
            0 -> {
                imageView?.setImageResource(R.drawable.avengers)
            }
        }


    }
}