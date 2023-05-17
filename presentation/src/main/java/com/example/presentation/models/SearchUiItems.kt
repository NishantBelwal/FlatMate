package com.example.presentation.models

import kotlinx.collections.immutable.ImmutableList

data class SearchTextFieldState(
    val text: String,
    val placeholderText: String,
    val isTrailingIconVisible: Boolean
)

sealed interface SearchUiState{

    data class Success(val trips: ImmutableList<TripCardDataUiItem>): SearchUiState

    object Loading: SearchUiState

    data class Error(val message: String): SearchUiState
}