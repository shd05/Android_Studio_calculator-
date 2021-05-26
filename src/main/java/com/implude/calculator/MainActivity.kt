package com.implude.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {

    lateinit var num1: EditText
    lateinit var num2: EditText
    lateinit var result: TextView
    lateinit var pl: Button
    lateinit var mi: Button
    lateinit var divi: Button
    lateinit var multi: Button
    var inum1: Double = 0.0
    var inum2: Double = 0.0
    var rnum: Double = 0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        num1 = findViewById(R.id.number1) as EditText
        num2 = findViewById(R.id.number2) as EditText
        result = findViewById(R.id.textView3) as TextView
        pl = findViewById(R.id.pl) as Button
        mi = findViewById(R.id.mi) as Button
        multi = findViewById(R.id.multi) as Button
        divi = findViewById(R.id.divi) as Button




        pl.setOnClickListener({
            inum1 = num1.text.toString().toDouble()
            inum2 = num2.text.toString().toDouble()
            result.text=(inum1+inum2).toString()
        })
        mi.setOnClickListener({
            inum1= num1.text.toString().toDouble()
            inum2= num2.text.toString().toDouble()
            result.text=(inum1-inum2).toString()
        })
        multi.setOnClickListener({
            inum1= num1.text.toString().toDouble()
            inum2= num2.text.toString().toDouble()
            result.text=(inum1*inum2).toString()
        })
        divi.setOnClickListener({
            inum1= num1.text.toString().toDouble()
            inum2= num2.text.toString().toDouble()
            result.text=(inum1/inum2).toString()
        })
    }
}
