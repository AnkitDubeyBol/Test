package com.lji.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private var plusButton : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculator_screen)


        plusButton = findViewById(R.id.btn_add)

        plusButton?.setOnClickListener {
            println("Plus button clicked...")
        }

    }
}