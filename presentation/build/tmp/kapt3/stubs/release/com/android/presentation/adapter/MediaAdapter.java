package com.android.presentation.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004/012B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ&\u0010\u001b\u001a\u00020\u001c2\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u001ej\b\u0012\u0004\u0012\u00020\u0005`\u001f2\u0006\u0010 \u001a\u00020\u0016J\b\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\"H\u0016J\u0010\u0010&\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"H\u0016J\u0018\u0010\'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\"H\u0016J\u0018\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\"H\u0016J\u000e\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u00063"}, d2 = {"Lcom/android/presentation/adapter/MediaAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "modelList", "", "Lcom/android/domain/model/Content;", "context", "Landroid/content/Context;", "(Ljava/util/List;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "mClickListener", "Lcom/android/presentation/adapter/MediaAdapter$ClickListener;", "getMClickListener", "()Lcom/android/presentation/adapter/MediaAdapter$ClickListener;", "setMClickListener", "(Lcom/android/presentation/adapter/MediaAdapter$ClickListener;)V", "getModelList", "()Ljava/util/List;", "setModelList", "(Ljava/util/List;)V", "searchString", "", "getSearchString", "()Ljava/lang/String;", "setSearchString", "(Ljava/lang/String;)V", "filterList", "", "filterlist", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "text", "getItemCount", "", "getItemId", "", "position", "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "aClickListener", "ClickListener", "Companion", "ProgressViewHolder", "ViewHolder", "presentation_release"})
public final class MediaAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.android.domain.model.Content> modelList;
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private java.lang.String searchString = "";
    @org.jetbrains.annotations.NotNull
    public static final com.android.presentation.adapter.MediaAdapter.Companion Companion = null;
    private static final int VIEW_TYPE_DATA = 0;
    private static final int VIEW_TYPE_PROGRESS = 1;
    public com.android.presentation.adapter.MediaAdapter.ClickListener mClickListener;
    
    public MediaAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.android.domain.model.Content> modelList, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.android.domain.model.Content> getModelList() {
        return null;
    }
    
    public final void setModelList(@org.jetbrains.annotations.NotNull
    java.util.List<com.android.domain.model.Content> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSearchString() {
        return null;
    }
    
    public final void setSearchString(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    public final void filterList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.android.domain.model.Content> filterlist, @org.jetbrains.annotations.NotNull
    java.lang.String text) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.android.presentation.adapter.MediaAdapter.ClickListener getMClickListener() {
        return null;
    }
    
    public final void setMClickListener(@org.jetbrains.annotations.NotNull
    com.android.presentation.adapter.MediaAdapter.ClickListener p0) {
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull
    com.android.presentation.adapter.MediaAdapter.ClickListener aClickListener) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/android/presentation/adapter/MediaAdapter$ClickListener;", "", "onClick", "", "pos", "", "aView", "Landroid/view/View;", "presentation_release"})
    public static abstract interface ClickListener {
        
        public abstract void onClick(int pos, @org.jetbrains.annotations.NotNull
        android.view.View aView);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016\u00a8\u0006\f"}, d2 = {"Lcom/android/presentation/adapter/MediaAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "(Lcom/android/presentation/adapter/MediaAdapter;Landroid/view/View;)V", "bind", "", "model", "Lcom/android/domain/model/Content;", "onClick", "p0", "presentation_release"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        @java.lang.Override
        public void onClick(@org.jetbrains.annotations.Nullable
        android.view.View p0) {
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.android.domain.model.Content model) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/android/presentation/adapter/MediaAdapter$ProgressViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/android/presentation/adapter/MediaAdapter;Landroid/view/View;)V", "presentation_release"})
    public final class ProgressViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public ProgressViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/android/presentation/adapter/MediaAdapter$Companion;", "", "()V", "VIEW_TYPE_DATA", "", "VIEW_TYPE_PROGRESS", "presentation_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}