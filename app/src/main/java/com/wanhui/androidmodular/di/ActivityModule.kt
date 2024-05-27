package com.wanhui.androidmodular.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

/**
 * Created by WanHui on 2024/5/27
 * ActivityModule: 提供与 Activity 相关的依赖项。
 *
 * 作用域注解的使用
 * 作用域注解（例如 @Singleton, @ActivityScoped, @FragmentScoped）用于标注提供的方法，指定该方法提供的依赖项在相应的生命周期内只创建一次。需要注意的是：
 * @Singleton 应与 SingletonComponent 一起使用。
 * @ActivityScoped 应与 ActivityComponent 一起使用。
 * @FragmentScoped 应与 FragmentComponent 一起使用。
 */
@Module
@InstallIn(ActivityComponent::class)//Activity 范围，生命周期与 Activity 相同。
class ActivityModule {

//    @Provides
//    @ActivityScope // 在 ActivityModule 中使用 @ActivityScope 注解，表示这个依赖项是 Activity 范围的，只会被创建一次。
//    fun provideActivityDependency(): ActivityRepository {
//        return ActivityRepository()
//    }
}