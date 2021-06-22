package com.mad.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll : Button = findViewById(R.id.roll_button)

        btnRoll.setOnClickListener(){
            rollDice()
        }

    }

    private fun rollDice(){
        var randomInt = (1..6).random()
        var tvResult : TextView = findViewById(R.id.result_text)
        tvResult.text = randomInt.toString()
        //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
    }
}