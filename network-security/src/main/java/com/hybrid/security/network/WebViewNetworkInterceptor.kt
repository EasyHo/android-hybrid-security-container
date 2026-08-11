package com.hybrid.security.network

import android.webkit.WebResourceRequest
import android.webkit.WebResourceResponse
import android.webkit.WebView
import android.webkit.WebViewClient

/**
 * Intercepts WebView network requests and provides a unified security entry point.
 *
 * Flow:
 * WebView -> shouldInterceptRequest -> Security Layer -> OkHttp Adapter
 */
class WebViewNetworkInterceptor(
    private val requestHandler: SecureRequestHandler
) : WebViewClient() {

    override fun shouldInterceptRequest(
        view: WebView,
        request: WebResourceRequest
    ): WebResourceResponse? {
        return if (requestHandler.shouldHandle(request.url.toString())) {
            requestHandler.execute(request)
        } else {
            super.shouldInterceptRequest(view, request)
        }
    }
}

interface SecureRequestHandler {

    fun shouldHandle(url: String): Boolean

    fun execute(request: WebResourceRequest): WebResourceResponse?
}
