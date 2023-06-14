package ru.maxmvaas.domain.usecase.dishes

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import ru.maxmvaas.domain.model.Resource
import ru.maxmvaas.domain.model.remote.Dish
import ru.maxmvaas.domain.repository.remote.FoodRemoteRepository
import javax.inject.Inject

class GetDishesUseCase @Inject constructor(private val foodRemoteRepository: FoodRemoteRepository) {
    operator fun invoke(): Flow<Resource<List<Dish>>> = flow {
        try {
            emit(Resource.Success(foodRemoteRepository.getDishes()))
        } catch (exception: Exception) {
            emit(Resource.Error(exception.localizedMessage ?: "An unexpected error occurred"))
        }
    }
}