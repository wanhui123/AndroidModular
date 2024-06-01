package com.wanhui.core.user

import android.content.Context
import com.wanhui.core.common.UserService

/**
 * Created by WanHui on 2024/6/1
 */
class UserServiceImpl(private val context: Context) : UserService {
    override fun getUserInfo(): String {
        return "User Info"
    }

    override fun startUserActivity() {
        UserActivity.start(context)
    }
}