package com.example.programaticandroid.front

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.programaticandroid.R

class MainActivity : AppCompatActivity() {
    lateinit var viewGroup: MainActivityRelativeLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewGroup = MainActivityRelativeLayout(this)
        setListener()
        setContentView(viewGroup)
    }
    private fun setListener() {
        viewGroup.buttonsViewGroup.buttonEffect = {imageId ->
            viewGroup.playerImageView.setImageResource(imageId)
        }
    }
}