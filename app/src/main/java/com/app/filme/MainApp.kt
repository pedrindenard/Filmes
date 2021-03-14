package com.app.filme

import android.app.Application
import com.app.filme.data.repository.MovieRepository

class MainApp : Application()  {
    val repository by lazy { MovieRepository() }
}