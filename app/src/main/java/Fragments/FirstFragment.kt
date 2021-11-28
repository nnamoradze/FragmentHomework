package Fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.fragmenthomework.R

class FirstFragment: Fragment(R.layout.first_fragment){

    private lateinit var amountET: EditText
    private lateinit var submitBtn: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        amountET = view.findViewById(R.id.amountEditText)
        submitBtn = view.findViewById(R.id.amountSubmitBtn)

        val navController = Navigation.findNavController(view)

        submitBtn.setOnClickListener {

            val amountText = amountET.text.toString()

            if (amountText.isEmpty()){
                return@setOnClickListener
            }

            val amount = amountText.toInt()

            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment2(amount)

            navController.navigate(action)

        }


    }

}