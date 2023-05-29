package com.example.burguerdelivery.api

import com.example.burguerdelivery.model.UserResponse
import com.example.burguerdelivery.model.Usuario
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object CadastroApiService {


    private val instance = Retrofit.Builder()
        .baseUrl("http://192.168.18.13:8080/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    // create service using Interface that has the request methods
    private val service = instance.create(ApiUserService::class.java)



    fun cadastro( nome: String,email: String,  pwd: String, onSuccess: () -> Unit, onFailure: (message: String?) -> Unit){

        val response: Call<UserResponse> = service.cadastroUsuario( usuario = Usuario(nome,email, pwd))
        response.enqueue(object : Callback<UserResponse> {
            override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
                if(response.code() == 200){
                    response.body()?.let {

                        onSuccess.invoke()
                    }?: run {
                        onFailure.invoke(" ")
                    }

                }else if (response.code() == 401) {
                    val error =
                        Gson().fromJson(response.errorBody()?.string(), UserResponse::class.java)
                    onFailure.invoke(error.errorMessage)
                }
            }

            override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                t.printStackTrace()
                onFailure.invoke(t.message)
            }

        })




    }
}

