package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {
    lateinit var textResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice()
            Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
            rollButton.text = "Roll"
        }
        textResult = findViewById(R.id.text_result)
    }

    private fun rollDice() {
        textResult.text = (Random().nextInt(6) + 1).toString()
    }

}