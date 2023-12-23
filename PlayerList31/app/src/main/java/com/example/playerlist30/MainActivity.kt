package com.example.playerlist30

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var listView:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.listView)
        val playerArray = arrayOf(
            "Messi",
            "Corra",
            "De Maria",
            "De Paul",
            "Enzo",
            "Grancho",
            "Lisandro",
            "Martinaze",
            "Molina",
            "Neo Paz",
            "Otamendi",
            "Parades",
            "Romero"

        )
        val arrayAdapter = ArrayAdapter<Any>(applicationContext,android.R.layout.simple_list_item_1,playerArray)
        listView.adapter = arrayAdapter
        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,playerArray[position],Toast.LENGTH_SHORT).show()
        }
    }
}