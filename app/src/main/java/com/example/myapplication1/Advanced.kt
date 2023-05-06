package com.example.myapplication1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class Advanced : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.advanced)
        // 'handle' for save checkbox
        val sharedPreferences = getSharedPreferences("app_preferences", Context.MODE_PRIVATE)

        // Load checkbox status at start
        val checkbox1Value = sharedPreferences.getBoolean("advbox1", false)
        val checkbox2Value = sharedPreferences.getBoolean("advbox2", false)
        val checkbox3Value = sharedPreferences.getBoolean("advbox3", false)
        val checkbox4Value = sharedPreferences.getBoolean("advbox4", false)

        // List of boxes
        val advbox1 = findViewById<CheckBox>(R.id.advBox1)
        val advbox2 = findViewById<CheckBox>(R.id.advBox2)
        val advbox3 = findViewById<CheckBox>(R.id.advBox3)
        val advbox4 = findViewById<CheckBox>(R.id.advBox4)


        // Set checkbox status
        advbox1.isChecked = checkbox1Value
        advbox2.isChecked = checkbox2Value
        advbox3.isChecked = checkbox3Value
        advbox4.isChecked = checkbox4Value


        val learnButton = findViewById<Button>(R.id.advButtOK)
        learnButton.setOnClickListener {
            // Change screen to #1
            val changeView = Intent(this, MainActivity::class.java)
            startActivity(changeView)

            // save checkBox status
            val editor = sharedPreferences.edit()
            editor.putBoolean("advbox1", advbox1.isChecked)
            editor.putBoolean("advbox2", advbox2.isChecked)
            editor.putBoolean("advbox3", advbox3.isChecked)
            editor.putBoolean("advbox4", advbox4.isChecked)

            editor.apply()
        }
    }
}