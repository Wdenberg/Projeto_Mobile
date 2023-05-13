package com.example.burguerdelivery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.burguerdelivery.databinding.ActivityDetalhamentoProdutoBinding
import com.example.burguerdelivery.databinding.ActivityMainBinding

class DetalhamentoProdutoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetalhamentoProdutoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalhamentoProdutoBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}