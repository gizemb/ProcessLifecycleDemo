package com.gizmiks.processlifecycledemo.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gizmiks.processlifecycledemo.Logger

abstract class BaseActivity : AppCompatActivity() {

    abstract val layoutResId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutResId)
        Logger.logProcessId(this)
        Logger.logMessage(this, "$this onCreate, bundle: $savedInstanceState")
    }

    override fun onStart() {
        super.onStart()
        Logger.logMessage(this, "$this onStart")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Logger.logMessage(this, "$this onRestoreInstanceState, bundle: $savedInstanceState")
    }

    override fun onResume() {
        super.onResume()
        Logger.logMessage(this, "$this onResume")
    }

    override fun onPause() {
        Logger.logMessage(this, "$this onPause")
        super.onPause()
    }

    override fun onStop() {
        Logger.logMessage(this, "$this onStop")
        super.onStop()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Logger.logMessage(this, "$this onSaveInstanceState, bundle: $outState")
        super.onSaveInstanceState(outState)
    }

    override fun onDestroy() {
        Logger.logMessage(this, "$this onDestroy")
        super.onDestroy()
    }
}