package com.example.myfirstandroidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_compute.*

class ComputeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compute)

        //change view on radio check change
        radioGroup.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val checked: String = resources.getResourceEntryName(checkedId)
                if(checked.equals("squareId")){
                    textView3.text = "Value"
                    textView4.visibility = View.INVISIBLE
                    Value2Text.visibility = View.INVISIBLE
                }else{
                    textView3.text = "Value 1"
                    textView4.visibility = View.VISIBLE
                    Value2Text.visibility = View.VISIBLE
                }
            }
        )

        calculatebtn.setOnClickListener {
            if(sumId.isChecked){
                resultText.text = (value1Text.text.toString().toInt()+Value2Text.text.toString().toInt()).toString()
            }else{
                resultText.text = (value1Text.text.toString().toInt() * value1Text.text.toString().toInt()).toString()
            }
        }

        signOutBtn.setOnClickListener {
            this.intent = Intent(this, AuthenticationActivity::class.java)
            startActivity(intent)
        }
    }
}

