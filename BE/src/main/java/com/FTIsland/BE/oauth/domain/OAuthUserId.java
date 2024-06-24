package com.FTIsland.BE.oauth.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import static jakarta.persistence.EnumType.STRING;
import static lombok.AccessLevel.PROTECTED;

@Embeddable
@NoArgsConstructor(access = PROTECTED)
@ToString
public class OAuthUserId {

    @NotNull
    @Getter
    private String oauthServerId;

    @Enumerated(STRING)
    @NotNull
    @Getter
    private OAuthServerType oauthServerType;

    public OAuthUserId(final String oauthServerId, final OAuthServerType oauthServerType) {
        this.oauthServerId = oauthServerId;
        this.oauthServerType = oauthServerType;
    }
}
