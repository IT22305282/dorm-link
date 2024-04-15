package com.example.mad_exam_2

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class SignUpPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_page)

        //getting ImageViews by IDs for Bottom Menu buttons
        val homebtn = findViewById<ImageView>(R.id.homebtn)
        val locationbtn = findViewById<ImageView>(R.id.locationbtn)
        val likedbtn = findViewById<ImageView>(R.id.likedbtn)
        val signInNavbtn = findViewById<TextView>(R.id.signInNavbtn)
        val signUpbtn = findViewById<Button>(R.id.signUpbtn)

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

        signInNavbtn.setOnClickListener {
            val intent = Intent(this, SignInPage::class.java)
            val options = ActivityOptions.makeCustomAnimation(this, R.anim.fade_in, R.anim.fade_out)
            startActivity(intent, options.toBundle())
        }

        signUpbtn.setOnClickListener {
            val intent = Intent(this, SignInPage::class.java)
            val options = ActivityOptions.makeCustomAnimation(this, R.anim.fade_in, R.anim.fade_out)
            startActivity(intent, options.toBundle())
        }
    }
}