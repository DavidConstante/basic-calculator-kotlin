package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtValue1 = findViewById<EditText>(R.id.txtValue1) as EditText
        val txtValue2 = findViewById<EditText>(R.id.txtValue2) as EditText

        val buttonPlus = findViewById<Button>(R.id.buttonPlus) as Button
        val buttonMinus = findViewById<Button>(R.id.buttonSubstraction) as Button
        val buttonMultiply = findViewById<Button>(R.id.buttonMultiply) as Button
        val buttonDivide = findViewById<Button>(R.id.buttonDivide) as Button
        val buttonFactorial = findViewById<Button>(R.id.buttonFactorial) as Button
        val buttonPow = findViewById<Button>(R.id.buttonPow) as Button


        buttonPlus.setOnClickListener(){
            PlusVals(txtValue1,txtValue2)
        }

        buttonMinus.setOnClickListener(){
            SubstractVals(txtValue1,txtValue2)
        }

        buttonMultiply.setOnClickListener(){
            MultiplyVals(txtValue1,txtValue2)
        }

        buttonDivide.setOnClickListener(){
            DivideVals(txtValue1,txtValue2)
        }

        buttonPow.setOnClickListener(){
            PowVals(txtValue1,txtValue2)
        }

        buttonFactorial.setOnClickListener(){
            FactVals(txtValue1,txtValue2)
        }
    }

    private fun SubstractVals(txtValue1: EditText, txtValue2: EditText) {

        if (txtValue1.text.toString().trim().isEmpty() || txtValue2.text.toString().trim().isEmpty() ){
            Toast.makeText(this,"Plese insert both values", Toast.LENGTH_LONG).show()
        }else{
            var res = txtValue1.text.toString().toFloat() - txtValue2.text.toString().toFloat()
            Toast.makeText(this,"El Resultado es " + res.toString(), Toast.LENGTH_LONG).show()

            txtValue1.setText("")
            txtValue2.setText("")
        }
    }

    private fun PlusVals(txtValue1: EditText, txtValue2: EditText) {

        if (txtValue1.text.toString().trim().isEmpty() || txtValue2.text.toString().trim().isEmpty() ){
            Toast.makeText(this,"Plese insert both values", Toast.LENGTH_LONG).show()
        }else{
            var res = txtValue1.text.toString().toFloat() + txtValue2.text.toString().toFloat()
            Toast.makeText(this,"El Resultado es " + res.toString(), Toast.LENGTH_LONG).show()

            txtValue1.setText("")
            txtValue2.setText("")
        }
    }

    private fun MultiplyVals(txtValue1: EditText, txtValue2: EditText) {

        if (txtValue1.text.toString().trim().isEmpty() || txtValue2.text.toString().trim().isEmpty() ){
            Toast.makeText(this,"Plese insert both values", Toast.LENGTH_LONG).show()
        }else{
            var res = txtValue1.text.toString().toFloat() * txtValue2.text.toString().toFloat()
            Toast.makeText(this,"El Resultado es " + res.toString(), Toast.LENGTH_LONG).show()

            txtValue1.setText("")
            txtValue2.setText("")
        }
    }

    private fun DivideVals(txtValue1: EditText, txtValue2: EditText) {

        if (txtValue1.text.toString().trim().isEmpty() || txtValue2.text.toString().trim().isEmpty() ){
            Toast.makeText(this,"Plese insert both values", Toast.LENGTH_LONG).show()
        }else{
            var res = txtValue1.text.toString().toFloat() / txtValue2.text.toString().toFloat()
            Toast.makeText(this,"El Resultado es " + res.toString(), Toast.LENGTH_LONG).show()

            txtValue1.setText("")
            txtValue2.setText("")
        }
    }

    private fun PowVals(txtValue1: EditText, txtValue2: EditText) {

        if (txtValue1.text.toString().trim().isEmpty() || txtValue2.text.toString().trim().isEmpty() ){
            Toast.makeText(this,"Plese insert both values", Toast.LENGTH_LONG).show()
        }else{
            var res = Math.pow(txtValue1.text.toString().toDouble(),txtValue2.text.toString().toDouble())
            Toast.makeText(this,"El Resultado es " + res.toString(), Toast.LENGTH_LONG).show()

            txtValue1.setText("")
            txtValue2.setText("")
        }
    }

    private fun FactVals(txtValue1: EditText, txtValue2: EditText) {

        if (txtValue1.text.toString().trim().isEmpty()  ){
            Toast.makeText(this,"Plese insert value", Toast.LENGTH_LONG).show()
        }else{
            var res = CalcFactorial(txtValue1.text.toString().trim().toInt())
            Toast.makeText(this,"El Resultado es " + res.toString(), Toast.LENGTH_LONG).show()

            txtValue1.setText("")
            txtValue2.setText("")
        }
    }

    fun CalcFactorial(num: Int): Long {
        if (num >= 1)
            return num * CalcFactorial(num - 1)
        else
            return 1
    }



}