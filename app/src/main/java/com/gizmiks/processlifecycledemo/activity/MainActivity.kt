package com.gizmiks.processlifecycledemo.activity

import android.content.Intent
import android.os.Bundle
import com.gizmiks.processlifecycledemo.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override val layoutResId: Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainButtonSimpleVariable.setOnClickListener {
            startActivity(Intent(this, ActivitySimpleVariable::class.java))
        }

        mainButtonEditTextIdExample.setOnClickListener {
            startActivity(ActivityWithEditText.newIntent(this))
        }
    }
}