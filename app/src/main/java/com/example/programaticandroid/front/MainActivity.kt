package com.example.programaticandroid.front

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

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
            viewGroup.cpuImageView.setImageResource(JokenpoGame.play(imageId))
            viewGroup.scoreViewGroup.setScore(
                JokenpoGame.getWins(),
                JokenpoGame.getDraws(),
                JokenpoGame.getLoses()
            )
        }
    }
}