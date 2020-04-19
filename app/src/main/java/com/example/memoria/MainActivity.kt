package com.example.memoria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import java.util.concurrent.Delayed
import kotlin.collections.ArrayList
import kotlin.concurrent.schedule
import kotlin.concurrent.timer
import kotlin.concurrent.timerTask
import kotlin.math.absoluteValue

class MainActivity : AppCompatActivity() {

    var mutableList: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8)
    var num: MutableList<Int> = mutableListOf(0)
    var cosa: MutableList<View> = mutableListOf()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener()
        btnREANUDAR.setOnClickListener {
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

    private fun setListener() {

      /*  val clickableViews: List<View> =
            listOf(tvBoxONE,tvBoxTWO,tvBoxThree,tvBoxFOUR,tvBoxFIVE,tvBoxSIX,tvBoxSEVEN,tvBoxEIGHT)

        /*for (item in clickableViews) {
            item.setOnClickListener{changeImage(it)}
            cosa.add(0,item)*/

        tvBoxONE.setOnClickListener{
            changeImage(it)}
            //cosa.add(0,tvBoxONE)

        tvBoxTWO.setOnClickListener{
            changeImage(it)}
            cosa.add(0,tvBoxTWO)

        tvBoxThree.setOnClickListener{
            changeImage(it)}
            cosa.add(0,tvBoxThree)

        tvBoxFOUR.setOnClickListener{
            changeImage(it)}
            cosa.add(0,tvBoxFOUR)

        tvBoxFIVE.setOnClickListener{
            changeImage(it)}
            cosa.add(0,tvBoxFIVE)

        tvBoxSIX.setOnClickListener{
            changeImage(it)}
            cosa.add(0,tvBoxSIX)

        tvBoxSEVEN.setOnClickListener{
            changeImage(it)}
            cosa.add(0,tvBoxSEVEN)

        tvBoxEIGHT.setOnClickListener{
            changeImage(it)}
            cosa.add(0,tvBoxEIGHT)*/



        var clickableViews: MutableList<View> =
            mutableListOf(
                tvBoxONE,
                tvBoxTWO,
                tvBoxThree,
                tvBoxFOUR,
                tvBoxFIVE,
                tvBoxSIX,
                tvBoxSEVEN,
                tvBoxEIGHT
            )
        for (item in clickableViews) {

            when (item) {
                tvBoxONE -> {
                    cosa.add(item);
                    item.setOnClickListener { changeImage(it) }
                }
                tvBoxTWO -> {
                    cosa.add(item);
                    item.setOnClickListener { changeImage(it) }
                }
                tvBoxThree -> {
                    cosa.add(item);
                    item.setOnClickListener { changeImage(it) }
                }
                tvBoxFOUR -> {
                    cosa.add(item);
                    item.setOnClickListener { changeImage(it) }
                }
                tvBoxFIVE -> {
                    cosa.add(item);
                    item.setOnClickListener { changeImage(it) }
                }
                tvBoxSIX -> {
                    cosa.add(item);
                    item.setOnClickListener { changeImage(it) }
                }
                tvBoxSEVEN -> {
                    cosa.add(item);
                    item.setOnClickListener { changeImage(it) }
                }
                tvBoxEIGHT -> {
                    cosa.add(item);
                    item.setOnClickListener { changeImage(it) }
                }
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

            1 -> view.setBackgroundResource(R.drawable.la0)
            2 -> view.setBackgroundResource(R.drawable.la0)
            3 -> view.setBackgroundResource(R.drawable.la1)
            4 -> view.setBackgroundResource(R.drawable.la1)
            5 -> view.setBackgroundResource(R.drawable.la2)
            6 -> view.setBackgroundResource(R.drawable.la2)
            7 -> view.setBackgroundResource(R.drawable.la3)
            else -> view.setBackgroundResource(R.drawable.la3)

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

        if (num.first() == 0) {
            num.remove(0)
            num.add(randomInt)
            mutableList.remove(randomInt)
            Toast.makeText(this,"random : $randomInt y num: $num ",Toast.LENGTH_LONG).show()

        } else {

            if ((randomInt == 1 && num.last() == 2) || (randomInt == 2 && num.last() == 1) ||
                (randomInt == 3 && num.last() == 4) || (randomInt == 4 && num.last() == 3) ||
                (randomInt == 5 && num.last() == 6) || (randomInt == 6 && num.last() == 5) ||
                (randomInt == 7 && num.last() == 8) || (randomInt == 8 && num.last() == 7) ){

                Toast.makeText(this, " if 1 random : $randomInt y num: $num", Toast.LENGTH_LONG)
                    .show()
                num.clear()
                num.add(0)
                mutableList.remove(randomInt)


            }
            
                if  ((num.last() == 1 || num.last() == 2) || (num.last() == 3 || num.last() == 4) ||
                        (num.last() == 5 || num.last() == 6) || (num.last() == 7 || num.last() == 8)) {

                    mutableList.remove(randomInt)
                    num.clear()
                    num.add(0)


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
            /*if (num.last() == 1 || num.last() == 2) {
                cosa.last().setBackground(null);
              cosa.last().setBackground(null)
                Toast.makeText(this," ELSE IF 1 random : $randomInt y num: $num ",Toast.LENGTH_LONG).show()
                mutableList.remove(randomInt)
                num.clear()
                num.add(0)
            }

            if (num.last() == 3 || num.last() == 4) {
                val a = cosa.size-1
                cosa.last().setBackgroundResource(R.drawable.corazon)
                cosa[a].setBackgroundResource(R.drawable.corazon)
                Toast.makeText(this," ELSE IF 2 random : $randomInt y num: $num  ",Toast.LENGTH_LONG).show()
                mutableList.remove(randomInt)
                num.clear()
                num.add(0)
            }

            if (num.last() == 5 || num.last() == 6) {
                val a = cosa.size-1
                cosa.last().setBackgroundResource(R.drawable.corazon)
                cosa[a].setBackgroundResource(R.drawable.corazon)
                Toast.makeText(this," ELSE IF 3 random : $randomInt y num: $num ",Toast.LENGTH_LONG).show()
                mutableList.remove(randomInt)
                num.clear()
                num.add(0)
            }

            if (num.last() == 7 || num.last() == 8) {
                val a = cosa.size-1
                cosa.last().setBackgroundResource(R.drawable.corazon)
                cosa[a].setBackgroundResource(R.drawable.corazon)
                Toast.makeText(this," ELSE IF 4 random : $randomInt y num: $num ",Toast.LENGTH_LONG).show()
                mutableList.remove(randomInt)
                num.clear()
                num.add(0)
            }*/


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
        mutableList.add(0, 1)
        mutableList.add(1, 2)
        mutableList.add(2, 3)
        mutableList.add(3, 4)
        mutableList.add(4, 5)
        mutableList.add(5, 6)
        mutableList.add(6, 7)
        mutableList.add(7, 8)

        num.clear()
        num.add(0)

    }

}





