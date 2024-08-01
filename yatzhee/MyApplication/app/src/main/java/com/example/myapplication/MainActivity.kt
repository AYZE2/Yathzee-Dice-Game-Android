package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var startbt = findViewById<Button>(R.id.bt3)
        startbt.setOnClickListener {
            var p = Intent(this, homepage::class.java )
            startActivity(p)
        }
        var startgbt = findViewById<Button>(R.id.bt4)
        startgbt.setOnClickListener {
            var l = Intent(this, newgame::class.java)
            startActivity(l)
        }


    }
}