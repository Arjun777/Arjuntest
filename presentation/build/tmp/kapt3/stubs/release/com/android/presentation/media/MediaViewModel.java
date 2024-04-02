package com.android.presentation.media;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0007R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\n\u001a\u0004\u0018\u00010\u00078F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000e0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\t\u00a8\u0006\u0015"}, d2 = {"Lcom/android/presentation/media/MediaViewModel;", "Landroidx/lifecycle/ViewModel;", "getMediaListUseCase", "Lcom/android/domain/usecase/GetMediaUseCase;", "(Lcom/android/domain/usecase/GetMediaUseCase;)V", "ContentData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/android/domain/model/Content;", "getContentData", "()Landroidx/lifecycle/MutableLiveData;", "content", "getContent", "()Lcom/android/domain/model/Content;", "contentReceivedLiveData", "", "getContentReceivedLiveData", "isLoad", "", "loadContent", "", "set", "presentation_release"})
public final class MediaViewModel extends androidx.lifecycle.ViewModel {
    private final com.android.domain.usecase.GetMediaUseCase getMediaListUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.android.domain.model.Content>> contentReceivedLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoad = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.android.domain.model.Content> ContentData = null;
    
    @javax.inject.Inject
    public MediaViewModel(@org.jetbrains.annotations.NotNull
    com.android.domain.usecase.GetMediaUseCase getMediaListUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.android.domain.model.Content>> getContentReceivedLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoad() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.android.domain.model.Content> getContentData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.android.domain.model.Content getContent() {
        return null;
    }
    
    public final void set(@org.jetbrains.annotations.NotNull
    com.android.domain.model.Content content) {
    }
    
    public final void loadContent() {
    }
}