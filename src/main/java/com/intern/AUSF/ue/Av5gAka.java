package com.intern.AUSF.ue;

public class Av5gAka {

    private String rand;
    private String hxresStar;
    private String autn;

    public Av5gAka(String rand, String hxresStar, String autn) {
        this.rand = rand;
        this.hxresStar = hxresStar;
        this.autn = autn;
    }

    public String getRand() {
        return rand;
    }

    public void setRand(String rand) {
        this.rand = rand;
    }

    public String getHxresStar() {
        return hxresStar;
    }

    public void setHxresStar(String hxresStar) {
        this.hxresStar = hxresStar;
    }

    public String getAutn() {
        return autn;
    }

    public void setAutn(String autn) {
        this.autn = autn;
    }

    @Override
    public String toString() {
        return "Av5gAka{" +
                "rand='" + rand + '\'' +
                ", hxresStar='" + hxresStar + '\'' +
                ", autn='" + autn + '\'' +
                '}';
    }
}
