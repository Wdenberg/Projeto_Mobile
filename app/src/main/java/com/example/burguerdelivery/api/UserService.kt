package com.example.burguerdelivery.api

import com.example.burguerdelivery.model.Login
import com.example.burguerdelivery.model.LoginResponse
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object UserService {
    private val instance = Retrofit.Builder()
        .baseUrl("http://10.10.7.54:8080/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    // create service using Interface that has the request methods
    private val service = instance.create(ApiUserService::class.java)

    fun login(email: String, pwd: String, onSuccess: () -> Unit, onFailure: (message: String?) -> Unit) {
        val response: Call<LoginResponse> = service.login(login = Login(email, pwd))
        response.enqueue(object : Callback<LoginResponse> {

            override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                if (response.code() == 200) {
                    response.body()?.let {
                        onSuccess.invoke()
                    } ?: run {
                        onFailure.invoke("")
                    }
                } else if (response.code() == 401) {
                    val error =
                        Gson().fromJson(response.errorBody()?.string(), LoginResponse::class.java)
                    onFailure.invoke(error.errorMessage)
                }
            }

            override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                t.printStackTrace()
                onFailure.invoke(t.message)
            }

        })
    }
}