package com.gizmiks.processlifecycledemo.ui.fragment

import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.gizmiks.processlifecycledemo.R
import com.gizmiks.processlifecycledemo.ui.activity.BaseActivity

class ActivityWithFragment : BaseActivity() {
    override val layoutResId: Int = R.layout.activity_with_fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        trx {
            add(R.id.activityWithFragmentContainerLayout, FirstFragment())
        }
    }

    fun openSecondFragment(text: String) = trx {
        replace(R.id.activityWithFragmentContainerLayout, SecondFragment.newInstance(text))
    }

    private fun trx(func: FragmentTransaction.() -> FragmentTransaction) {
        supportFragmentManager.beginTransaction()
            .func()
            .commit()
    }
}