package com.wanhui.core.common.navigation

import android.app.Activity

/**
 * Created by WanHui on 2024/6/1
 */
interface UserNavigator {

    //跳转到用户模块
    fun navigateToUserDetail(activity: Activity, userId: String)
}