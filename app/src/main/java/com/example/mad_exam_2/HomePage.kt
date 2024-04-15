package com.example.mad_exam_2

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        //getting ImageViews by IDs for Categories
        val singleBedView = findViewById<ImageView>(R.id.singleBedView)
        val multiBedView = findViewById<ImageView>(R.id.multiBedView)
        val apartmentView = findViewById<ImageView>(R.id.apartmentView)
        val houseView = findViewById<ImageView>(R.id.houseView)

        //getting ImageViews by ID for Like btn
        val boookmark = findViewById<ImageView>(R.id.bookmarkbtn)

        //changing ImageView drawable when image is clicked
        singleBedView.setOnClickListener {
            if (singleBedView.tag == null || singleBedView.tag.toString() == "normal") {
                singleBedView.setImageResource(R.drawable.single_bed_c)
                singleBedView.tag = "highlighted"
            } else {
                singleBedView.setImageResource(R.drawable.single_bed)
                singleBedView.tag = "normal"
            }
        }

        multiBedView.setOnClickListener {
            if (multiBedView.tag == null || multiBedView.tag.toString() == "normal") {
                multiBedView.setImageResource(R.drawable.multi_bed_c)
                multiBedView.tag = "highlighted"
            } else {
                multiBedView.setImageResource(R.drawable.multi_bed)
                multiBedView.tag = "normal"
            }
        }

        apartmentView.setOnClickListener {
            if (apartmentView.tag == null || apartmentView.tag.toString() == "normal") {
                apartmentView.setImageResource(R.drawable.apartment_c)
                apartmentView.tag = "highlighted"
            } else {
                apartmentView.setImageResource(R.drawable.apartment)
                apartmentView.tag = "normal"
            }
        }

        houseView.setOnClickListener {
            if (houseView.tag == null || houseView.tag.toString() == "normal") {
                houseView.setImageResource(R.drawable.house_c)
                houseView.tag = "highlighted"
            } else {
                houseView.setImageResource(R.drawable.house)
                houseView.tag = "normal"
            }
        }

        boookmark.setOnClickListener {
            if(boookmark.tag == null || boookmark.tag.toString() == "normal"){
                boookmark.setImageResource(R.drawable.liked_c)
                boookmark.tag = "liked"
            }else{
                boookmark.setImageResource(R.drawable.like)
                boookmark.tag = "normal"
            }
        }

        //getting ImageViews by IDs for Bottom Menu buttons
        val profilebtn = findViewById<ImageView>(R.id.profilebtn)
        val locationbtn = findViewById<ImageView>(R.id.locationbtn)
        val likedbtn = findViewById<ImageView>(R.id.likedbtn)

        profilebtn.setOnClickListener {
            val intent = Intent(this, SignInPage::class.java)
            //startActivity(intent)
            val options = ActivityOptions.makeCustomAnimation(this, R.anim.fade_in, R.anim.fade_out)
            startActivity(intent, options.toBundle())
        }

        locationbtn.setOnClickListener {
            val intent = Intent(this, LocationPage::class.java)
            val options = ActivityOptions.makeCustomAnimation(this, R.anim.fade_in, R.anim.fade_out)
            startActivity(intent, options.toBundle())
        }

        likedbtn.setOnClickListener {
            val intent = Intent(this, LikedPage::class.java)
            val options = ActivityOptions.makeCustomAnimation(this, R.anim.fade_in, R.anim.fade_out)
            startActivity(intent, options.toBundle())
        }


        val CardView1 = findViewById<CardView>(R.id.CardView1)

        CardView1.setOnClickListener {
            val intent = Intent(this, DetailsPage::class.java)
            val options = ActivityOptions.makeCustomAnimation(this, R.anim.fade_in, R.anim.fade_out)
            startActivity(intent, options.toBundle())
        }
    }
}