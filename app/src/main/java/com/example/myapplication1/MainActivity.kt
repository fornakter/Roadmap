package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set value on progressbar
        val receivedIntent = intent
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        val value = receivedIntent.getIntExtra("value", 0)
        progressBar.progress = value


        // 'handle' for button'
        val learn_button = findViewById<Button>(R.id.bLearn)

        // action for button1
        learn_button.setOnClickListener {

            val change_view = Intent(this, LearnBasics::class.java)
            startActivity(change_view)

        }



    }
}