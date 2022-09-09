package com.example.cinema

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.cinema.databinding.ActivityContentBinding


class contentActivity : AppCompatActivity(), View.OnClickListener {

    // переменная для обращения с виджетами как с элементами вью
    private var binding: ActivityContentBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityContentBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        var stringId = intent.getIntExtra("key", 0)

        binding?.buttonMovieInformation?.setOnClickListener(this)
        binding?.closeActivity?.setOnClickListener(this)

        when (stringId) {
            0 -> {
                binding?.imageContent?.setImageResource(R.drawable.avengers)
                binding?.longMovie?.text = this.getText(R.string.longMovies)
                binding?.nameMovie?.text = this.getText(R.string.Avengers)
                binding?.producerMovie?.text = this.getText(R.string.producerAvengers)
            }
            1 -> {
                binding?.imageContent?.setImageResource(R.drawable.millers)
                binding?.longMovie?.text = this.getText(R.string.longMovies)
                binding?.nameMovie?.text = this.getText(R.string.Millers)
                binding?.producerMovie?.text = this.getText(R.string.producerMillers)
            }
            2 -> {
                binding?.imageContent?.setImageResource(R.drawable.star_wars)
                binding?.longMovie?.text = this.getText(R.string.longMovies)
                binding?.nameMovie?.text = this.getText(R.string.StarWars)
                binding?.producerMovie?.text = this.getText(R.string.producerStarWars)
            }
            3 -> {
                binding?.imageContent?.setImageResource(R.drawable.ted)
                binding?.longMovie?.text = this.getText(R.string.longMovies)
                binding?.nameMovie?.text = this.getText(R.string.Ted)
                binding?.producerMovie?.text = this.getText(R.string.producerTed)
            }
            4 -> {
                binding?.imageContent?.setImageResource(R.drawable.supernatural)
                binding?.longMovie?.text = this.getText(R.string.longMovies)
                binding?.nameMovie?.text = this.getText(R.string.Supernatural)
                binding?.producerMovie?.text = this.getText(R.string.producerSupernatural)
            }
            5 -> {
                binding?.imageContent?.setImageResource(R.drawable.white_collars)
                binding?.longMovie?.text = this.getText(R.string.longMovies)
                binding?.nameMovie?.text = this.getText(R.string.WhiteCollars)
                binding?.producerMovie?.text = this.getText(R.string.producerWhiteCollars)
            }
            6 -> {
                binding?.imageContent?.setImageResource(R.drawable.game_of_throne)
                binding?.longMovie?.text = this.getText(R.string.longMovies)
                binding?.nameMovie?.text = this.getText(R.string.GameOfThrone)
                binding?.producerMovie?.text = this.getText(R.string.producerGameOfThrone)
            }
            7 -> {
                binding?.imageContent?.setImageResource(R.drawable.chernobyl)
                binding?.longMovie?.text = this.getText(R.string.longMovies)
                binding?.nameMovie?.text = this.getText(R.string.Chernobyl)
                binding?.producerMovie?.text = this.getText(R.string.producerChernobyl)
            }
        }
    }

    override fun onClick(view: View) {
        // переменная экземпляр класса contentFragmentActvity для отображения информации
        ///в нижнем всплывающем окошке
        val contentFragmentActvitynt = contentFragmentActvity()

        // переменна для упаковки параметров которые нужно передать
        val parameters = Bundle()
        when(view.id){
            R.id.buttonMovieInformation -> {


                parameters.putString("nameMovie", binding?.nameMovie?.text?.toString())
                parameters.putString("longMovie", binding?.longMovie?.text?.toString())
                parameters.putString("actorsMovie", binding?.producerMovie?.text?.toString())

                contentFragmentActvitynt.arguments = parameters

                contentFragmentActvitynt.show(supportFragmentManager, "contentFragmentActvitynt")
            }
            R.id.closeActivity -> {
                val startActivity = Intent(this, MainActivity::class.java)
                startActivity(startActivity)
            }

        }
    }
}