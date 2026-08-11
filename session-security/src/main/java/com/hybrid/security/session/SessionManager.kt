package com.hybrid.security.session

class SessionManager(
    private val cookieManager: SecureCookieManager
) {

    private var accessToken: String? = null

    fun updateToken(token: String) {
        accessToken = token
    }

    fun getToken(): String? {
        return accessToken
    }

    fun clear() {
        accessToken = null
        cookieManager.clearSession()
    }
}
