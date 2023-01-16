package com.example.tapeworm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        topAppBar.setOnMenuItemClickListener{
            when (it.itemId) {
                R.id.settings -> {
                    Toast.makeText(this, "Настройки", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.about -> {
                    Toast.makeText(this, "О программе", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }

        bottom_navigation.setOnItemSelectedListener {
            when (it.itemId){
                R.id.news -> {
                    Toast.makeText(this, "Новости", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.favorites -> {
                    Toast.makeText(this, "Избранное", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.catalogue -> {
                    Toast.makeText(this, "Каталог фильмов", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }
}