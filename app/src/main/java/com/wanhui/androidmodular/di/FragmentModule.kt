package com.wanhui.androidmodular.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

/**
 * Created by WanHui on 2024/5/27
 */
@Module
@InstallIn(FragmentComponent::class)// Fragment 范围，生命周期与 Fragment 相同。
class FragmentModule {

//    @Provides
//    @FragmentScope // 在 FragmentModule 中使用 @FragmentScope 注解，表示这个依赖项是 Fragment 范围的，只会被创建一次。
//    fun provideFragmentDependency(): FragmentRepository {
//        return FragmentRepository()
//    }
}