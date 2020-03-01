package com.gizmiks.processlifecycledemo.ui.activity

import android.content.Context
import android.content.Intent
import com.gizmiks.processlifecycledemo.R

class ActivityWithEditText : BaseActivity() {
    override val layoutResId: Int = R.layout.activity_edittext

    companion object {
        fun newIntent(context: Context) = Intent(context, ActivityWithEditText::class.java)
    }
}