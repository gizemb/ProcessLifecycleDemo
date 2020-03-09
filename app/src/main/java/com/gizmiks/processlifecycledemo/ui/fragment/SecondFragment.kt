package com.gizmiks.processlifecycledemo.ui.fragment

import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.gizmiks.processlifecycledemo.R

class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onResume() {
        super.onResume()
        val text = arguments?.getString(ARG_KEY_TEXT) ?: "no text found"
        Toast.makeText(context, "Text is: $text", Toast.LENGTH_SHORT).show()
    }

    companion object {
        private const val ARG_KEY_TEXT = "argKeyText"

        fun newInstance(text: String) = SecondFragment().apply {
            arguments = bundleOf(ARG_KEY_TEXT to text)
        }
    }
}