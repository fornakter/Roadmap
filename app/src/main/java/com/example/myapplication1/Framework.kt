package com.example.myapplication1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class Framework : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.framework)

        val sharedPreferences = getSharedPreferences("app_preferences", Context.MODE_PRIVATE)

        val checkbox1Value = sharedPreferences.getBoolean("framebox1", false)

        val frameButtonOk = findViewById<Button>(R.id.frameButtOk)
        val synchButton = findViewById<Button>(R.id.synchButtGo)
        val asynchButton = findViewById<Button>(R.id.asynchButtGo)
        val frameBox = findViewById<CheckBox>(R.id.frameBox)

        frameBox.isChecked = checkbox1Value

        // Back to main screen button
        frameButtonOk.setOnClickListener {
            // Change screen to #1
            val changeView = Intent(this, MainActivity::class.java)
            startActivity(changeView)
            // Save checkbox
            val editor = sharedPreferences.edit()
            editor.putBoolean("framebox1", frameBox.isChecked)
            editor.apply()
        }
        synchButton.setOnClickListener {
            // Change to synch screen
            val changeView = Intent(this, Synch::class.java)
            startActivity(changeView)

            val editor = sharedPreferences.edit()
            editor.putBoolean("framebox1", frameBox.isChecked)
            editor.apply()
        }
        asynchButton.setOnClickListener {
            // Change to asynch screen
            val changeView = Intent(this, Asynch::class.java)
            startActivity(changeView)

            val editor = sharedPreferences.edit()
            editor.putBoolean("framebox1", frameBox.isChecked)
            editor.apply()
        }

    }
}