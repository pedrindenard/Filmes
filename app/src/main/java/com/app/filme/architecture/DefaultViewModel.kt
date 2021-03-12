package com.app.filme.architecture

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.filme.data.model.MovieResponse
import com.app.filme.data.repository.MovieRepository
import kotlinx.coroutines.launch
import retrofit2.Response

class DefaultViewModel(private val repository: MovieRepository): ViewModel() {

    private val responseMain: MutableLiveData<Response<MovieResponse>> = MutableLiveData()

    fun getTrendingMovies() {
        viewModelScope.launch {
            val response = repository.getTrendingMovies()
            responseMain.value = response
        }
    }

    fun getDiscoveryMovies() {
        viewModelScope.launch {
            val response = repository.getDiscoveryMovies()
            responseMain.value = response
        }
    }

    fun getTopRateMovies() {
        viewModelScope.launch {
            val response = repository.getTopRateMovies()
            responseMain.value = response
        }
    }

    fun getPopularMovies() {
        viewModelScope.launch {
            val response = repository.getPopularMovies()
            responseMain.value = response
        }
    }

    fun getUpComingMovies() {
        viewModelScope.launch {
            val response = repository.getUpComingMovies()
            responseMain.value = response
        }
    }

    fun getRecommendMovies() {
        viewModelScope.launch {
            val response = repository.getRecommendMovies()
            responseMain.value = response
        }
    }
}