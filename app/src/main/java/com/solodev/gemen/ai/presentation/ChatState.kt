package com.solodev.gemen.ai.presentation

import android.graphics.Bitmap
import com.solodev.gemen.ai.domain.model.Chat

data class ChatState(
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)