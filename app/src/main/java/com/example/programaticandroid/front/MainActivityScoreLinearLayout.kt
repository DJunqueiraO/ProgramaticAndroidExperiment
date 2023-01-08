package com.example.programaticandroid.front

import android.content.Context
import android.content.res.Resources
import android.graphics.Color
import android.graphics.Typeface
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import com.example.programaticandroid.utils.extensions.viewgroup.addViews

class MainActivityScoreLinearLayout(context: Context?) : LinearLayout(context) {
    private lateinit var playerTextView: TextView
    private lateinit var scoreTextView: TextView
    private lateinit var cpuTextView: TextView
    val createTextView: (String) -> TextView = { text ->
        val textView = TextView(context)
        val size = Resources.getSystem().displayMetrics.widthPixels/3
        val layoutParams = LayoutParams(
            size, LayoutParams.MATCH_PARENT
        )
        textView.gravity = Gravity.CENTER
        textView.layoutParams = layoutParams
        textView.text = text
        textView.textSize = 30f
        textView.typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
        textView
    }
    init {
        setLayout()
        this.addViews(
            arrayOf(
                playerTextView,
                scoreTextView,
                cpuTextView
            )
        )
        this.setBackgroundColor(Color.BLACK)
    }
    private fun setLayout() {
        playerTextView = createTextView("Vitórias")
        scoreTextView = createTextView("Empates")
        cpuTextView = createTextView("Derrotas")
    }
    fun setScore(wins: Int, draws: Int, loses: Int) {
        playerTextView.text = "Vitórias:\n" + wins
        scoreTextView.text = "Empates:\n" + draws
        cpuTextView.text = "Derrotas:\n " + loses
    }
}