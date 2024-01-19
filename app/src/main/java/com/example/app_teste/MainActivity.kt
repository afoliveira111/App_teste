package com.example.app_teste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val botaoSomar = findViewById<Button>(R.id.botaoSomar)
        val botaoSubtrair = findViewById<Button>(R.id.botaoSubtrair)
        val resultado = findViewById<TextView>(R.id.resultado)

        botaoSomar.setOnClickListener {
            contador = contador + 1
            resultado.text = "Valor : ${contador}"

        }
        botaoSubtrair.setOnClickListener {
            contador = contador - 1
            resultado.text = "Valor : ${contador}"

        }
    }
}

