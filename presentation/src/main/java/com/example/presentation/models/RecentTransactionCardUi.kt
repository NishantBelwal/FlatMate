package com.example.presentation.models

abstract class BaseRecentTransactionCardDataUiItem(
    open val id: String,
    open val name: String,
    open val imageUrl: String,
    open val amount: String,
    open val amountSign: Boolean,
    open val days: Int
)

data class RecentTransactionCardDataUiItem(
    override val id: String,
    override val name: String,
    override val imageUrl: String,
    override val amount: String,
    override val amountSign: Boolean,
    override val days: Int
): BaseRecentTransactionCardDataUiItem(
    id = id,
    name = name,
    imageUrl = imageUrl,
    amount = amount,
    amountSign = amountSign,
    days = days
)

/**
 * Class used to create items that should shimmer the market data fields, i.e. [name] and [imageUrl].
 * Values of those fields are be used as a fake placeholder data behind the shimmer.
 */

data class RecentTransactionCardWithShimmeringDataUiItem(
    override val id: String,
    override val name: String,
    override val imageUrl: String,
    override val amount: String,
    override val amountSign: Boolean,
    override val days: Int
): BaseRecentTransactionCardDataUiItem(
    id = id,
    name = name,
    imageUrl = imageUrl,
    amount = amount,
    amountSign = amountSign,
    days = days
)
