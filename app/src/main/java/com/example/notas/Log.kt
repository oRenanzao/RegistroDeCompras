package com.example.notas

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Log : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log)

        //Recebendo as variáveis de Main Activity
        val nometxt = intent.getStringExtra("nometxt")

        //Recuperando os objetos
        val resultado = findViewById<TextView>(R.id.resultado)

        //Exibindo os valores nas caixas
        resultado.text = "Loja: $nometxt"

    }
}