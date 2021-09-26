package com.example.buttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var positiveButton: Button
    lateinit var negativeButton: Button
    lateinit var counterTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        positiveButton = findViewById(R.id.buttonP)
        negativeButton = findViewById(R.id.buttonN)
        counterTextView = findViewById(R.id.counter)
        positiveButton.setOnClickListener { increase() }
        negativeButton.setOnClickListener { decrease() }
    }

    fun increase() {
        var tempCounter = (counterTextView.text.toString().toInt()) + 1
        counterTextView.setText("$tempCounter")
    }
    fun decrease() {
        var tempCounter = (counterTextView.text.toString().toInt()) - 1
        counterTextView.setText("$tempCounter")
    }

}