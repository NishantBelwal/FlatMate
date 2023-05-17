package com.example.presentation.models

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Dashboard
import androidx.compose.material.icons.filled.Payments
import androidx.compose.material.icons.filled.ShareLocation
import androidx.compose.ui.graphics.vector.ImageVector
import com.flatmate.presentation.R

enum class BottomNavigationItem(val route:Screen, val icon: ImageVector, @StringRes val title: Int) {

    HomePage(
        route = Screen.HomePage,
        icon = Icons.Default.Dashboard,
        title = R.string.homepage
    ),

    Transactions(
        route = Screen.TransactionPage,
        icon = Icons.Default.Payments,
        title = R.string.transaction
    ),

    Location(
        route = Screen.Location,
        icon = Icons.Default.ShareLocation,
        title = R.string.location
    )
}