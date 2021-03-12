package com.app.filme.data.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "movies")
data class Movie(

    @PrimaryKey
    @SerializedName("id") val id: Int,

    @SerializedName("title") var title: String?,

    @SerializedName("vote_average") var rate: Float?,

    @SerializedName("overview") var description: String?,

    @SerializedName("poster_path") var poster: String?,

    @SerializedName("backdrop_path") var background: String?,

    @SerializedName("release_date") var releaseDate: String?,

    @SerializedName("runtime") var runtime: Int?,

    @SerializedName("video") var video: String?
)