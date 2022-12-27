package com.example.tapeworm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener{
            Toast.makeText(this, button1.text, Toast.LENGTH_SHORT).show()
        }

        button2.setOnClickListener{
            Toast.makeText(this, button2.text, Toast.LENGTH_SHORT).show()
        }

        button3.setOnClickListener{
            Toast.makeText(this, button3.text, Toast.LENGTH_SHORT).show()
        }

        button4.setOnClickListener{
            Toast.makeText(this, button4.text, Toast.LENGTH_SHORT).show()
        }

        button5.setOnClickListener{
            Toast.makeText(this, button5.text, Toast.LENGTH_SHORT).show()
        }
    }
}