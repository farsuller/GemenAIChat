package com.solodev.gemen.ai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import com.solodev.gemen.ai.presentation.ChatScreen
import com.solodev.gemen.ai.ui.theme.GemenAIChatTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GemenAIChatTheme {
                Scaffold {
                    ChatScreen(paddingValues = it)
                }
            }
        }
    }
}

