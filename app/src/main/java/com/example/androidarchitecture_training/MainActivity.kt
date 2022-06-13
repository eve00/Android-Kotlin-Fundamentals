package com.example.androidarchitecture_training

import android.annotation.SuppressLint
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.text.isDigitsOnly

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        /*val countUpButton: Button = findViewById(R.id.count_up_button)
        countUpButton.setOnClickListener { add() }*/

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { reset() }

    }

    private fun rollDice() {
        Toast.makeText(
            this, "roll-button clicked",
            Toast.LENGTH_SHORT
        ).show()

        val randomInt = (1..6).random()
        val diceImage : ImageView = findViewById(R.id.dice_image)
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }

    /*private fun add() {
        Toast.makeText(
            this, "count-button clicked",
            Toast.LENGTH_SHORT
        ).show()

        val diceImage: ImageView = findViewById(R.id.dice_image)


        val drawableResource = when {
            diceImage.equals(R.drawable.dice_1) -> R.drawable.dice_2
            diceImage.equals(R.drawable.dice_2) -> R.drawable.dice_3
            diceImage.equals(R.drawable.dice_3) -> R.drawable.dice_4
            diceImage.equals(R.drawable.dice_4) -> R.drawable.dice_5
            diceImage.equals(R.drawable.dice_5) -> R.drawable.dice_6
            else-> R.drawable.dice_1

        }
        diceImage.setImageResource(drawableResource)
    }*/

    private fun reset() {
        Toast.makeText(
            this, "reset-button clicked",
            Toast.LENGTH_SHORT
        ).show()

        val diceImage: ImageView = findViewById(R.id.dice_image)
        diceImage.setImageResource(R.drawable.empty_dice)
    }
}