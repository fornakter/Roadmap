package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Synch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.synch)

        val synchButtonOk = findViewById<Button>(R.id.synchButtOk)

        synchButtonOk.setOnClickListener {
            // Change screen to #1
            val changeView = Intent(this, Framework::class.java)
            startActivity(changeView)
        }
    }
}