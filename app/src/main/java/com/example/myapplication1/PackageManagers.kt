package com.example.myapplication1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class PackageManagers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.package_managers)

        val sharedPreferences = getSharedPreferences("app_preferences", Context.MODE_PRIVATE)

        // Load checkbox status at start
        val checkbox1Value = sharedPreferences.getBoolean("packbox1", false)
        val checkbox2Value = sharedPreferences.getBoolean("packbox2", false)
        val checkbox3Value = sharedPreferences.getBoolean("packbox3", false)

        // List of boxes
        val packbox1 = findViewById<CheckBox>(R.id.packBox1)
        val packbox2 = findViewById<CheckBox>(R.id.packBox2)
        val packbox3 = findViewById<CheckBox>(R.id.packBox3)

        // Set checkbox status
        packbox1.isChecked = checkbox1Value
        packbox2.isChecked = checkbox2Value
        packbox3.isChecked = checkbox3Value

        val packButtonOk = findViewById<Button>(R.id.packButtonOk)
        packButtonOk.setOnClickListener {
            val changeView = Intent(this, Advanced::class.java)
            startActivity(changeView)

            // save checkBox status
            val editor = sharedPreferences.edit()
            editor.putBoolean("packbox1", packbox1.isChecked)
            editor.putBoolean("packbox2", packbox2.isChecked)
            editor.putBoolean("packbox3", packbox3.isChecked)
            editor.apply()
        }
    }
}