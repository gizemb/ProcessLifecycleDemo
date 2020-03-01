package com.gizmiks.processlifecycledemo

import android.app.Application

class DemoApp: Application() {
    override fun onCreate() {
        super.onCreate()
        Logger.logProcessId(this)
    }
}