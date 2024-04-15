package com.example.mad_exam_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class OnBoarding1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding1)

        val nextbtnView = findViewById<ImageView>(R.id.nextbtnView)
        nextbtnView.setOnClickListener {
            val intent = Intent(this, OnBoarding2::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        val skipbtnView = findViewById<TextView>(R.id.skipbtnView)
        skipbtnView.setOnClickListener {
            val intent = Intent(this,HomePage::class.java)
            startActivity(intent)
        }

    }
}