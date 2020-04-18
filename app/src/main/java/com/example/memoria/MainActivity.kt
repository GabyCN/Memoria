package com.example.memoria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener()
    }

    private fun setListener(){
        val clickableViews: List<View> =
            listOf(tvBoxONE,tvBoxTWO,tvBoxThree,tvBoxFOUR,tvBoxFIVE,tvBoxSIX,tvBoxSEVEN,tvBoxEIGHT,btnREANUDAR)
        for (item in clickableViews){
            item.setOnClickListener{changeImage(it)}
        }
    }

    private fun changeImage(view: View){
        when(view.id){
            R.id.tvBoxONE -> view.setBackgroundResource(R.drawable.la0)
            R.id.tvBoxTWO -> view.setBackgroundResource(R.drawable.la1)
            R.id.tvBoxThree -> view.setBackgroundResource(R.drawable.la2)
            R.id.tvBoxFOUR -> view.setBackgroundResource(R.drawable.la3)
            R.id.tvBoxFIVE -> view.setBackgroundResource(R.drawable.la2)
            R.id.tvBoxSIX -> view.setBackgroundResource(R.drawable.la3)
            R.id.tvBoxSEVEN -> view.setBackgroundResource(R.drawable.la0)
            R.id.tvBoxEIGHT -> view.setBackgroundResource(R.drawable.la1)

            R.id.btnREANUDAR ->{tvBoxONE.setBackgroundResource(R.drawable.corazon);
                                tvBoxTWO.setBackgroundResource(R.drawable.corazon);
                                tvBoxThree.setBackgroundResource(R.drawable.corazon);
                                tvBoxFOUR.setBackgroundResource(R.drawable.corazon)
                                tvBoxFIVE.setBackgroundResource(R.drawable.corazon)
                                tvBoxSIX.setBackgroundResource(R.drawable.corazon)
                                tvBoxSEVEN.setBackgroundResource(R.drawable.corazon)
                                tvBoxEIGHT.setBackgroundResource(R.drawable.corazon)}



        }
    }


}
