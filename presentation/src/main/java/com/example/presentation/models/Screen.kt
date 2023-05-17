package com.example.presentation.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


sealed class Screen: Parcelable {

    @Parcelize
    object HomePage : Screen()

    @Parcelize
    object TransactionPage : Screen()

    @Parcelize
    object Location : Screen()

    @Parcelize
    object AddAnExpensePage : Screen()

    @Parcelize
    object MyTripsPage : Screen()

    @Parcelize
    object TripNamePage : Screen()

    @Parcelize
    object AddATripPage : Screen()

}