package com.app.filme.api.network

object ApiConfig {

    const val BASE_URL = "https://api.themoviedb.org/3/"
    const val API_KEY = "5179442a4d6ed6eb656ad05e611bad78"
}

object Url {

    const val Trending_Movie = "trending/movie/day"
    const val Discovery_Movie = "discover/movie?sort_by=popularity.desc&year=2020&vote_average.gte=9&vote_average.lte=10"
    const val TopRated_Movie = "movie/top_rated"
    const val Popular_Movie = "movie/popular"
    const val Recommend_Movie = "movie/{id}/recommendations"
    const val Movie_Details = "movie/{id}"
    const val UpComing_Movie = "discover/movie?sort_by=primary_release_date.asc&primary_release_year=2021"
}