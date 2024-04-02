package com.android.data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b\u000b\u00a8\u0006\f"}, d2 = {"Lcom/android/data/di/DatabaseModule;", "", "()V", "provideAppDatabase", "Lcom/android/data/source/local/AppDatabase;", "application", "Landroid/app/Application;", "provideAppDatabase$data_debug", "providePhotoDao", "Lcom/android/data/source/local/dao/PhotoDao;", "appDatabase", "providePhotoDao$data_debug", "data_debug"})
@dagger.Module
public final class DatabaseModule {
    
    public DatabaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.android.data.source.local.AppDatabase provideAppDatabase$data_debug(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.android.data.source.local.dao.PhotoDao providePhotoDao$data_debug(@org.jetbrains.annotations.NotNull
    com.android.data.source.local.AppDatabase appDatabase) {
        return null;
    }
}