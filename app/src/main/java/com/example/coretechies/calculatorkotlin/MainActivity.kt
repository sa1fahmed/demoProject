package com.example.coretechies.calculatorkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val num1 = findViewById(R.id.editText) as EditText
        val num2 = findViewById(R.id.editText2) as EditText
        val add = findViewById(R.id.button) as Button
        val sub = findViewById(R.id.button2) as Button
        val mul = findViewById(R.id.button3) as Button
        val div = findViewById(R.id.button4) as Button
        val res= findViewById(R.id.textView) as TextView

        add.setOnClickListener{
           val s1= Integer.parseInt(num1.getText().toString())
            val s2= Integer.parseInt(num2.getText().toString())
            val total:Int = s1+s2
            res.setText(total.toString())

        }
        sub.setOnClickListener{
            val s1= Integer.parseInt(num1.getText().toString())
            val s2= Integer.parseInt(num2.getText().toString())
            val total:Int = s1-s2
            res.setText(total.toString())
        }

        mul.setOnClickListener{
            val s1= Integer.parseInt(num1.getText().toString())
            val s2= Integer.parseInt(num2.getText().toString())
            val total:Int = s1*s2
            res.setText(total.toString())

        }
        div.setOnClickListener{
            val s1= (num1.getText().toString()).toFloat()
            val s2= (num2.getText().toString()).toFloat()
            val total:Float = (s1/s2)
            res.setText(total.toString())
        }

    }



}
