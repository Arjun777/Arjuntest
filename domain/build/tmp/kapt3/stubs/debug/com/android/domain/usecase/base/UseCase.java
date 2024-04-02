package com.android.domain.usecase.base;

import java.lang.System;

/**
 * This class is extended by SingleUseCase classes
 * to use common methods & fields
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eR\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0010"}, d2 = {"Lcom/android/domain/usecase/base/UseCase;", "", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "lastDisposable", "Lio/reactivex/disposables/Disposable;", "getLastDisposable", "()Lio/reactivex/disposables/Disposable;", "setLastDisposable", "(Lio/reactivex/disposables/Disposable;)V", "dispose", "", "disposeLast", "domain_debug"})
public abstract class UseCase {
    @org.jetbrains.annotations.Nullable
    private io.reactivex.disposables.Disposable lastDisposable;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    
    public UseCase() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    protected final io.reactivex.disposables.Disposable getLastDisposable() {
        return null;
    }
    
    protected final void setLastDisposable(@org.jetbrains.annotations.Nullable
    io.reactivex.disposables.Disposable p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    public final void disposeLast() {
    }
    
    public final void dispose() {
    }
}