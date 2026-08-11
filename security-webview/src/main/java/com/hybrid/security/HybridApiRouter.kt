package com.hybrid.security

import android.webkit.WebView

interface JsApiHandler {
    fun handle(method: String, payload: String): String
}

class HybridApiRouter {
    private val handlers = mutableMapOf<String, JsApiHandler>()

    fun register(name: String, handler: JsApiHandler) {
        handlers[name] = handler
    }

    fun dispatch(method: String, payload: String): String {
        return handlers[method]?.handle(method, payload) ?: "{}"
    }
}
