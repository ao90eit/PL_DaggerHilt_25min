package com.aoinc.pl_daggerhilt_25min

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton  // always use same instance of string
    @Provides   // we want to provide this as a dependency to something
    @Named("String1")
    fun provideTestString1() = "This is string #1 we will inject."
}