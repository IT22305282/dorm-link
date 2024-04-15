package com.example.mad_exam_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class OnBoarding3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding3)

        val backbtnView = findViewById<TextView>(R.id.backbtnView)
        backbtnView.setOnClickListener {
            // Finish the current activity to go back to the previous one
            finish()
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
        }

        val getstartedView = findViewById<ImageView>(R.id.getstartedView)
        getstartedView.setOnClickListener{
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }

    }
}