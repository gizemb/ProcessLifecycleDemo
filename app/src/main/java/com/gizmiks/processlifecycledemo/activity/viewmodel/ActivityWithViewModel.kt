package com.gizmiks.processlifecycledemo.activity.viewmodel

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.gizmiks.processlifecycledemo.R
import com.gizmiks.processlifecycledemo.activity.BaseActivity
import kotlinx.android.synthetic.main.activity_with_vm.*

class ActivityWithViewModel : BaseActivity() {
    override val layoutResId: Int = R.layout.activity_with_vm

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel: MyViewModel by viewModels()

        viewModel.numberLiveData.observe(this, Observer {
            activityWithVmTextviewNumber.text = "Number is: $it"
        })
        activityWithVmButtonIncrementNumber.setOnClickListener {
            viewModel.incrementNumber()
        }
    }

    companion object {
        fun newIntent(context: Context) = Intent(context, ActivityWithViewModel::class.java)
    }
}