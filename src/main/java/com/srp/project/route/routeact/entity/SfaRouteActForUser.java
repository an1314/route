package com.srp.project.route.routeact.entity;

/**
 * 实际路线 以人员信息为主的返回模板
 */
public class SfaRouteActForUser {

    private String userCode;

    private String firstUserName;

    private String lastUserName;
    
    private String managerUserCode;

    private String managerFirstUserName;

    private String managerLastUserName;

    private Double lon;

    private Double lat;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName(){
        return (this.firstUserName == null ? "" : this.firstUserName) + (this.lastUserName  == null ? "" : this.lastUserName);
    }

    public void setFirstUserName(String firstUserName) {
        this.firstUserName = firstUserName;
    }


    public void setLastUserName(String lastUserName) {
        this.lastUserName = lastUserName;
    }

    public String getManagerUserCode() {
        return managerUserCode;
    }

    public void setManagerUserCode(String managerUserCode) {
        this.managerUserCode = managerUserCode;
    }

    public String getManagerUserName(){
        return (this.managerFirstUserName == null ? "" : this.managerFirstUserName) + (this.managerLastUserName  == null ? "" : this.managerLastUserName);
    }

    public void setManagerFirstUserName(String managerFirstUserName) {
        this.managerFirstUserName = managerFirstUserName;
    }

    public void setManagerLastUserName(String managerLastUserName) {
        this.managerLastUserName = managerLastUserName;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }
}