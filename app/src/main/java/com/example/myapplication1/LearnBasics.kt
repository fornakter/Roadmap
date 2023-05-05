package com.example.myapplication1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox

class LearnBasics : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.learn_basics)
        // List of boxes
        val box1 = findViewById<CheckBox>(R.id.checkBox1)
        val box2 = findViewById<CheckBox>(R.id.checkBox2)
        val box3 = findViewById<CheckBox>(R.id.checkBox3)
        val box4 = findViewById<CheckBox>(R.id.checkBox4)
        val box5 = findViewById<CheckBox>(R.id.checkBox5)
        val box6 = findViewById<CheckBox>(R.id.checkBox6)

        var counter = 0

        // Count boxes
        box1.setOnClickListener(View.OnClickListener {
            if (box1.isChecked())
                counter++
            else
                counter--
        })
        box2.setOnClickListener(View.OnClickListener {
            if (box2.isChecked())
                counter++
            else
                counter--
        })
        box3.setOnClickListener(View.OnClickListener {
            if (box3.isChecked())
                counter++
            else
                counter--
        })
        box4.setOnClickListener(View.OnClickListener {
            if (box4.isChecked())
                counter++
            else
                counter--
        })
        box5.setOnClickListener(View.OnClickListener {
            if (box5.isChecked())
                counter++
            else
                counter--
        })
        box6.setOnClickListener(View.OnClickListener {
            if (box6.isChecked())
                counter++
            else
                counter--
        })


        // Back to main screen button
        val learnButton = findViewById<Button>(R.id.bLearnOk)
        learnButton.setOnClickListener {
            // Change screen
            val changeView = Intent(this, MainActivity::class.java)
            startActivity(changeView)

            // Send values
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("value", counter)
            startActivity(intent)

        } // End 'Back to main screen button'


    }

}


