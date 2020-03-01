package com.gizmiks.processlifecycledemo.service

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

// adb shell am start -n com.gizmiks.processlifecycledemo/com.gizmiks.processlifecycledemo.service.ActivityWithService
class ActivityWithService: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val serviceIntent = Intent(this, MyService::class.java)
        startService(serviceIntent)
        finish()
    }
}