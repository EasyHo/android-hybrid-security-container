package com.hybrid.security.network

interface SecurityHeaderProvider {
    fun headers(): Map<String, String>
}

class HybridRequestInterceptor(
    private val provider: SecurityHeaderProvider
) {
    fun intercept(headers: MutableMap<String, String>) {
        headers.putAll(provider.headers())
    }
}
