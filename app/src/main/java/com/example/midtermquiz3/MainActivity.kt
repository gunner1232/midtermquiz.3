package com.example.midtermquiz3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.Button
import android.widget.EditText

//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        val buttonApp1: Button = findViewById(R.id.buttonApp1)
//        val buttonApp2: Button = findViewById(R.id.buttonApp2)
//
//        buttonApp1.setOnClickListener {
//            val intent = Intent()
//            intent.setClassName("com.example.midtermquiz3", "com.example.midtermquiz3.midtermquiz2")
//            intent.putExtra("message", "Hello from NewApp to App1")
//            startActivity(intent)
//        }
//
//        buttonApp2.setOnClickListener {
//            val intent = Intent()
//            intent.setClassName("com.example.midtermquiz3", "com.example.midtermquiz3.quiz1")
//            intent.putExtra("message", "Hello from NewApp to App2")
//            startActivity(intent)
//        }
//    }
//}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val etUserMessage: EditText = findViewById(R.id.etUserMessage)
        val btnSendMsgToNextActivity1: Button = findViewById(R.id.buttonApp1)
        btnSendMsgToNextActivity1.setOnClickListener {
            val message: String = etUserMessage.text.toString()
            val intent = Intent(this, quiz1::class.java)
            intent.putExtra("key", message)
            startActivity(intent)
        }
        val btnSendMsgToNextActivity2: Button = findViewById(R.id.buttonApp2)
        btnSendMsgToNextActivity2.setOnClickListener {
            val message: String = etUserMessage.text.toString()
            val intent = Intent(this, midtermquiz2::class.java)
            intent.putExtra("key", message)
            startActivity(intent)
        }
    }
}