package com.wanhui.core.settings.navigation

import android.app.Activity
import android.app.Application
import com.wanhui.core.common.navigation.SettingsNavigator
import com.wanhui.core.settings.SettingsActivity

/**
 * Created by WanHui on 2024/6/1
 */
class SettingsNavigatorImpl(private val application: Application) : SettingsNavigator {
    override fun navigateToSettings(activity: Activity) {
        SettingsActivity.start(activity)
    }
}