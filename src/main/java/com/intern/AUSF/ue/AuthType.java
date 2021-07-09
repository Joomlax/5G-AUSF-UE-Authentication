package com.intern.AUSF.ue;

public class AuthType {
    private String AuthType;

    public AuthType(String authType) {
        AuthType = authType;
    }

    public String getAuthType() {
        return AuthType;
    }

    public void setAuthType(String authType) {
        AuthType = authType;
    }

    @Override
    public String toString() {
        return "AuthType{" +
                "AuthType='" + AuthType + '\'' +
                '}';
    }
}
