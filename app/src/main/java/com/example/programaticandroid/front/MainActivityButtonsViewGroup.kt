package com.example.programaticandroid.front

import android.content.Context
import android.content.res.Resources
import android.graphics.Color
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.programaticandroid.utils.extensions.viewgroup.addViews

class MainActivityButtonsViewGroup(context: Context?) : LinearLayout(context) {
    val configureButtonsViewGroup: (ViewGroup) -> Unit = {
        it.setBackgroundColor(Color.BLUE)
    }
    var stonebutton: Button
    var paperbutton: Button
    var scissorsbutton: Button
    var lizardbutton: Button
    var spokbutton: Button
    val createButton: (String) -> Button = { text ->
        val button = Button(context)
        val size = Resources.getSystem().displayMetrics.widthPixels/5
        val layoutParams = RelativeLayout.LayoutParams(size, size)
        button.layoutParams = layoutParams
        button.text = text
        button
    }
    init {
        stonebutton = createButton("Pedra")
        paperbutton = createButton("Papel")
        scissorsbutton = createButton("Tesoura")
        lizardbutton = createButton("Lagarto")
        spokbutton = createButton("Spok")
        configureButtonsViewGroup(this)
        val layoutParams = RelativeLayout.LayoutParams(
            RelativeLayout.LayoutParams.MATCH_PARENT,
            RelativeLayout.LayoutParams.WRAP_CONTENT
        ).apply {
            addRule(RelativeLayout.ALIGN_PARENT_TOP)
            addRule(RelativeLayout.ALIGN_PARENT_LEFT)
        }
        this.layoutParams = layoutParams
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
}