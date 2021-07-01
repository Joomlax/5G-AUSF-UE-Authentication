package com.intern.AUSF.ue;

import java.util.ArrayList;

public class Auth {
    private String supiOrSuci; //Required
    private String servingNetworkName; //Required

    //ResynchronizationInfo
    private String rand; //req
    private String auts; //req
    //ResynchronizationInfo
    private String pei;

    //traceData
    private String traceRef; //req
    private String traceDepth; //req
    private String neTypeList; //req
    private String eventList; //req
    private String collectionEntityIpv4Addr;
    private String collectionEntityIpv6Addr;
    private String interfaceList;
    //traceData

    private String udmGroupId;
    private String routingIndicator;
    private ArrayList<String> cellCagInfo;
    private boolean n5gcInd;
    private String supportedFeatures;

    
}
