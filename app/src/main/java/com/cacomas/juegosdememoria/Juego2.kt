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
        val Comenzar : Button = view.findViewById(R.id.button_Comenzar_j2)
        var rnds = (0..24).random();
        var auxRnd= rnds
        var ButtonAux : ImageButton = buttons.get(rnds)
        Comenzar.setOnClickListener {

                buttons.get(rnds).setBackgroundColor(resources.getColor(R.color.colorPrimary));
                rnds = (0..24).random();
                buttons.get(rnds).setBackgroundColor(resources.getColor(R.color.colorPrimary));
            GlobalScope.launch(context = Dispatchers.Main) {
                delay(1000)
                    buttons.get(rnds).setBackgroundColor(Color.LTGRAY);
                    buttons.get(auxRnd).setBackgroundColor(Color.LTGRAY);
            }
        }


    }

}