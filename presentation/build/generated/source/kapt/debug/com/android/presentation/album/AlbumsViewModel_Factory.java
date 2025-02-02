// Generated by Dagger (https://dagger.dev).
package com.android.presentation.album;

import com.android.domain.usecase.GetAlbumsUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AlbumsViewModel_Factory implements Factory<AlbumsViewModel> {
  private final Provider<GetAlbumsUseCase> getAlbumListUseCaseProvider;

  public AlbumsViewModel_Factory(Provider<GetAlbumsUseCase> getAlbumListUseCaseProvider) {
    this.getAlbumListUseCaseProvider = getAlbumListUseCaseProvider;
  }

  @Override
  public AlbumsViewModel get() {
    return newInstance(getAlbumListUseCaseProvider.get());
  }

  public static AlbumsViewModel_Factory create(
      Provider<GetAlbumsUseCase> getAlbumListUseCaseProvider) {
    return new AlbumsViewModel_Factory(getAlbumListUseCaseProvider);
  }

  public static AlbumsViewModel newInstance(GetAlbumsUseCase getAlbumListUseCase) {
    return new AlbumsViewModel(getAlbumListUseCase);
  }
}
