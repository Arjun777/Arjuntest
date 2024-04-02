package com.android.data.source.local;

import java.lang.System;

/**
 * To manage data items that can be accessed, updated
 * & maintain relationships between them
 */
@androidx.room.Database(entities = {com.android.data.source.local.entity.PhotoEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/android/data/source/local/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "photoDao", "Lcom/android/data/source/local/dao/PhotoDao;", "getPhotoDao", "()Lcom/android/data/source/local/dao/PhotoDao;", "Companion", "data_release"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final com.android.data.source.local.AppDatabase.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DB_NAME = "ArjunDiagonalDatabase.db";
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.android.data.source.local.dao.PhotoDao getPhotoDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/android/data/source/local/AppDatabase$Companion;", "", "()V", "DB_NAME", "", "data_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}