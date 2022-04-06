package com.example.retrofitapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.retrofitapi.Api.RetrofitApi
import com.example.retrofitapi.Api.User
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


const val BASE_URL="https://jsonplaceholder.typicode.com/"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getMyData();
    }
    private fun getMyData(){
        val retrofitBuilder= Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)

        var Apicall=retrofitBuilder.create(RetrofitApi::class.java)
        var call=Apicall.User

        call?.eneque(object::callback<List<User?>?{

        })

    }
}
