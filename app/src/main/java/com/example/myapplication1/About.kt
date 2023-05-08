package com.example.myapplication1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about)

        val aboutButtonOK = findViewById<Button>(R.id.aboutButtonOK)
        val webLink = findViewById<TextView>(R.id.webTextView)

        aboutButtonOK.setOnClickListener {
            val changeView = Intent(this, MainActivity::class.java)
            startActivity(changeView)
        }
        webLink.setOnClickListener {
            val url = "http://adam-fatyga.ddns.net"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
    }
}