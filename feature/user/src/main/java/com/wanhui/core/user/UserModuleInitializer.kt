package com.wanhui.core.user

import android.app.Application
import com.wanhui.core.common.navigation.NavigationManager
import com.wanhui.core.user.navigation.UserNavigatorImpl

/**
 * Created by WanHui on 2024/6/1
 */
object UserModuleInitializer {
    fun init(application: Application) {
        NavigationManager.userNavigator = UserNavigatorImpl(application)
    }
}