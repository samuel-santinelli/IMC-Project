package com.example.imcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Remove a toolbar
        supportActionBar!!.hide()

       // Instanciar o boão entrar
        val  botaoNovoUsuario = findViewById<Button>(R.id.button_criar_conta)

       // Criar um Listener - ouvinte
        botaoNovoUsuario.setOnClickListener{
            // Criar uma intent
            val abrirCadastro = Intent(this, novoUsuario::class.java)
            startActivity(abrirCadastro)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.toolbar_cadastro,menu)
        return true
    }
}