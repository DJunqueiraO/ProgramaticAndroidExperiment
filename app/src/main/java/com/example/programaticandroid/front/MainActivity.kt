package com.example.programaticandroid.front

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    lateinit var viewGroup: MainActivityRelativeLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewGroup = MainActivityRelativeLayout(this)
        setContentView(viewGroup)
    }
}