package com.example.androidarchitecture_training

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.text.isDigitsOnly

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{ rollDice() }

        val countUpButton: Button = findViewById(R.id.count_up_button)
        countUpButton.setOnClickListener{ add() }

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener{ reset() }

    }

    private fun rollDice(){
        Toast.makeText(this, "roll-button clicked",
        Toast.LENGTH_SHORT).show()

        val randomInt = (1..6).random()

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }

    @SuppressLint("SetTextI18n")
    private fun add(){
        Toast.makeText(this, "count-button clicked",
            Toast.LENGTH_SHORT).show()

        val resultText: TextView = findViewById(R.id.result_text)

        if(resultText.text.isDigitsOnly()){
            val resultNum: Int = Integer.parseInt(resultText.text.toString())
            if(resultNum < 6)
                resultText.text = (1 + resultNum).toString()
        }else{
            resultText.text = "1"
        }
    }

    private fun reset(){
        Toast.makeText(this, "reset-button clicked",
            Toast.LENGTH_SHORT).show()

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = 0.toString()
    }
}