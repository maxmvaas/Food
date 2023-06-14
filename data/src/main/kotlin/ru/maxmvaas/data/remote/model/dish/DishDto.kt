package ru.maxmvaas.data.remote.model.dish


import com.google.gson.annotations.SerializedName
import ru.maxmvaas.domain.model.remote.Dish
import ru.maxmvaas.domain.model.remote.enumeration.DishTag

data class DishDto(
    @SerializedName("description")
    val description: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image_url")
    val imageUrl: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("price")
    val price: Int,
    @SerializedName("tegs")
    val tags: List<DishTag>,
    @SerializedName("weight")
    val weight: Int
)

fun DishDto.toDish(): Dish {
    return Dish(
        description = description,
        id = id,
        imageUrl = imageUrl,
        name = name,
        price = price,
        tags = tags,
        weight = weight
    )
}