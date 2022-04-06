package com.example.retrofitapi.Api

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface RetrofitApi {
    @GET("posts")
    fun getData():Call<List<User>>

}
