package com.databindingmedium

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.databindingmedium.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding //Binding Object Created

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.activityTextView.text="Activity Text View"
        binding.mainActivityObject=this //mainActivityObject'e burayı tanıttık
        binding.sumResult="0" //Null hatası almamak için default değer verildi.
    }
    /*Parametresiz function
      fun sumCalculation(){
        val firstNumber=binding.firstNumberEditText.text.toString().toInt()
        val secondNumber=binding.secondNumberEditText.text.toString().toInt()
        val sum= firstNumber+secondNumber
        binding.resultTextView.text=sum.toString()
    }
*/
   /* Parametreli Function
     fun sumCalculation(firstNumber:String,secondNumber:String){
        val firstNumber=firstNumber.toInt()
        val secondNumber=secondNumber.toInt()
        val sum= firstNumber+secondNumber
        binding.resultTextView.text=sum.toString()
    }
*/
    fun sumCalculation(firstNumber:String,secondNumber:String){
        val firstNumber=firstNumber.toInt()
        val secondNumber=secondNumber.toInt()
        val sum= firstNumber+secondNumber
        binding.sumResult =sum.toString()
    }


}