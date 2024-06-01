package com.wanhui.core.user.navigation

import android.app.Activity
import android.app.Application
import com.wanhui.core.common.navigation.UserNavigator
import com.wanhui.core.user.UserActivity

/**
 * Created by WanHui on 2024/6/1
 */
class UserNavigatorImpl(private val application: Application) : UserNavigator {
    override fun navigateToUserDetail(activity: Activity, userId: String) {
        UserActivity.start(activity)
    }

}