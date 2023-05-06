package com.example.burguerdelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.burguerdelivery.databinding.ActivityPaginaDeCadastroBinding

class PaginaDeCadastro : AppCompatActivity() {

    private lateinit var binding: ActivityPaginaDeCadastroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaginaDeCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var btnLogin = findViewById<Button>(binding.btnLoginCadastro.id)
        val btnCadastrar = findViewById<Button>(binding.btnCadastrar.id)




        btnLogin.setOnClickListener{

            val irPraLogin = Intent(this, TelaDeLogin::class.java)
            startActivity(irPraLogin)
        }

    }
}