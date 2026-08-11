package com.hybrid.security.session

import android.webkit.CookieManager

class SecureCookieManager {

    private val cookieManager = CookieManager.getInstance()

    fun syncCookie(url: String, cookie: String) {
        cookieManager.setAcceptCookie(true)
        cookieManager.setCookie(url, cookie)
    }

    fun getCookie(url: String): String? {
        return cookieManager.getCookie(url)
    }

    fun clearSession() {
        cookieManager.removeAllCookies(null)
        cookieManager.flush()
    }
}
