package com.example.imcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var editEmail: EditText
    lateinit var editSenha: EditText
    lateinit var btnEntrar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Remove a toolbar
        supportActionBar!!.hide()

       // Instanciar o boão entrar
        val  botaoNovoUsuario = findViewById<Button>(R.id.button_criar_conta)

        editEmail = findViewById(R.id.edit_novo_email)
        editSenha = findViewById(R.id.edit_novo_senha)
        btnEntrar = findViewById(R.id.btn_entrar)

        btnEntrar.setOnClickListener{
            login()

        }

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

    private fun login() {
        val arquivo = getSharedPreferences("cadastro", MODE_PRIVATE)

        val email = arquivo.getString("email", "")
        val senha = arquivo.getString("senha", "")


        if (editEmail.text.toString() == email && editSenha.text.toString() == senha) {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }else{
                    Toast.makeText(this, "Usuario ou senha incorretos!!", Toast.LENGTH_SHORT).show()
                }
        }
    }


