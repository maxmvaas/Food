package ru.maxmvaas.data.remote.repository

import ru.maxmvaas.data.remote.model.category.toCategory
import ru.maxmvaas.data.remote.model.dish.toDish
import ru.maxmvaas.data.remote.service.FoodService
import ru.maxmvaas.domain.model.remote.Category
import ru.maxmvaas.domain.model.remote.Dish
import ru.maxmvaas.domain.repository.remote.FoodRemoteRepository
import javax.inject.Inject

class FoodRemoteRepositoryImpl @Inject constructor(private val foodService: FoodService) :
    FoodRemoteRepository {
    override suspend fun getCategories(): List<Category> =
        foodService.getCategories().categories.map {
            it.toCategory()
        }

    override suspend fun getDishes(): List<Dish> = foodService.getDishes().dishes.map {
        it.toDish()
    }
}