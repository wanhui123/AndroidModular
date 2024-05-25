package com.wanhui.androidmodular

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * Created by WanHui on 2024/5/25
 */
@HiltAndroidApp
class App : Application(){

    override fun onCreate() {
        super.onCreate()
    }
}