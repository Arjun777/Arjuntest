package com.android.data.source.remote

import com.android.domain.model.Album
import com.android.domain.model.Content
import io.reactivex.Single
import retrofit2.http.GET

interface RetrofitService {

    @GET("albums/")
    fun getAlbums(): Single<List<Album>>

    @GET("content/")
    fun getcontent(): Single<List<Content>>


}
