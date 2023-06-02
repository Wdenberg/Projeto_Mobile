package com.example.burguerdelivery.api

import com.example.burguerdelivery.model.BurguerChar
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET

interface ApiProdutosService {


    @GET("produto")
    fun produtos(): Call<List<BurguerChar>?>


}