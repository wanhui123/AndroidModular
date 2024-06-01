package com.wanhui.core.user

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.wanhui.core.common.navigation.NavigationManager

/**
 * Created by WanHui on 2024/6/1
 */
class UserActivity: ComponentActivity() {

    companion object{
        //跳转到用户模块
        fun start(activity: Context){
            activity.startActivity(Intent(activity, UserActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            UserScreen()
        }
    }

    @Composable
    fun UserScreen() {
        Box(modifier = Modifier.fillMaxSize(),contentAlignment = Alignment.Center) {
            Text("User Screen", modifier = Modifier.clickable {
                // 使用 NavigationManager 进行跳转
                NavigationManager.settingsNavigator?.navigateToSettings(this@UserActivity)
            })
        }
    }
}