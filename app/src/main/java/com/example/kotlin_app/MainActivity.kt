package com.example.kotlin_app

import android.os.Bundle
import android.view.DragEvent
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() , View.OnClickListener{

    lateinit var btnAdd : Button
    lateinit var btnSub : Button
    lateinit var btnMultiply : Button
    lateinit var bunDivision : Button
    lateinit var etA :EditText
    lateinit var etB : EditText
    lateinit var resultly : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        btnAdd = findViewById(R.id.btm_add)
        btnSub = findViewById(R.id.btm_subtraction)
        btnMultiply = findViewById(R.id.btm_multiplication)
        bunDivision = findViewById(R.id.btm_division)
        etA = findViewById(R.id.it_a)
        etB  = findViewById(R.id.it_b)
        resultly = findViewById(R.id.result_tv)


        btnAdd.setOnClickListener(this)
        btnSub.setOnClickListener(this)
        btnMultiply.setOnClickListener(this)
        bunDivision.setOnClickListener(this)



    }

    override fun onClick(v: View?) {
        var a =etA.text.toString().toDouble()
        var b =etB.text.toString().toDouble()
        var result = 0.0
        when(v?.id){
            R.id.btm_add->{
                result = a+b
            }
            R.id.btm_subtraction->{
                result = a-b
            }
            R.id.btm_multiplication->{
                result = a*b
            }
            R.id.btm_division->{
                result = a/b
            }

        }
        resultly.text = "Result is $result"
    }


}