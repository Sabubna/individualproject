package com.example.individualproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val textView = findViewById<TextView>(R.id.textView10)

        textView.setOnClickListener {
            startActivity(Intent(this, MainActivity5::class.java))
        }
    }
}
