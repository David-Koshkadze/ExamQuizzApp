package com.example.examquizzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {
    lateinit var nextButton : Button
    lateinit var input : AppCompatEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN

        nextButton = findViewById(R.id.button)
        input = findViewById(R.id.input)

        nextButton.setOnClickListener {
            if(input.text.toString().isEmpty())
            {
                Toast.makeText(this,"Enter Your Name",Toast.LENGTH_SHORT).show()
            }
            else{
                var intent = Intent(this,QuestionActivity::class.java)
                intent.putExtra("${setData.name}",input.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}