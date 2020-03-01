package com.gizmiks.processlifecycledemo

import android.util.Log

object Logger {

    private fun tag(item: Any) = item.javaClass.simpleName

    fun logProcessId(item: Any) {
        Log.e(tag(item), "Process id: ${android.os.Process.myPid()}")
    }

    fun logMessage(item: Any, message: String) {
        Log.e(tag(item), message)
    }
}