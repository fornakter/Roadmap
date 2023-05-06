package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Asynch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.asynch)
        val asynchButtOk = findViewById<Button>(R.id.asynchButtOk)

        asynchButtOk.setOnClickListener {
            // Change screen to #1
            val changeView = Intent(this, Framework::class.java)
            startActivity(changeView)
        }
    }
}