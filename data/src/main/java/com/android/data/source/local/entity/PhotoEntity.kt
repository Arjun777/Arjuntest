package com.android.data.source.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Content")
data class PhotoEntity(
    @PrimaryKey var id: Long,
    var name: String,
    val posterimage: String,
)
