package com.intern.AUSF.ue;


import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class Auth {
    private String supiOrSuci; //Required
    private String servingNetworkName; //Required

    private ResynchronizationInfo resynchronizationInfo;

    private String pei;
    private String udmGroupId;
    private String routingIndicator;
    private ArrayList<String> cellCagInfo;
    private boolean n5gcInd;
    private String supportedFeatures;

    public Auth() {
    }

    public Auth(String supiOrSuci, String servingNetworkName) {
        this.supiOrSuci = supiOrSuci;
        this.servingNetworkName = servingNetworkName;
    }

    public Auth(String supiOrSuci, String servingNetworkName, ResynchronizationInfo resynchronizationInfo) {
        this.supiOrSuci = supiOrSuci;
        this.servingNetworkName = servingNetworkName;
        this.resynchronizationInfo = resynchronizationInfo;
    }

    public Auth(String supiOrSuci, String servingNetworkName, ResynchronizationInfo resynchronizationInfo, String pei) {
        this.supiOrSuci = supiOrSuci;
        this.servingNetworkName = servingNetworkName;
        this.resynchronizationInfo = resynchronizationInfo;
        this.pei = pei;
    }

    public Auth(String supiOrSuci, String servingNetworkName, ResynchronizationInfo resynchronizationInfo, String pei, String udmGroupId) {
        this.supiOrSuci = supiOrSuci;
        this.servingNetworkName = servingNetworkName;
        this.resynchronizationInfo = resynchronizationInfo;
        this.pei = pei;
        this.udmGroupId = udmGroupId;
    }

    public Auth(String supiOrSuci, String servingNetworkName, ResynchronizationInfo resynchronizationInfo, String pei, String udmGroupId, String routingIndicator) {
        this.supiOrSuci = supiOrSuci;
        this.servingNetworkName = servingNetworkName;
        this.resynchronizationInfo = resynchronizationInfo;
        this.pei = pei;
        this.udmGroupId = udmGroupId;
        this.routingIndicator = routingIndicator;
    }

    public Auth(String supiOrSuci, String servingNetworkName, ResynchronizationInfo resynchronizationInfo, String pei, String udmGroupId, String routingIndicator, ArrayList<String> cellCagInfo) {
        this.supiOrSuci = supiOrSuci;
        this.servingNetworkName = servingNetworkName;
        this.resynchronizationInfo = resynchronizationInfo;
        this.pei = pei;
        this.udmGroupId = udmGroupId;
        this.routingIndicator = routingIndicator;
        this.cellCagInfo = cellCagInfo;
    }

    public Auth(String supiOrSuci, String servingNetworkName, ResynchronizationInfo resynchronizationInfo, String pei, String udmGroupId, String routingIndicator, ArrayList<String> cellCagInfo, boolean n5gcInd) {
        this.supiOrSuci = supiOrSuci;
        this.servingNetworkName = servingNetworkName;
        this.resynchronizationInfo = resynchronizationInfo;
        this.pei = pei;
        this.udmGroupId = udmGroupId;
        this.routingIndicator = routingIndicator;
        this.cellCagInfo = cellCagInfo;
        this.n5gcInd = n5gcInd;
    }

    public Auth(String supiOrSuci, String servingNetworkName, ResynchronizationInfo resynchronizationInfo, String pei, String udmGroupId, String routingIndicator, ArrayList<String> cellCagInfo, boolean n5gcInd, String supportedFeatures) {
        this.supiOrSuci = supiOrSuci;
        this.servingNetworkName = servingNetworkName;
        this.resynchronizationInfo = resynchronizationInfo;
        this.pei = pei;
        this.udmGroupId = udmGroupId;
        this.routingIndicator = routingIndicator;
        this.cellCagInfo = cellCagInfo;
        this.n5gcInd = n5gcInd;
        this.supportedFeatures = supportedFeatures;
    }

    public Auth(String supiOrSuci, String servingNetworkName, String pei) {
        this.supiOrSuci = supiOrSuci;
        this.servingNetworkName = servingNetworkName;
        this.pei = pei;
    }

    public Auth(String supiOrSuci, String servingNetworkName, String pei, String udmGroupId) {
        this.supiOrSuci = supiOrSuci;
        this.servingNetworkName = servingNetworkName;
        this.pei = pei;
        this.udmGroupId = udmGroupId;
    }

    public Auth(String supiOrSuci, String servingNetworkName, String pei, String udmGroupId, String routingIndicator) {
        this.supiOrSuci = supiOrSuci;
        this.servingNetworkName = servingNetworkName;
        this.pei = pei;
        this.udmGroupId = udmGroupId;
        this.routingIndicator = routingIndicator;
    }

    public Auth(String supiOrSuci, String servingNetworkName, String pei, String udmGroupId, String routingIndicator, ArrayList<String> cellCagInfo) {
        this.supiOrSuci = supiOrSuci;
        this.servingNetworkName = servingNetworkName;
        this.pei = pei;
        this.udmGroupId = udmGroupId;
        this.routingIndicator = routingIndicator;
        this.cellCagInfo = cellCagInfo;
    }

    public Auth(String supiOrSuci, String servingNetworkName, String pei, String udmGroupId, String routingIndicator, ArrayList<String> cellCagInfo, boolean n5gcInd) {
        this.supiOrSuci = supiOrSuci;
        this.servingNetworkName = servingNetworkName;
        this.pei = pei;
        this.udmGroupId = udmGroupId;
        this.routingIndicator = routingIndicator;
        this.cellCagInfo = cellCagInfo;
        this.n5gcInd = n5gcInd;
    }

    public Auth(String supiOrSuci, String servingNetworkName, String pei, String udmGroupId, String routingIndicator, ArrayList<String> cellCagInfo, boolean n5gcInd, String supportedFeatures) {
        this.supiOrSuci = supiOrSuci;
        this.servingNetworkName = servingNetworkName;
        this.pei = pei;
        this.udmGroupId = udmGroupId;
        this.routingIndicator = routingIndicator;
        this.cellCagInfo = cellCagInfo;
        this.n5gcInd = n5gcInd;
        this.supportedFeatures = supportedFeatures;
    }

    //Getters & Setters Start Point


    public ResynchronizationInfo getResynchronizationInfo() {
        return resynchronizationInfo;
    }

    public void setResynchronizationInfo(ResynchronizationInfo resynchronizationInfo) {
        this.resynchronizationInfo = resynchronizationInfo;
    }

    public String getSupiOrSuci() {
        return supiOrSuci;
    }

    public void setSupiOrSuci(String supiOrSuci) {
        this.supiOrSuci = supiOrSuci;
    }

    public String getServingNetworkName() {
        return servingNetworkName;
    }

    public void setServingNetworkName(String servingNetworkName) {
        this.servingNetworkName = servingNetworkName;
    }

    public String getPei() {
        return pei;
    }

    public void setPei(String pei) {
        this.pei = pei;
    }

    public String getUdmGroupId() {
        return udmGroupId;
    }

    public void setUdmGroupId(String udmGroupId) {
        this.udmGroupId = udmGroupId;
    }

    public String getRoutingIndicator() {
        return routingIndicator;
    }

    public void setRoutingIndicator(String routingIndicator) {
        this.routingIndicator = routingIndicator;
    }

    public ArrayList<String> getCellCagInfo() {
        return cellCagInfo;
    }

    public void setCellCagInfo(ArrayList<String> cellCagInfo) {
        this.cellCagInfo = cellCagInfo;
    }

    public boolean isN5gcInd() {
        return n5gcInd;
    }

    public void setN5gcInd(boolean n5gcInd) {
        this.n5gcInd = n5gcInd;
    }

    public String getSupportedFeatures() {
        return supportedFeatures;
    }

    public void setSupportedFeatures(String supportedFeatures) {
        this.supportedFeatures = supportedFeatures;
    }

    @Override
    public String toString() {
        return "Auth{" +
                "supiOrSuci='" + supiOrSuci + '\'' +
                ", servingNetworkName='" + servingNetworkName + '\'' +
                ", resynchronizationInfo=" + resynchronizationInfo +
                ", pei='" + pei + '\'' +
                ", udmGroupId='" + udmGroupId + '\'' +
                ", routingIndicator='" + routingIndicator + '\'' +
                ", cellCagInfo=" + cellCagInfo +
                ", n5gcInd=" + n5gcInd +
                ", supportedFeatures='" + supportedFeatures + '\'' +
                '}';
    }
}
