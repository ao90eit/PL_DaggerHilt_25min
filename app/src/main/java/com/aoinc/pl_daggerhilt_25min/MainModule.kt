package com.aoinc.pl_daggerhilt_25min

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named

@Module
@InstallIn(ActivityComponent::class)
object MainModule {

    //@Singleton  // only works in SingletonComponent, doesn't work here
    @ActivityScoped // activity specific single instance
    @Provides
    @Named("String2")
    fun provideTestString2(
        @ApplicationContext context: Context,
        @Named("String1") testString1: String
    ) = "${context.getString(R.string.string_to_inject)} - $testString1"
}