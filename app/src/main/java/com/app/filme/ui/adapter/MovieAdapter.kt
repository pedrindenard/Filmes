package com.app.filme.ui.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.filme.data.model.entity.Movie

class MovieAdapter (private val context: Context,
                    private val movies: MutableList<Movie> = mutableListOf(),
                    var onItemClickListener: (movie: Movie) -> Unit = {}
): RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    inner class MovieViewHolder(View: View) : RecyclerView.ViewHolder(View) {
    }
}