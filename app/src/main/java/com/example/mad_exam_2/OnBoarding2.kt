package com.example.mad_exam_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class OnBoarding2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding2)

        val nextbtn2View = findViewById<ImageView>(R.id.nextbtn2View)
        nextbtn2View.setOnClickListener {
            val intent = Intent(this, OnBoarding3::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        val backbtnView = findViewById<TextView>(R.id.backbtnView)
        backbtnView.setOnClickListener {
            // Finish the current activity to go back to the previous one
            finish()
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
        }
    }
}