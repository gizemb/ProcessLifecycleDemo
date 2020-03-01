package com.gizmiks.processlifecycledemo.ui.fragment

import android.widget.Toast
import androidx.fragment.app.Fragment
import com.gizmiks.processlifecycledemo.R

class SecondFragment(private var text: String) : Fragment(R.layout.fragment_second) {

    override fun onResume() {
        super.onResume()
        Toast.makeText(context, "Text is: $text", Toast.LENGTH_SHORT).show()
    }
}