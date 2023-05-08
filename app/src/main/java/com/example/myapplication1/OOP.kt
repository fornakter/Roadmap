package com.example.myapplication1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class OOP : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.oop)

        val sharedPreferences = getSharedPreferences("app_preferences", Context.MODE_PRIVATE)

        // Load checkbox status at start
        val checkbox1Value = sharedPreferences.getBoolean("oopBox1", false)
        val checkbox2Value = sharedPreferences.getBoolean("oopBox2", false)
        val checkbox3Value = sharedPreferences.getBoolean("oopBox3", false)
        val checkbox4Value = sharedPreferences.getBoolean("oopBox4", false)
        val checkbox5Value = sharedPreferences.getBoolean("oopBox5", false)

        // List of boxes
        val oopbox1 = findViewById<CheckBox>(R.id.oopBox1)
        val oopbox2 = findViewById<CheckBox>(R.id.oopBox2)
        val oopbox3 = findViewById<CheckBox>(R.id.oopBox3)
        val oopbox4 = findViewById<CheckBox>(R.id.oopBox4)
        val oopbox5 = findViewById<CheckBox>(R.id.oopBox5)

        // Set checkbox status
        oopbox1.isChecked = checkbox1Value
        oopbox2.isChecked = checkbox2Value
        oopbox3.isChecked = checkbox3Value
        oopbox4.isChecked = checkbox4Value

        val oopButtOk = findViewById<Button>(R.id.oopButtOk)

        oopButtOk.setOnClickListener {
            val changeView = Intent(this, Advanced::class.java)
            startActivity(changeView)

            // save checkBox status
            val editor = sharedPreferences.edit()
            editor.putBoolean("oopBox1", oopbox1.isChecked)
            editor.putBoolean("oopBox2", oopbox2.isChecked)
            editor.putBoolean("oopBox3", oopbox3.isChecked)
            editor.putBoolean("oopBox4", oopbox4.isChecked)
            editor.putBoolean("oopBox5", oopbox5.isChecked)
            editor.apply()
        }

    }
}