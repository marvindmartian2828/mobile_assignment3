package com.example.chicchronicles.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Data class representing a fashion brand.
 */
data class FashionBrand(
    @StringRes val name: Int,
    @StringRes val description: Int,
    @DrawableRes val imageResourceId: Int
)
