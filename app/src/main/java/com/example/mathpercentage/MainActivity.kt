package com.example.mathpercentage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        calculateBtn.setOnClickListener {
            val get_percent = percentageNumTxt.text.toString()
            val get_number = numberTxt.text.toString()

            val my_percent: Float = get_percent.toFloat()
            val my_number: Float = get_number.toFloat()

            val dec = my_percent?.div(100)
            val total = dec?.times(my_number)

            resultTxt.text = total.toString()


        }

    }
}