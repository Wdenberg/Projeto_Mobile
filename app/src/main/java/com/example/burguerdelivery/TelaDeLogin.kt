package com.example.burguerdelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.burguerdelivery.api.UserService
import com.example.burguerdelivery.databinding.ActivityTelaDeLoginBinding
import com.example.burguerdelivery.model.Usuario
import com.google.android.gms.auth.api.signin.GoogleSignInClient

class TelaDeLogin : AppCompatActivity() {

    private lateinit var binding: ActivityTelaDeLoginBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaDeLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.cadastrar.setOnClickListener{
            val pagCadastro = Intent(this, PaginaDeCadastro::class.java)
            startActivity(pagCadastro)
        }

        val bntLoginVeri = findViewById<Button>(binding.bntLogin.id)

        bntLoginVeri.setOnClickListener{


            val email = binding.inputeLoginEmail.text.toString()
            val password = binding.loginPassword.text.toString()

            UserService.login(
                email = email,
                pwd = password,
                onSuccess = {
                    Toast.makeText(this, "Logado Com Sucesso!" , Toast.LENGTH_LONG).show()
                    val loginValid = Intent(this@TelaDeLogin, MainActivity::class.java)
                    startActivity(loginValid)
                },
                onFailure = { message ->
                    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
                    binding.inputeLoginEmail.error = "Email Invalido"
                    binding.loginPassword.error = "Senha Invalida"
                }
            )



        }


    }





}