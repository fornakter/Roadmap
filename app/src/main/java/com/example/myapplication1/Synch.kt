package com.example.myapplication1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class Synch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.synch)

        val sharedPreferences = getSharedPreferences("app_preferences", Context.MODE_PRIVATE)

        // Load checkbox status at start
        val checkbox1Value = sharedPreferences.getBoolean("synchbox1", false)
        val checkbox2Value = sharedPreferences.getBoolean("synchbox2", false)
        val checkbox3Value = sharedPreferences.getBoolean("synchbox3", false)

        // List of boxes
        val synchbox1 = findViewById<CheckBox>(R.id.synchBox1)
        val synchbox2 = findViewById<CheckBox>(R.id.synchBox2)
        val synchbox3 = findViewById<CheckBox>(R.id.synchBox3)

        // Set checkbox status
        synchbox1.isChecked = checkbox1Value
        synchbox2.isChecked = checkbox2Value
        synchbox3.isChecked = checkbox3Value

        val synchButtonOk = findViewById<Button>(R.id.synchButtOk)

        synchButtonOk.setOnClickListener {
            // Change screen to Framework
            val changeView = Intent(this, Framework::class.java)
            startActivity(changeView)

            // save checkBox status
            val editor = sharedPreferences.edit()
            editor.putBoolean("synchbox1", synchbox1.isChecked)
            editor.putBoolean("synchbox2", synchbox2.isChecked)
            editor.putBoolean("synchbox3", synchbox3.isChecked)
            editor.apply()
        }
    }
}