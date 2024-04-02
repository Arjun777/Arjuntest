package com.android.domain.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bH\u00c6\u0003JE\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011\u00a8\u0006$"}, d2 = {"Lcom/android/domain/model/PageThird;", "", "title", "", "totalcontentitems", "pagenum", "pagesize", "contentitems", "Lcom/android/domain/model/ContentitemThird;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/android/domain/model/ContentitemThird;)V", "getContentitems", "()Lcom/android/domain/model/ContentitemThird;", "setContentitems", "(Lcom/android/domain/model/ContentitemThird;)V", "getPagenum", "()Ljava/lang/String;", "setPagenum", "(Ljava/lang/String;)V", "getPagesize", "setPagesize", "getTitle", "setTitle", "getTotalcontentitems", "setTotalcontentitems", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_debug"})
public final class PageThird {
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "title")
    private java.lang.String title;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "total-content-items")
    private java.lang.String totalcontentitems;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "page-num")
    private java.lang.String pagenum;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "page-size")
    private java.lang.String pagesize;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "content-items")
    private com.android.domain.model.ContentitemThird contentitems;
    
    @org.jetbrains.annotations.NotNull
    public final com.android.domain.model.PageThird copy(@org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.String totalcontentitems, @org.jetbrains.annotations.Nullable
    java.lang.String pagenum, @org.jetbrains.annotations.Nullable
    java.lang.String pagesize, @org.jetbrains.annotations.Nullable
    com.android.domain.model.ContentitemThird contentitems) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public PageThird() {
        super();
    }
    
    public PageThird(@org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.String totalcontentitems, @org.jetbrains.annotations.Nullable
    java.lang.String pagenum, @org.jetbrains.annotations.Nullable
    java.lang.String pagesize, @org.jetbrains.annotations.Nullable
    com.android.domain.model.ContentitemThird contentitems) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTotalcontentitems() {
        return null;
    }
    
    public final void setTotalcontentitems(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPagenum() {
        return null;
    }
    
    public final void setPagenum(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPagesize() {
        return null;
    }
    
    public final void setPagesize(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.android.domain.model.ContentitemThird component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.android.domain.model.ContentitemThird getContentitems() {
        return null;
    }
    
    public final void setContentitems(@org.jetbrains.annotations.Nullable
    com.android.domain.model.ContentitemThird p0) {
    }
}