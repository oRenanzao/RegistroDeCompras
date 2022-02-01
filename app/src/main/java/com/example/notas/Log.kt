package com.example.notas

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible
import androidx.recyclerview.widget.DividerItemDecoration
import java.io.BufferedReader

class Log : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log)

        //Alterando o nome e o ícone da Action Bar
        supportActionBar!!.setTitle("Histórico")
        supportActionBar!!.setHomeAsUpIndicator(R.drawable.ic_seta2)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        //Recebendo as variáveis de Main Activity
        val nometxt = intent.getStringExtra("nometxt")
        val valortxt = intent.getStringExtra("valortxt")
        val produtotxt = intent.getStringExtra("produtotxt")
        val datatxt = intent.getStringExtra("datatxt")
        val descricaotxt = intent.getStringExtra("descricaotxt")
        val CONTTT = intent.getStringExtra("CONTTTtxt")

        //Recuperando os objetos para cada parte do layout
        val btnLimpeza = findViewById<Button>(R.id.btnLimpeza)

        val lognome = findViewById<TextView>(R.id.lognome)
        val logvalor = findViewById<TextView>(R.id.logvalor)
        val logproduto = findViewById<TextView>(R.id.logproduto)
        val logdata = findViewById<TextView>(R.id.logdata)
        val logdescricao = findViewById<TextView>(R.id.logdescricao)

        val lognome2 = findViewById<TextView>(R.id.lognome2)
        val logvalor2 = findViewById<TextView>(R.id.logvalor2)
        val logproduto2 = findViewById<TextView>(R.id.logproduto2)
        val logdata2 = findViewById<TextView>(R.id.logdata2)
        val logdescricao2 = findViewById<TextView>(R.id.logdescricao2)
        val imgcalendar2 = findViewById<ImageView>(R.id.imgcalendar2)
        val imgmoney2 = findViewById<ImageView>(R.id.imgmoney2)
        val imgdesc2 = findViewById<ImageView>(R.id.imgdesc2)
        val divider2 = findViewById<View>(R.id.divider2)

        val lognome3 = findViewById<TextView>(R.id.lognome3)
        val logvalor3 = findViewById<TextView>(R.id.logvalor3)
        val logproduto3 = findViewById<TextView>(R.id.logproduto3)
        val logdata3 = findViewById<TextView>(R.id.logdata3)
        val logdescricao3 = findViewById<TextView>(R.id.logdescricao3)
        val imgcalendar3 = findViewById<ImageView>(R.id.imgcalendar3)
        val imgmoney3 = findViewById<ImageView>(R.id.imgmoney3)
        val imgdesc3 = findViewById<ImageView>(R.id.imgdesc3)
        val divider3 = findViewById<View>(R.id.divider3)

        //Caixa de contagem
        val tvteste2 = findViewById<TextView>(R.id.tvteste2)

        tvteste2.text = "$CONTTT"

        fun limparHistorico(){
            val intent = Intent(this, MainActivity::class.java)

            //Enviando um zero para a contagem na Main Activity
            intent.putExtra("logcont", "Clicado")

            //Voltando para a página Main
            startActivity(intent)
        }

        //Escrevendo os valores nas caixas do layout 1
        fun placeCont1(){
            lognome.text = "$nometxt:"
            logvalor.text = "$valortxt R$"
            logproduto.text = "$produtotxt"
            logdata.text = "$datatxt"
            logdescricao.text = "$descricaotxt"
        }

        //Armazenando os valores que estavam nas caixas do layout 1
        fun saveCont1() {
            val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.apply {
                putString("NOME1", nometxt)
                putString("VALOR1", valortxt)
                putString("PRODUTO1", produtotxt)
                putString("DATA1", datatxt)
                putString("DESCRICAO1", descricaotxt)
            }.apply()
        }

        //Retornando os valores que estavam nas caixas do layout 1
        fun getCont1(){
            val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
            val nome1 = sharedPreferences.getString("NOME1", null)
            val valor1 = sharedPreferences.getString("VALOR1", null)
            val produto1 = sharedPreferences.getString("PRODUTO1", null)
            val data1 = sharedPreferences.getString("DATA1", null)
            val descricao1 = sharedPreferences.getString("DESCRICAO1", null)

            //Escrevendo os valores novamente nas caixas
            lognome.text = "$nome1:"
            logvalor.text = "$valor1 R$"
            logproduto.text = "$produto1"
            logdata.text = "$data1"
            logdescricao.text = "$descricao1"
        }

        //Escrevendo os valores nas caixas do layout 2
        fun placeCont2(){

            //Colocando os valores das caixas de layout 1 de volta
            getCont1()

            //Colocando os valores das caixas de layout 2
            lognome2.text = "$nometxt:"
            logvalor2.text = "$valortxt R$"
            logproduto2.text = "$produtotxt"
            logdata2.text = "$datatxt"
            logdescricao2.text = "$descricaotxt"
        }

        //Armazenando os valores que estavam nas caixas do layout 2
        fun saveCont2() {
            val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.apply {
                putString("NOME2", nometxt)
                putString("VALOR2", valortxt)
                putString("PRODUTO2", produtotxt)
                putString("DATA2", datatxt)
                putString("DESCRICAO2", descricaotxt)
            }.apply()
        }

        //Retornando os valores que estavam nas caixas do layout 2
        fun getCont2(){
            val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
            val nome2 = sharedPreferences.getString("NOME2", null)
            val valor2 = sharedPreferences.getString("VALOR2", null)
            val produto2 = sharedPreferences.getString("PRODUTO2", null)
            val data2 = sharedPreferences.getString("DATA2", null)
            val descricao2 = sharedPreferences.getString("DESCRICAO2", null)

            //Escrevendo os valores novamente nas caixas
            lognome2.text = "$nome2:"
            logvalor2.text = "$valor2 R$"
            logproduto2.text = "$produto2"
            logdata2.text = "$data2"
            logdescricao2.text = "$descricao2"
        }

        fun placeCont3(){

            //Colocando os valores das caixas de layout 1 de volta
            getCont2()

            //Colocando os valores das caixas de layout 2
            lognome3.text = "$nometxt:"
            logvalor3.text = "$valortxt R$"
            logproduto3.text = "$produtotxt"
            logdata3.text = "$datatxt"
            logdescricao3.text = "$descricaotxt"
        }

        //Armazenando os valores que estavam nas caixas do layout 2
        fun saveCont3() {
            val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.apply {
                putString("NOME3", nometxt)
                putString("VALOR3", valortxt)
                putString("PRODUTO3", produtotxt)
                putString("DATA3", datatxt)
                putString("DESCRICAO3", descricaotxt)
            }.apply()
        }

        //Retornando os valores que estavam nas caixas do layout 2
        fun getCont3(){
            val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
            val nome3 = sharedPreferences.getString("NOME3", null)
            val valor3 = sharedPreferences.getString("VALOR3", null)
            val produto3 = sharedPreferences.getString("PRODUTO3", null)
            val data3 = sharedPreferences.getString("DATA3", null)
            val descricao3 = sharedPreferences.getString("DESCRICAO3", null)

            //Escrevendo os valores novamente nas caixas
            lognome3.text = "$nome3:"
            logvalor3.text = "$valor3 R$"
            logproduto3.text = "$produto3"
            logdata3.text = "$data3"
            logdescricao3.text = "$descricao3"
        }

        //Exibindo os valores nas caixas de acordo com a contagem de salvamentos

        if (CONTTT == "1"){
            placeCont1()
            saveCont1()

            //Deixando o resto invisível
            imgcalendar2.isVisible = false
            imgdesc2.isVisible = false
            imgmoney2.isVisible = false
            imgcalendar3.isVisible = false
            imgdesc3.isVisible = false
            imgmoney3.isVisible = false
            divider2.isVisible = false
            divider3.isVisible = false

        } else{
            if (CONTTT == "2"){
                getCont1()
                placeCont2()
                saveCont2()

                //Deixando o resto invisível
                imgcalendar3.isVisible = false
                imgdesc3.isVisible = false
                imgmoney3.isVisible = false
                divider3.isVisible = false

            } else {
                if (CONTTT == "3") {
                    getCont1()
                    getCont2()
                    placeCont3()
                    saveCont3()
                }
            }
        }

        btnLimpeza.setOnClickListener{
            //Confirmando a limpeza dos dados
            val builder = AlertDialog.Builder(this)
            builder.setMessage("Tem certeza que deseja limpar o histórico?")
                .setCancelable(false)
                .setPositiveButton("Sim") { dialog, id ->
                    limparHistorico()
                }
                .setNegativeButton("Não") { dialog, id ->
                    // Dismiss the dialog
                    dialog.dismiss()
                }
            val alert = builder.create()
            alert.show()
        }

    }
}