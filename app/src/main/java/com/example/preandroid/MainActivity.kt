package com.example.preandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var countButton: FrameLayout
    private lateinit var countTextview: TextView
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        initUIEvenHander()
    }

    private fun initUIEvenHander() {
        countButton.setOnClickListener{
            count++
            countTextview.text = "$count"
        }
    }

    private fun initView() {
        countButton = findViewById(R.id.countBt)
        countTextview = findViewById(R.id.counttv)
    }
}