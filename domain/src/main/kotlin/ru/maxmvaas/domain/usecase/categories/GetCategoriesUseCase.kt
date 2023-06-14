package ru.maxmvaas.domain.usecase.categories

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import ru.maxmvaas.domain.model.Resource
import ru.maxmvaas.domain.model.remote.Category
import ru.maxmvaas.domain.repository.remote.FoodRemoteRepository
import javax.inject.Inject

class GetCategoriesUseCase @Inject constructor(private val foodRemoteRepository: FoodRemoteRepository) {
    operator fun invoke(): Flow<Resource<List<Category>>> = flow {
        try {
            emit(Resource.Loading())
            emit(Resource.Success(foodRemoteRepository.getCategories()))
        } catch (exception: Exception) {
            emit(Resource.Error(exception.localizedMessage ?: "An unexpected error occurred"))
        }
    }
}