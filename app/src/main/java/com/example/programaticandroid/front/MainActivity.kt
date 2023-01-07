package com.example.programaticandroid.front

import android.content.res.Resources
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.programaticandroid.utils.extensions.viewgroup.addViews

class MainActivity : AppCompatActivity() {
    lateinit var viewGroup: ViewGroup
    val createViewGroup: () -> ViewGroup = {
        val viewGroup = LinearLayout(this)
        setContentView(viewGroup)
        viewGroup
    }
    lateinit var stoneButton: Button
    lateinit var paperButton: Button
    lateinit var scissorsButton: Button
    lateinit var lizardButton: Button
    lateinit var spokButton: Button
    val createButton: (text: String) -> Button = {text ->
        val button = Button(this)
        button.text = text
        button.background = null
        button.setOnClickListener {
            if (button.isSelected) {
                button.isSelected = false
                button.background = null
            } else {
                button.isSelected = true
                button.setBackgroundColor(Color.RED)
            }
        }
        button
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initialize()
        constrain()
        configure()
    }
    private fun initialize() {
        viewGroup = createViewGroup()
        stoneButton = createButton("Pedra")
        paperButton = createButton("Papel")
        scissorsButton = createButton("Tesour")
        lizardButton = createButton("Lagart")
        spokButton = createButton("Spok")
    }
    private fun configure() {
        viewGroup.addViews(
            arrayOf(
                stoneButton,
                paperButton,
                scissorsButton,
                lizardButton,
                spokButton
            )
        )
    }
    private fun constrain() {
        val size = Resources.getSystem().displayMetrics.widthPixels/5
        val layoutParams = RelativeLayout.LayoutParams(size, size)
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT)
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_TOP)
        stoneButton.layoutParams = layoutParams
        paperButton.layoutParams = layoutParams
        scissorsButton.layoutParams = layoutParams
        lizardButton.layoutParams = layoutParams
        spokButton.layoutParams = layoutParams
    }
}