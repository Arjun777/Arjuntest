package com.android.data.source.local.dao;

import java.lang.System;

/**
 * it provides access to [Photo] underlying database
 */
@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\'J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\bH\'J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0011"}, d2 = {"Lcom/android/data/source/local/dao/PhotoDao;", "", "delete", "", "photo", "Lcom/android/data/source/local/entity/PhotoEntity;", "deleteAll", "insert", "", "loadAll", "", "loadOneByPhotoId", "photoId", "loadOneByPhotoTitle", "photoTitle", "", "update", "data_debug"})
public abstract interface PhotoDao {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract long insert(@org.jetbrains.annotations.NotNull
    com.android.data.source.local.entity.PhotoEntity photo);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Content")
    public abstract java.util.List<com.android.data.source.local.entity.PhotoEntity> loadAll();
    
    @androidx.room.Delete
    public abstract void delete(@org.jetbrains.annotations.NotNull
    com.android.data.source.local.entity.PhotoEntity photo);
    
    @androidx.room.Query(value = "DELETE FROM Content")
    public abstract void deleteAll();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM Content where id = :photoId")
    public abstract com.android.data.source.local.entity.PhotoEntity loadOneByPhotoId(long photoId);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM Content where name = :photoTitle")
    public abstract com.android.data.source.local.entity.PhotoEntity loadOneByPhotoTitle(@org.jetbrains.annotations.NotNull
    java.lang.String photoTitle);
    
    @androidx.room.Update
    public abstract void update(@org.jetbrains.annotations.NotNull
    com.android.data.source.local.entity.PhotoEntity photo);
}