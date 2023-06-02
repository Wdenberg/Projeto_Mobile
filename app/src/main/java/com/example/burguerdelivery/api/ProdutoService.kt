package com.example.burguerdelivery.api

import com.example.burguerdelivery.model.BurguerChar
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ProdutoService {

    private val instance = Retrofit.Builder()
        .baseUrl("http://192.168.1.13:8080/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    // create service using Interface that has the request methods
    private val service = instance.create(ApiProdutosService::class.java)

    fun produtos(onSuccess: (List<BurguerChar>?) -> Unit, onFailure: (message: String?) -> Unit){
        val response: Call<List<BurguerChar>?> = service.produtos()
        response.enqueue(object : Callback<List<BurguerChar>?>{
            override fun onResponse(
                call: Call<List<BurguerChar>?>,
                response: Response<List<BurguerChar>?>
            ) {
                if (response.code() == 200){
                    response.body()?.let {
                        onSuccess.invoke(it)
                    }?: run{
                        onFailure.invoke("")
                    }
                }else if (response.code() == 401){
                    onFailure.invoke(response.errorBody()?.string())
                }
            }

            override fun onFailure(call: Call<List<BurguerChar>?>, t: Throwable) {
                t.printStackTrace()
                onFailure.invoke(t.message)
            }

        })
    }
}