// Generated by Dagger (https://dagger.dev).
package com.android.data.di;

import com.android.data.source.remote.RetrofitService;
import com.android.domain.repository.MediaRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class NetworkModule_ProvideMediaRepositoryFactory implements Factory<MediaRepository> {
  private final NetworkModule module;

  private final Provider<RetrofitService> retrofitServiceProvider;

  public NetworkModule_ProvideMediaRepositoryFactory(NetworkModule module,
      Provider<RetrofitService> retrofitServiceProvider) {
    this.module = module;
    this.retrofitServiceProvider = retrofitServiceProvider;
  }

  @Override
  public MediaRepository get() {
    return provideMediaRepository(module, retrofitServiceProvider.get());
  }

  public static NetworkModule_ProvideMediaRepositoryFactory create(NetworkModule module,
      Provider<RetrofitService> retrofitServiceProvider) {
    return new NetworkModule_ProvideMediaRepositoryFactory(module, retrofitServiceProvider);
  }

  public static MediaRepository provideMediaRepository(NetworkModule instance,
      RetrofitService retrofitService) {
    return Preconditions.checkNotNullFromProvides(instance.provideMediaRepository(retrofitService));
  }
}
