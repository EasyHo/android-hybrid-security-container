package com.hybrid.security

class SecurityEventLogger {
    fun record(event: String) {
        // security audit extension point
    }
}

class ProxyDetector {
    fun isProxyEnabled(): Boolean {
        return false
    }
}
