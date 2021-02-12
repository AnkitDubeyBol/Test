package com.lji.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var plusButton : Button? = null
    private var minusButton : Button? = null
    private var multiplyButton : Button? = null
    private var divButton : Button? = null

    private var firstET : EditText? = null
    private var secondET : EditText? = null

    private var answerTV : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculator_screen)


        plusButton = findViewById(R.id.btn_add)
        minusButton = findViewById(R.id.btn_subtr)
        multiplyButton = findViewById(R.id.btn_mul)
        divButton = findViewById(R.id.btn_div)
        firstET = findViewById(R.id.et_first)
        secondET = findViewById(R.id.et_second)
        answerTV = findViewById(R.id.answer_tv)


        plusButton?.setOnClickListener {
            val firstNumber = firstET?.text.toString()
            val secondNumber = secondET?.text.toString()

            if(firstNumber.isEmpty()){
                Toast.makeText(this, "Enter first number", Toast.LENGTH_LONG).show()
            }
            else if(secondNumber.isEmpty()){
                Toast.makeText(this, "Enter second number", Toast.LENGTH_LONG).show()
            }
            else{
                val a = firstNumber.toInt()
                val b = secondNumber.toInt()
                val c = a+b
                answerTV?.text = "Total : $c"
            }
        }

        minusButton?.setOnClickListener {
            println("Minus button clicked...")
        }

        multiplyButton?.setOnClickListener {
            println("Multiply button clicked...")
        }

        divButton?.setOnClickListener {
            println("Div button clicked...")
        }

    }
}