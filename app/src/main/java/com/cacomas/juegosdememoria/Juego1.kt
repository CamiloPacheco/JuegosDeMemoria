package com.cacomas.juegosdememoria

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_juego1.view.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.w3c.dom.Text

/**
 * A simple [Fragment] subclass.
 * Use the [Juego1.newInstance] factory method to
 * create an instance of this fragment.
 */
val Imagenes = arrayOf(R.drawable.leon, R.drawable.mono1, R.drawable.elefante,R.drawable.jirafa, R.drawable.perico1,R.drawable.ardilla  )
var Indices = listOf(0,1,2,3,4,5,0,1,2,3,4,5)
var sw=0
var Indiceaux=0
var Puntaje=0

var  BotonAuxId=0

class Juego1 : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        return  inflater.inflate(R.layout.fragment_juego1, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Indices=Indices.shuffled()
        view.findViewById<ImageButton>(R.id.imageButton3).setOnClickListener{
            MostrarImagen(view,R.id.imageButton3,0)
        }
        view.findViewById<ImageButton>(R.id.imageButton4).setOnClickListener{
            MostrarImagen(view,R.id.imageButton4,1)
        }
        view.findViewById<ImageButton>(R.id.imageButton5).setOnClickListener{
            MostrarImagen(view,R.id.imageButton5,2)
        }
        view.findViewById<ImageButton>(R.id.imageButton6).setOnClickListener{
            MostrarImagen(view,R.id.imageButton6,3)
        }
        view.findViewById<ImageButton>(R.id.imageButton7).setOnClickListener{
            MostrarImagen(view,R.id.imageButton7,4)
        }
        view.findViewById<ImageButton>(R.id.imageButton8).setOnClickListener{
            MostrarImagen(view,R.id.imageButton8,5)
        }
        view.findViewById<ImageButton>(R.id.imageButton9).setOnClickListener{
            MostrarImagen(view,R.id.imageButton9,6)
        }
        view.findViewById<ImageButton>(R.id.imageButton10).setOnClickListener{
            MostrarImagen(view,R.id.imageButton10,7)
        }
        view.findViewById<ImageButton>(R.id.imageButton11).setOnClickListener{
            MostrarImagen(view,R.id.imageButton11,8)
        }
        view.findViewById<ImageButton>(R.id.imageButton2).setOnClickListener{
            MostrarImagen(view,R.id.imageButton2,9)
        }
        view.findViewById<ImageButton>(R.id.imageButton13).setOnClickListener{
            MostrarImagen(view,R.id.imageButton13,10)
        }
        view.findViewById<ImageButton>(R.id.imageButton12).setOnClickListener{
            MostrarImagen(view,R.id.imageButton12,11)
        }
        view.findViewById<ImageButton>(R.id.imageButton14).setOnClickListener{
            Reinicio(view)
        }
            val boton: ImageButton = view.findViewById(R.id.imageButton3)
            boton.setImageResource(R.drawable.interrogacion1)
            val boton1: ImageButton = view.findViewById(R.id.imageButton4)
            boton1.setImageResource(R.drawable.interrogacion1)
            val boton2: ImageButton =  view.findViewById(R.id.imageButton5)
            boton2.setImageResource(R.drawable.interrogacion1)
            val boton3: ImageButton =  view.findViewById(R.id.imageButton6)
            boton3.setImageResource(R.drawable.interrogacion1)
            val boton4: ImageButton =  view.findViewById(R.id.imageButton7)
            boton4.setImageResource(R.drawable.interrogacion1)
            val boton5: ImageButton =  view.findViewById(R.id.imageButton8)
            boton5.setImageResource(R.drawable.interrogacion1)
            val boton6: ImageButton =  view.findViewById(R.id.imageButton9)
            boton6.setImageResource(R.drawable.interrogacion1)
            val boton7: ImageButton =  view.findViewById(R.id.imageButton10)
            boton7.setImageResource(R.drawable.interrogacion1)
            val boton8: ImageButton =  view.findViewById(R.id.imageButton11)
            boton8.setImageResource(R.drawable.interrogacion1)
            val boton9: ImageButton =  view.findViewById(R.id.imageButton2)
            boton9.setImageResource(R.drawable.interrogacion1)
            val boton10: ImageButton =  view.findViewById(R.id.imageButton13)
            boton10.setImageResource(R.drawable.interrogacion1)
            val boton11: ImageButton =  view.findViewById(R.id.imageButton12)
            boton11.setImageResource(R.drawable.interrogacion1)


    }
    fun MostrarImagen(view: View,botonId: Int, i:Int) {
        val botonaux: ImageButton = view.findViewById(botonId)

        botonaux.setImageResource(Imagenes.get(Indices.get(i)))
        GlobalScope.launch(context = Dispatchers.Main) {
            delay(1000)
            // code here

            if (sw == 1) {
                if (Indices.get(i) != Indiceaux) {


                    botonaux.setImageResource(R.drawable.interrogacion1)
                    val valueName = view.findViewById<ImageButton>(BotonAuxId)
                    valueName.setImageResource(R.drawable.interrogacion1)
                    Puntaje=Puntaje-10


                }
                else{
                    Puntaje=Puntaje+100

                }
                val puntajeText: TextView = view.findViewById(R.id.textView3)
                var strPuntaje:String = Puntaje.toString()
                puntajeText.text= strPuntaje

                sw = 0
            } else {
                Indiceaux = Indices.get(i)
                BotonAuxId=botonId
                sw = 1


            }


        }

    }

    fun Reinicio(view: View) {
        Indices=Indices.shuffled()
        Puntaje=0
        val puntajeText: TextView = view.findViewById(R.id.textView3)
        var strPuntaje:String = Puntaje.toString()
        puntajeText.setText(strPuntaje)
        val boton= view.findViewById<ImageButton>(R.id.imageButton3)
        boton.setImageResource(R.drawable.interrogacion1)

        val boton1: ImageButton =view.findViewById(R.id.imageButton4)
        boton1.setImageResource(R.drawable.interrogacion1)

        val boton2: ImageButton = view.findViewById(R.id.imageButton5)
        boton2.setImageResource(R.drawable.interrogacion1)

        val boton3: ImageButton = view.findViewById(R.id.imageButton6)
        boton3.setImageResource(R.drawable.interrogacion1)

        val boton4: ImageButton = view.findViewById(R.id.imageButton7)
        boton4.setImageResource(R.drawable.interrogacion1)

        val boton5: ImageButton = view.findViewById(R.id.imageButton8)
        boton5.setImageResource(R.drawable.interrogacion1)

        val boton6: ImageButton =view. findViewById(R.id.imageButton9)
        boton6.setImageResource(R.drawable.interrogacion1)

        val boton7: ImageButton = view.findViewById(R.id.imageButton10)
        boton7.setImageResource(R.drawable.interrogacion1)

        val boton8: ImageButton = view.findViewById(R.id.imageButton11)
        boton8.setImageResource(R.drawable.interrogacion1)

        val boton9: ImageButton = view.findViewById(R.id.imageButton2)
        boton9.setImageResource(R.drawable.interrogacion1)

        val boton10: ImageButton = view.findViewById(R.id.imageButton13)
        boton10.setImageResource(R.drawable.interrogacion1)

        val boton11: ImageButton = view.findViewById(R.id.imageButton12)
        boton11.setImageResource(R.drawable.interrogacion1)

    }



}