package com.luisfagundes.parrotlingo

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Translate
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(
    val route: String,
    val icon: ImageVector,
    @StringRes val screenNameId: Int
) {
    object Translation : Screen(
        route ="translation",
        icon = Icons.Filled.Translate,
        screenNameId = R.string.translation
    )
    object Saved : Screen(
        route = "saved",
        icon = Icons.Filled.Bookmark,
        screenNameId = R.string.saved
    )
    object Settings : Screen(
        route ="settings",
        icon = Icons.Filled.Settings,
        screenNameId = R.string.settings
    )
}

