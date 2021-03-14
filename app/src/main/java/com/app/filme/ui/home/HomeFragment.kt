package com.app.filme.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.filme.MainApp
import com.app.filme.R
import com.app.filme.ui.adapter.MovieAdapter
import com.google.android.material.appbar.MaterialToolbar
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private val viewModel: HomeViewModel by viewModels {
        HomeViewModelFactory((activity?.application as MainApp).repository)
    }

    private val adapter by lazy {
        context?.let {
            MovieAdapter(context = it)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        getDiscoveryMovies()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    // Busca a lista de filmes Descubra
    private fun getDiscoveryMovies() {
        viewModel.getMovies()
        viewModel.mResponse.observe(this) {
            if (it.isSuccessful) {
                it.body()?.let { movies ->
                    adapter?.append(movies.results)
                }
            } else {
                Log.i("Response", it.errorBody().toString())
            }
        }
    }
}