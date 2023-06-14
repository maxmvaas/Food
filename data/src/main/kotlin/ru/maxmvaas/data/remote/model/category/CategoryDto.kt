package ru.maxmvaas.data.remote.model.category


import com.google.gson.annotations.SerializedName
import ru.maxmvaas.domain.model.remote.Category

data class CategoryDto(
    @SerializedName("id")
    val id: Int,
    @SerializedName("image_url")
    val imageUrl: String,
    @SerializedName("name")
    val name: String
)

fun CategoryDto.toCategory(): Category {
    return Category(id = id, imageUrl = imageUrl, name = name)
}