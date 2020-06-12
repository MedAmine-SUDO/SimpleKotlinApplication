package com.example.myfirstandroidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(applicationContext, "This app is developed by Amine The one and only!",Toast.LENGTH_LONG).show();

        enterBtn.setOnClickListener {
            intent = Intent(applicationContext, AuthenticationActivity::class.java)
            startActivity(intent)
        }
    }
}


