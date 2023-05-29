package com.example.burguerdelivery.api

import com.example.burguerdelivery.model.BurguerChar
import com.example.burguerdelivery.model.Login
import com.example.burguerdelivery.model.LoginResponse
import com.example.burguerdelivery.model.UserResponse
import com.example.burguerdelivery.model.Usuario
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT


interface ApiUserService {

    @POST("login")
    fun login(@Body login: Login): Call<LoginResponse>


    @POST("usuario")
    fun cadastroUsuario(@Body usuario: Usuario): Call<UserResponse>
}