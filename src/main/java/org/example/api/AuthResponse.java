package org.example.api;

import java.util.Collection;

public class AuthResponse {
    private String userId;
    private String accessToken;

    private Long expireAt;

    private Collection<String> authorities ;

    public AuthResponse(String userId, String accessToken, Long expireAt, Collection<String> authorities) {
        this.userId = userId;
        this.accessToken = accessToken;
        this.expireAt = expireAt;
        this.authorities = authorities;
    }

    public AuthResponse() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Long getExpireAt() {
        return expireAt;
    }

    public void setExpireAt(Long expireAt) {
        this.expireAt = expireAt;
    }

    public Collection<String> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<String> authorities) {
        this.authorities = authorities;
    }
}
