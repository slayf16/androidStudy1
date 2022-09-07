package com.example.cinema

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.cinema.databinding.ActivityContentBinding


class contentActivity : AppCompatActivity(), View.OnClickListener {

    private var binding: ActivityContentBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContentBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        var stringId = intent.getIntExtra("key", 0)


        when (stringId) {
            0 -> {
                binding?.imageContent?.setImageResource(R.drawable.avengers)
            }
        }
    }

    override fun onClick(view: View) {

        val contentFragmentActvitynt = contentFragmentActvity()

        val parameters = Bundle()

        parameters.putString("nameMovie", binding?.nameMovie?.text?.toString())
        parameters.putString("longMovie", binding?.longMovie?.text?.toString())
        parameters.putString("actorsMovie", binding?.producerMovie?.text?.toString())

        contentFragmentActvitynt.arguments = parameters

        contentFragmentActvitynt.show(supportFragmentManager, "contentFragmentActvitynt")


    }
}