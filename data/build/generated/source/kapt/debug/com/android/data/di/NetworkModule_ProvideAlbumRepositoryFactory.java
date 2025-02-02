// Generated by Dagger (https://dagger.dev).
package com.android.data.di;

import com.android.data.source.remote.RetrofitService;
import com.android.domain.repository.AlbumRepository;
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
public final class NetworkModule_ProvideAlbumRepositoryFactory implements Factory<AlbumRepository> {
  private final NetworkModule module;

  private final Provider<RetrofitService> retrofitServiceProvider;

  public NetworkModule_ProvideAlbumRepositoryFactory(NetworkModule module,
      Provider<RetrofitService> retrofitServiceProvider) {
    this.module = module;
    this.retrofitServiceProvider = retrofitServiceProvider;
  }

  @Override
  public AlbumRepository get() {
    return provideAlbumRepository(module, retrofitServiceProvider.get());
  }

  public static NetworkModule_ProvideAlbumRepositoryFactory create(NetworkModule module,
      Provider<RetrofitService> retrofitServiceProvider) {
    return new NetworkModule_ProvideAlbumRepositoryFactory(module, retrofitServiceProvider);
  }

  public static AlbumRepository provideAlbumRepository(NetworkModule instance,
      RetrofitService retrofitService) {
    return Preconditions.checkNotNullFromProvides(instance.provideAlbumRepository(retrofitService));
  }
}
