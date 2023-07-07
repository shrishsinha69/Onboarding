package com.shrish.onboardingscreenapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.google.android.gms.cast.framework.media.ImagePicker

class UploadActivity : AppCompatActivity() {

//    val button5 : Button = findViewById(R.id.captureBtn)
    private  lateinit var button: Button
    private  lateinit var imageView: ImageView
    companion object{
        val IMAGE_REQUEST_CODE = 100

    }
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_upload)
        lateinit var captureBtn: Button
        lateinit var selectBtn: Button
        captureBtn = findViewById(R.id.captureBtn)
        selectBtn = findViewById(R.id.selectBtn)

        selectBtn.setOnClickListener {
            Toast.makeText(applicationContext, "IMAGE SELECTED!!", Toast.LENGTH_SHORT).show()
        }


        captureBtn.setOnClickListener {
            Toast.makeText(applicationContext, "IMAGE SAVED SUCCESSFULLY", Toast.LENGTH_SHORT).show()

        }


        var button3 = findViewById<Button>(R.id.btnLast)
        button3.setOnClickListener {
            val intent3 = Intent(this,MainActivity::class.java)
            startActivity(intent3)
        }


        imageView = findViewById(R.id.imgView)

        button = findViewById(R.id.selectBtn)
        button.setOnClickListener {
            pickImageGallery()
        }


    }



    private fun pickImageGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, IMAGE_REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == IMAGE_REQUEST_CODE && resultCode == RESULT_OK){
            imageView.setImageURI(data?.data)
    }


//
 }
    }
