package com.example.b7deliverys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.b7deliverys.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


       val btnCadastro = findViewById<Button>(binding.btnLogin.id)

       btnCadastro.setOnClickListener{
           val intent = Intent(this, MainActivity3::class.java)
           startActivity(intent)
       }



    }


}
