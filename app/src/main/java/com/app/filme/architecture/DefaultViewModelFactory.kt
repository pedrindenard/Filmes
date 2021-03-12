package com.app.filme.architecture

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.app.filme.data.repository.MovieRepository

@Suppress("UNCHECKED_CAST")
class DefaultViewModelFactory(private val repository: MovieRepository): ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        TODO("Not yet implemented")
    }

    @Suppress("UNCHECKED_CAST")
    class TrendingViewModelFactory(private val repository: MovieRepository) :
        ViewModelProvider.Factory {

        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return DefaultViewModel(repository) as T
        }
    }

    @Suppress("UNCHECKED_CAST")
    class DiscoveryViewModelFactory(private val repository: MovieRepository) :
        ViewModelProvider.Factory {

        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return DefaultViewModel(repository) as T
        }
    }

    @Suppress("UNCHECKED_CAST")
    class TopRateViewModelFactory(private val repository: MovieRepository) :
        ViewModelProvider.Factory {

        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return DefaultViewModel(repository) as T
        }
    }

    @Suppress("UNCHECKED_CAST")
    class PopularViewModelFactory(private val repository: MovieRepository) :
        ViewModelProvider.Factory {

        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return DefaultViewModel(repository) as T
        }
    }

    @Suppress("UNCHECKED_CAST")
    class UpComingViewModelFactory(private val repository: MovieRepository) :
        ViewModelProvider.Factory {

        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return DefaultViewModel(repository) as T
        }
    }

    @Suppress("UNCHECKED_CAST")
    class RecommendViewModelFactory(private val repository: MovieRepository) :
        ViewModelProvider.Factory {

        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return DefaultViewModel(repository) as T
        }
    }
}
