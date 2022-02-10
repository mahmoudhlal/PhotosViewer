package com.example.domain.entities

data class Photo(
    val id:String,
    val secret:String,
    val server:String,
    val farm:String,
    val title:String,
    val page:String,
    val imgUrl:String
)