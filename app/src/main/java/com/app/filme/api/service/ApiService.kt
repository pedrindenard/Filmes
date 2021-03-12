package com.app.filme.api.service

import com.app.filme.api.network.Url
import com.app.filme.data.model.MovieResponse
import com.app.filme.data.model.entity.Movie
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET(Url.Trending_Movie)
    fun getTrendingMovies(): Response<MovieResponse>

    @GET(Url.Discovery_Movie)
    fun getDiscoveryMovies(@Query("page") page: Int? = null): Response<MovieResponse>

    @GET(Url.TopRated_Movie)
    fun getTopRateMovies(@Query("page") page: Int? = null): Response<MovieResponse>

    @GET(Url.Popular_Movie)
    fun getPopularMovies(@Query("page") page: Int? = null): Response<MovieResponse>

    @GET(Url.UpComing_Movie)
    fun getUpComingMovies(@Query("page") page: Int? = null): Response<MovieResponse>

    @GET(Url.Recommend_Movie)
    fun getRecommendMovies(@Path("id") movieId: Int? = null): Response<MovieResponse>

    @GET(Url.Movie_Details)
    fun getDetailMovies(@Path("id") movieId: Int): Response<Movie>

}