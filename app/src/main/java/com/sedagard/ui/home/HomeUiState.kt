package com.sedagard.ui.home

import com.sedagard.data.HomePodcastRow

data class HomeUiState(
  val isLoading: Boolean = false,
  val podcasts: List<HomePodcastRow> = emptyList(),
  val error: String = "",
)
