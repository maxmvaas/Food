package ru.maxmvaas.domain.repository.remote

import ru.maxmvaas.domain.model.remote.Category
import ru.maxmvaas.domain.model.remote.Dish

interface FoodRemoteRepository {
    suspend fun getCategories(): List<Category>

    suspend fun getDishes(): List<Dish>
}