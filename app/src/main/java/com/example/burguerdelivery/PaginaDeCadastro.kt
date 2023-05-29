package com.example.burguerdelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import android.widget.Toast
import com.example.burguerdelivery.api.CadastroApiService

import com.example.burguerdelivery.databinding.ActivityPaginaDeCadastroBinding


class PaginaDeCadastro : AppCompatActivity() {

    private lateinit var binding: ActivityPaginaDeCadastroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaginaDeCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val btnCad = findViewById<Button>(binding.btnCadastrar.id)
        btnCad.setOnClickListener {

            val nome = binding.inputNameCadastro.text.toString()
            val email = binding.inputEmailCadastro.text.toString()
            val password = binding.inputPasswordCadastro.text.toString()




            if (!isEmailValid(email)) {
                Toast.makeText(this," Digite um Email valido", Toast.LENGTH_LONG).show()
                binding.inputEmailCadastro.error = "Email inválido"
                return@setOnClickListener
            }
            if (!isPasswordValid(password)) {
                Toast.makeText(this," Digite uma senha valida", Toast.LENGTH_LONG).show()

                binding.inputPasswordCadastro.error = "Senha inválida. A senha deve conter pelo menos uma letra e um número."
                return@setOnClickListener
            }

            CadastroApiService.cadastro(
                nome = nome,
                email = email,
                pwd = password,

                onSuccess = {

                    Toast.makeText(this, "Cadastro Ciado com Sucesso" , Toast.LENGTH_LONG).show()
                    val cadastroValid = Intent(this@PaginaDeCadastro,TelaDeLogin::class.java)
                    startActivity(cadastroValid)


                }
                ,

                onFailure = {message ->

                    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
                    binding.inputNameCadastro.error = "Email Invalido"
                    binding.inputEmailCadastro.error = "Senha Invalida"

                }

            )




        }



        binding.btnLoginCadastro.setOnClickListener{

            val irPraLogin = Intent(this, TelaDeLogin::class.java)
            startActivity(irPraLogin)
        }




    }

    private fun isEmailValid(email: String): Boolean {
        val regex = "^[A-Za-z](.*)([@]{1})(.{1,})(\\.)(.{1,})".toRegex()
        return email.matches(regex)
    }

    private fun isPasswordValid(password: String): Boolean {
        val hasLetter = password.any { it.isLetter() }
        val hasNumber = password.any { it.isDigit() }
        return hasLetter && hasNumber
    }


}