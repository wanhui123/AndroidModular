package com.wanhui.core.common

/**
 * Created by WanHui on 2024/6/1
 */
interface UserService {
    //获取用户信息
    fun getUserInfo(): String

    //跳转到用户模块
    fun startUserActivity()
}