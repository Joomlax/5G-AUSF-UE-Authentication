package com.intern.AUSF.ue;

public class TraceData {
    private String traceRef; //Req
    private String traceDepth; //Req
    private String neTypeList; //Req
    private String eventList; //Req

    private String collectionEntityIpv4Addr;
    private String collectionEntityIpv6Addr;
    private String interfaceList;


    public TraceData(String traceRef, String traceDepth, String neTypeList, String eventList) {
        this.traceRef = traceRef;
        this.traceDepth = traceDepth;
        this.neTypeList = neTypeList;
        this.eventList = eventList;
    }

    public TraceData(String traceRef, String traceDepth, String neTypeList, String eventList, String collectionEntityIpv4Addr) {
        this.traceRef = traceRef;
        this.traceDepth = traceDepth;
        this.neTypeList = neTypeList;
        this.eventList = eventList;
        this.collectionEntityIpv4Addr = collectionEntityIpv4Addr;
    }

    public TraceData(String traceRef, String traceDepth, String neTypeList, String eventList, String collectionEntityIpv4Addr, String collectionEntityIpv6Addr) {
        this.traceRef = traceRef;
        this.traceDepth = traceDepth;
        this.neTypeList = neTypeList;
        this.eventList = eventList;
        this.collectionEntityIpv4Addr = collectionEntityIpv4Addr;
        this.collectionEntityIpv6Addr = collectionEntityIpv6Addr;
    }

    public TraceData(String traceRef, String traceDepth, String neTypeList, String eventList, String collectionEntityIpv4Addr, String collectionEntityIpv6Addr, String interfaceList) {
        this.traceRef = traceRef;
        this.traceDepth = traceDepth;
        this.neTypeList = neTypeList;
        this.eventList = eventList;
        this.collectionEntityIpv4Addr = collectionEntityIpv4Addr;
        this.collectionEntityIpv6Addr = collectionEntityIpv6Addr;
        this.interfaceList = interfaceList;
    }

    //Getters & Setters Start Point
    public String getTraceRef() {
        return traceRef;
    }

    public void setTraceRef(String traceRef) {
        this.traceRef = traceRef;
    }

    public String getTraceDepth() {
        return traceDepth;
    }

    public void setTraceDepth(String traceDepth) {
        this.traceDepth = traceDepth;
    }

    public String getNeTypeList() {
        return neTypeList;
    }

    public void setNeTypeList(String neTypeList) {
        this.neTypeList = neTypeList;
    }

    public String getEventList() {
        return eventList;
    }

    public void setEventList(String eventList) {
        this.eventList = eventList;
    }

    public String getCollectionEntityIpv4Addr() {
        return collectionEntityIpv4Addr;
    }

    public void setCollectionEntityIpv4Addr(String collectionEntityIpv4Addr) {
        this.collectionEntityIpv4Addr = collectionEntityIpv4Addr;
    }

    public String getCollectionEntityIpv6Addr() {
        return collectionEntityIpv6Addr;
    }

    public void setCollectionEntityIpv6Addr(String collectionEntityIpv6Addr) {
        this.collectionEntityIpv6Addr = collectionEntityIpv6Addr;
    }

    public String getInterfaceList() {
        return interfaceList;
    }

    public void setInterfaceList(String interfaceList) {
        this.interfaceList = interfaceList;
    }

    @Override
    public String toString() {
        return "TraceData{" +
                "traceRef='" + traceRef + '\'' +
                ", traceDepth='" + traceDepth + '\'' +
                ", neTypeList='" + neTypeList + '\'' +
                ", eventList='" + eventList + '\'' +
                ", collectionEntityIpv4Addr='" + collectionEntityIpv4Addr + '\'' +
                ", collectionEntityIpv6Addr='" + collectionEntityIpv6Addr + '\'' +
                ", interfaceList='" + interfaceList + '\'' +
                '}';
    }
}
