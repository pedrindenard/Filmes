package com.app.filme.data.repository

import com.app.filme.api.network.ApiNetwork
import com.app.filme.api.service.ApiService
import com.app.filme.data.model.MovieResponse
import com.app.filme.data.model.entity.Movie
import retrofit2.Response

class MovieRepository(private val service: ApiService = ApiNetwork().movieService) {

    suspend fun getTrendingMovies(): Response<MovieResponse> {
        return service.getTrendingMovies()
    }

    suspend fun getDiscoveryMovies(): Response<MovieResponse>{
        return service.getDiscoveryMovies()
    }

    suspend fun getTopRateMovies(): Response<MovieResponse>{
        return service.getTopRateMovies()
    }

    suspend fun getPopularMovies(): Response<MovieResponse>{
        return service.getPopularMovies()
    }

    suspend fun getUpComingMovies(): Response<MovieResponse>{
        return service.getUpComingMovies()
    }

    suspend fun getRecommendMovies(): Response<MovieResponse>{
        return service.getRecommendMovies()
    }

    suspend fun getDetailMovies(id: Int): Response<Movie>{
        return service.getDetailMovies(id)
    }
}