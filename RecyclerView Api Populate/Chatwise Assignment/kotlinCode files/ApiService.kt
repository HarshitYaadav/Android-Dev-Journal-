package com.example.chatwiseassignment

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("products")
    fun getProductData():Call<jsondata>



}
