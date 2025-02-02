// Generated by Dagger (https://dagger.dev).
package com.android.data.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class NetworkModule_ProvidesRxJavaCallAdapterFactoryFactory implements Factory<RxJava2CallAdapterFactory> {
  private final NetworkModule module;

  public NetworkModule_ProvidesRxJavaCallAdapterFactoryFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public RxJava2CallAdapterFactory get() {
    return providesRxJavaCallAdapterFactory(module);
  }

  public static NetworkModule_ProvidesRxJavaCallAdapterFactoryFactory create(NetworkModule module) {
    return new NetworkModule_ProvidesRxJavaCallAdapterFactoryFactory(module);
  }

  public static RxJava2CallAdapterFactory providesRxJavaCallAdapterFactory(NetworkModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesRxJavaCallAdapterFactory());
  }
}
