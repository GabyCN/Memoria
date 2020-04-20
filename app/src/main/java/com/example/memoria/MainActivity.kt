package com.example.memoria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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

    var mutableList: MutableList<Int> = mutableListOf()
    var num: MutableList<Int> = mutableListOf(0)
    var cosa: MutableList<Int> = mutableListOf()
    var nombre: MutableList<View> = mutableListOf()
    var nuevaImagen: MutableList<Int> = mutableListOf()
    val imagenes: MutableList<Int> = mutableListOf(R.drawable.la0,R.drawable.la1, R.drawable.la2, R.drawable.la3,
        R.drawable.la0,R.drawable.la1, R.drawable.la2,R.drawable.la3)
    var prueba :Int = 0




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener()
        btnREANUDAR.setOnClickListener {
            reanudar(it)
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
                tvBoxSIX,
                tvBoxSEVEN,
                tvBoxEIGHT
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
            R.id.tvBoxSIX -> {
                view.setBackgroundResource(imagenes[5]); mutableList.add(0,5)
            }
            R.id.tvBoxSEVEN -> {
                view.setBackgroundResource(imagenes[6]); mutableList.add(0,6)
            }
            else -> {
                view.setBackgroundResource(imagenes[7]); mutableList.add(0,7)
            }
        }



        if (num.first() == 0) {
            num.clear()
            num.add(0,1)
            cosa.add(0,mutableList.last())



            Toast.makeText(this, "num: $num, lista $mutableList, prueba: $prueba", Toast.LENGTH_LONG).show()

        } else {



            if (imagenes[mutableList[0]] == imagenes[mutableList[1]]) {


                num.clear()
                num.add(0,0)

                Toast.makeText(this, " IF 1 num: $num lista: $mutableList ", Toast.LENGTH_LONG)
                    .show()

            } else {


                tvBoxONE.setBackgroundResource(R.drawable.corazon)
                tvBoxTWO.setBackgroundResource(R.drawable.corazon)
                tvBoxThree.setBackgroundResource(R.drawable.corazon)
                tvBoxFOUR.setBackgroundResource(R.drawable.corazon)
                tvBoxFIVE.setBackgroundResource(R.drawable.corazon)
                tvBoxSIX.setBackgroundResource(R.drawable.corazon)
                tvBoxSEVEN.setBackgroundResource(R.drawable.corazon)
                tvBoxEIGHT.setBackgroundResource(R.drawable.corazon)
                  /*  if (mutableList.elementAt(mutableList[a]) == 0) {
                    tvBoxONE.setBackgroundResource(R.drawable.corazon)

                    if (mutableList.elementAt(mutableList[b]) == 1) {
                        tvBoxTWO.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 2) {
                        tvBoxThree.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 3) {
                        tvBoxFOUR.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 4) {
                        tvBoxFIVE.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 5) {
                        tvBoxSIX.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 6) {
                        tvBoxSEVEN.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 7) {
                        tvBoxEIGHT.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }
                }

                if (mutableList.elementAt(mutableList[a]) == 1) {
                    tvBoxTWO.setBackgroundResource(R.drawable.corazon)

                    if (mutableList.elementAt(mutableList[b]) == 0) {
                        tvBoxONE.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 2) {
                        tvBoxThree.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 3) {
                        tvBoxFOUR.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 4) {
                        tvBoxFIVE.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 5) {
                        tvBoxSIX.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 6) {
                        tvBoxSEVEN.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 7) {
                        tvBoxEIGHT.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }
                }

                if (mutableList.elementAt(mutableList[a]) == 2) {
                    tvBoxThree.setBackgroundResource(R.drawable.corazon)

                    if (mutableList.elementAt(mutableList[b]) == 1) {
                        tvBoxTWO.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 0) {
                        tvBoxONE.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 3) {
                        tvBoxFOUR.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 4) {
                        tvBoxFIVE.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 5) {
                        tvBoxSIX.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 6) {
                        tvBoxSEVEN.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 7) {
                        tvBoxEIGHT.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }
                }

                if (mutableList.elementAt(mutableList[a]) == 3) {
                    tvBoxFOUR.setBackgroundResource(R.drawable.corazon)

                    if (mutableList.elementAt(mutableList[b]) == 1) {
                        tvBoxTWO.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 2) {
                        tvBoxThree.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 0) {
                        tvBoxONE.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 4) {
                        tvBoxFIVE.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 5) {
                        tvBoxSIX.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 6) {
                        tvBoxSEVEN.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 7) {
                        tvBoxEIGHT.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }
                }

                if (mutableList.elementAt(mutableList[a]) == 4) {
                    tvBoxFIVE.setBackgroundResource(R.drawable.corazon)

                    if (mutableList.elementAt(mutableList[b]) == 1) {
                        tvBoxTWO.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 2) {
                        tvBoxThree.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 3) {
                        tvBoxFOUR.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 0) {
                        tvBoxONE.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 5) {
                        tvBoxSIX.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 6) {
                        tvBoxSEVEN.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 7) {
                        tvBoxEIGHT.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }
                }

                if (mutableList.elementAt(mutableList[a]) == 5) {
                    tvBoxSIX.setBackgroundResource(R.drawable.corazon)

                    if (mutableList.elementAt(mutableList[b]) == 1) {
                        tvBoxTWO.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 2) {
                        tvBoxThree.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 3) {
                        tvBoxFOUR.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 4) {
                        tvBoxFIVE.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 0) {
                        tvBoxONE.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 6) {
                        tvBoxSEVEN.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 7) {
                        tvBoxEIGHT.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }
                }

                if (mutableList.elementAt(mutableList[a]) == 6) {
                    tvBoxSEVEN.setBackgroundResource(R.drawable.corazon)

                    if (mutableList.elementAt(mutableList[b]) == 1) {
                        tvBoxTWO.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 2) {
                        tvBoxThree.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 3) {
                        tvBoxFOUR.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 4) {
                        tvBoxFIVE.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 5) {
                        tvBoxSIX.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 0) {
                        tvBoxONE.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 7) {
                        tvBoxEIGHT.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }
                }

                if (mutableList.elementAt(mutableList[a]) == 7) {
                    tvBoxEIGHT.setBackgroundResource(R.drawable.corazon)

                    if (mutableList.elementAt(mutableList[b]) == 1) {
                        tvBoxTWO.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 2) {
                        tvBoxThree.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 3) {
                        tvBoxFOUR.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 4) {
                        tvBoxFIVE.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 5) {
                        tvBoxSIX.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 6) {
                        tvBoxSEVEN.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }

                    if (mutableList.elementAt(mutableList[b]) == 0) {
                        tvBoxONE.setBackgroundResource(R.drawable.corazon)
                        num.clear()
                        num.add(0)
                    }
                }*/


                Toast.makeText(this, " if 2 num: $num, lista: $mutableList ", Toast.LENGTH_LONG).show()
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
                tvBoxSEVEN.setBackgroundResource(R.drawable.corazon);
                tvBoxEIGHT.setBackgroundResource(R.drawable.corazon)
            }

        }

        mutableList.clear()

        num.clear()
        num.add(0,0)

        imagenes.shuffle()

    }

}





