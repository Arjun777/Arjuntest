package com.android.domain.usecase;

import java.lang.System;

/**
 * An interactor that calls the actual implementation of [AlbumViewModel](which is injected by DI)
 * it handles the response that returns data &
 * contains a list of actions, event steps
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\bH\u0010\u00a2\u0006\u0002\b\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/android/domain/usecase/GetAlbumsUseCase;", "Lcom/android/domain/usecase/base/SingleUseCase;", "", "Lcom/android/domain/model/Album;", "repository", "Lcom/android/domain/repository/AlbumRepository;", "(Lcom/android/domain/repository/AlbumRepository;)V", "buildUseCaseSingle", "Lio/reactivex/Single;", "buildUseCaseSingle$domain_debug", "domain_debug"})
public final class GetAlbumsUseCase extends com.android.domain.usecase.base.SingleUseCase<java.util.List<? extends com.android.domain.model.Album>> {
    private final com.android.domain.repository.AlbumRepository repository = null;
    
    @javax.inject.Inject
    public GetAlbumsUseCase(@org.jetbrains.annotations.NotNull
    com.android.domain.repository.AlbumRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Single<java.util.List<com.android.domain.model.Album>> buildUseCaseSingle$domain_debug() {
        return null;
    }
}