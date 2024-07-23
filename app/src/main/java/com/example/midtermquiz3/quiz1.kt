package com.example.midtermquiz3

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class quiz1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addButton: Button = findViewById(R.id.btResult1)
        val subtractButton: Button = findViewById(R.id.btResult2)
        val multiplyButton: Button = findViewById(R.id.btResult3)
        val divideButton: Button = findViewById(R.id.btResult4)
        val edtxt1: EditText = findViewById(R.id.ednum1)
        val edtxt2: EditText = findViewById(R.id.ednum2)
        val resultTV: TextView = findViewById(R.id.textResult)
        val messageTV: TextView = findViewById(R.id.messageView)

        val message = intent.getStringExtra("message")
        messageTV.text = message ?: "No message received"

        val clickListener = View.OnClickListener { view ->
            val x = edtxt1.text.toString().toDoubleOrNull()
            val y = edtxt2.text.toString().toDoubleOrNull()

            if (x != null && y != null) {
                val result = when (view.id) {
                    R.id.btResult1 -> x + y
                    R.id.btResult2 -> x - y
                    R.id.btResult3 -> x * y
                    R.id.btResult4 -> if (y != 0.0) x / y else null
                    else -> null
                }
                resultTV.text = result?.toString() ?: "The divisor cannot be 0"
            } else {
                resultTV.text = "Please enter a valid number"
            }
        }

        addButton.setOnClickListener(clickListener)
        subtractButton.setOnClickListener(clickListener)
        multiplyButton.setOnClickListener(clickListener)
        divideButton.setOnClickListener(clickListener)
    }
}