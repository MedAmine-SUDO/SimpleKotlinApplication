package com.example.myfirstandroidapp

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_authentication.*
import java.time.LocalDateTime

class AuthenticationActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentication)

        val dateTime = LocalDateTime.now()
        dataTimeField.text = dateTime.toString()

        updateButton.setOnClickListener {
            val dateTime = LocalDateTime.now()
            dataTimeField.text = dateTime.toString()
        }

        SigninButton.setOnClickListener {
            val username = loginId.text
            val pwd = passId.text
            if(pwd.toString().equals("pw"+username.toString())){
                Toast.makeText(applicationContext, "Successfull connection!",Toast.LENGTH_LONG).show();
                intent = Intent(applicationContext, ComputeActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(applicationContext, "Check password or username !",Toast.LENGTH_LONG).show();
            }
        }
    }
}