package com.example.dodoapp.model

import java.io.Serializable

data class Pizza(
    val imageRes: Int,
    val title: String,
    val description: String,
    val price: Int
):Serializable