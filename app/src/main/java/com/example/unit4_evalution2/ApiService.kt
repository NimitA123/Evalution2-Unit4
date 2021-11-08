package com.example.unit4_evalution2

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("/api/")
    fun  getUSer(): Call<ResponseDTO>
}