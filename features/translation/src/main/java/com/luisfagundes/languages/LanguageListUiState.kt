package com.luisfagundes.languages

import com.luisfagundes.domain.models.Language

data class LanguageListUiState(
    val isLoading: Boolean = false,
    val hasError: Boolean = false,
    val countries: List<Language> = emptyList(),
)