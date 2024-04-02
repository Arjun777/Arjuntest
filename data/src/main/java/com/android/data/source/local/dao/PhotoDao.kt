package com.android.data.source.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.android.data.source.local.entity.PhotoEntity

/**
 * it provides access to [Photo] underlying database
 * */
@Dao
interface PhotoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(photo: PhotoEntity): Long

    @Query("SELECT * FROM Content")
    fun loadAll(): MutableList<PhotoEntity>

    @Delete
    fun delete(photo: PhotoEntity)

    @Query("DELETE FROM Content")
    fun deleteAll()

    @Query("SELECT * FROM Content where id = :photoId")
    fun loadOneByPhotoId(photoId: Long): PhotoEntity?

    @Query("SELECT * FROM Content where name = :photoTitle")
    fun loadOneByPhotoTitle(photoTitle: String): PhotoEntity?

    @Update
    fun update(photo: PhotoEntity)
}
