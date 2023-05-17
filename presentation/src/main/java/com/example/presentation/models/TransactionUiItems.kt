package com.example.presentation.models

import kotlinx.collections.immutable.ImmutableList


data class RecentTransactionData(
    val recentTransactions: ImmutableList<BaseRecentTransactionCardDataUiItem>,
    val lastUpdate: String
)

data class MyTripsData(
    val recentTrips: ImmutableList<TripImageDataUiItem>,
    val lastUpdate: String
)

data class RecentTransactionState(
    val recentTransactionsList: ImmutableList<BaseRecentTransactionCardDataUiItem>,
    val lastUpdateDate: String,
    val state: TransactionUiState
)

data class MyTripsState(
    val recentTripsList: ImmutableList<TripImageDataUiItem>,
    val lastUpdateDate: String,
    val state: TransactionUiState
)
sealed interface TransactionUiState {

    object Idle: TransactionUiState

    data class Refreshing(val isAutomaticRefresh: Boolean): TransactionUiState

    data class Error(val message: String): TransactionUiState

}