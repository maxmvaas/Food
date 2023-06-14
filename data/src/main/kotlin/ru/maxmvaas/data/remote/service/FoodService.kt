package ru.maxmvaas.data.remote.service

import retrofit2.http.GET
import ru.maxmvaas.data.remote.model.category.GetCategoriesResponse
import ru.maxmvaas.data.remote.model.dish.GetDishesResponse

interface FoodService {
    @GET("058729bd-1402-4578-88de-265481fd7d54")
    suspend fun getCategories(): GetCategoriesResponse

    @GET("aba7ecaa-0a70-453b-b62d-0e326c859b3b")
    suspend fun getDishes(): GetDishesResponse
}