package com.example.constraintlayoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var clickButton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView=findViewById(R.id.textView4)
        clickButton=findViewById(R.id.clickButton)
        clickButton.setOnClickListener{
            textView.text="버튼을 눌러주세요"
        }
    }
}