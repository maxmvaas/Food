package ru.maxmvaas.domain.usecase.cart

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import ru.maxmvaas.domain.model.Resource
import ru.maxmvaas.domain.model.local.CartItem
import ru.maxmvaas.domain.repository.local.FoodLocalRepository
import javax.inject.Inject

class GetCartUseCase @Inject constructor(private val foodLocalRepository: FoodLocalRepository) {
    operator fun invoke(): Flow<Resource<List<CartItem>>> = flow {
        try {
            emit(Resource.Success(foodLocalRepository.getCart()))
        } catch (exception: Exception) {
            emit(Resource.Error(exception.localizedMessage ?: "An unexpected error occurred"))
        }
    }
}