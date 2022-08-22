package com.iuturakulov.rndlocationinfortnite

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.iuturakulov.rndlocationinfortnite.databinding.ActivityMainBinding
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val random: Random = Random(1)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.getRandomLocation.setOnClickListener {
            val x =
                random.nextInt(
                    150, 900,
                ).toFloat()
            val y =
                random.nextInt(
                    200, 1000,
                ).toFloat()
            binding.location.x = x
            binding.location.y = y
            Log.d("MainActivity_Location", "x: $x, y: $y")
        }
    }

}