package com.FTIsland.BE.oauth.domain;

import com.FTIsland.BE.base.BaseException;

public class OAuthException extends BaseException {
    public OAuthException(final OAuthExceptionType exceptionType) {
        super(exceptionType);
    }
}
