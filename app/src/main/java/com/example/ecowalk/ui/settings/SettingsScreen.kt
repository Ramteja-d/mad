package com.example.ecowalk.ui.settings

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(
    onNavigateBack: () -> Unit,
    isDarkTheme: Boolean,
    onThemeChange: (Boolean) -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Settings") },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            ListItem(
                headlineContent = { Text("Dark Mode") },
                trailingContent = {
                    Switch(
                        checked = isDarkTheme,
                        onCheckedChange = onThemeChange
                    )
                }
            )
            ListItem(
                headlineContent = { Text("About EcoWalk") },
                supportingContent = { Text("Our mission is to promote greener and healthier lifestyles.") },
                modifier = Modifier.clickable { /* TODO */ }
            )
            ListItem(
                headlineContent = { Text("Version") },
                supportingContent = { Text("1.0.0") } // Replace with your app's version
            )
            ListItem(
                headlineContent = { Text("Privacy and Security") },
                supportingContent = { Text("Review our terms of service and privacy policy.") },
                modifier = Modifier.clickable { /* TODO */ }
            )
        }
    }
}
