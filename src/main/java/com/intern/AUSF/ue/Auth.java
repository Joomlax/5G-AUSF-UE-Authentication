package com.intern.AUSF.ue;

import java.util.ArrayList;

public class Auth {
    private String supiOrSuci; //Required
    private String servingNetworkName; //Required

    private String pei;
    private String rand;
    private String auts;
    private String routingIndicator;
    private ArrayList<String> cellCagInfo;
    private boolean n5gcInd;
    private String supportedFeatures;

    //Constructors


    public Auth(String supiOrSuci, String servingNetworkName) {
        this.supiOrSuci = supiOrSuci;
        this.servingNetworkName = servingNetworkName;
    }

    public Auth(String supiOrSuci, String servingNetworkName, String pei) {
        this.supiOrSuci = supiOrSuci;
        this.servingNetworkName = servingNetworkName;
        this.pei = pei;
    }

    public Auth(String supiOrSuci, String servingNetworkName, String pei, String rand) {
        this.supiOrSuci = supiOrSuci;
        this.servingNetworkName = servingNetworkName;
        this.pei = pei;
        this.rand = rand;
    }

    public Auth(String supiOrSuci, String servingNetworkName, String pei, String rand, String auts) {
        this.supiOrSuci = supiOrSuci;
        this.servingNetworkName = servingNetworkName;
        this.pei = pei;
        this.rand = rand;
        this.auts = auts;
    }

    public Auth(String supiOrSuci, String servingNetworkName, String pei, String rand, String auts, String routingIndicator) {
        this.supiOrSuci = supiOrSuci;
        this.servingNetworkName = servingNetworkName;
        this.pei = pei;
        this.rand = rand;
        this.auts = auts;
        this.routingIndicator = routingIndicator;
    }

    public Auth(String supiOrSuci, String servingNetworkName, String pei, String rand, String auts, String routingIndicator, ArrayList<String> cellCagInfo) {
        this.supiOrSuci = supiOrSuci;
        this.servingNetworkName = servingNetworkName;
        this.pei = pei;
        this.rand = rand;
        this.auts = auts;
        this.routingIndicator = routingIndicator;
        this.cellCagInfo = cellCagInfo;
    }

    public Auth(String supiOrSuci, String servingNetworkName, String pei, String rand, String auts, String routingIndicator, ArrayList<String> cellCagInfo, boolean n5gcInd) {
        this.supiOrSuci = supiOrSuci;
        this.servingNetworkName = servingNetworkName;
        this.pei = pei;
        this.rand = rand;
        this.auts = auts;
        this.routingIndicator = routingIndicator;
        this.cellCagInfo = cellCagInfo;
        this.n5gcInd = n5gcInd;
    }

    public Auth(String supiOrSuci, String servingNetworkName, String pei, String rand, String auts, String routingIndicator, ArrayList<String> cellCagInfo, boolean n5gcInd, String supportedFeatures) {
        this.supiOrSuci = supiOrSuci;
        this.servingNetworkName = servingNetworkName;
        this.pei = pei;
        this.rand = rand;
        this.auts = auts;
        this.routingIndicator = routingIndicator;
        this.cellCagInfo = cellCagInfo;
        this.n5gcInd = n5gcInd;
        this.supportedFeatures = supportedFeatures;
    }

    //Created all constructors
}
