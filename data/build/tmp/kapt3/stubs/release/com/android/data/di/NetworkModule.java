package com.android.data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0007J\u0012\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J \u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015H\u0007J\b\u0010\u001b\u001a\u00020\u0019H\u0007\u00a8\u0006\u001c"}, d2 = {"Lcom/android/data/di/NetworkModule;", "", "()V", "provideAlbumRepository", "Lcom/android/domain/repository/AlbumRepository;", "retrofitService", "Lcom/android/data/source/remote/RetrofitService;", "provideIsNetworkAvailable", "", "context", "Landroid/content/Context;", "provideMediaRepository", "Lcom/android/domain/repository/MediaRepository;", "provideService", "retrofit", "Lretrofit2/Retrofit;", "providesGson", "Lcom/google/gson/Gson;", "providesGsonConverterFactory", "Lretrofit2/converter/gson/GsonConverterFactory;", "providesOkHttpClient", "Lokhttp3/OkHttpClient;", "providesRetrofit", "gsonConverterFactory", "rxJava2CallAdapterFactory", "Lretrofit2/adapter/rxjava2/RxJava2CallAdapterFactory;", "okHttpClient", "providesRxJavaCallAdapterFactory", "data_release"})
@dagger.Module
public final class NetworkModule {
    
    public NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final retrofit2.Retrofit providesRetrofit(@org.jetbrains.annotations.NotNull
    retrofit2.converter.gson.GsonConverterFactory gsonConverterFactory, @org.jetbrains.annotations.NotNull
    retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory rxJava2CallAdapterFactory, @org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final okhttp3.OkHttpClient providesOkHttpClient(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.google.gson.Gson providesGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final retrofit2.converter.gson.GsonConverterFactory providesGsonConverterFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory providesRxJavaCallAdapterFactory() {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    public final boolean provideIsNetworkAvailable(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.android.data.source.remote.RetrofitService provideService(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.android.domain.repository.AlbumRepository provideAlbumRepository(@org.jetbrains.annotations.NotNull
    com.android.data.source.remote.RetrofitService retrofitService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.android.domain.repository.MediaRepository provideMediaRepository(@org.jetbrains.annotations.NotNull
    com.android.data.source.remote.RetrofitService retrofitService) {
        return null;
    }
}