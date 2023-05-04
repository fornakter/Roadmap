package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class LearnBasics : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.learn_basics)
        // Back to main screen button
        val learn_button = findViewById<Button>(R.id.bLearnOk)
        learn_button.setOnClickListener {
            val change_view = Intent(this, MainActivity::class.java)
            startActivity(change_view)
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("wartosc", 3)
            startActivity(intent)
        val boxLearn1 = findViewById<CheckBox>(R.id.learnBox1)
        }


    }

}


