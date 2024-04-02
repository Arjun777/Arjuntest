package com.android.data.repository

import com.android.data.source.remote.RetrofitService

import com.android.domain.model.Content
import com.android.domain.repository.MediaRepository
import io.reactivex.Single

class MediaRepositoryImp (
    private val retrofitService: RetrofitService
) : MediaRepository {

    override fun getContentDatas(): Single<List<Content>> {
        return retrofitService.getcontent()
    }
}
