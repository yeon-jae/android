package com.example.bmicalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    //선언
    lateinit var resultButton:Button //추후에 초기화 하는 변수 타입
    lateinit var nameEditText: EditText
    lateinit var heightEditText: EditText
    lateinit var weightEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //연결
        resultButton=findViewById<Button>(R.id.resultButton)
        nameEditText=findViewById<EditText>(R.id.nameEditText)
        heightEditText=findViewById<EditText>(R.id.heighteEditText)
        weightEditText=findViewById<EditText>(R.id.weightEditText)
        //사용

        loadData()

        resultButton.setOnClickListener {

            saveData(
                    heightEditText.text.toString().toInt(),
                    weightEditText.text.toString().toInt())

            var intent= Intent(this, ResultActivity::class.java)
            intent.putExtra("name",nameEditText.text.toString())
            intent.putExtra("height",heightEditText.text.toString())
            intent.putExtra("weight",weightEditText.text.toString())
            startActivity(intent)
        }
    }
    private fun saveData(heigth:Int,weight:Int){ //데이터를 저장하기 위한 함수
        var pref=this.getPreferences(0)
        var editor=pref.edit()

        editor.putString("NAME_HEIGHT",nameEditText.text.toString()).apply()
        editor.putInt("KEY_HEIGHT",heightEditText.text.toString().toInt()).apply()
        editor.putInt("KEY_WEIGHT",weightEditText.text.toString().toInt()).apply()
    }
    private fun loadData(){ //데이터를 불러오기 위한 함수
        var pref=this.getPreferences(0)
        var name=pref.getString("KEY_NAME","")
        var height=pref.getInt("KEY_HEIGHT",0)
        var weight=pref.getInt("KEY_WEIGHT",0)
        if(name!=""&&height!=0&&weight!=0){
            nameEditText.setText(name.toString())
            heightEditText.setText(height.toString())
            weightEditText.setText(weight.toString())
        }
    }

}