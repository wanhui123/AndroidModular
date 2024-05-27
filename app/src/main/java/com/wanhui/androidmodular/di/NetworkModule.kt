package com.wanhui.androidmodular.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by WanHui on 2024/5/27
 * NetworkModule: 专门用于提供网络相关的依赖项，例如 OkHttpClient、Retrofit 实例等。
 */
@Module
@InstallIn(SingletonComponent::class)// 应用程序范围，生命周期与应用程序相同。
class NetworkModule {

    // 提供 OkHttpClient 实例
    @Provides
    @Singleton// 表示这个依赖项是单例的，只会被创建一次。
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .build()
    }

    // 提供 Retrofit 实例
    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}