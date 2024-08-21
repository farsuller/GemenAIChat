package com.solodev.gemen.ai.presentation.components

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.platform.LocalContext
import kotlinx.coroutines.flow.MutableStateFlow

@Composable
fun getBitmap(uriState: MutableStateFlow<String>): Bitmap? {
    val context = LocalContext.current
    val uri = uriState.collectAsState().value

    return if (uri.isNotEmpty()) {
        try {
            val inputStream = context.contentResolver.openInputStream(Uri.parse(uri))
            BitmapFactory.decodeStream(inputStream)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    } else {
        null
    }
}