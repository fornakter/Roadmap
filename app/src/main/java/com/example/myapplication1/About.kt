package com.example.myapplication1

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about)

        val aboutButtonOK = findViewById<Button>(R.id.aboutButtonOK)
        val webLink = findViewById<TextView>(R.id.webTextView)
        val mailLink = findViewById<TextView>(R.id.mailTextView10)
        val btclLink = findViewById<TextView>(R.id.btcTextView9)
        val ethlLink = findViewById<TextView>(R.id.ethTextView11)

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
        mailLink.setOnClickListener {
            val mailClip = getSystemService(CLIPBOARD_SERVICE) as ClipboardManager
            val clip = ClipData.newPlainText("Email contact", mailLink.text.toString())
            mailClip.setPrimaryClip(clip)
            Toast.makeText(this, "Email copied", Toast.LENGTH_SHORT).show()
        }
        btclLink.setOnClickListener {
            val mailClip = getSystemService(CLIPBOARD_SERVICE) as ClipboardManager
            val clip = ClipData.newPlainText("BTC contact", btclLink.text.toString())
            mailClip.setPrimaryClip(clip)
            Toast.makeText(this, "BTC address copied", Toast.LENGTH_SHORT).show()
        }
        ethlLink.setOnClickListener {
            val mailClip = getSystemService(CLIPBOARD_SERVICE) as ClipboardManager
            val clip = ClipData.newPlainText("ETH contact", ethlLink.text.toString())
            mailClip.setPrimaryClip(clip)
            Toast.makeText(this, "ETH address copied", Toast.LENGTH_SHORT).show()
        }

    }
}