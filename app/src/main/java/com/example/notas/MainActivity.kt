package com.example.notas

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.io.BufferedReader
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Reconhecendo os objetos
        val btnClearCount = findViewById<Button>(R.id.btnClear)

        val tvnome = findViewById<TextView>(R.id.tvnome)
        val tvvalor = findViewById<TextView>(R.id.tvvalor)
        val tvproduto = findViewById<TextView>(R.id.tvproduto)
        val tvdata = findViewById<TextView>(R.id.tvdata)
        val tvdescricao = findViewById<TextView>(R.id.tvdescricao)
        val btnSave = findViewById<Button>(R.id.btnLog)
        val btnHist = findViewById<Button>(R.id.btnHist)
        val tvresultado = findViewById<TextView>(R.id.tvresultado)
        val tvcontagem = findViewById<TextView>(R.id.tvcontagem)

        //Definindo a caixa de data para ser a data atual automaticamente
        fun data_atual(){
            val data = Calendar.getInstance().time
            val formatador = SimpleDateFormat("dd/MM/yyyy")
            val data_formatada = formatador.format(data)
            tvdata.text = data_formatada
        }

        val SAVECOUNT = "Salvando Contagem"

        //Chamando a contagem pela primeira vez: retorna zero
        fun getSaveCount() : Int {
            val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
            return sharedPreferences.getInt(SAVECOUNT, 0)
        }

        //Adicionando a contagem ao Shared Preferences
        fun setSaveCount(count:Int) {
            val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.apply {
                putInt(SAVECOUNT, count)
            }.apply()
        }

        //Limpando a contagem
        fun clearSaveCount(){
            setSaveCount(0)
            val SaveCount = getSaveCount()
            tvcontagem.text = SaveCount.toString()
        }

        //Salvando os dados
        fun saveData(){

            //Passando o valor informado para a caixa
            tvresultado.text = tvnome.text.toString()

            //Pegando a contagem atual e adicionando mais um a cada vez que o botão é pressionado
            var SaveCount = getSaveCount()
            SaveCount++
            setSaveCount(SaveCount)
            tvcontagem.text = SaveCount.toString()

            //Salvando o resultado na chave NOME
            val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.apply{
                putString("NOME", tvnome.text.toString())
                putString("VALOR",tvvalor.text.toString())
                putString("PRODUTO",tvproduto.text.toString())
                putString("DATA",tvdata.text.toString())
                putString("DESCRICAO",tvdescricao.text.toString())
                putString("CONTTT", tvcontagem.text.toString())
            }.apply()

            //Enviando uma mensagem de conclusão
            Toast.makeText(this, "Dados salvos", Toast.LENGTH_SHORT).show()
        }

        //Abrindo uma nova tela
        fun goToLog(){

            val intent = Intent(this, Log::class.java)

            //Carregando os valores salvos no Preferences
            val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
            val savedNome = sharedPreferences.getString("NOME", null)
            val savedValor = sharedPreferences.getString("VALOR", null)
            val savedProduto = sharedPreferences.getString("PRODUTO", null)
            val savedData = sharedPreferences.getString("DATA", null)
            val savedDescricao = sharedPreferences.getString("DESCRICAO", null)
            val savedCONTTT = sharedPreferences.getString("CONTTT", null)

            //Enviando os dados para o Log
            intent.putExtra("nometxt", "$savedNome")
            intent.putExtra("valortxt", "$savedValor")
            intent.putExtra("produtotxt", "$savedProduto")
            intent.putExtra("datatxt", "$savedData")
            intent.putExtra("descricaotxt", "$savedDescricao")
            intent.putExtra("CONTTTtxt", "$savedCONTTT")

            startActivity(intent)
        }

        //Limpa as caixas de texto para outros input
        fun clearBoxes(){
            tvnome.text = ""
            tvproduto.text = ""
            tvvalor.text = ""
            tvdescricao.text =""
        }

        //Exibindo a contagem ao fechar e abrir o aplicativo
        tvcontagem.text = getSaveCount().toString()

        //Verificando se houve limpeza de histórico
        if (intent.getStringExtra("logcont").toString() == "Clicado"){
            tvcontagem.text = intent.getStringExtra("logcont").toString()
            clearSaveCount()
        }

        //Colocando o valor da data automaticamente
        data_atual()

        //Botão para salvar os dados
        btnSave.setOnClickListener{

            //Verificando se ainda cabem mais registros
            val SaveCount = getSaveCount()
            if (SaveCount >= 10){
                Toast.makeText(this, "Limite de registros atingido", Toast.LENGTH_SHORT).show()
            }
            else{
            //Verificando se as caixas foram preenchidas corretamente
            if(tvnome.text.toString() == ""){
                Toast.makeText(this, "Informe a Loja", Toast.LENGTH_SHORT).show()
            } else{
                if(tvproduto.text.toString() == ""){
                    Toast.makeText(this, "Informe o Produto", Toast.LENGTH_SHORT).show()
                } else{
                    if(tvvalor.text.toString() == ""){
                        Toast.makeText(this, "Informe o Valor", Toast.LENGTH_SHORT).show()
                    } else{
                        if(tvdata.text.toString() == ""){
                            Toast.makeText(this, "Informe a Data", Toast.LENGTH_SHORT).show()
                        } else {
                            //Salvando os dados e limpando as caixas
                        saveData()
                        goToLog()
                        clearBoxes()
                        }
                    }
                }
            }
            }
        }

        //Botão para recuperar os dados
        btnHist.setOnClickListener{
            if (tvcontagem.text.toString() != "0"){
                goToLog()
            }
            else{
                Toast.makeText(this, "Não há nada no histórico", Toast.LENGTH_SHORT).show()
            }
        }

        btnClearCount.setOnClickListener{
            clearSaveCount()
        }

    }

}