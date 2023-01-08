package com.example.programaticandroid.front

import android.content.Context
import android.content.res.Resources
import android.graphics.Color
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.programaticandroid.utils.extensions.viewgroup.addViews

class MainActivityViewGroup(context: Context?) : LinearLayout(context) {
    var buttonsViewGroup: MainActivityButtonsViewGroup
    var playerImageView: ImageView
    val configurePlayerImageView: (ImageView) -> Unit = {
        it.setBackgroundColor(Color.GREEN)
    }
    init {
        buttonsViewGroup = MainActivityButtonsViewGroup(context)
        playerImageView = ImageView(context).apply {
            configurePlayerImageView(this)
            val height = Resources.getSystem().displayMetrics.widthPixels*2/5
            val layoutParams = RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, height
            )
            this.layoutParams = layoutParams
        }
        this.orientation = LinearLayout.VERTICAL
        this.setBackgroundColor(Color.RED)
        this.addViews(
            arrayOf(
                buttonsViewGroup,
                playerImageView
            )
        )
    }
}