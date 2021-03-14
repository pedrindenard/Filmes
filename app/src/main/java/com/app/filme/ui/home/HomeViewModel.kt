package com.app.filme.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.filme.data.model.MovieResponse
import com.app.filme.data.repository.MovieRepository
import kotlinx.coroutines.launch
import retrofit2.Response

class HomeViewModel(private val repository: MovieRepository): ViewModel() {
    val mResponse: MutableLiveData<Response<MovieResponse>> = MutableLiveData()

    fun getMovies() {
        viewModelScope.launch {
            val response = repository.getDiscoveryMovies()
            mResponse.value = response
        }
    }
}