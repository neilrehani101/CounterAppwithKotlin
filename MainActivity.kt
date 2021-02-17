package com.techboycorp.countingy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val plus = findViewById(R.id.plus) as Button
        val minus = findViewById(R.id.minus) as Button
        val reset = findViewById(R.id.reset) as Button
        val num = findViewById(R.id.num) as TextView
        var time = 0

        plus.setOnClickListener {
            time++
            num.text = time.toString()
            Toast.makeText(this@MainActivity, "Increased", Toast.LENGTH_SHORT).show()

        }

        minus.setOnClickListener {
            time--
            num.text = time.toString()
            Toast.makeText(this@MainActivity, "Decreased", Toast.LENGTH_SHORT).show()

        }

        reset.setOnClickListener {
            time = 0
            num.text = time.toString()
            Toast.makeText(this@MainActivity, "Reset", Toast.LENGTH_SHORT).show()
        }
    }
}