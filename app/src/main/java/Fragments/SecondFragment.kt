package Fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragmenthomework.R

class SecondFragment: Fragment(R.layout.second_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.resultAmount).text = SecondFragmentArgs.fromBundle(requireArguments()).amount.toString()

    }

}