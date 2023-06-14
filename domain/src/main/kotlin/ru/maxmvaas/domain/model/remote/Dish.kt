package ru.maxmvaas.domain.model.remote

import ru.maxmvaas.domain.model.remote.enumeration.DishTag

data class Dish(
    val description: String,
    val id: Int,
    val imageUrl: String,
    val name: String,
    val price: Int,
    val tags: List<DishTag>?,
    val weight: Int
)