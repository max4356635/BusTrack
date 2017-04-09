package com.bustrack.bustrack.entity;

import java.util.List;

/**
 * Created by Administrator on 2017/04/09 0009.
 */

public class DatabaseStopObject {
    private int _id;

    private String stopId;

    private List<String> routeShortNames;


    public DatabaseStopObject(int _id, String stopId, List<String> routeShortNames) {
        this._id = _id;
        this.stopId = stopId;
        this.routeShortNames = routeShortNames;
    }

    public int get_Id(){return _id;}

    public void set_Id(int _id) {
        this._id = _id;
    }

    public String getStopId(){return stopId;}

    public void setStopId(String stopId) {
        this.stopId = stopId;
    }

    public List<String> getRouteShortNames(){return routeShortNames;}

    public void setRouteShortNames(List<String> routeShortNames) {
        this.routeShortNames = routeShortNames;
    }

}
