package com.hybrid.security.webview.bridge

interface JsBridgeHandler {
    fun handle(
        method: String,
        params: String,
        callback: (String) -> Unit
    )
}
