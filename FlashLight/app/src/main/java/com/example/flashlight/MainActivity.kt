package com.example.flashlight

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch

class MainActivity : AppCompatActivity() {
    lateinit var flashSwitch: Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        flashSwitch=findViewById(R.id.flashSwitch)
        //torch클래스 기능 쓸거라서 객체 만들기
        val torch= Torch(this)
        val intent=Intent(this,TorchService::class.java)


        flashSwitch.setOnCheckedChangeListener{buttonView,isChecked->
            if(isChecked){
               // torch.flashOn()
                intent.action="on"
                startService(intent)
            }
            else{
               // torch.flashOff()
                intent.action="off"
                startService(intent)
            }
        }
    }
}