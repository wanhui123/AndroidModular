package com.wanhui.androidmodular.di

import com.wanhui.androidmodular.repository.MainRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by WanHui on 2024/5/25
 * AppModule: 用于提供应用程序范围内的通用依赖项，例如网络客户端、数据库实例、全局配置等。
 */
@Module
@InstallIn(SingletonComponent::class)//应用程序范围，生命周期与应用程序相同。
class AppModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.example.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

//    @Provides
//    @Singleton
//    fun provideMainRepository(): MainRepository {
//        return MainRepository()
//    }
}