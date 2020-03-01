package com.gizmiks.processlifecycledemo.ui.activity

import android.os.Bundle
import com.gizmiks.processlifecycledemo.R
import kotlinx.android.synthetic.main.activity_simple_variable.*

class ActivitySimpleVariable : BaseActivity() {

    private var x = 5

    override val layoutResId: Int = R.layout.activity_simple_variable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        simpleVarTextviewX.text = "Value of x: $x"
        simpleVarButtonIncrement.setOnClickListener {
            x+=1
            simpleVarTextviewX.text = "Value of x: $x"
        }
    }

}