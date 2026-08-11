package com.hybrid.security

import okhttp3.CertificatePinner

object SecurityHttpClient {
    fun certificatePinner(host: String, sha256: String): CertificatePinner {
        return CertificatePinner.Builder()
            .add(host, sha256)
            .build()
    }
}
