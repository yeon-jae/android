package com.example.flashlight

import android.content.Context
import android.hardware.camera2.CameraCharacteristics
import android.hardware.camera2.CameraManager

class Torch (context:Context){
    private var cameraId:String?=null
    private val cameraManager=context.getSystemService(Context.CAMERA_SERVICE) as CameraManager

    //flash가 나오기 전 id를 설정을 미리 해야한다.
    init{
        cameraId=getCameraId()
    }
    fun flashOn(){
        cameraId?.let{cameraManager.setTorchMode(it,true)}
    }
    fun flashOff(){
        cameraId?.let{cameraManager.setTorchMode(it,false)}
    }

    private fun getCameraId(): String?{
        val cameraIds=cameraManager.cameraIdList
        for(id in cameraIds){
            val info=cameraManager.getCameraCharacteristics(id)
            val flashAvailable=info.get(CameraCharacteristics.FLASH_INFO_AVAILABLE) //플래시 사용여부
            val lensFacing=info.get(CameraCharacteristics.LENS_FACING)
            if(flashAvailable!==null&&flashAvailable
                &&lensFacing!==null&&lensFacing==CameraCharacteristics.LENS_FACING_BACK){
                return id
            }
        }
        return null
    }
}