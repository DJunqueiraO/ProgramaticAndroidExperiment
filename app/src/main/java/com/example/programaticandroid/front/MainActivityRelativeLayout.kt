package com.example.programaticandroid.front

import android.content.Context
import android.content.res.Resources
import android.graphics.Color
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.programaticandroid.utils.extensions.viewgroup.addViews

class MainActivityRelativeLayout(context: Context?) : RelativeLayout(context) {
    lateinit var buttonsViewGroup: MainActivityButtonsLinearLayout
    lateinit var playerImageView: ImageView
    lateinit var versusImageView: ImageView
    lateinit var cpuImageView: ImageView
    lateinit var scoreViewGroup: MainActivityScoreLinearLayout
    init {
        setLayout()
        this.setBackgroundColor(Color.RED)
        this.addViews(
            arrayOf(
                buttonsViewGroup,
                playerImageView,
                versusImageView,
                cpuImageView,
                scoreViewGroup
            )
        )
    }
    private fun setLayout() {
        var (width, height) = Pair(
            LayoutParams.MATCH_PARENT,
            Resources.getSystem().displayMetrics.heightPixels
        )
        buttonsViewGroup = MainActivityButtonsLinearLayout(context).apply {
            this.id = generateViewId()
            val layoutParams = LayoutParams(
                LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT
            ).apply {
                addRule(ALIGN_PARENT_TOP)
                addRule(ALIGN_PARENT_LEFT)
            }
            this.layoutParams = layoutParams
        }
        playerImageView = ImageView(context).apply {
            this.id = generateViewId()
            this.setBackgroundColor(Color.GREEN)
            this.layoutParams = LayoutParams(
                width, height*2/10
            ).apply {
                addRule(BELOW, buttonsViewGroup.id)
                addRule(ALIGN_PARENT_LEFT)
            }
        }
        versusImageView = ImageView(context).apply {
            this.id = generateViewId()
            this.setBackgroundColor(Color.CYAN)
            this.layoutParams = LayoutParams(
                width, height/10
            ).apply {
                addRule(BELOW, playerImageView.id)
                addRule(ALIGN_PARENT_LEFT)
            }
        }
        cpuImageView = ImageView(context).apply {
            this.id = generateViewId()
            this.setBackgroundColor(Color.GREEN)
            this.layoutParams = LayoutParams(
                width, height*2/10
            ).apply {
                addRule(BELOW, versusImageView.id)
                addRule(ALIGN_PARENT_LEFT)
            }
        }
        scoreViewGroup = MainActivityScoreLinearLayout(context).apply {
            this.id = generateViewId()
            val layoutParams = LayoutParams(
                LayoutParams.MATCH_PARENT, 0
            ).apply {
                addRule(BELOW, cpuImageView.id)
                addRule(ALIGN_PARENT_LEFT)
                addRule(ALIGN_PARENT_BOTTOM)
                addRule(ALIGN_PARENT_RIGHT)
            }
            this.layoutParams = layoutParams
        }
    }
}