package com.example.notas

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Reconhecendo os objetos
        val tvnome = findViewById<TextView>(R.id.tvnome)
        val tvvalor = findViewById<TextView>(R.id.tvvalor)
        val btnLog = findViewById<Button>(R.id.btnLog)
        val tvresultado = findViewById<TextView>(R.id.tvresultado)

        //Salvando os dados
        fun saveData(){

            //Passando o valor informado para a caixa
            tvresultado.text = tvnome.text.toString()

            //Salvando o resultado na chave NOME
            val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.apply{
                putString("NOME", tvnome.text.toString())
                putString("VALOR",tvvalor.text.toString())
            }.apply()

            //Enviando uma mensagem de conclusão
            Toast.makeText(this, "Data saved", Toast.LENGTH_SHORT).show()
        }

        //Abrindo uma nova tela
        fun goToLog(){

            val intent = Intent(this, Log::class.java)

            //Carregando os valores salvos no Preferences
            val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
            val savedNome = sharedPreferences.getString("NOME", null)
            val savedValor = sharedPreferences.getString("VALOR", null)

            //Enviando os dados para o Log
            intent.putExtra("nometxt", "$savedNome")
            intent.putExtra("valortxt", "$savedValor")

            startActivity(intent)
        }

        //Ativando as funções no botão
        btnLog.setOnClickListener{
            saveData()
            goToLog()
        }

    }


}