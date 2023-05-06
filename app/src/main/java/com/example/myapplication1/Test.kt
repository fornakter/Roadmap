package com.example.myapplication1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class Test : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test)

        val sharedPreferences = getSharedPreferences("app_preferences", Context.MODE_PRIVATE)

        // Load checkbox status at start
        val checkbox1Value = sharedPreferences.getBoolean("testbox1", false)
        val checkbox2Value = sharedPreferences.getBoolean("testbox2", false)
        val checkbox3Value = sharedPreferences.getBoolean("testbox3", false)
        val checkbox4Value = sharedPreferences.getBoolean("testbox4", false)

        // List of boxes
        val testbox1 = findViewById<CheckBox>(R.id.testBox1)
        val testbox2 = findViewById<CheckBox>(R.id.testBox2)
        val testbox3 = findViewById<CheckBox>(R.id.testBox3)
        val testbox4 = findViewById<CheckBox>(R.id.testBox4)

        // Set checkbox status
        testbox1.isChecked = checkbox1Value
        testbox2.isChecked = checkbox2Value
        testbox3.isChecked = checkbox3Value
        testbox4.isChecked = checkbox4Value

        // Back to main screen button
        val testButtonOk = findViewById<Button>(R.id.testButtonOk)
        testButtonOk.setOnClickListener {
            // Change screen to #1
            val changeView = Intent(this, MainActivity::class.java)
            startActivity(changeView)

            val editor = sharedPreferences.edit()
            editor.putBoolean("testbox1", testbox1.isChecked)
            editor.putBoolean("testbox2", testbox2.isChecked)
            editor.putBoolean("testbox3", testbox3.isChecked)
            editor.putBoolean("testbox4", testbox4.isChecked)
            editor.apply()
        }
    }
}