package com.example.animations

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        blink.setOnClickListener {
           val a = AnimationUtils.loadAnimation(applicationContext,R.anim.blink)
            text.startAnimation(a)
        }
        clockwise.setOnClickListener {
            val a = AnimationUtils.loadAnimation(applicationContext,R.anim.clockwise)
            text.startAnimation(a)
        }
        fade.setOnClickListener {
            val a = AnimationUtils.loadAnimation(applicationContext,R.anim.fade)
            text.startAnimation(a)
        }
        move.setOnClickListener {
            val a = AnimationUtils.loadAnimation(applicationContext,R.anim.move)
            text.startAnimation(a)
        }
        slide.setOnClickListener {
            val a = AnimationUtils.loadAnimation(applicationContext,R.anim.slide)
            text.startAnimation(a)
        }

    }
}