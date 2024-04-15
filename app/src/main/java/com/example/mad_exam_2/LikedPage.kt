package com.example.mad_exam_2

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ObjectAnimator
import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout

class LikedPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liked_page)

        //getting ImageViews by IDs for Bottom Menu buttons
        val homebtn = findViewById<ImageView>(R.id.homebtn)
        val profilebtn = findViewById<ImageView>(R.id.profilebtn)
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

        locationbtn.setOnClickListener {
            val intent = Intent(this, LocationPage::class.java)
            val options = ActivityOptions.makeCustomAnimation(this, R.anim.fade_in, R.anim.fade_out)
            startActivity(intent, options.toBundle())
        }

        //getting ImageViews by IDs for Back button
        val backbtn = findViewById<ImageView>(R.id.backbtn_main)

        backbtn.setOnClickListener {
            finish()
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
        }

        //getting ImageViews by IDs for Remove buttons
        val removebtnRec: ImageView = findViewById(R.id.removebtnRec)
        val removeBtn1: ImageView = findViewById(R.id.removebtn1)
        val removeBtn2: ImageView = findViewById(R.id.removebtn2)
        val removeBtn3: ImageView = findViewById(R.id.removebtn3)
        val removeBtn4: ImageView = findViewById(R.id.removebtn4)
        val removeBtn5: ImageView = findViewById(R.id.removebtn5)

        removeBtn1.setOnClickListener {
            var parentView = it.parent as View
            while (parentView !is CardView) { // Keep traversing up until we find the CardView
                parentView = parentView.parent as View
            }
            val cardView = parentView as CardView

            // Create an ObjectAnimator to fade out the CardView
            val fadeOutAnimator = ObjectAnimator.ofFloat(cardView, View.ALPHA, 1f, 0f)
            fadeOutAnimator.duration = 300

            // Add a listener to remove the CardView after the animation ends
            fadeOutAnimator.addListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator) {
                    // Remove the CardView from its parent
                    (cardView.parent as? ViewGroup)?.removeView(cardView)
                }
            })

            fadeOutAnimator.start() // Start the animation
        }

        removeBtn2.setOnClickListener {
            var parentView = it.parent as View
            while (parentView !is CardView) { // Keep traversing up until we find the CardView
                parentView = parentView.parent as View
            }
            val cardView = parentView as CardView

            // Create an ObjectAnimator to fade out the CardView
            val fadeOutAnimator = ObjectAnimator.ofFloat(cardView, View.ALPHA, 1f, 0f)
            fadeOutAnimator.duration = 300

            // Add a listener to remove the CardView after the animation ends
            fadeOutAnimator.addListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator) {
                    // Remove the CardView from its parent
                    (cardView.parent as? ViewGroup)?.removeView(cardView)
                }
            })

            fadeOutAnimator.start() // Start the animation
        }

        removeBtn3.setOnClickListener {
            var parentView = it.parent as View
            while (parentView !is CardView) { // Keep traversing up until we find the CardView
                parentView = parentView.parent as View
            }
            val cardView = parentView as CardView

            // Create an ObjectAnimator to fade out the CardView
            val fadeOutAnimator = ObjectAnimator.ofFloat(cardView, View.ALPHA, 1f, 0f)
            fadeOutAnimator.duration = 300

            // Add a listener to remove the CardView after the animation ends
            fadeOutAnimator.addListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator) {
                    // Remove the CardView from its parent
                    (cardView.parent as? ViewGroup)?.removeView(cardView)
                }
            })

            fadeOutAnimator.start() // Start the animation
        }

        removeBtn4.setOnClickListener {
            var parentView = it.parent as View
            while (parentView !is CardView) { // Keep traversing up until we find the CardView
                parentView = parentView.parent as View
            }
            val cardView = parentView as CardView

            // Create an ObjectAnimator to fade out the CardView
            val fadeOutAnimator = ObjectAnimator.ofFloat(cardView, View.ALPHA, 1f, 0f)
            fadeOutAnimator.duration = 300

            // Add a listener to remove the CardView after the animation ends
            fadeOutAnimator.addListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator) {
                    // Remove the CardView from its parent
                    (cardView.parent as? ViewGroup)?.removeView(cardView)
                }
            })

            fadeOutAnimator.start() // Start the animation
        }

        removeBtn5.setOnClickListener {
            var parentView = it.parent as View
            while (parentView !is CardView) { // Keep traversing up until we find the CardView
                parentView = parentView.parent as View
            }
            val cardView = parentView as CardView

            // Create an ObjectAnimator to fade out the CardView
            val fadeOutAnimator = ObjectAnimator.ofFloat(cardView, View.ALPHA, 1f, 0f)
            fadeOutAnimator.duration = 300

            // Add a listener to remove the CardView after the animation ends
            fadeOutAnimator.addListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator) {
                    // Remove the CardView from its parent
                    (cardView.parent as? ViewGroup)?.removeView(cardView)
                }
            })

            fadeOutAnimator.start() // Start the animation
        }

        removebtnRec.setOnClickListener {
            var parentView = it.parent as View
            while (parentView !is CardView) { // Keep traversing up until we find the CardView
                parentView = parentView.parent as View
            }
            val cardView = parentView as CardView

            // Create an ObjectAnimator to fade out the CardView
            val fadeOutAnimator = ObjectAnimator.ofFloat(cardView, View.ALPHA, 1f, 0f)
            fadeOutAnimator.duration = 300

            // Add a listener to remove the CardView after the animation ends
            fadeOutAnimator.addListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator) {
                    // Remove the CardView from its parent
                    (cardView.parent as? ViewGroup)?.removeView(cardView)
                }
            })

            fadeOutAnimator.start() // Start the animation
        }
    }
}