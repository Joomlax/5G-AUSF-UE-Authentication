package com.intern.AUSF.ue;

import java.util.ArrayList;

public class UEAuthenticationCtx {

    private AuthType authType; //Required
    private AuthData authData;  //Required
    private _links links; //Required
    private String servingNetworkName;

    public UEAuthenticationCtx(AuthType authType, AuthData authData, _links links) {
        this.authType = authType;
        this.authData = authData;
        this.links = links;
    }

    public UEAuthenticationCtx(AuthType authType, AuthData authData, _links links, String servingNetworkName) {
        this.authType = authType;
        this.authData = authData;
        this.links = links;
        this.servingNetworkName = servingNetworkName;
    }

    public AuthType getAuthType() {
        return authType;
    }

    public void setAuthType(AuthType authType) {
        this.authType = authType;
    }

    public AuthData getAuthData() {
        return authData;
    }

    public void setAuthData(AuthData authData) {
        this.authData = authData;
    }

    public _links getLinks() {
        return links;
    }

    public void setLinks(_links links) {
        this.links = links;
    }

    public String getServingNetworkName() {
        return servingNetworkName;
    }

    public void setServingNetworkName(String servingNetworkName) {
        this.servingNetworkName = servingNetworkName;
    }

    @Override
    public String toString() {
        return "UEAuthenticationCtx{" +
                "authType=" + authType +
                ", authData=" + authData +
                ", links=" + links +
                ", servingNetworkName='" + servingNetworkName + '\'' +
                '}';
    }
}

