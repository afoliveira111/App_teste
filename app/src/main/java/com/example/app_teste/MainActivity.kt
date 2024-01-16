package com.example.app_teste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var contador = 0
    private var contador2 = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.botao)
        val button2 = findViewById<Button>(R.id.botao2)
        val resultado = findViewById<TextView>(R.id.resultado)
        val resultado2 = findViewById<TextView>(R.id.resultado2)

        button.setOnClickListener {
            contador = contador + 1
            resultado.text = "Valor : ${contador}"

         button2.setOnClickListener {
             contador2 = contador2 -1
             resultado2.text = "Valor : ${contador2}"
         }

        }

    }

}