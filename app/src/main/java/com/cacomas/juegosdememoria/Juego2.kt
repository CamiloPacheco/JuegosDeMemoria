package com.cacomas.juegosdememoria

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
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

        buttons[0].setOnClickListener {
            arr.add(getPos(buttons,buttons[0]))
        }
        buttons[1].setOnClickListener {
            arr.add(getPos(buttons,buttons[1]))
        }
        buttons[2].setOnClickListener {
            arr.add(getPos(buttons,buttons[2]))
        }
        buttons[3].setOnClickListener {
            arr.add(getPos(buttons,buttons[3]))
        }
        buttons[4].setOnClickListener {
            arr.add(getPos(buttons,buttons[4]))
        }
        buttons[5].setOnClickListener {
            arr.add(getPos(buttons,buttons[5]))
        }
        buttons[6].setOnClickListener {
            arr.add(getPos(buttons,buttons[6]))
        }
        buttons[7].setOnClickListener {
            arr.add(getPos(buttons,buttons[7]))
        }
        buttons[8].setOnClickListener {
            arr.add(getPos(buttons,buttons[8]))
        }
        buttons[9].setOnClickListener {
            arr.add(getPos(buttons,buttons[9]))
        }
        buttons[10].setOnClickListener {
            arr.add(getPos(buttons,buttons[10]))
        }
        buttons[11].setOnClickListener {
            arr.add(getPos(buttons,buttons[11]))
        }
        buttons[12].setOnClickListener {
            arr.add(getPos(buttons,buttons[12]))
        }
        buttons[13].setOnClickListener {
            arr.add(getPos(buttons,buttons[13]))
        }
        buttons[14].setOnClickListener {
            arr.add(getPos(buttons,buttons[14]))
        }
        buttons[15].setOnClickListener {
            arr.add(getPos(buttons,buttons[15]))
        }
        buttons[16].setOnClickListener {
            arr.add(getPos(buttons,buttons[16]))
        }
        buttons[17].setOnClickListener {
            arr.add(getPos(buttons,buttons[17]))
        }
        buttons[18].setOnClickListener {
            arr.add(getPos(buttons,buttons[18]))
        }
        buttons[19].setOnClickListener {
            arr.add(getPos(buttons,buttons[19]))
        }
        buttons[20].setOnClickListener {
            arr.add(getPos(buttons,buttons[20]))
        }
        buttons[21].setOnClickListener {
            arr.add(getPos(buttons,buttons[21]))
        }
        buttons[22].setOnClickListener {
            arr.add(getPos(buttons,buttons[22]))
        }
        buttons[23].setOnClickListener {
            arr.add(getPos(buttons,buttons[23]))
        }
        buttons[24].setOnClickListener {
            arr.add(getPos(buttons,buttons[24]))
        }


        val Comenzar : Button = view.findViewById(R.id.button_Comenzar_j2)
        var rnds = 0
        var rnds2= 0
        var ButtonAux : ImageButton = buttons.get(rnds)
        var level = 1
        var firstTime = 0

        Comenzar.setOnClickListener {
            if (firstTime != 0){
                if (comparacion(arr, arr2) == 1){
                    level += 1
                    arr.clear()
                    arr2.clear()
                }else{
                    level = 1
                    arr.clear()
                    arr2.clear()
                }
            }

            when (level){
                1 ->{
                    firstTime = 1

                    rnds = (0..24).random()
                    buttons.get(rnds).setImageResource(R.drawable.morado)
                    arr2.add(getPos(buttons, buttons[rnds]))

                    GlobalScope.launch(context = Dispatchers.Main) {
                        delay(1000)
                        buttons.get(rnds).setImageResource(R.drawable.interrogacion)
                    }

                    rnds2 = (0..24).random()
                    while (rnds2==rnds){
                        rnds2 = (0..24).random()
                    }
                    buttons.get(rnds2).setImageResource(R.drawable.morado)
                    arr2.add(getPos(buttons, buttons[rnds2]))

                    GlobalScope.launch(context = Dispatchers.Main) {
                        delay(1000)
                        buttons.get(rnds2).setImageResource(R.drawable.interrogacion)
                    }

                    /**GlobalScope.launch(context = Dispatchers.Main) {
                        delay(1000)
                        buttons.get(rnds).setImageResource(R.drawable.interrogacion)
                        buttons.get(rnds2).setImageResource(R.drawable.interrogacion)
                    }*/
                }
            }

            /**buttons.get(rnds).setBackgroundColor(resources.getColor(R.color.colorPrimary));
            rnds = (0..24).random();
            buttons.get(rnds).setBackgroundColor(resources.getColor(R.color.colorPrimary));
            GlobalScope.launch(context = Dispatchers.Main) {
                delay(1000)
                    buttons.get(rnds).setBackgroundColor(Color.LTGRAY);
                    buttons.get(auxRnd).setBackgroundColor(Color.LTGRAY);
            }*/
        }

    }

    fun getPos(buttons : Array<ImageButton>, imageButton : ImageButton): Int {
        return buttons.indexOf(imageButton)
    }

    fun comparacion(arr : ArrayList<Int>, arr2 : ArrayList<Int>): Int{
        return if (arr == arr2){
            1
        }else{
            0
        }
    }

}