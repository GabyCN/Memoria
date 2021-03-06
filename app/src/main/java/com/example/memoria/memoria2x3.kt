package com.example.memoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import kotlinx.android.synthetic.main.activity_memoria2x3.*
import kotlinx.android.synthetic.main.memoria2x8.*
import kotlinx.android.synthetic.main.memoria2x8.btnREANUDAR
import kotlinx.android.synthetic.main.memoria2x8.tvBoxFIVE
import kotlinx.android.synthetic.main.memoria2x8.tvBoxFOUR
import kotlinx.android.synthetic.main.memoria2x8.tvBoxONE
import kotlinx.android.synthetic.main.memoria2x8.tvBoxSIX
import kotlinx.android.synthetic.main.memoria2x8.tvBoxTWO
import kotlinx.android.synthetic.main.memoria2x8.tvBoxThree

class memoria2x3 : AppCompatActivity() {
    var mutableList: MutableList<Int> = mutableListOf()
    var num: MutableList<Int> = mutableListOf(0)

    val imagenes: MutableList<Int> = mutableListOf(
        R.drawable.la0, R.drawable.la1, R.drawable.la2,
        R.drawable.la0, R.drawable.la1, R.drawable.la2)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memoria2x3)
        setListener()
        btnREANUDAR.setOnClickListener {
            reanudar(it)
        }

        btnNuevo.setOnClickListener{
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        imagenes.shuffle()
    }

    private fun setListener(){
        var clickableViews: MutableList<View> =
            mutableListOf(
                tvBoxONE,
                tvBoxTWO,
                tvBoxThree,
                tvBoxFOUR,
                tvBoxFIVE,
                tvBoxSIX
            )

        for(item in clickableViews) {
            item.setOnClickListener{changeImage(it)}}
    }


    private fun changeImage(view: View) {

        when (view.id) {
            R.id.tvBoxONE -> {
                view.setBackgroundResource(imagenes[0]); mutableList.add(0,0)
            }
            R.id.tvBoxTWO -> {
                view.setBackgroundResource(imagenes[1]); mutableList.add(0,1)
            }
            R.id.tvBoxThree -> {
                view.setBackgroundResource(imagenes[2]); mutableList.add(0,2)
            }
            R.id.tvBoxFOUR -> {
                view.setBackgroundResource(imagenes[3]); mutableList.add(0,3)
            }
            R.id.tvBoxFIVE -> {
                view.setBackgroundResource(imagenes[4]); mutableList.add(0,4)
            }
            else -> {
                view.setBackgroundResource(imagenes[5]); mutableList.add(0,5)
            }
        }



        if (num.first() == 0) {
            num.clear()
            num.add(0,1)
            //cosa.add(0,mutableList.last())



            //Toast.makeText(this, "num: $num, lista $mutableList, prueba: $prueba", Toast.LENGTH_LONG).show()

        } else {



            if (imagenes[mutableList[0]] == imagenes[mutableList[1]]) {


                num.clear()
                num.add(0,0)

                //Toast.makeText(this, " IF 1 num: $num lista: $mutableList ", Toast.LENGTH_LONG).show()

            } else {


                Handler().postDelayed(
                    {
                        tvBoxONE.setBackgroundResource(R.drawable.corazon)
                        tvBoxTWO.setBackgroundResource(R.drawable.corazon)
                        tvBoxThree.setBackgroundResource(R.drawable.corazon)
                        tvBoxFOUR.setBackgroundResource(R.drawable.corazon)
                        tvBoxFIVE.setBackgroundResource(R.drawable.corazon)
                        tvBoxSIX.setBackgroundResource(R.drawable.corazon)

                    },
                    1000 // value in milliseconds
                )




                // Toast.makeText(this, " if 2 num: $num, lista: $mutableList ", Toast.LENGTH_LONG).show()
                num.clear()
                num.add(0,0)
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

            }

        }

        mutableList.clear()
        mutableList.add(0,0)

        num.clear()
        num.add(0,0)

        imagenes.shuffle()

    }





}
