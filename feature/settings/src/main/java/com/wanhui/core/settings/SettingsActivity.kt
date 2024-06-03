package com.wanhui.core.settings

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
class SettingsActivity : ComponentActivity() {

    companion object{
        fun start(activity: Context) {
            activity.startActivity(Intent(activity, SettingsActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            SettingsScreen()
        }
    }

    @Composable
    fun SettingsScreen() {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text("设置模块 点击进入用户模块", modifier = Modifier.clickable {
                // 检查并使用 NavigationManager 进行跳转
                NavigationManager.userNavigator?.navigateToUserDetail(this@SettingsActivity,"12345")
            })
        }
    }
}