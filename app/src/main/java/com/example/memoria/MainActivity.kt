package com.example.memoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import java.util.concurrent.Delayed
import kotlin.collections.ArrayList
import kotlin.concurrent.schedule
import kotlin.concurrent.timer
import kotlin.concurrent.timerTask
import kotlin.math.absoluteValue

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rgTodo.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener{ group, checkedId ->
                val radio :RadioButton= findViewById(checkedId)


                    when (radio.getId()) {
                        R.id.rb2x2 -> {val intent=Intent(this,memoria2x2::class.java)
                        startActivity(intent)}

                        R.id.rb2x3 ->{ val intent=Intent(this, memoria2x3::class.java)
                        startActivity(intent)}

                       else -> {val intent= Intent(this,memoria2x8::class.java)
                        startActivity(intent)   }       }})


        }




    }








