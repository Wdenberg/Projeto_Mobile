package com.example.burguerdelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.burguerdelivery.databinding.ActivityDetalhamentoProdutoBinding
import com.example.burguerdelivery.model.BurguerChar

class DetalhamentoProduto : AppCompatActivity() {


    private lateinit var binding: ActivityDetalhamentoProdutoBinding
    private var contador = 1
    private lateinit var contadorTextView: TextView
    private lateinit var alteraValorTextView: TextView

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
            val voltarTela = Intent(this, MainActivity::class.java)
            startActivity(voltarTela)
        }

        contadorTextView = findViewById(binding.contador.id)
        alteraValorTextView = findViewById(binding.r2550.id)
        val btnMais = findViewById<Button>(binding.btnMais.id)
        val btnMenos = findViewById<Button>(binding.btnMenos.id)


        binding.btnMais.setOnClickListener {
            contador++
            updateContador()

        }

        binding.btnMenos.setOnClickListener {
            if (contador > 1) {
                contador--
                updateContador()

            }
        }

        }
    private fun updateContador() {
        contadorTextView.text = contador.toString()
        val valor = 34.90 * contador
        alteraValorTextView.text = String.format("R$: %.2f", valor)
    }
}
