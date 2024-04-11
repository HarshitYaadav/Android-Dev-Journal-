package com.example.chatwiseassignment

data class jsondata(
    val limit: Int,
    val products: List<Product>,
    val skip: Int,
    val total: Int
)
