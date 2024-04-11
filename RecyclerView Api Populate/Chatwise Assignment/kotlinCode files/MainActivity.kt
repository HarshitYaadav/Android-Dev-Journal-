package com.example.chatwiseassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val productidlist = findViewById<AppCompatButton>(R.id.productIDbtn)

        productidlist.setOnClickListener {
            val intent = Intent(this,ProductList::class.java)

            startActivity(intent)
        }
    }
}
