package com.example.notas

import android.content.Context
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toolbar
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
        val btnEdit1 = findViewById<ImageView>(R.id.btnEdit1)

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

        val lognome4 = findViewById<TextView>(R.id.lognome4)
        val logvalor4 = findViewById<TextView>(R.id.logvalor4)
        val logproduto4 = findViewById<TextView>(R.id.logproduto4)
        val logdata4 = findViewById<TextView>(R.id.logdata4)
        val logdescricao4 = findViewById<TextView>(R.id.logdescricao4)
        val imgcalendar4 = findViewById<ImageView>(R.id.imgcalendar4)
        val imgmoney4 = findViewById<ImageView>(R.id.imgmoney4)
        val imgdesc4 = findViewById<ImageView>(R.id.imgdesc4)
        val divider4 = findViewById<View>(R.id.divider4)

        val lognome5 = findViewById<TextView>(R.id.lognome5)
        val logvalor5 = findViewById<TextView>(R.id.logvalor5)
        val logproduto5 = findViewById<TextView>(R.id.logproduto5)
        val logdata5 = findViewById<TextView>(R.id.logdata5)
        val logdescricao5 = findViewById<TextView>(R.id.logdescricao5)
        val imgcalendar5 = findViewById<ImageView>(R.id.imgcalendar5)
        val imgmoney5 = findViewById<ImageView>(R.id.imgmoney5)
        val imgdesc5 = findViewById<ImageView>(R.id.imgdesc5)
        val divider5 = findViewById<View>(R.id.divider5)

        val lognome6 = findViewById<TextView>(R.id.lognome6)
        val logvalor6 = findViewById<TextView>(R.id.logvalor6)
        val logproduto6 = findViewById<TextView>(R.id.logproduto6)
        val logdata6 = findViewById<TextView>(R.id.logdata6)
        val logdescricao6 = findViewById<TextView>(R.id.logdescricao6)
        val imgcalendar6 = findViewById<ImageView>(R.id.imgcalendar6)
        val imgmoney6 = findViewById<ImageView>(R.id.imgmoney6)
        val imgdesc6 = findViewById<ImageView>(R.id.imgdesc6)
        val divider6 = findViewById<View>(R.id.divider6)

        val lognome7 = findViewById<TextView>(R.id.lognome7)
        val logvalor7 = findViewById<TextView>(R.id.logvalor7)
        val logproduto7 = findViewById<TextView>(R.id.logproduto7)
        val logdata7 = findViewById<TextView>(R.id.logdata7)
        val logdescricao7 = findViewById<TextView>(R.id.logdescricao7)
        val imgcalendar7 = findViewById<ImageView>(R.id.imgcalendar7)
        val imgmoney7 = findViewById<ImageView>(R.id.imgmoney7)
        val imgdesc7 = findViewById<ImageView>(R.id.imgdesc7)
        val divider7 = findViewById<View>(R.id.divider7)

        val lognome8 = findViewById<TextView>(R.id.lognome8)
        val logvalor8 = findViewById<TextView>(R.id.logvalor8)
        val logproduto8 = findViewById<TextView>(R.id.logproduto8)
        val logdata8 = findViewById<TextView>(R.id.logdata8)
        val logdescricao8 = findViewById<TextView>(R.id.logdescricao8)
        val imgcalendar8 = findViewById<ImageView>(R.id.imgcalendar8)
        val imgmoney8 = findViewById<ImageView>(R.id.imgmoney8)
        val imgdesc8 = findViewById<ImageView>(R.id.imgdesc8)
        val divider8 = findViewById<View>(R.id.divider8)

        val lognome9 = findViewById<TextView>(R.id.lognome9)
        val logvalor9 = findViewById<TextView>(R.id.logvalor9)
        val logproduto9 = findViewById<TextView>(R.id.logproduto9)
        val logdata9 = findViewById<TextView>(R.id.logdata9)
        val logdescricao9 = findViewById<TextView>(R.id.logdescricao9)
        val imgcalendar9 = findViewById<ImageView>(R.id.imgcalendar9)
        val imgmoney9 = findViewById<ImageView>(R.id.imgmoney9)
        val imgdesc9 = findViewById<ImageView>(R.id.imgdesc9)
        val divider9 = findViewById<View>(R.id.divider9)

        val lognome10 = findViewById<TextView>(R.id.lognome10)
        val logvalor10 = findViewById<TextView>(R.id.logvalor10)
        val logproduto10 = findViewById<TextView>(R.id.logproduto10)
        val logdata10 = findViewById<TextView>(R.id.logdata10)
        val logdescricao10 = findViewById<TextView>(R.id.logdescricao10)
        val imgcalendar10 = findViewById<ImageView>(R.id.imgcalendar10)
        val imgmoney10 = findViewById<ImageView>(R.id.imgmoney10)
        val imgdesc10 = findViewById<ImageView>(R.id.imgdesc10)
        val divider10 = findViewById<View>(R.id.divider10)

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

        //Escondendo as imagens do layout 2
        fun hideCont2(){
            imgcalendar2.isVisible = false
            imgdesc2.isVisible = false
            imgmoney2.isVisible = false
            divider2.isVisible = false
        }

        fun placeCont3(){

            //Colocando os valores das caixas de layout de volta
            getCont1()
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

        fun hideCont3(){
            imgdesc3.isVisible = false
            imgmoney3.isVisible = false
            divider3.isVisible = false
            imgcalendar3.isVisible = false
        }

        fun placeCont4(){

            //Colocando os valores das caixas de layout 2 e 3 de volta
            getCont2()
            getCont2()
            getCont3()

            //Colocando os valores das caixas de layout 2
            lognome4.text = "$nometxt:"
            logvalor4.text = "$valortxt R$"
            logproduto4.text = "$produtotxt"
            logdata4.text = "$datatxt"
            logdescricao4.text = "$descricaotxt"
        }

        //Armazenando os valores que estavam nas caixas do layout 2
        fun saveCont4() {
            val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.apply {
                putString("NOME4", nometxt)
                putString("VALOR4", valortxt)
                putString("PRODUTO4", produtotxt)
                putString("DATA4", datatxt)
                putString("DESCRICAO4", descricaotxt)
            }.apply()
        }

        //Retornando os valores que estavam nas caixas do layout 2
        fun getCont4(){
            val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
            val nome4 = sharedPreferences.getString("NOME4", null)
            val valor4 = sharedPreferences.getString("VALOR4", null)
            val produto4 = sharedPreferences.getString("PRODUTO4", null)
            val data4 = sharedPreferences.getString("DATA4", null)
            val descricao4 = sharedPreferences.getString("DESCRICAO4", null)

            //Escrevendo os valores novamente nas caixas
            lognome4.text = "$nome4:"
            logvalor4.text = "$valor4 R$"
            logproduto4.text = "$produto4"
            logdata4.text = "$data4"
            logdescricao4.text = "$descricao4"
        }

        fun hideCont4(){
            imgdesc4.isVisible = false
            imgmoney4.isVisible = false
            imgcalendar4.isVisible = false
            divider4.isVisible = false
        }

        fun placeCont5(){

            //Colocando os valores das caixas de layout 2 e 3 de volta
            getCont1()
            getCont2()
            getCont3()
            getCont4()

            //Colocando os valores das caixas de layout 2
            lognome5.text = "$nometxt:"
            logvalor5.text = "$valortxt R$"
            logproduto5.text = "$produtotxt"
            logdata5.text = "$datatxt"
            logdescricao5.text = "$descricaotxt"
        }

        //Armazenando os valores que estavam nas caixas do layout 2
        fun saveCont5() {
            val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.apply {
                putString("NOME5", nometxt)
                putString("VALOR5", valortxt)
                putString("PRODUTO5", produtotxt)
                putString("DATA5", datatxt)
                putString("DESCRICAO5", descricaotxt)
            }.apply()
        }

        //Retornando os valores que estavam nas caixas do layout 2
        fun getCont5(){
            val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
            val nome5 = sharedPreferences.getString("NOME5", null)
            val valor5 = sharedPreferences.getString("VALOR5", null)
            val produto5 = sharedPreferences.getString("PRODUTO5", null)
            val data5 = sharedPreferences.getString("DATA5", null)
            val descricao5 = sharedPreferences.getString("DESCRICAO5", null)

            //Escrevendo os valores novamente nas caixas
            lognome5.text = "$nome5:"
            logvalor5.text = "$valor5 R$"
            logproduto5.text = "$produto5"
            logdata5.text = "$data5"
            logdescricao5.text = "$descricao5"
        }

        fun hideCont5(){
            imgdesc5.isVisible = false
            imgmoney5.isVisible = false
            imgcalendar5.isVisible = false
            divider5.isVisible = false
        }

        fun placeCont6(){

            //Colocando os valores das caixas de layout 2 e 3 de volta
            getCont1()
            getCont2()
            getCont3()
            getCont4()
            getCont5()

            //Colocando os valores das caixas de layout 2
            lognome6.text = "$nometxt:"
            logvalor6.text = "$valortxt R$"
            logproduto6.text = "$produtotxt"
            logdata6.text = "$datatxt"
            logdescricao6.text = "$descricaotxt"
        }

        //Armazenando os valores que estavam nas caixas do layout 2
        fun saveCont6() {
            val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.apply {
                putString("NOME6", nometxt)
                putString("VALOR6", valortxt)
                putString("PRODUTO6", produtotxt)
                putString("DATA6", datatxt)
                putString("DESCRICAO6", descricaotxt)
            }.apply()
        }

        //Retornando os valores que estavam nas caixas do layout 2
        fun getCont6(){
            val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
            val nome6 = sharedPreferences.getString("NOME6", null)
            val valor6 = sharedPreferences.getString("VALOR6", null)
            val produto6 = sharedPreferences.getString("PRODUTO6", null)
            val data6 = sharedPreferences.getString("DATA6", null)
            val descricao6 = sharedPreferences.getString("DESCRICAO6", null)

            //Escrevendo os valores novamente nas caixas
            lognome6.text = "$nome6:"
            logvalor6.text = "$valor6 R$"
            logproduto6.text = "$produto6"
            logdata6.text = "$data6"
            logdescricao6.text = "$descricao6"
        }

        fun hideCont6(){
            imgdesc6.isVisible = false
            imgmoney6.isVisible = false
            imgcalendar6.isVisible = false
            divider6.isVisible = false
        }

        fun placeCont7(){

            //Colocando os valores das caixas de layout 2 e 3 de volta
            getCont1()
            getCont2()
            getCont3()
            getCont4()
            getCont5()
            getCont6()

            //Colocando os valores das caixas de layout 2
            lognome7.text = "$nometxt:"
            logvalor7.text = "$valortxt R$"
            logproduto7.text = "$produtotxt"
            logdata7.text = "$datatxt"
            logdescricao7.text = "$descricaotxt"
        }

        //Armazenando os valores que estavam nas caixas do layout 2
        fun saveCont7() {
            val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.apply {
                putString("NOME7", nometxt)
                putString("VALOR7", valortxt)
                putString("PRODUTO7", produtotxt)
                putString("DATA7", datatxt)
                putString("DESCRICAO7", descricaotxt)
            }.apply()
        }

        //Retornando os valores que estavam nas caixas do layout 2
        fun getCont7(){
            val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
            val nome7 = sharedPreferences.getString("NOME7", null)
            val valor7 = sharedPreferences.getString("VALOR7", null)
            val produto7 = sharedPreferences.getString("PRODUTO7", null)
            val data7 = sharedPreferences.getString("DATA7", null)
            val descricao7 = sharedPreferences.getString("DESCRICAO7", null)

            //Escrevendo os valores novamente nas caixas
            lognome7.text = "$nome7:"
            logvalor7.text = "$valor7 R$"
            logproduto7.text = "$produto7"
            logdata7.text = "$data7"
            logdescricao7.text = "$descricao7"
        }

        fun hideCont7(){
            imgdesc7.isVisible = false
            imgmoney7.isVisible = false
            imgcalendar7.isVisible = false
            divider7.isVisible = false
        }

        fun placeCont8(){

            //Colocando os valores das caixas de layout 2 e 3 de volta
            getCont1()
            getCont2()
            getCont3()
            getCont4()
            getCont5()
            getCont6()
            getCont7()

            //Colocando os valores das caixas de layout 2
            lognome8.text = "$nometxt:"
            logvalor8.text = "$valortxt R$"
            logproduto8.text = "$produtotxt"
            logdata8.text = "$datatxt"
            logdescricao8.text = "$descricaotxt"
        }

        //Armazenando os valores que estavam nas caixas do layout 2
        fun saveCont8() {
            val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.apply {
                putString("NOME8", nometxt)
                putString("VALOR8", valortxt)
                putString("PRODUTO8", produtotxt)
                putString("DATA8", datatxt)
                putString("DESCRICAO8", descricaotxt)
            }.apply()
        }

        //Retornando os valores que estavam nas caixas do layout 2
        fun getCont8(){
            val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
            val nome8 = sharedPreferences.getString("NOME8", null)
            val valor8 = sharedPreferences.getString("VALOR8", null)
            val produto8 = sharedPreferences.getString("PRODUTO8", null)
            val data8 = sharedPreferences.getString("DATA8", null)
            val descricao8 = sharedPreferences.getString("DESCRICAO8", null)

            //Escrevendo os valores novamente nas caixas
            lognome8.text = "$nome8:"
            logvalor8.text = "$valor8 R$"
            logproduto8.text = "$produto8"
            logdata8.text = "$data8"
            logdescricao8.text = "$descricao8"
        }

        fun hideCont8(){
            imgdesc8.isVisible = false
            imgmoney8.isVisible = false
            imgcalendar8.isVisible = false
            divider8.isVisible = false
        }

        fun placeCont9(){

            //Colocando os valores das caixas de layout 2 e 3 de volta
            getCont1()
            getCont2()
            getCont3()
            getCont4()
            getCont5()
            getCont6()
            getCont7()
            getCont8()

            //Colocando os valores das caixas de layout 2
            lognome9.text = "$nometxt:"
            logvalor9.text = "$valortxt R$"
            logproduto9.text = "$produtotxt"
            logdata9.text = "$datatxt"
            logdescricao9.text = "$descricaotxt"
        }

        //Armazenando os valores que estavam nas caixas do layout 2
        fun saveCont9() {
            val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.apply {
                putString("NOME9", nometxt)
                putString("VALOR9", valortxt)
                putString("PRODUTO9", produtotxt)
                putString("DATA9", datatxt)
                putString("DESCRICAO9", descricaotxt)
            }.apply()
        }

        //Retornando os valores que estavam nas caixas do layout 2
        fun getCont9(){
            val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
            val nome9 = sharedPreferences.getString("NOME9", null)
            val valor9 = sharedPreferences.getString("VALOR9", null)
            val produto9 = sharedPreferences.getString("PRODUTO9", null)
            val data9 = sharedPreferences.getString("DATA9", null)
            val descricao9 = sharedPreferences.getString("DESCRICAO9", null)

            //Escrevendo os valores novamente nas caixas
            lognome9.text = "$nome9:"
            logvalor9.text = "$valor9 R$"
            logproduto9.text = "$produto9"
            logdata9.text = "$data9"
            logdescricao9.text = "$descricao9"
        }

        fun hideCont9(){
            imgdesc9.isVisible = false
            imgmoney9.isVisible = false
            imgcalendar9.isVisible = false
            divider9.isVisible = false
        }

        fun placeCont10(){

            //Colocando os valores das caixas de layout 2 e 3 de volta
            getCont1()
            getCont2()
            getCont3()
            getCont4()
            getCont5()
            getCont6()
            getCont7()
            getCont8()
            getCont9()

            //Colocando os valores das caixas de layout 2
            lognome10.text = "$nometxt:"
            logvalor10.text = "$valortxt R$"
            logproduto10.text = "$produtotxt"
            logdata10.text = "$datatxt"
            logdescricao10.text = "$descricaotxt"
        }

        //Armazenando os valores que estavam nas caixas do layout 2
        fun saveCont10() {
            val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.apply {
                putString("NOME10", nometxt)
                putString("VALOR10", valortxt)
                putString("PRODUTO10", produtotxt)
                putString("DATA10", datatxt)
                putString("DESCRICAO10", descricaotxt)
            }.apply()
        }

        //Retornando os valores que estavam nas caixas do layout 2
        fun getCont10(){
            val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
            val nome10 = sharedPreferences.getString("NOME10", null)
            val valor10 = sharedPreferences.getString("VALOR10", null)
            val produto10 = sharedPreferences.getString("PRODUTO10", null)
            val data10 = sharedPreferences.getString("DATA10", null)
            val descricao10 = sharedPreferences.getString("DESCRICAO10", null)

            //Escrevendo os valores novamente nas caixas
            lognome10.text = "$nome10:"
            logvalor10.text = "$valor10 R$"
            logproduto10.text = "$produto10"
            logdata10.text = "$data10"
            logdescricao10.text = "$descricao10"
        }

        fun hideCont10(){
            imgdesc10.isVisible = false
            imgmoney10.isVisible = false
            imgcalendar10.isVisible = false
            divider10.isVisible = false
        }

        //Habilitando a edição de caixas
        btnEdit1.setOnClickListener{

        }


        //Exibindo os valores nas caixas de acordo com a contagem de salvamentos
        if (CONTTT == "1"){
            placeCont1()
            saveCont1()

            //Deixando o resto invisível
            hideCont2()
            hideCont3()
            hideCont4()
            hideCont5()
            hideCont6()
            hideCont7()
            hideCont8()
            hideCont9()
            hideCont10()
        }
        if (CONTTT == "2"){
            placeCont2()
            saveCont2()

            //Deixando o resto invisível
            hideCont3()
            hideCont4()
            hideCont5()
            hideCont6()
            hideCont7()
            hideCont8()
            hideCont9()
            hideCont10()
        }
        if (CONTTT == "3") {
            placeCont3()
            saveCont3()

            //Deixando o resto invisível
            hideCont4()
            hideCont5()
            hideCont6()
            hideCont7()
            hideCont8()
            hideCont9()
            hideCont10()
        }
        if (CONTTT == "4") {
            placeCont4()
            saveCont4()

            //Deixando o resto invisível
            hideCont5()
            hideCont6()
            hideCont7()
            hideCont8()
            hideCont9()
            hideCont10()
        }
        if (CONTTT == "5") {
            placeCont5()
            saveCont5()

            //Deixando o resto invisível
            hideCont6()
            hideCont7()
            hideCont8()
            hideCont9()
            hideCont10()
        }
        if (CONTTT == "6") {
            placeCont6()
            saveCont6()

            //Deixando o resto invisível
            hideCont7()
            hideCont8()
            hideCont9()
            hideCont10()
        }
        if (CONTTT == "7") {
            placeCont7()
            saveCont7()

            //Deixando o resto invisível
            hideCont8()
            hideCont9()
            hideCont10()
        }
        if (CONTTT == "8") {
            placeCont8()
            saveCont8()

            //Deixando o resto invisível
            hideCont9()
            hideCont10()
        }
        if (CONTTT == "9") {
            placeCont9()
            saveCont9()

            //Deixando o resto invisível
            hideCont10()
        }
        if (CONTTT == "10") {
            placeCont10()
            saveCont10()
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