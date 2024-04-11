package com.example.chatwiseassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory



class ProductList : AppCompatActivity() {


    lateinit var recyclerView: RecyclerView
    lateinit var myAdapter: rvAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_list)

        recyclerView = findViewById(R.id.productList)

        val retrofitBuilder = Retrofit.Builder()
            .baseUrl("https://dummyjson.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)

        val retrofitData = retrofitBuilder.getProductData()

        retrofitData.enqueue(object : Callback<jsondata?> {
            override fun onResponse(call: Call<jsondata?>, response: Response<jsondata?>) {

                var responseBody = response.body()
                val productList = responseBody?.products!!

                myAdapter = rvAdapter(this@ProductList, productList)
                recyclerView.adapter = myAdapter
                recyclerView.layoutManager = LinearLayoutManager(this@ProductList)
            }

            override fun onFailure(call: Call<jsondata?>, t: Throwable) {
                // if api call fails
                Log.d("ProductList ", "onFailure: " + t.message)
            }
        })



    }
}
