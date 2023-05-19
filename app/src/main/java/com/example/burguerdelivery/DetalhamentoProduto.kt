package com.example.burguerdelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.burguerdelivery.databinding.ActivityDetalhamentoProdutoBinding
import com.example.burguerdelivery.model.BurguerChar

class DetalhamentoProduto : AppCompatActivity() {


    private lateinit var binding: ActivityDetalhamentoProdutoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalhamentoProdutoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dados = intent.extras
        var nameBurguer = dados?.getParcelable<BurguerChar>("burguer")

        binding.goldenBurg.text = nameBurguer?.name
        binding.imgGolden.findViewById<ImageView>(binding.imgGolden.id)
        binding.r2550.text = nameBurguer?.price

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