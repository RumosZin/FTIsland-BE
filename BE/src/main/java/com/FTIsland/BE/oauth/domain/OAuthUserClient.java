package com.FTIsland.BE.oauth.domain;

public interface OAuthUserClient {
    OAuthUserInfo fetchUser(final String authCode);

    OAuthServerType supportType();
}
