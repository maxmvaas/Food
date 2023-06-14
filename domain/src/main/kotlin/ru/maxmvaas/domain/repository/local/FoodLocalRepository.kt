package ru.maxmvaas.domain.repository.local

import ru.maxmvaas.domain.model.local.CartItem

interface FoodLocalRepository {
    suspend fun getCart(): List<CartItem>

    suspend fun updateCartItem(cartItem: CartItem): Boolean

    suspend fun removeCartItem(cartItem: CartItem): Boolean
}