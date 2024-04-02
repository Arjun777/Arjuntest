// Generated by Dagger (https://dagger.dev).
package com.android.data.di;

import android.app.Application;
import com.android.data.source.local.AppDatabase;
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
public final class DatabaseModule_ProvideAppDatabase$data_debugFactory implements Factory<AppDatabase> {
  private final DatabaseModule module;

  private final Provider<Application> applicationProvider;

  public DatabaseModule_ProvideAppDatabase$data_debugFactory(DatabaseModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public AppDatabase get() {
    return provideAppDatabase$data_debug(module, applicationProvider.get());
  }

  public static DatabaseModule_ProvideAppDatabase$data_debugFactory create(DatabaseModule module,
      Provider<Application> applicationProvider) {
    return new DatabaseModule_ProvideAppDatabase$data_debugFactory(module, applicationProvider);
  }

  public static AppDatabase provideAppDatabase$data_debug(DatabaseModule instance,
      Application application) {
    return Preconditions.checkNotNullFromProvides(instance.provideAppDatabase$data_debug(application));
  }
}
