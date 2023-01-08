package com.example.programaticandroid.front

import android.content.Context
import android.content.res.Resources
import android.graphics.Color
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.programaticandroid.R
import com.example.programaticandroid.utils.extensions.viewgroup.addViews

class MainActivityButtonsLinearLayout(context: Context?) : LinearLayout(context) {
    lateinit var buttonEffect: (Int) -> Unit
    lateinit var stonebutton: Button
    lateinit var paperbutton: Button
    lateinit var scissorsbutton: Button
    lateinit var lizardbutton: Button
    lateinit var spokbutton: Button
    val createButton: (Int) -> Button = {imageId ->
        val button = Button(context)
        val size = Resources.getSystem().displayMetrics.widthPixels/5
        val layoutParams = RelativeLayout.LayoutParams(size, size)
        button.setOnClickListener {buttonEffect(imageId)}
        button.layoutParams = layoutParams
        button.setBackgroundResource(imageId)
        button
    }
    init {
        this.setLayout()
        this.setBackgroundColor(Color.BLUE)
        this.addViews(
            arrayOf(
                stonebutton,
                paperbutton,
                scissorsbutton,
                lizardbutton,
                spokbutton
            )
        )
    }
    private fun setLayout() {
        stonebutton = createButton(R.drawable.stone)
        paperbutton = createButton(R.drawable.paper)
        scissorsbutton = createButton(R.drawable.scissors)
        lizardbutton = createButton(R.drawable.lizard)
        spokbutton = createButton(R.drawable.spok)
    }
}