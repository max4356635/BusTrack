package com.bustrack.bustrack.entity;

/**
 * Created by Administrator on 2017/04/09 0009.
 */

public class BusObject {
    private String busId;

    private String shortName;

    private String departureStop;

    private String arriveTime;

    public BusObject(String busId,String shortName, String departureStop, String arriveTime){
        this.busId = busId;
        this.shortName = shortName;
        this.departureStop = departureStop;
        this.arriveTime = arriveTime;
    }

    public String getId(){return busId;}

    public String getShortName(){return shortName;}

    public String getDepartureStop(){return departureStop;}

    public String getArriveTime(){return arriveTime;}
}
