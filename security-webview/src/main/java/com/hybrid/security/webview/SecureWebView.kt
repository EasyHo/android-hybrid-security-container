package com.hybrid.security.webview

import android.content.Context
import android.webkit.WebView
import android.webkit.WebSettings

class SecureWebView(context: Context) : WebView(context) {

    init {
        settings.apply {
            javaScriptEnabled = true
            allowFileAccess = false
            allowContentAccess = false
            mixedContentMode = WebSettings.MIXED_CONTENT_NEVER_ALLOW
        }

        WebView.setWebContentsDebuggingEnabled(false)
    }

    fun loadSecureUrl(url: String) {
        loadUrl(url)
    }
}
