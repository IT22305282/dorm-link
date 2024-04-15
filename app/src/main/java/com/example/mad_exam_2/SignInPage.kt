package com.example.mad_exam_2

import android.annotation.SuppressLint
import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class SignInPage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_page)

        //getting ImageViews by IDs for Bottom Menu buttons
        val homebtn = findViewById<ImageView>(R.id.homebtn)
        val locationbtn = findViewById<ImageView>(R.id.locationbtn)
        val likedbtn = findViewById<ImageView>(R.id.likedbtn)
        val signUpbtn = findViewById<TextView>(R.id.signUpNavbtn)
        val signInbtn = findViewById<Button>(R.id.signInbtn)

        homebtn.setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
            val options = ActivityOptions.makeCustomAnimation(this, R.anim.fade_in, R.anim.fade_out)
            startActivity(intent, options.toBundle())
        }

        likedbtn.setOnClickListener {
            val intent = Intent(this, LikedPage::class.java)
            val options = ActivityOptions.makeCustomAnimation(this, R.anim.fade_in, R.anim.fade_out)
            startActivity(intent, options.toBundle())
        }

        locationbtn.setOnClickListener {
            val intent = Intent(this, LocationPage::class.java)
            val options = ActivityOptions.makeCustomAnimation(this, R.anim.fade_in, R.anim.fade_out)
            startActivity(intent, options.toBundle())
        }

        signUpbtn.setOnClickListener {
            val intent = Intent(this, SignUpPage::class.java)
            val options = ActivityOptions.makeCustomAnimation(this, R.anim.fade_in, R.anim.fade_out)
            startActivity(intent, options.toBundle())
        }

        signInbtn.setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
            val options = ActivityOptions.makeCustomAnimation(this, R.anim.fade_in, R.anim.fade_out)
            startActivity(intent, options.toBundle())
        }
    }
}