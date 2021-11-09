package com.example.imcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class novoUsuario : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.toolbar_cadastro, menu)

        return true
    }
}