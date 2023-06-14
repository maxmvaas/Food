package ru.maxmvaas.data.remote.model.dish


import com.google.gson.annotations.SerializedName

data class GetDishesResponse(
    @SerializedName("dishes")
    val dishes: List<DishDto>
)