package com.example.domain.features.app

interface AppRepository {

    suspend fun isOnBoardingAlreadyShown(): Boolean
    suspend fun isUserLoggedIn(): Boolean
    suspend fun setOnBoardingStep()
    suspend fun setUserLoggingInStep()
}