package ru.maxmvaas.domain.model.local

data class CartItem(
    val id: Int,
    val imageUrl: String,
    val name: String,
    val price: Int,
    val weight: Int,
    val count: Int
)