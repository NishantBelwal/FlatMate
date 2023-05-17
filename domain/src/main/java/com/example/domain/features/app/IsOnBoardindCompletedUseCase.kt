package com.example.domain.features.app

import javax.inject.Inject

class IsOnBoardingCompletedUseCase @Inject constructor(
    private val repository: AppRepository
) {
    suspend operator fun invoke(): Boolean{
        return repository.isOnBoardingAlreadyShown() // TODO
    }

}