package com.android.presentation.album;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u000eH\u0016J\u001a\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001d"}, d2 = {"Lcom/android/presentation/album/AlbumsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/android/presentation/album/AlbumsAdapter;", "binding", "Lcom/android/presentation/databinding/FragmentAlbumsBinding;", "viewModel", "Lcom/android/presentation/album/AlbumsViewModel;", "getViewModel", "()Lcom/android/presentation/album/AlbumsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "navigateToPhotosPage", "", "album", "Lcom/android/domain/model/Album;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDetach", "onViewCreated", "view", "Companion", "presentation_release"})
@dagger.hilt.android.AndroidEntryPoint
public final class AlbumsFragment extends androidx.fragment.app.Fragment {
    private com.android.presentation.databinding.FragmentAlbumsBinding binding;
    private com.android.presentation.album.AlbumsAdapter adapter;
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final com.android.presentation.album.AlbumsFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String FRAGMENT_NAME = null;
    private java.util.HashMap _$_findViewCache;
    
    public AlbumsFragment() {
        super();
    }
    
    private final com.android.presentation.album.AlbumsViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void navigateToPhotosPage(com.android.domain.model.Album album) {
    }
    
    @java.lang.Override
    public void onDetach() {
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmStatic
    public static final com.android.presentation.album.AlbumsFragment newInstance() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/android/presentation/album/AlbumsFragment$Companion;", "", "()V", "FRAGMENT_NAME", "", "getFRAGMENT_NAME", "()Ljava/lang/String;", "newInstance", "Lcom/android/presentation/album/AlbumsFragment;", "presentation_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFRAGMENT_NAME() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @kotlin.jvm.JvmStatic
        public final com.android.presentation.album.AlbumsFragment newInstance() {
            return null;
        }
    }
}