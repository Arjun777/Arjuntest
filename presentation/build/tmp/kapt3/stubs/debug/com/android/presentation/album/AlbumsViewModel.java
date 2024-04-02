package com.android.presentation.album;

import java.lang.System;

/**
 * To store & manage UI-related data in a lifecycle conscious way!
 * this class allows data to survive configuration changes such as screen rotation
 * by interacting with [GetAlbumsUseCase]
 */
@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0006R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f\u00a8\u0006\u0015"}, d2 = {"Lcom/android/presentation/album/AlbumsViewModel;", "Landroidx/lifecycle/ViewModel;", "getAlbumListUseCase", "Lcom/android/domain/usecase/GetAlbumsUseCase;", "(Lcom/android/domain/usecase/GetAlbumsUseCase;)V", "album", "Lcom/android/domain/model/Album;", "getAlbum", "()Lcom/android/domain/model/Album;", "albumData", "Landroidx/lifecycle/MutableLiveData;", "getAlbumData", "()Landroidx/lifecycle/MutableLiveData;", "albumsReceivedLiveData", "", "getAlbumsReceivedLiveData", "isLoad", "", "loadAlbums", "", "set", "presentation_debug"})
public final class AlbumsViewModel extends androidx.lifecycle.ViewModel {
    private final com.android.domain.usecase.GetAlbumsUseCase getAlbumListUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.android.domain.model.Album>> albumsReceivedLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoad = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.android.domain.model.Album> albumData = null;
    
    @javax.inject.Inject
    public AlbumsViewModel(@org.jetbrains.annotations.NotNull
    com.android.domain.usecase.GetAlbumsUseCase getAlbumListUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.android.domain.model.Album>> getAlbumsReceivedLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoad() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.android.domain.model.Album> getAlbumData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.android.domain.model.Album getAlbum() {
        return null;
    }
    
    public final void set(@org.jetbrains.annotations.NotNull
    com.android.domain.model.Album album) {
    }
    
    public final void loadAlbums() {
    }
}