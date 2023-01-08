package com.example.programaticandroid.front

import android.content.Context
import android.content.res.Resources
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.RelativeLayout.LayoutParams
import com.example.programaticandroid.utils.extensions.viewgroup.addViews

class MainActivity : AppCompatActivity() {
    lateinit var viewGroup: MainActivityViewGroup
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewGroup = MainActivityViewGroup(this)
        setContentView(viewGroup)
    }
}