package com.example.mad_exam_2

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.os.Handler


class MainActivity : AppCompatActivity() {

    val SPLASH_SCREEN: Long = 2000

    //variables
    private lateinit var logo: ImageView
    private lateinit var dorm: TextView
    private lateinit var link: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //remove the action bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN )

        logo = findViewById(R.id.dormlogo)
        dorm = findViewById(R.id.dormText)
        link = findViewById(R.id.linkText)

        // Apply pop-up animation to logo
        val logoPopUpAnimation = AnimationUtils.loadAnimation(this, R.anim.pop_up_anim)
        logo.startAnimation(logoPopUpAnimation)

        // Apply bottom-to-top animation to dorm text
        val dormBottomToTopAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_to_top_anim)
        dorm.startAnimation(dormBottomToTopAnimation)

        // Apply bottom-to-top animation to link text
        val linkBottomToTopAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_to_top_anim)
        link.startAnimation(linkBottomToTopAnimation)

        Handler().postDelayed({
            val intent = Intent(this@MainActivity, OnBoarding1::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_SCREEN)
    }
}