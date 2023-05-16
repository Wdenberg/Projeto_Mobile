package com.example.burguerdelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.burguerdelivery.databinding.ActivityDetalhamentoProdutoBinding

class DetalhamentoProduto : AppCompatActivity() {


    private lateinit var binding: ActivityDetalhamentoProdutoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalhamentoProdutoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVoltar.setOnClickListener {
            val voltarTela = Intent(this, MainActivity::class.java )
            startActivity(voltarTela)
        }



        binding.btnMenos.setOnClickListener {

        }

        binding.btnMais.setOnClickListener {

        }
    }
}