package com.example.burguerdelivery.api

import com.example.burguerdelivery.model.BurguerChar
import com.example.burguerdelivery.model.Login
import com.example.burguerdelivery.model.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST


interface ApiUserService {

    @POST("login")
    fun login(@Body login: Login): Call<LoginResponse>


    @GET("api/produto")
    fun listProdutos(@Body produto: BurguerChar): Call<BurguerChar>
}