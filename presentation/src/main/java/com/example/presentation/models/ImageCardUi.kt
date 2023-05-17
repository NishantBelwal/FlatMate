package com.example.presentation.models

abstract class BaseImageCardDataUiItem(
    open val id: String,
    open val imageUrl: String
)

data class TripImageDataUiItem(
    override val id: String,
    override val imageUrl: String
): BaseImageCardDataUiItem(
    id = id,
    imageUrl = imageUrl
)

/**
 * Class used to create items that should shimmer the market data fields, i.e. [name] and [imageUrl].
 * Values of those fields are be used as a fake placeholder data behind the shimmer.
 */

data class ImageCardWithShimmeringDataUiItem(
    override val id: String,
    override val imageUrl: String
): BaseImageCardDataUiItem(
    id = id,
    imageUrl = imageUrl
)