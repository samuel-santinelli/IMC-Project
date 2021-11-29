package com.example.imcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class DashboardActivity : AppCompatActivity() {


        // *** Carregar os dados da SharedPreferences nos campos da dashboard

        lateinit var tvNome: TextView
        lateinit var tvProfissao: TextView
        lateinit var tvAltura: TextView

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_dashboard)

            supportActionBar!!.hide()


            tvNome = findViewById(R.id.tv_nome)
            tvProfissao = findViewById(R.id.tv_profissao)
            tvAltura = findViewById(R.id.tv_altura)

            // *** Abrir o arquivo cadastro
            val arquivo = getSharedPreferences("cadastro", MODE_PRIVATE)

            // *** Pegar os dados do arquivo e jogar nos TextViews
            tvNome.text = arquivo.getString("nome", "")
            tvProfissao.text = arquivo.getString("profissao", "")
            tvAltura.text = arquivo.getFloat("altura", 0.0f).toString()


        }
    }






