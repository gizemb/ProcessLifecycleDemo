package com.gizmiks.processlifecycledemo.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.gizmiks.processlifecycledemo.Logger

class MyService: Service() {

    override fun onCreate() {
        super.onCreate()
        Logger.logProcessId(this)
        Logger.logMessage(this, "$this, onCreate")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Logger.logMessage(this, "$this, onStartCommand")
        Thread.sleep(10000)
        Logger.logMessage(this, "service is finishing")
        stopSelf()
        return START_NOT_STICKY
    }

    override fun onDestroy() {
        Logger.logMessage(this, "$this, onDestroy")
        super.onDestroy()
    }

    override fun onBind(intent: Intent?): IBinder? = null

}