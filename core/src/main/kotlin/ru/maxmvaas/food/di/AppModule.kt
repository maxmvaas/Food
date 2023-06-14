package ru.maxmvaas.food.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

import ru.maxmvaas.data.di.NetworkModule

@Suppress("unused")
@InstallIn(SingletonComponent::class)
@Module(includes = [NetworkModule::class])
class AppModule {}
