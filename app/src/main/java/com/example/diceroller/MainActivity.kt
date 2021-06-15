package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val diceButton: Button = findViewById(R.id.MainActivity_button)

        diceButton.setOnClickListener { rollTheDice() }

    }

    private fun rollTheDice() {
        val diceObj = Dice(6)
        val ans = diceObj.roll()
        val resultOfDice: ImageView = findViewById(R.id.MainActivity_imageView)
        when (ans){
            1-> resultOfDice.setImageResource(R.drawable.dice_1)
            2->resultOfDice.setImageResource(R.drawable.dice_2)
            3->resultOfDice.setImageResource(R.drawable.dice_3)
            4->resultOfDice.setImageResource(R.drawable.dice_4)
            5->resultOfDice.setImageResource(R.drawable.dice_5)
            6->resultOfDice.setImageResource(R.drawable.dice_6)
        }
    }

    class Dice(private val slidesNumber: Int) {
        fun roll(): Int {
            return (1..slidesNumber).random()
        }
    }
}
