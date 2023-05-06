package com.example.myapplication1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class LearnBasics : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.learn_basics)
        // 'handle' for save checkbox
        val sharedPreferences = getSharedPreferences("app_preferences", Context.MODE_PRIVATE)

        // Load checkbox status at start
        val checkbox1Value = sharedPreferences.getBoolean("box1", false)
        val checkbox2Value = sharedPreferences.getBoolean("box2", false)
        val checkbox3Value = sharedPreferences.getBoolean("box3", false)
        val checkbox4Value = sharedPreferences.getBoolean("box4", false)
        val checkbox5Value = sharedPreferences.getBoolean("box5", false)
        val checkbox6Value = sharedPreferences.getBoolean("box6", false)

        // List of boxes
        val box1 = findViewById<CheckBox>(R.id.checkBox1)
        val box2 = findViewById<CheckBox>(R.id.checkBox2)
        val box3 = findViewById<CheckBox>(R.id.checkBox3)
        val box4 = findViewById<CheckBox>(R.id.checkBox4)
        val box5 = findViewById<CheckBox>(R.id.checkBox5)
        val box6 = findViewById<CheckBox>(R.id.checkBox6)

        // Set checkbox status
        box1.isChecked = checkbox1Value
        box2.isChecked = checkbox2Value
        box3.isChecked = checkbox3Value
        box4.isChecked = checkbox4Value
        box5.isChecked = checkbox5Value
        box6.isChecked = checkbox6Value

        // Back to main screen button
        val learnButton = findViewById<Button>(R.id.bLearnOk)
        learnButton.setOnClickListener {
            // Change screen to #1
            val changeView = Intent(this, MainActivity::class.java)
            startActivity(changeView)

            // save checkBox status
            val editor = sharedPreferences.edit()
            editor.putBoolean("box1", box1.isChecked)
            editor.putBoolean("box2", box2.isChecked)
            editor.putBoolean("box3", box3.isChecked)
            editor.putBoolean("box4", box4.isChecked)
            editor.putBoolean("box5", box5.isChecked)
            editor.putBoolean("box6", box6.isChecked)
            editor.apply()
        }

            // Send values, number of boxes
//            val intent = Intent(this, MainActivity::class.java)
//            intent.putExtra("value", counter)
//            startActivity(intent)

         // End 'Back to main screen button'


    }

}


