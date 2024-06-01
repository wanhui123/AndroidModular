package com.wanhui.core.settings

import android.app.Activity
import android.app.Application
import com.wanhui.core.common.navigation.NavigationManager
import com.wanhui.core.settings.navigation.SettingsNavigatorImpl

/**
 * Created by WanHui on 2024/6/1
 */
object SettingsModuleInitializer {
    fun init(application: Application) {
        NavigationManager.settingsNavigator = SettingsNavigatorImpl(application)
    }
}