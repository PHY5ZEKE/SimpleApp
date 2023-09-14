package com.example.simpleapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    //Variable Declarations
    var sumText: String = ""
    var sumNum: Int = 0
    var isAddActive: Boolean = false
    var isSubActive: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
//Add and Minus Operations
    fun add(view:View)
    {
        isAddActive = true
    }
    fun minus(view: View)
    {
        if(sumText.isNotEmpty()||sumNum>0)
        {
            isSubActive = true
        }
        else
        {
            Toast.makeText(this, "Invalid! Values are Empty", Toast.LENGTH_SHORT).show()
        }

    }
//A B C Operations
    fun addLetter(letter: Char)
    {
            sumText += letter
            Toast.makeText(this, sumText, Toast.LENGTH_SHORT).show()
            isAddActive = false
    }
    fun subtractLetter()
    {
            if (sumText.isNotEmpty()) {
                sumText = sumText.substring(0, sumText.length - 1)
                Toast.makeText(this, sumText, Toast.LENGTH_SHORT).show()
                isSubActive = false
            } else {
                Toast.makeText(this, "Invalid! Values are Empty", Toast.LENGTH_SHORT).show()
        }
    }
    fun addA(view: View)
    {
        if (isAddActive) {
            addLetter('a')
        }
        else if(isSubActive)
        {
            subtractLetter()
        }
        else {
            Toast.makeText(this, "Plus is Not Selected", Toast.LENGTH_SHORT).show()
        }
    }

    fun addB(view: View)
    {
        if (isAddActive)
        {
            addLetter('b')
        }
        else if(isSubActive)
        {
            subtractLetter()
        }
        else {
            Toast.makeText(this, "Plus is Not Selected", Toast.LENGTH_SHORT).show()
        }
    }

    fun addC(view: View)
    {
        if (isAddActive)
        {
            addLetter('c')
        }
        else if(isSubActive)
        {
            subtractLetter()
        }
        else {
            Toast.makeText(this, "Plus is Not Selected", Toast.LENGTH_SHORT).show()
        }
    }
        //1 2 3 Operations
        fun addNumber(number:Int)
        {
            if (isAddActive) {
                sumNum += number
                Toast.makeText(this, sumNum.toString(), Toast.LENGTH_SHORT).show()
                isAddActive = false
            }
        }
    fun subNumber(number:Int)
    {
        if(sumNum>0)
        {
            if (isSubActive)
            {
                    sumNum -= number
                    if(sumNum>=0)
                    {
                        Toast.makeText(this, sumNum.toString(), Toast.LENGTH_SHORT).show()
                        isSubActive = false
                    }
                    else
                    {
                        Toast.makeText(this,"Number is Negative", Toast.LENGTH_SHORT).show()
                        isSubActive = false
                        sumNum=0
                    }
            }
        }

    }
        fun add1(view: View)
        {
            if (isAddActive) {
                addNumber(1)
            }
            else if(isSubActive)
            {
                subNumber(1)
            }
            else{
                Toast.makeText(this, "Plus is Not Selected", Toast.LENGTH_SHORT).show()
            }
        }

        fun add2(view: View)
        {
            if (isAddActive) {
                addNumber(2)
            }
            else if(isSubActive)
            {
                subNumber(2)
            }
            else{
                Toast.makeText(this, "Plus is Not Selected", Toast.LENGTH_SHORT).show()
            }

        }
        fun add3(view: View)
        {
            if (isAddActive)
            {
                addNumber(3)
            }
            else if(isSubActive)
            {
                subNumber(3)
            }
            else
            {
                Toast.makeText(this, "Plus is Not Selected", Toast.LENGTH_SHORT).show()
            }
        }
    }
