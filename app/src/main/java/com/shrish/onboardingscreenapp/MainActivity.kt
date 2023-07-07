package com.shrish.onboardingscreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button1 = findViewById<Button>(R.id.btnFeed)
        var button2 = findViewById<Button>(R.id.btnUpload)
        button1.setOnClickListener {
            val intent1 = Intent(this,FeedActivity::class.java)
            startActivity(intent1)
        }
        button2.setOnClickListener {
            val intent2 = Intent(this, UploadActivity::class.java)
            startActivity(intent2)
        }
    }
}


