package com.example.myapplication1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class Data : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.data)
        val sharedPreferences = getSharedPreferences("app_preferences", Context.MODE_PRIVATE)

        // Load checkbox status at start
        val checkbox1Value = sharedPreferences.getBoolean("databox1", false)
        val checkbox2Value = sharedPreferences.getBoolean("databox2", false)
        val checkbox3Value = sharedPreferences.getBoolean("databox3", false)
        val checkbox4Value = sharedPreferences.getBoolean("databox4", false)
        val checkbox5Value = sharedPreferences.getBoolean("databox5", false)
        val checkbox6Value = sharedPreferences.getBoolean("databox6", false)

        // List of boxes
        val databox1 = findViewById<CheckBox>(R.id.dataBox1)
        val databox2 = findViewById<CheckBox>(R.id.dataBox2)
        val databox3 = findViewById<CheckBox>(R.id.dataBox3)
        val databox4 = findViewById<CheckBox>(R.id.dataBox4)
        val databox5 = findViewById<CheckBox>(R.id.dataBox5)
        val databox6 = findViewById<CheckBox>(R.id.dataBox6)

        // Set checkbox status
        databox1.isChecked = checkbox1Value
        databox2.isChecked = checkbox2Value
        databox3.isChecked = checkbox3Value
        databox4.isChecked = checkbox4Value
        databox5.isChecked = checkbox5Value
        databox6.isChecked = checkbox6Value

        // Back to main screen button
        val dataButton = findViewById<Button>(R.id.button)
        dataButton.setOnClickListener {
            // Change screen to #1
            val changeView = Intent(this, MainActivity::class.java)
            startActivity(changeView)

            // save checkBox status
            val editor = sharedPreferences.edit()
            editor.putBoolean("databox1", databox1.isChecked)
            editor.putBoolean("databox2", databox2.isChecked)
            editor.putBoolean("databox3", databox3.isChecked)
            editor.putBoolean("databox4", databox4.isChecked)
            editor.putBoolean("databox5", databox5.isChecked)
            editor.putBoolean("databox6", databox6.isChecked)
            editor.apply()
        }
    }
}