package com.wanhui.core.settings

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

/**
 * Created by WanHui on 2024/6/1
 */
class SettingsActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            SettingsScreen()
        }
    }

    @Composable
    fun SettingsScreen() {
        Box(contentAlignment = Alignment.Center) {
            Text("Settings Screen", modifier = Modifier.clickable {

            })
        }
    }
}