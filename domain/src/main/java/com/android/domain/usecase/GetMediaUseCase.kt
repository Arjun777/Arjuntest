package com.android.domain.usecase


import com.android.domain.model.Content
import com.android.domain.repository.MediaRepository
import com.android.domain.usecase.base.SingleUseCase
import io.reactivex.Single
import javax.inject.Inject

class GetMediaUseCase  @Inject constructor(
    private val repository: MediaRepository
) : SingleUseCase<List<Content>>() {

    override fun buildUseCaseSingle(): Single<List<Content>> {
        return repository.getContentDatas()
    }

}