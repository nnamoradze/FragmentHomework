package Fragments

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.fragment.app.Fragment
import com.example.fragmenthomework.R

class FourthFragment: Fragment(R.layout.fourth_fragment) {
    private lateinit var firstAnswerCB: CheckBox
    private lateinit var secondAnswerCB: CheckBox
    private lateinit var thirdAnswerCB: CheckBox
    private lateinit var image: ImageView

    var score = 0

    private lateinit var questions: TextView


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        image = view.findViewById(R.id.gswImageView)
        firstAnswerCB = view.findViewById(R.id.firstAnswer)
        secondAnswerCB = view.findViewById(R.id.secondAnswer)
        thirdAnswerCB = view.findViewById(R.id.thirdAnswer)
        questions = view.findViewById(R.id.question)

        firstAnswerCB.setOnClickListener{
            secondQuestion()
            firstAnswerCB.isChecked = false

        }

        secondAnswerCB.setOnClickListener{
            score+=1
            secondAnswerCB.isChecked = false
            secondQuestion()

        }

        thirdAnswerCB.setOnClickListener{
            secondQuestion()
            thirdAnswerCB.isChecked = false

        }


    }

    private fun secondQuestion() {
        questions.text = "ვინ გახდა 2017 წელს season MVP"
        firstAnswerCB.text = "S.Curry"
        secondAnswerCB.text = "L.James"
        thirdAnswerCB.text = "K.Durant"
        image.setImageResource(R.drawable._017mvp)


        firstAnswerCB.setOnClickListener{
            thirdQuestion()
            firstAnswerCB.isChecked = false

        }

        secondAnswerCB.setOnClickListener{
            secondAnswerCB.isChecked = false
            thirdQuestion()

        }

        thirdAnswerCB.setOnClickListener{
            thirdQuestion()
            score+=1
            thirdAnswerCB.isChecked = false

        }


    }

    private fun thirdQuestion() {

        questions.text = "რამდენი ქულა აქვს ჩაგდებული ერთ თამაშში კობი ბრაიანტს"
        firstAnswerCB.text = "81"
        secondAnswerCB.text = "67"
        thirdAnswerCB.text = "92"
        image.setImageResource(R.drawable.kobee)


        firstAnswerCB.setOnClickListener{
            score+=1
            firstAnswerCB.isChecked = false
            showScore()
        }

        secondAnswerCB.setOnClickListener{
            secondAnswerCB.isChecked = false
            showScore()
        }

        thirdAnswerCB.setOnClickListener{
            score+=1
            thirdAnswerCB.isChecked = false
            showScore()
        }


    }

    private fun showScore() {
        questions.text = "თქვენ დააგროვეთ ${score} ქულა 3-დან, კმაყოფილი ხართ?"
        firstAnswerCB.text = "დიახ"
        secondAnswerCB.text = "არც,ისე"
        thirdAnswerCB.text = "არა"
        image.setImageResource(R.drawable.thx)

        firstAnswerCB.setOnClickListener{
            firstAnswerCB.isChecked = false
            Toast.makeText(context, "მადლობა <3", Toast.LENGTH_SHORT).show()
        }

        secondAnswerCB.setOnClickListener{
            secondAnswerCB.isChecked = false
            Toast.makeText(context, "შემდეგში უკეთესი იქნება", Toast.LENGTH_SHORT).show()
        }

        thirdAnswerCB.setOnClickListener{
            thirdAnswerCB.isChecked = false
            Toast.makeText(context, "რატო? მე ხომ ვიწვალე :((", Toast.LENGTH_SHORT).show()
        }

    }


}