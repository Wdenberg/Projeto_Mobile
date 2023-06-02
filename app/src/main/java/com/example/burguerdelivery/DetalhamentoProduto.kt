package com.example.burguerdelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.burguerdelivery.databinding.ActivityDetalhamentoProdutoBinding
import com.example.burguerdelivery.model.BurguerChar
import com.squareup.picasso.Picasso

class DetalhamentoProduto : AppCompatActivity() {


    private lateinit var binding: ActivityDetalhamentoProdutoBinding
    private var contador = 1
    private lateinit var contadorTextView: TextView
    private lateinit var alteraValorTextView: TextView
    private var price: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalhamentoProdutoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*
        val dados = intent.extras
        var nameBurguer = dados?.getParcelable<BurguerChar>("burguer")

        */

        val intent = intent
        val burguerChar = intent.getParcelableExtra<BurguerChar>("burguer")

        price = burguerChar?.preco ?: 0.0
        binding.goldenBurg.text = burguerChar?.nome
        binding.r2550.text = String.format("R$: %.2f", burguerChar?.preco)
        binding.blendsDeC.text = burguerChar?.descricao
        val imgUrl = "http://192.168.1.13/img/${burguerChar?.img}"

        Picasso.get()
            .load(imgUrl)
            .into(binding.imgGolden)










        binding.btnVoltar.setOnClickListener {
            val voltarTela = Intent(this, MainActivity::class.java)
            startActivity(voltarTela)
        }

        binding.btnSacola.setOnClickListener {
            val voltarTelaPrincipal = Intent(this, MainActivity::class.java)
            startActivity(voltarTelaPrincipal)

            Toast.makeText(this, "Produto Adicionado", Toast.LENGTH_LONG).show()
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
        val valor = price * contador
        alteraValorTextView.text = String.format("R$: %.2f", valor)
    }
}
