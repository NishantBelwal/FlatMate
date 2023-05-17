package com.example.presentation.models


abstract class BaseTripCardDataUiItem(
    open val id: String,
    open val name: String,
    open val imageUrl: String
)

data class TripCardDataUiItem(
    override val id: String,
    override val name: String,
    override val imageUrl: String
): BaseTripCardDataUiItem(
    id = id,
    name = name,
    imageUrl = imageUrl
)

/**
 * Class used to create items that should shimmer the market data fields, i.e. [name] and [imageUrl].
 * Values of those fields are be used as a fake placeholder data behind the shimmer.
 */

data class TripCardWithShimmeringDataUiItem(
    override val id: String,
    override val name: String,
    override val imageUrl: String
): BaseTripCardDataUiItem(
    id = id,
    name = name,
    imageUrl = imageUrl
)
