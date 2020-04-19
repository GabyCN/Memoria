package com.example.memoria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.absoluteValue

class MainActivity : AppCompatActivity() {

  var mutableList: MutableList<Int> = mutableListOf(1,2,3,4,5,6,7,8)
  var num:MutableList<Int> = mutableListOf(0)
    var cosa:MutableList<View> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener()
        btnREANUDAR.setOnClickListener{
            reanudar(it)
        }
        /*val one:TextView=findViewById(R.id.tvBoxONE)
        tvBoxONE.setOnClickListener{
            changeImage(it)
            //cosa.add(0,tvBoxONE)
        }
        tvBoxTWO.setOnClickListener{
            changeImage(it)
            cosa.add(0,tvBoxTWO)
        }
        tvBoxThree.setOnClickListener{
            changeImage(it)
            cosa.add(0,tvBoxThree)
        }
        tvBoxFOUR.setOnClickListener{
            changeImage(it)
            cosa.add(0,tvBoxFOUR)
        }
        tvBoxFIVE.setOnClickListener{
            changeImage(it)
            cosa.add(0,tvBoxFIVE)
        }
        tvBoxSIX.setOnClickListener{
            changeImage(it)
            cosa.add(0,tvBoxSIX)
        }
        tvBoxSEVEN.setOnClickListener{
            changeImage(it)
            cosa.add(0,tvBoxSEVEN)
        }
        tvBoxEIGHT.setOnClickListener{
            changeImage(it)
            cosa.add(0,tvBoxEIGHT)
        }*/


    }

    private fun setListener(){
        var clickableViews: MutableList<View> =
            mutableListOf(tvBoxONE,tvBoxTWO,tvBoxThree,tvBoxFOUR,tvBoxFIVE,tvBoxSIX,tvBoxSEVEN,tvBoxEIGHT)
        for (item in clickableViews){

            when (item){
                tvBoxONE -> { cosa.add(0,item);
                    item.setOnClickListener{changeImage(it)}}
                tvBoxTWO -> { cosa.add(0,item);
                    item.setOnClickListener{changeImage(it)}}
                tvBoxThree -> { cosa.add(0,item);
                    item.setOnClickListener{changeImage(it)}}
                tvBoxFOUR -> { cosa.add(0,item);
                    item.setOnClickListener{changeImage(it)}}
                tvBoxFIVE -> { cosa.add(0,item);
                    item.setOnClickListener{changeImage(it)}}
                tvBoxSIX -> { cosa.add(0,item);
                    item.setOnClickListener{changeImage(it)}}
                tvBoxSEVEN -> { cosa.add(0,item);
                    item.setOnClickListener{changeImage(it)}}
                tvBoxEIGHT -> { cosa.add(0,item);
                    item.setOnClickListener{changeImage(it)}}
            }

            /*if(item == tvBoxONE){
                cosa.add(0,tvBoxONE)
                item.setOnClickListener{changeImage(it) }
            }
            if(item == tvBoxTWO){
                cosa.add(0,tvBoxTWO)
                item.setOnClickListener{changeImage(it) }
            }
            if(item == tvBoxThree){
                cosa.add(0,tvBoxThree)
                item.setOnClickListener{changeImage(it) }
            }
            if(item == tvBoxFOUR){
                cosa.add(0,tvBoxFOUR)
                item.setOnClickListener{changeImage(it) }
            }
            if(item == tvBoxFIVE){
                cosa.add(0,tvBoxFIVE)
                item.setOnClickListener{changeImage(it) }
            }
            if(item == tvBoxSIX){
                cosa.add(0,tvBoxSIX)
                item.setOnClickListener{changeImage(it) }
            }
            if(item == tvBoxSEVEN){
                cosa.add(0,tvBoxSEVEN)
                item.setOnClickListener{changeImage(it) }
            }
            if(item == tvBoxEIGHT){
                cosa.add(0,tvBoxEIGHT)
                item.setOnClickListener{changeImage(it) }
            }*/

        }


    }

    private fun changeImage(view: View) {


        val randomInt = mutableList.random()

        val drawableResource = when (randomInt) {

           /* 1, 4 -> R.drawable.la0
            2, 5 -> R.drawable.la1
            3, 6 -> R.drawable.la2
            7, 8 -> R.drawable.la3
            else -> R.drawable.corazon*/

            1->view.setBackgroundResource(R.drawable.la0)
            2->view.setBackgroundResource(R.drawable.la0)
            3->view.setBackgroundResource(R.drawable.la1)
            4->view.setBackgroundResource(R.drawable.la1)
            5->view.setBackgroundResource(R.drawable.la2)
            6->view.setBackgroundResource(R.drawable.la2)
            7->view.setBackgroundResource(R.drawable.la3)
            else->view.setBackgroundResource(R.drawable.la3)

        }

      /*  when (view.id) {
            R.id.tvBoxONE -> view.setBackgroundResource(drawableResource)
            R.id.tvBoxTWO -> view.setBackgroundResource(drawableResource)
            R.id.tvBoxThree -> view.setBackgroundResource(drawableResource)
            R.id.tvBoxFOUR -> view.setBackgroundResource(drawableResource)
            R.id.tvBoxFIVE -> view.setBackgroundResource(drawableResource)
            R.id.tvBoxSIX -> view.setBackgroundResource(drawableResource)
            R.id.tvBoxSEVEN -> view.setBackgroundResource(drawableResource)
            R.id.tvBoxEIGHT -> view.setBackgroundResource(drawableResource)


        }*/

        if (num.first()==0){
            num.add(0,randomInt.toInt())
            mutableList.remove(element = randomInt.toInt())
        }

        if (randomInt == 1 && num.first() == 2 || randomInt == 2 && num.first() == 1 ||
            randomInt == 3 && num.first() == 4 || randomInt == 4 && num.first() == 3 ||
            randomInt == 5 && num.first() == 6 || randomInt == 6 && num.first() == 5 ||
            randomInt == 7 && num.first() == 8 || randomInt == 8 && num.first() == 7 ){


            num.add(0, 0)
            mutableList.remove(element = randomInt.toInt())







        } else {
            if (num.first()==1|| num.first()==2){
                cosa.get(0).setBackgroundResource(R.drawable.corazon);
                cosa.get(1).setBackgroundResource(R.drawable.corazon)
                num.add(0, 0)
            }else {
            if (num.first()==3|| num.first()==4) {
                cosa.get(0).setBackgroundResource(R.drawable.corazon)
                cosa.get(1).setBackgroundResource(R.drawable.corazon)
                num.add(0, 0)
            }else {
                if (num.first()==5|| num.first()==6){
                    cosa.get(0).setBackgroundResource(R.drawable.corazon)
                    cosa.get(1).setBackgroundResource(R.drawable.corazon)
                    num.add(0, 0)
            }else {
                    if (num.first()==7|| num.first()==8){
                        cosa.get(0).setBackgroundResource(R.drawable.corazon)
                        cosa.get(1).setBackgroundResource(R.drawable.corazon)
                        num.add(0, 0)
                    }
                }}

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

        mutableList.clear()
        mutableList.add(0,1)
        mutableList.add(1,2)
        mutableList.add(2,3)
        mutableList.add(3,4)
        mutableList.add(4,5)
        mutableList.add(5,6)
        mutableList.add(6,7)
        mutableList.add(7,8)

        num.clear()
        num.add(0,0)

    }


    }

