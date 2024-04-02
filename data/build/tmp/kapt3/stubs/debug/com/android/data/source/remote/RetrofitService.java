package com.android.data.source.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H\'\u00a8\u0006\b"}, d2 = {"Lcom/android/data/source/remote/RetrofitService;", "", "getAlbums", "Lio/reactivex/Single;", "", "Lcom/android/domain/model/Album;", "getcontent", "Lcom/android/domain/model/Content;", "data_debug"})
public abstract interface RetrofitService {
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "albums/")
    public abstract io.reactivex.Single<java.util.List<com.android.domain.model.Album>> getAlbums();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "content/")
    public abstract io.reactivex.Single<java.util.List<com.android.domain.model.Content>> getcontent();
}