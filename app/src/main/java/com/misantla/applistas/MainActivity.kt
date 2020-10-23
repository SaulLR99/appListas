package com.misantla.applistas

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.system.exitProcess


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var frutas: ArrayList<String> = ArrayList()
        frutas.add("Kiwi")
        frutas.add("Limon")
        frutas.add("Manzana")
        frutas.add("Naranja")
        frutas.add("Platano")
        frutas.add("Uva")

        val lista = findViewById<ListView>(R.id.lista)
        val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)

        lista.adapter = adaptador
        lista.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, position,l ->
            Toast.makeText(this, frutas.get(position), Toast.LENGTH_LONG).show()
            if (position == 0) {
                // Abre una nueva Activity Kiwi:
                val myIntent = Intent(view.context, KiwiActivity::class.java)
                startActivity(myIntent)
            } else if (position == 1) {
                // Abre una nueva Activity Limon:
                val myIntent = Intent(view.context, LimonActivity::class.java)
                startActivity(myIntent)
            } else if (position == 2) {
                // Abre una nueva Activity Manzana:
                val myIntent = Intent(view.context, ManzanaActivity::class.java)
                startActivity(myIntent)
            } else if (position == 3) {
                // Abre una nueva Activity Naranja:
                val myIntent = Intent(view.context, NaranjaActivity::class.java)
                startActivity(myIntent)
            } else if (position == 4) {
                // Abre una nueva Activity Platano:
                val myIntent = Intent(view.context, PlatanoActivity::class.java)
                startActivity(myIntent)
            } else if (position == 5) {
                // Abre una nueva Activity Uva:
                val myIntent = Intent(view.context, UvaActivity::class.java)
                startActivity(myIntent)
            }
        }

       /* lista.setOnItemClickListener(
                OnItemClickListener { parent, view, position, id ->
                    if (position == 0) {
                        // Abre una nueva Activity Kiwi:
                        val myIntent = Intent(view.context, KiwiActivity::class.java)
                        startActivity(myIntent)
                    } else if (position == 1) {
                        // Abre una nueva Activity Limon:
                        val myIntent = Intent(view.context, LimonActivity::class.java)
                        startActivity(myIntent)
                    } else if (position == 2) {
                        // Abre una nueva Activity Manzana:
                        val myIntent = Intent(view.context, ManzanaActivity::class.java)
                        startActivity(myIntent)
                    } else if (position == 3) {
                        // Abre una nueva Activity Naranja:
                        val myIntent = Intent(view.context, NaranjaActivity::class.java)
                        startActivity(myIntent)
                    } else if (position == 4) {
                        // Abre una nueva Activity Platano:
                        val myIntent = Intent(view.context, PlatanoActivity::class.java)
                        startActivity(myIntent)
                    } else if (position == 5) {
                        // Abre una nueva Activity Uva:
                        val myIntent = Intent(view.context, UvaActivity::class.java)
                        startActivity(myIntent)
                    }
                }
        )*/
    }
}
