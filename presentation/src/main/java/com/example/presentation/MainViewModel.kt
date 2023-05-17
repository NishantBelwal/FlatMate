package com.example.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.features.app.IsOnBoardingCompletedUseCase
import com.example.domain.features.app.IsUserLoggedInUseCase
import com.example.domain.features.app.SetOnBoardingShownUseCase
import com.example.domain.features.app.SetUserLoggingInShownUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val isUserLoggedInUseCase:IsUserLoggedInUseCase,
    private val setUserLoggingInShownUseCase: SetUserLoggingInShownUseCase,
    private val isOnBoardingCompletedUseCase: IsOnBoardingCompletedUseCase,
    private val setOnBoardingShownUseCase: SetOnBoardingShownUseCase
) : ViewModel(){

    var isUserLoggedIn by mutableStateOf(false)
        private set

    var isUserCompletedOnBoarding by mutableStateOf(false)
        private set

    fun init(){
        viewModelScope.launch {
            isUserLoggedIn = !isUserLoggedInUseCase()
            isUserCompletedOnBoarding = !isOnBoardingCompletedUseCase()
        }
    }

    fun onUserLoggedInShown(){
        isUserLoggedIn = false
        viewModelScope.launch {
            setUserLoggingInShownUseCase()
        }
    }

    fun onBoardingCompletedShown(){
        isUserCompletedOnBoarding = false
        viewModelScope.launch {
            setOnBoardingShownUseCase()
        }
    }
}