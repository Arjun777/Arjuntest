package com.android.domain.usecase.base;

import java.lang.System;

/**
 * This abstract class is shared among several closely related UseCase classes
 * that classes that extend this abstract class to use common methods & fields
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H \u00a2\u0006\u0002\b\u0006J\\\u0010\u0007\u001a\u00020\b2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\b0\n2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\b0\n2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/android/domain/usecase/base/SingleUseCase;", "T", "Lcom/android/domain/usecase/base/UseCase;", "()V", "buildUseCaseSingle", "Lio/reactivex/Single;", "buildUseCaseSingle$domain_release", "execute", "", "onSuccess", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "t", "onError", "", "onFinished", "Lkotlin/Function0;", "domain_release"})
public abstract class SingleUseCase<T extends java.lang.Object> extends com.android.domain.usecase.base.UseCase {
    
    public SingleUseCase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<T> buildUseCaseSingle$domain_release();
    
    public final void execute(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onFinished) {
    }
}