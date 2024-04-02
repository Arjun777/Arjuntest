package com.android.data.mapper

import com.android.data.source.local.entity.PhotoEntity
import com.android.domain.model.Photo

fun Photo.toEntity() = PhotoEntity(
    id = id,
    name = title,
    posterimage = url,

)
