package com.example.examquizzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Result : AppCompatActivity() {
    lateinit var congratText : TextView;
    lateinit var scoreText : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN

        congratText = findViewById(R.id.congrat_text)
        scoreText = findViewById(R.id.score_text)

        val userName = intent.getStringExtra(setData.name)
        val score = intent.getStringExtra(setData.score)
        val totalQuestion = intent.getStringExtra("total size")

        congratText.text = "Congratulations ${userName}"
        scoreText.text = "${score} / ${totalQuestion}"

        findViewById<Button>(R.id.button).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

    }
}