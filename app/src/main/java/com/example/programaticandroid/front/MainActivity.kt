package com.example.programaticandroid.front

import android.content.res.Resources
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var viewGroup: ViewGroup
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        textView = TextView(this).apply {
            val size = Resources.getSystem().displayMetrics.widthPixels/5
            val layoutParams = RelativeLayout.LayoutParams(size, size)
            setBackgroundColor(Color.BLUE)
            this.layoutParams = layoutParams
            text = "Lero Lero"
        }
        viewGroup = RelativeLayout(this).apply {
            setBackgroundColor(Color.RED)
            addView(textView)
        }
        setContentView(viewGroup)
    }
}