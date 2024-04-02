package com.android.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/android/data/repository/MediaRepositoryImp;", "Lcom/android/domain/repository/MediaRepository;", "retrofitService", "Lcom/android/data/source/remote/RetrofitService;", "(Lcom/android/data/source/remote/RetrofitService;)V", "getContentDatas", "Lio/reactivex/Single;", "", "Lcom/android/domain/model/Content;", "data_debug"})
public final class MediaRepositoryImp implements com.android.domain.repository.MediaRepository {
    private final com.android.data.source.remote.RetrofitService retrofitService = null;
    
    public MediaRepositoryImp(@org.jetbrains.annotations.NotNull
    com.android.data.source.remote.RetrofitService retrofitService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Single<java.util.List<com.android.domain.model.Content>> getContentDatas() {
        return null;
    }
}