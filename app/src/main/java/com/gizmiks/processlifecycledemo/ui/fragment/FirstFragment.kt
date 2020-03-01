package com.gizmiks.processlifecycledemo.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.gizmiks.processlifecycledemo.R
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment: Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragFirstButtonSubmit.setOnClickListener {
            (activity as? ActivityWithFragment)?.openSecondFragment(
                fragFirstEdittext.text.toString()
            )
        }
    }
}