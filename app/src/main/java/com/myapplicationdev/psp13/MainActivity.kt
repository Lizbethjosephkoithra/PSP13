package com.myapplicationdev.psp13

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.IntegerRes
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var num = ""
    var symbol = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnOnClick(view: View) {
        val btnSelected = view as Button
        when (btnSelected.id) {
            button0.id -> num = "0"
            button1.id -> num = "1"
            button2.id -> num = "2"
            button3.id -> num = "3"
            button4.id -> num = "4"
            button5.id -> num = "5"
            button6.id -> num = "6"
            button7.id -> num = "7"
            button8.id -> num = "8"
            button9.id -> num = "9"
            buttonAC.id -> {
                tv.text = ""
            }

        }
        tv.text = num

    }

    fun btnOnClick1(view: View) {
        val btnSelected = view as Button
        when (btnSelected.id) {
            buttonDecimal.id -> symbol = "."
            buttonAdd.id -> symbol = "+"
            buttonSubtract.id -> symbol = "-"
            buttonDivide.id -> symbol = "/"
            buttonMultiply.id -> symbol = "*"
        }
    }


    fun btnOnClick2(view: View) {
        var secondNum = tv.text
        var value = ""
        val btnSelected = view as Button
        when (btnSelected.id) {
            buttonEquals.id -> {
                if (symbol.equals("+")) {
                    value = num + secondNum
                } else if (symbol.equals("*")) {
                    value = num * secondNum
                } else if (symbol.equals("-")) {
                    if (num > secondNum.toString()) {
                        value = num - secondNum
                    } else {
                        value = secondNum - num
                    }

                } else if (symbol.equals("/")) {
                    if (num > secondNum.toString()) {
                        value = num / secondNum
                    } else {
                        value = secondNum / num
                    }

                }
                tv.text = value
            }
        }


    }
}
