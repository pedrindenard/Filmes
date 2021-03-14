package com.app.filme.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.app.filme.data.repository.MovieRepository

@Suppress("UNCHECKED_CAST")
class HomeViewModelFactory(private val repository: MovieRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return HomeViewModelFactory(repository) as T
    }
}