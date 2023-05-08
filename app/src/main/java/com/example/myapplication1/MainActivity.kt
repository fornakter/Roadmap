package com.example.myapplication1

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        // Set value on progressbar
//        val receivedIntent = intent
//        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
//        val value = receivedIntent.getIntExtra("value", 0)
//        progressBar.progress = value


        // 'handle' for button'
        val learnButton = findViewById<Button>(R.id.bLearn)
        val dataButton = findViewById<Button>(R.id.bData)
        val advButton = findViewById<Button>(R.id.bAdv)
        val fraButton = findViewById<Button>(R.id.bFramework)
        val testButton = findViewById<Button>(R.id.bTest)
        val aboutButton = findViewById<Button>(R.id.bAbout)


        // action for buttons
        learnButton.setOnClickListener {
            val changeView = Intent(this, LearnBasics::class.java)
            startActivity(changeView)
        }
        dataButton.setOnClickListener {
            val changeView = Intent(this, Data::class.java)
            startActivity(changeView)
        }
        advButton.setOnClickListener {
            val changeView = Intent(this, Advanced::class.java)
            startActivity(changeView)
        }
        fraButton.setOnClickListener {
            val changeView = Intent(this, Framework::class.java)
            startActivity(changeView)
        }
        testButton.setOnClickListener {
            val changeView = Intent(this, Test::class.java)
            startActivity(changeView)
        }
        aboutButton.setOnClickListener {
            val changeView = Intent(this, About::class.java)
            startActivity(changeView)
        }


    }
}