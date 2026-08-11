# Android Hybrid Security Container

Android Hybrid security container implementing:

- H5 JSBridge API forwarding
- Native network proxy layer
- HTTPS certificate pinning
- WebView hardening

## Architecture

H5 -> JSBridge -> Native Router -> Security Network Client -> Backend
