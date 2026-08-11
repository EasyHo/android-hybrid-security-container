package com.hybrid.security.webview

import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class SecureWebViewClient(
    private val allowedHosts: Set<String>
) : WebViewClient() {

    override fun shouldOverrideUrlLoading(
        view: WebView,
        request: WebResourceRequest
    ): Boolean {
        val uri = request.url
        return uri.scheme != "https" || !allowedHosts.contains(uri.host)
    }
}
