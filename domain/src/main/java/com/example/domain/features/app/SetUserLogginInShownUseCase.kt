package com.example.domain.features.app

import javax.inject.Inject

class SetUserLoggingInShownUseCase @Inject constructor(
    private val repository: AppRepository
){
    suspend operator fun invoke(){
        return repository.setUserLoggingInStep()
    }
}