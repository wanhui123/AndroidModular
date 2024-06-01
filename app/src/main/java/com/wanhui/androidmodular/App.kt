package com.wanhui.androidmodular

import android.app.Application
import com.wanhui.core.settings.SettingsModuleInitializer
import com.wanhui.core.user.UserModuleInitializer
import dagger.hilt.android.HiltAndroidApp

/**
 * Created by WanHui on 2024/5/25
 */
@HiltAndroidApp
class App : Application(){

    override fun onCreate() {
        super.onCreate()
        UserModuleInitializer.init(this)
        SettingsModuleInitializer.init(this)
    }
}