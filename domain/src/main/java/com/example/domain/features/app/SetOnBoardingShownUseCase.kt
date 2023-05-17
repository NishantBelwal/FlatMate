package com.example.domain.features.app

import javax.inject.Inject

class SetOnBoardingShownUseCase @Inject constructor(
    private val repository: AppRepository
) {

    suspend operator fun invoke(){
        return repository.setOnBoardingStep()//TODO
    }
}