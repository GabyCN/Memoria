package com.example.memoria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.absoluteValue

class MainActivity : AppCompatActivity() {

  var mutableList: MutableList<Int> = mutableListOf(1,2,3,4,5,6,7,8)
  var num:MutableList<Int> = mutableListOf(0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener()
        btnREANUDAR.setOnClickListener{
            reanudar(it)
        }
    }

    private fun setListener(){
        val clickableViews: List<View> =
            listOf(tvBoxONE,tvBoxTWO,tvBoxThree,tvBoxFOUR,tvBoxFIVE,tvBoxSIX,tvBoxSEVEN,tvBoxEIGHT)
        for (item in clickableViews){
            item.setOnClickListener{changeImage(it)}
        }
    }

    private fun changeImage(view: View) {


        val randomInt = mutableList.shuffled().take(1)[0]

        val drawableResource = when (randomInt) {

            /*1, 4 -> R.drawable.la0
            2, 5 -> R.drawable.la1
            3, 6 -> R.drawable.la2
            7, 8 -> R.drawable.la3
            else -> R.drawable.corazon*/

            1->R.drawable.la0
            2->R.drawable.la0
            3->R.drawable.la1
            4->R.drawable.la1
            5->R.drawable.la2
            6->R.drawable.la2
            7->R.drawable.la3
            else->R.drawable.la3

        }

        when (view.id) {
            R.id.tvBoxONE -> view.setBackgroundResource(drawableResource)
            R.id.tvBoxTWO -> view.setBackgroundResource(drawableResource)
            R.id.tvBoxThree -> view.setBackgroundResource(drawableResource)
            R.id.tvBoxFOUR -> view.setBackgroundResource(drawableResource)
            R.id.tvBoxFIVE -> view.setBackgroundResource(drawableResource)
            R.id.tvBoxSIX -> view.setBackgroundResource(drawableResource)
            R.id.tvBoxSEVEN -> view.setBackgroundResource(drawableResource)
            R.id.tvBoxEIGHT -> view.setBackgroundResource(drawableResource)


        }

        if (randomInt == 1 && num.first() == 4 || randomInt == 4 && num.first() == 1 ||
            randomInt == 2 && num.first() == 5 || randomInt == 5 && num.first() == 2 ||
            randomInt == 3 && num.first() == 6 || randomInt == 6 && num.first() == 3 ||
            randomInt == 7 && num.first() == 8 || randomInt == 8 && num.first() == 7 ||
            num.first()==0 ) {




            num.add(0, randomInt)
            mutableList.remove(randomInt)





        } else {
            if (num.first()==1|| num.first()==4){
                tvBoxONE.setBackgroundResource(R.drawable.corazon)
                tvBoxFOUR.setBackgroundResource(R.drawable.corazon)
            }
            if (num.first()==2|| num.first()==5){
                tvBoxTWO.setBackgroundResource(R.drawable.corazon)
                tvBoxFIVE.setBackgroundResource(R.drawable.corazon)
            }
            if (num.first()==3|| num.first()==6){
                tvBoxThree.setBackgroundResource(R.drawable.corazon)
                tvBoxSIX.setBackgroundResource(R.drawable.corazon)
            }
            if (num.first()==7|| num.first()==8){
                tvBoxSEVEN.setBackgroundResource(R.drawable.corazon)
                tvBoxEIGHT.setBackgroundResource(R.drawable.corazon)
            }

            }


        }
    fun reanudar(view: View) {
        when (view.id) {
            R.id.btnREANUDAR -> {
                tvBoxONE.setBackgroundResource(R.drawable.corazon);
                tvBoxTWO.setBackgroundResource(R.drawable.corazon);
                tvBoxThree.setBackgroundResource(R.drawable.corazon);
                tvBoxFOUR.setBackgroundResource(R.drawable.corazon);
                tvBoxFIVE.setBackgroundResource(R.drawable.corazon);
                tvBoxSIX.setBackgroundResource(R.drawable.corazon);
                tvBoxSEVEN.setBackgroundResource(R.drawable.corazon);
                tvBoxEIGHT.setBackgroundResource(R.drawable.corazon)
            }

        }

        mutableList.add(1)
        mutableList.add(2)
        mutableList.add(3)
        mutableList.add(4)
        mutableList.add(5)
        mutableList.add(6)
        mutableList.add(7)
        mutableList.add(8)

        num.clear()
        num.add(0)

    }


    }

