package com.app.filme.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.filme.R
import com.app.filme.data.model.entity.Movie
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import kotlinx.android.synthetic.main.item_movie.view.*

// Adapter do RecyclerView do Home Fragment

class MovieAdapter (private val context: Context,
                    private val movies: MutableList<Movie> = mutableListOf(),
                    var onItemClickListener: (movie: Movie) -> Unit = {}
): RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater
            .from(context)
            .inflate(R.layout.item_movie, parent, false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(movies[position])
    }

    override fun getItemCount(): Int = movies.size

    fun append(movies: List<Movie>) {
        this.movies.clear()
        this.movies.addAll(movies)
        notifyDataSetChanged()
    }

    inner class MovieViewHolder(View: View) : RecyclerView.ViewHolder(View) {
        private lateinit var movie: Movie

        private val moviePoster by lazy {
            itemView.imageMovie
        }

        init {
            itemView.setOnClickListener {
                if (::movie.isInitialized) {
                    onItemClickListener(movie)
                }
            }
        }

        fun bind(movie: Movie) {
            this.movie = movie
            Glide.with(itemView)
                .load(movie.poster)
                .transform(CenterCrop())
                .into(moviePoster)
        }
    }
}
