package com.ronaldogarcia.ciclodevida

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG = "CicloDeVida"

    private val PLACAR_CASA = "placarcasa"
    private val PLACAR_VISITANTE = "placarvisitante"

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState != null){

            tvPlacarVisitante.text = savedInstanceState.getString(PLACAR_VISITANTE)
            tvPlacarCasa.text = savedInstanceState.getString(PLACAR_CASA)

        }

        btCasa.setOnClickListener{
            golCasa()
        }

        btVisitante.setOnClickListener{
            golVisitante()
        }
    }

    fun golCasa(){

        var placarAtual = Integer.parseInt(tvPlacarCasa.text.toString())
        placarAtual++
        tvPlacarCasa.text = placarAtual.toString()
    }

    fun golVisitante(){

        var placarAtual = Integer.parseInt(tvPlacarVisitante.text.toString())
        placarAtual++
        tvPlacarVisitante.text = placarAtual.toString()
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "Metodo onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "Metodo onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "Metodo onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "Metodo onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        Log.i(TAG, "Metodo onSaveInstanceState")

        outState.putString(PLACAR_CASA, tvPlacarCasa.text as String)
        outState.putString(PLACAR_VISITANTE, tvPlacarVisitante.text as String)

    }


}
