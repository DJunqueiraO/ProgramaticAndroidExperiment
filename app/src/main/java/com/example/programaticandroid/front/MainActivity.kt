package com.example.programaticandroid.front

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.programaticandroid.R
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var viewGroup: MainActivityRelativeLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewGroup = MainActivityRelativeLayout(this)
        setListener()
        setContentView(viewGroup)
    }
    private fun setListener() {
        var images = arrayOf(
            R.drawable.stone,
            R.drawable.paper,
            R.drawable.scissors,
            R.drawable.lizard,
            R.drawable.spok
        )
        viewGroup.buttonsViewGroup.buttonEffect = {imageId ->
            viewGroup.playerImageView.setImageResource(imageId)
            val cpuChose = Random().nextInt(5)
            viewGroup.cpuImageView.setImageResource(images[cpuChose])
        }
    }
}