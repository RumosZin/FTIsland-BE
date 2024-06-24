package com.FTIsland.BE.oauth.domain;

public record OAuthUserInfo(
        String oauthServerId,
        String profileImageUrl,
        OAuthServerType oAuthServerType) {
    public OAuthUserId oAuthMemberId() {
        return new OAuthUserId(oauthServerId, oAuthServerType);
    }
}
