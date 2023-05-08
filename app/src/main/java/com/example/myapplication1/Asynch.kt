package com.example.myapplication1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class Asynch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.asynch)
        val asynchButtOk = findViewById<Button>(R.id.asynchButtOk)

        val sharedPreferences = getSharedPreferences("app_preferences", Context.MODE_PRIVATE)

        // Load checkbox status at start
        val checkbox1Value = sharedPreferences.getBoolean("asynchbox1", false)
        val checkbox2Value = sharedPreferences.getBoolean("asynchbox2", false)
        val checkbox3Value = sharedPreferences.getBoolean("asynchbox3", false)
        val checkbox4Value = sharedPreferences.getBoolean("asynchbox4", false)

        // List of boxes
        val asynchbox1 = findViewById<CheckBox>(R.id.asynchBox1)
        val asynchbox2 = findViewById<CheckBox>(R.id.asynchBox2)
        val asynchbox3 = findViewById<CheckBox>(R.id.asynchBox3)
        val asynchbox4 = findViewById<CheckBox>(R.id.asynchBox4)

        // Set checkbox status
        asynchbox1.isChecked = checkbox1Value
        asynchbox2.isChecked = checkbox2Value
        asynchbox3.isChecked = checkbox3Value
        asynchbox4.isChecked = checkbox4Value

        asynchButtOk.setOnClickListener {
            // Change screen to Adv
            val changeView = Intent(this, Framework::class.java)
            startActivity(changeView)

            // save checkBox status
            val editor = sharedPreferences.edit()
            editor.putBoolean("asynchbox1", asynchbox1.isChecked)
            editor.putBoolean("asynchbox2", asynchbox2.isChecked)
            editor.putBoolean("asynchbox3", asynchbox3.isChecked)
            editor.putBoolean("asynchbox4", asynchbox4.isChecked)
            editor.apply()
        }
    }
}