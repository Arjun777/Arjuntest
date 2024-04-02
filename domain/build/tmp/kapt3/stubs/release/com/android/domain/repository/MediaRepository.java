package com.android.domain.repository;

import java.lang.System;

/**
 * To make an interaction between [MediaRepositoryImp] & [GetMediaUseCase]
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/android/domain/repository/MediaRepository;", "", "getContentDatas", "Lio/reactivex/Single;", "", "Lcom/android/domain/model/Content;", "domain_release"})
public abstract interface MediaRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<java.util.List<com.android.domain.model.Content>> getContentDatas();
}