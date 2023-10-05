package com.teamproject.okowan.oauth;

public enum OAuthProvider {
    ORIGIN(OAuth.ORIGIN),
    KAKAO(OAuth.KAKAO);

    private final String provider;

    OAuthProvider(String provider) {
        this.provider = provider;
    }

    public String getProvider() {
        return this.provider;
    }

    public static class OAuth {
        public static final String ORIGIN = "TELLRO";
        public static final String KAKAO = "KAKAO";
    }
}
