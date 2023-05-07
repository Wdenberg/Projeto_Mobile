package com.example.burguerdelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.burguerdelivery.databinding.ActivityTelaHomeBinding

class TelaHome : AppCompatActivity() {

    private  lateinit var binding: ActivityTelaHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnLoginHomer = findViewById<Button>(binding.btnLoginHome.id)

        btnLoginHomer.setOnClickListener{
            val proximaPagina = Intent(this, TelaDeLogin::class.java)

            startActivity(proximaPagina)
        }
    }
}