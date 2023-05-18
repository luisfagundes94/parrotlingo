package com.luisfagundes.parrotlingo.di

import android.content.Context
import com.luisfagundes.parrotlingo.provider.AppResourceProvider
import com.luisfagundes.parrotlingo.provider.AppThemeProvider
import com.luisfagundes.provider.ResourceProvider
import com.luisfagundes.provider.ThemeProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ProviderModule {
    @Provides
    @Singleton
    fun provideThemeProvider(@ApplicationContext context: Context): ThemeProvider {
        return AppThemeProvider(context)
    }

    @Provides
    @Singleton
    fun provideAppResourceProvider(@ApplicationContext context: Context): ResourceProvider {
        return AppResourceProvider(context)
    }
}
