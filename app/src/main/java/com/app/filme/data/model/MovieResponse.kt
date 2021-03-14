package com.app.filme.data.model

import com.app.filme.data.model.entity.Movie
import com.google.gson.annotations.SerializedName

data class MovieResponse (

    @SerializedName("page") val page: Int,

    @SerializedName("results") val results: List<Movie>,

    @SerializedName("total_pages") val totalPages: Int,

    @SerializedName("total_results") var totalResults: Int?
)