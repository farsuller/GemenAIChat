package com.solodev.gemen.ai.di

import com.solodev.gemen.ai.BuildConfig
import com.solodev.gemen.ai.data.ChatRepositoryImpl
import com.solodev.gemen.ai.domain.repository.ChatRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideApiKey(): String {
        return BuildConfig.API_KEY
    }

    @Provides
    @Singleton
    fun provideChatRepository(apiKey: String): ChatRepository {
        return ChatRepositoryImpl(apiKey)
    }
}