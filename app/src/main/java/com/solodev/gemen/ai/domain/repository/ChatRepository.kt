package com.solodev.gemen.ai.domain.repository

import android.graphics.Bitmap
import com.solodev.gemen.ai.domain.model.Chat

interface ChatRepository {

    suspend fun getChatResponse(prompt: String): Chat
    suspend fun getChatResponseWithImage(prompt: String, bitmap: Bitmap): Chat

}