package com.example.presentation.models

import kotlinx.collections.immutable.ImmutableList

data class ProfileUiItem(
    val name: String,
    val imageUrl: String
)

data class TripCardUiData(
    val id: String,
    val name: String,
    val imageUrl: String,
)

data class TripCardsState(
    val tripCardsList: ImmutableList<BaseTripCardDataUiItem>,
    val lastUpdateDate: String,
    val state: HomePageUiState
)

sealed interface HomePageUiState{

    object Idle: HomePageUiState

    data class Refreshing(val isAutomaticRefresh: Boolean): HomePageUiState

    data class Error(val message: String): HomePageUiState
}