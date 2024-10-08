package com.example.networktest

import okhttp3.OkHttpClient
import okhttp3.Request
import java.net.Inet4Address
import javax.security.auth.callback.Callback

object HttpUtil {
    fun SR(address: String,callback: okhttp3.Callback) {
        val client = OkHttpClient()
        val request = Request.Builder()
            .url(address)
            .build()
        client.newCall(request).execute(callback)
    }
}