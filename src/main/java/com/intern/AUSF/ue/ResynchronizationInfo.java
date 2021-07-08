package com.intern.AUSF.ue;

import javax.persistence.Entity;
import javax.persistence.Table;

public class ResynchronizationInfo {

    private String rand;
    private String auths;

    public ResynchronizationInfo(String rand, String auths) {
        this.rand = rand;
        this.auths = auths;
    }

    public String getRand() {
        return rand;
    }

    public void setRand(String rand) {
        this.rand = rand;
    }

    public String getAuths() {
        return auths;
    }

    public void setAuths(String auths) {
        this.auths = auths;
    }

    @Override
    public String toString() {
        return "ResynchronizationInfo{" +
                "rand='" + rand + '\'' +
                ", auths='" + auths + '\'' +
                '}';
    }
}
