package com.cacomas.juegosdememoria

import android.app.AlertDialog
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.ArrayList

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [Juego2.newInstance] factory method to
 * create an instance of this fragment.
 */
class Juego2 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_juego2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var arr = ArrayList<Int>()
        var arr2 = ArrayList<Int>()
        var randomm= listOf( 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24)
        val builder = AlertDialog.Builder(this.context)

        val buttons = arrayOf(
            view.findViewById<ImageButton>(R.id.imageButton18),
            view.findViewById<ImageButton>(R.id.imageButton19),
            view.findViewById<ImageButton>(R.id.imageButton20),
            view.findViewById<ImageButton>(R.id.imageButton21),
            view.findViewById<ImageButton>(R.id.imageButton22),
            view.findViewById<ImageButton>(R.id.imageButton23),
            view.findViewById<ImageButton>(R.id.imageButton24),
            view.findViewById<ImageButton>(R.id.imageButton25),
            view.findViewById<ImageButton>(R.id.imageButton26),
            view.findViewById<ImageButton>(R.id.imageButton27),
            view.findViewById<ImageButton>(R.id.imageButton28),
            view.findViewById<ImageButton>(R.id.imageButton29),
            view.findViewById<ImageButton>(R.id.imageButton30),
            view.findViewById<ImageButton>(R.id.imageButton31),
            view.findViewById<ImageButton>(R.id.imageButton32),
            view.findViewById<ImageButton>(R.id.imageButton33),
            view.findViewById<ImageButton>(R.id.imageButton34),
            view.findViewById<ImageButton>(R.id.imageButton35),
            view.findViewById<ImageButton>(R.id.imageButton36),
            view.findViewById<ImageButton>(R.id.imageButton37),
            view.findViewById<ImageButton>(R.id.imageButton38),
            view.findViewById<ImageButton>(R.id.imageButton39),
            view.findViewById<ImageButton>(R.id.imageButton40),
            view.findViewById<ImageButton>(R.id.imageButton41),
            view.findViewById<ImageButton>(R.id.imageButton42)
        )

        resetButtons(buttons)

        buttons[0].setOnClickListener {
            buttons[0].setImageResource(R.drawable.morado)
            arr.add(getPos(buttons,buttons[0]))
        }
        buttons[1].setOnClickListener {
            buttons[1].setImageResource(R.drawable.morado)
            arr.add(getPos(buttons,buttons[1]))
        }
        buttons[2].setOnClickListener {
            buttons[2].setImageResource(R.drawable.morado)
            arr.add(getPos(buttons,buttons[2]))
        }
        buttons[3].setOnClickListener {
            buttons[3].setImageResource(R.drawable.morado)
            arr.add(getPos(buttons,buttons[3]))
        }
        buttons[4].setOnClickListener {
            buttons[4].setImageResource(R.drawable.morado)
            arr.add(getPos(buttons,buttons[4]))
        }
        buttons[5].setOnClickListener {
            buttons[5].setImageResource(R.drawable.morado)
            arr.add(getPos(buttons,buttons[5]))
        }
        buttons[6].setOnClickListener {
            buttons[6].setImageResource(R.drawable.morado)
            arr.add(getPos(buttons,buttons[6]))
        }
        buttons[7].setOnClickListener {
            buttons[7].setImageResource(R.drawable.morado)
            arr.add(getPos(buttons,buttons[7]))
        }
        buttons[8].setOnClickListener {
            buttons[8].setImageResource(R.drawable.morado)
            arr.add(getPos(buttons,buttons[8]))
        }
        buttons[9].setOnClickListener {
            buttons[9].setImageResource(R.drawable.morado)
            arr.add(getPos(buttons,buttons[9]))
        }
        buttons[10].setOnClickListener {
            buttons[10].setImageResource(R.drawable.morado)
            arr.add(getPos(buttons,buttons[10]))
        }
        buttons[11].setOnClickListener {
            buttons[11].setImageResource(R.drawable.morado)
            arr.add(getPos(buttons,buttons[11]))
        }
        buttons[12].setOnClickListener {
            buttons[12].setImageResource(R.drawable.morado)
            arr.add(getPos(buttons,buttons[12]))
        }
        buttons[13].setOnClickListener {
            buttons[13].setImageResource(R.drawable.morado)
            arr.add(getPos(buttons,buttons[13]))
        }
        buttons[14].setOnClickListener {
            buttons[14].setImageResource(R.drawable.morado)
            arr.add(getPos(buttons,buttons[14]))
        }
        buttons[15].setOnClickListener {
            buttons[15].setImageResource(R.drawable.morado)
            arr.add(getPos(buttons,buttons[15]))
        }
        buttons[16].setOnClickListener {
            buttons[16].setImageResource(R.drawable.morado)
            arr.add(getPos(buttons,buttons[16]))
        }
        buttons[17].setOnClickListener {
            buttons[17].setImageResource(R.drawable.morado)
            arr.add(getPos(buttons,buttons[17]))
        }
        buttons[18].setOnClickListener {
            buttons[18].setImageResource(R.drawable.morado)
            arr.add(getPos(buttons,buttons[18]))
        }
        buttons[19].setOnClickListener {
            buttons[19].setImageResource(R.drawable.morado)
            arr.add(getPos(buttons,buttons[19]))
        }
        buttons[20].setOnClickListener {
            buttons[20].setImageResource(R.drawable.morado)
            arr.add(getPos(buttons,buttons[20]))
        }
        buttons[21].setOnClickListener {
            buttons[21].setImageResource(R.drawable.morado)
            arr.add(getPos(buttons,buttons[21]))
        }
        buttons[22].setOnClickListener {
            buttons[22].setImageResource(R.drawable.morado)
            arr.add(getPos(buttons,buttons[22]))
        }
        buttons[23].setOnClickListener {
            buttons[23].setImageResource(R.drawable.morado)
            arr.add(getPos(buttons,buttons[23]))
        }
        buttons[24].setOnClickListener {
            buttons[24].setImageResource(R.drawable.morado)
            arr.add(getPos(buttons,buttons[24]))
        }


        val Comenzar : Button = view.findViewById(R.id.button_Comenzar_j2)
        var level = 1
        var firstTime = 0

        var time: Long =1000

        Comenzar.setOnClickListener {
            randomm=randomm.shuffled()
            if(level == 26){
                builder.setTitle("Wow!")
                builder.setMessage("Has ganado?, Enhorabuena! no pense que alguien lo lograria")
                builder.setPositiveButton("Nuevo juego", null)
                val winnerDialog : AlertDialog = builder.create()
                winnerDialog.show()
                level = 1
                firstTime = 0
            }
            if (firstTime != 0){
                if (comparacion(arr, arr2, buttons) == 1){
                    level += 1
                    val Nivel : TextView=  view.findViewById(R.id.textView2)
                    Nivel.text = "Nivel "+level.toString()
                    arr.clear()
                    arr2.clear()
                }else{
                    builder.setTitle("Ups")
                    builder.setMessage("Usted ha perdido y sera enviado al nivel 1")
                    builder.setPositiveButton("Continuar", null)
                    val looserDialog : AlertDialog = builder.create()
                    looserDialog.show()


                    GlobalScope.launch(context = Dispatchers.Main) {
                        delay(5000)
                        level = 1
                        val Nivel : TextView=  view.findViewById(R.id.textView2)
                        Nivel.text = "Nivel "+level.toString()
                        arr.clear()
                        arr2.clear()
                    }
                }
            }
            else {
                firstTime = 1
                Comenzar.setText("Continuar")
            }


            for (i in 0..level){

                GlobalScope.launch(context = Dispatchers.Main) {
                    delay(1000*i.toLong())

                    buttons.get(randomm[i]).setImageResource(R.drawable.morado)
                    arr2.add(getPos(buttons, buttons[randomm[i]]))
                }

                GlobalScope.launch(context = Dispatchers.Main) {
                    delay(1000*(level.toLong()+1))

                    buttons.get(randomm[i]).setImageResource(R.drawable.interrogacion)
                }


            }

        }

    }

    fun getPos(buttons : Array<ImageButton>, imageButton : ImageButton): Int {
        return buttons.indexOf(imageButton)
    }

    fun comparacion(arr : ArrayList<Int>, arr2 : ArrayList<Int>, buttons : Array<ImageButton>): Int{
        resetButtons(buttons)
        return if (arr == arr2){
            1
        }else{
            0
        }
    }

    fun resetButtons(buttons : Array<ImageButton>){
        buttons[0].setImageResource(R.drawable.interrogacion)
        buttons[1].setImageResource(R.drawable.interrogacion)
        buttons[2].setImageResource(R.drawable.interrogacion)
        buttons[3].setImageResource(R.drawable.interrogacion)
        buttons[4].setImageResource(R.drawable.interrogacion)
        buttons[5].setImageResource(R.drawable.interrogacion)
        buttons[6].setImageResource(R.drawable.interrogacion)
        buttons[7].setImageResource(R.drawable.interrogacion)
        buttons[8].setImageResource(R.drawable.interrogacion)
        buttons[9].setImageResource(R.drawable.interrogacion)
        buttons[10].setImageResource(R.drawable.interrogacion)
        buttons[11].setImageResource(R.drawable.interrogacion)
        buttons[12].setImageResource(R.drawable.interrogacion)
        buttons[13].setImageResource(R.drawable.interrogacion)
        buttons[14].setImageResource(R.drawable.interrogacion)
        buttons[15].setImageResource(R.drawable.interrogacion)
        buttons[16].setImageResource(R.drawable.interrogacion)
        buttons[17].setImageResource(R.drawable.interrogacion)
        buttons[18].setImageResource(R.drawable.interrogacion)
        buttons[19].setImageResource(R.drawable.interrogacion)
        buttons[20].setImageResource(R.drawable.interrogacion)
        buttons[21].setImageResource(R.drawable.interrogacion)
        buttons[22].setImageResource(R.drawable.interrogacion)
        buttons[23].setImageResource(R.drawable.interrogacion)
        buttons[24].setImageResource(R.drawable.interrogacion)
    }

}