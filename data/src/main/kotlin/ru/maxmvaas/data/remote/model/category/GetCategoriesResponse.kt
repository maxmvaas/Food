package ru.maxmvaas.data.remote.model.category


import com.google.gson.annotations.SerializedName

data class GetCategoriesResponse(
    @SerializedName("сategories")
    val categories: List<CategoryDto>
)