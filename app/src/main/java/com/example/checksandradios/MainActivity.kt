package com.example.checksandradios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var  listaSeleccionados:ArrayList<String> = arrayListOf()
    private lateinit var txtSelecionados:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        txtSelecionados = findViewById<TextView>(R.id.txtSelecionados)
        val chkRest = findViewById<CheckBox>(R.id.chkRes)
        val chkBar = findViewById<CheckBox>(R.id.chkBar)
        val chkVidaNoc = findViewById<CheckBox>(R.id.chkVida)
        val chkCompras = findViewById<CheckBox>(R.id.chkShop)


        chkRest.setOnClickListener {
            var myCheck = it as CheckBox

            if(it.isChecked){
                listaSeleccionados.add(it.text.toString())
            }
            else{
                val indexElemento = listaSeleccionados.indexOf(it.text.toString())

                if (indexElemento != -1)
                    listaSeleccionados.removeAt(indexElemento)
            }

            mostrarSeleccionados()
        }

        chkBar.setOnClickListener {
            var myCheck = it as CheckBox

            if(it.isChecked){
                listaSeleccionados.add(it.text.toString())
            }
            else{
                val indexElemento = listaSeleccionados.indexOf(it.text.toString())

                if (indexElemento != -1)
                    listaSeleccionados.removeAt(indexElemento)
            }
            mostrarSeleccionados()
        }

        chkVidaNoc.setOnClickListener {
            var myCheck = it as CheckBox

            if(it.isChecked){
                listaSeleccionados.add(it.text.toString())
            }
            else{
                val indexElemento = listaSeleccionados.indexOf(it.text.toString())

                if (indexElemento != -1)
                    listaSeleccionados.removeAt(indexElemento)
            }
            mostrarSeleccionados()
        }

        chkCompras.setOnClickListener {
            var myCheck = it as CheckBox

            if(it.isChecked){
                listaSeleccionados.add(it.text.toString())
            }
            else{
                val indexElemento = listaSeleccionados.indexOf(it.text.toString())

                if (indexElemento != -1)
                    listaSeleccionados.removeAt(indexElemento)
            }
            mostrarSeleccionados()
        }
    }

    fun mostrarSeleccionados(){
        if(listaSeleccionados.size > 0){
           /* for (texto in listaSeleccionados){
                txtSelecionados.text = txtSelecionados.text.toString() + " " + texto
            }*/

            txtSelecionados.text = listaSeleccionados.joinToString(" ", "{", "}")
        }
        else{
            txtSelecionados.text = ""
        }
    }
}