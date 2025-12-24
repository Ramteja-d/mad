package com.example.ecowalk

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.ecowalk.ui.AppRoot
import com.example.ecowalk.ui.theme.EcoWalkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val systemTheme = isSystemInDarkTheme()
            var isDarkTheme by remember { mutableStateOf(systemTheme) }

            EcoWalkTheme(
                darkTheme = isDarkTheme,
                dynamicColor = false
            ) {
                AppRoot(
                    isDarkTheme = isDarkTheme,
                    onThemeChange = { isDarkTheme = it }
                )
            }
        }
    }
}
