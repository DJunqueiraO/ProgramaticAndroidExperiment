package com.example.programaticandroid.front

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    lateinit var view: MainActivityRelativeLayout
    val gameLogic: (MainActivityRelativeLayout, Int) -> Unit = {layout, id ->
        layout.playerImageView.setImageResource(id)
        layout.cpuImageView.setImageResource(JokenpoGame.play(id))
        layout.scoreViewGroup.setScore(
            JokenpoGame.getWins(),
            JokenpoGame.getDraws(),
            JokenpoGame.getLoses()
        )
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        view = MainActivityRelativeLayout(this)
        setListener()
        setContentView(view)
    }
    private fun setListener() {
        view.buttonsViewGroup.buttonEffect = {
            imageId -> view.apply {gameLogic(this, imageId)}
        }
    }
}