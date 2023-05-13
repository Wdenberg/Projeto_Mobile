package com.example.burguerdelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.burguerdelivery.databinding.ActivityTelaDeLoginBinding
import com.google.android.gms.auth.api.signin.GoogleSignInClient

class TelaDeLogin : AppCompatActivity() {

    private lateinit var binding: ActivityTelaDeLoginBinding
    private lateinit var mGoogleClient: GoogleSignInClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaDeLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val bntLoginVeri = findViewById<Button>(binding.bntLogin.id)

        bntLoginVeri.setOnClickListener{

            val email = binding.inputeLoginEmail.text.toString()
            val passwor = binding.loginPassword.text.toString()


            if (email.equals("teste") && passwor.equals("123")){

                Toast.makeText(this, "Logado Com Sucesso!" , Toast.LENGTH_LONG).show()
                val loginValid = Intent(this@TelaDeLogin, MainActivity::class.java)
                startActivity(loginValid)

            }else{

                Toast.makeText(this, "Email e/ou Senha Invalido", Toast.LENGTH_SHORT).show()
                binding.inputeLoginEmail.error = "Email Invalido"
                binding.loginPassword.error = "Senha Invalida"

            }

            val bntCadastro = findViewById<Button>(binding.cadastrar.id)
            bntCadastro.setOnClickListener{
                val pagCadastro = Intent(this, PaginaDeCadastro::class.java)
                startActivity(pagCadastro)
            }


        }
    }
}