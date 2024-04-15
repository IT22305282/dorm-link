package com.example.mad_exam_2

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class DetailsPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_page)

        //getting ImageViews by IDs for Bottom Menu buttons
        val homebtn = findViewById<ImageView>(R.id.homebtn)
        val profilebtn = findViewById<ImageView>(R.id.profilebtn)
        val likedbtn = findViewById<ImageView>(R.id.likedbtn)
        val locationbtn = findViewById<ImageView>(R.id.locationbtn)

        homebtn.setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
            val options = ActivityOptions.makeCustomAnimation(this, R.anim.fade_in, R.anim.fade_out)
            startActivity(intent, options.toBundle())
        }

        profilebtn.setOnClickListener {
            val intent = Intent(this, SignInPage::class.java)
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

        //getting ImageViews by IDs for Back Button
        val backbtn_details = findViewById<ImageView>(R.id.backbtn_details)

        backbtn_details.setOnClickListener {
            finish()
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
        }
    }
}