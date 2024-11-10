package com.example.firstassingment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)

        findViewById<TextView>(R.id.register)?.setOnClickListener {
            setContentView(R.layout.create_account)

            findViewById<TextView>(R.id.login)?.setOnClickListener {
                setContentView(R.layout.login_page)
            }
        }
    }
}