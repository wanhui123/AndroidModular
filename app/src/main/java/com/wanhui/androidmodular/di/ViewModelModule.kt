package com.wanhui.androidmodular.di

import com.wanhui.androidmodular.repository.MainRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

/**
 * Created by WanHui on 2024/5/27
 * ViewModelModule: 提供与 ViewModel 相关的依赖项。
 */
@Module
@InstallIn(ViewModelComponent::class)// ViewModel 范围，生命周期与 ViewModel 相同。
class ViewModelModule {

    @Provides
    fun provideMainRepository(): MainRepository {
        return MainRepository()
    }
}