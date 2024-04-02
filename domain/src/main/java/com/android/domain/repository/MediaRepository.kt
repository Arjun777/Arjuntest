package com.android.domain.repository

import com.android.domain.model.Content
import io.reactivex.Single


/**
 * To make an interaction between [MediaRepositoryImp] & [GetMediaUseCase]
 * */
interface MediaRepository {
    fun getContentDatas(): Single<List<Content>>
}