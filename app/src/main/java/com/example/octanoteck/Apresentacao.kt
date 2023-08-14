package com.example.octanoteck
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Apresentacao : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apresentacao)

        val btnvamos: Button = findViewById(R.id.btnvamos)
        val textNomeUsuario: Button = findViewById(R.id.editNomeUsuario)

        // Obtenha o nome do usuário da variável nomeUsuario ou de outro local
        val nomeUsuario = ""

        textNomeUsuario.text = "Olá Octano Teck,Comece a monitorar com Octano Teck-Seu parceiro na estrada!"

        btnvamos.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
