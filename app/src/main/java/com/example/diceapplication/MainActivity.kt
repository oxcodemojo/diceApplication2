package com.example.diceapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.diceapplication.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        var diceImage = binding.diceImageIV
        var rollDice = binding.rollDiceButton
        rollDice.text = "Lets roll"

        fun rollDice() {
            val randomNumber = Random.nextInt(6) + 1

            if (randomNumber == 6) {
                Toast.makeText(this, "empty", Toast.LENGTH_SHORT).show()
            } else Toast.makeText(this, "you scored $randomNumber!", Toast.LENGTH_SHORT).show()


            var drawableResource = when (randomNumber) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.empty_dice

            }
            diceImage.setImageResource(drawableResource)
        }

        rollDice.setOnClickListener {
            rollDice()
        }


    }
}