package com.intern.AUSF.ue;

public class AuthData {
    private Av5gAka av5gAka;
    private String EapPayload;

    public AuthData(Av5gAka av5gAka) {
        this.av5gAka = av5gAka;
    }

    public AuthData(String eapPayload) {
        EapPayload = eapPayload;
    }

    public Av5gAka getAv5gAka() {
        return av5gAka;
    }

    public void setAv5gAka(Av5gAka av5gAka) {
        this.av5gAka = av5gAka;
    }

    public String getEapPayload() {
        return EapPayload;
    }

    public void setEapPayload(String eapPayload) {
        EapPayload = eapPayload;
    }

    @Override
    public String toString() {
        return "AuthData{" +
                "av5gAka=" + av5gAka +
                ", EapPayload='" + EapPayload + '\'' +
                '}';
    }
}
