package com.FTIsland.BE.oauth.domain;

import com.FTIsland.BE.base.BaseExceptionType;
import org.springframework.http.HttpStatus;

public enum OAuthExceptionType implements BaseExceptionType {
    OAUTH_CLIENT_NOT_FOUND(HttpStatus.NOT_FOUND, "지원하는 OAuth Server가 아닙니다.");

    private final HttpStatus httpStatus;
    private final String message;

    OAuthExceptionType(final HttpStatus httpStatus, final String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }

    @Override
    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
