package com.srp.project.route.store.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.srp.framework.web.domain.BaseEntity;

/**
 * Store
 */
public class SfaStoreForConnection{

    private static final long serialVersionUID = 1L;

    private String storeCode;

    private Boolean storeStatus;

    private String sfaCode;

    private String storeName;

    private String storeAddress;

    private Double latitude;

    private Double longitude;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastVisitTime;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public Boolean getStoreStatus() {
        return storeStatus;
    }

    public void setStoreStatus(Boolean storeStatus) {
        this.storeStatus = storeStatus;
    }

    public String getSfaCode() {
        return sfaCode;
    }

    public void setSfaCode(String sfaCode) {
        this.sfaCode = sfaCode;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Date getLastVisitTime() {
        return lastVisitTime;
    }

    public void setLastVisitTime(Date lastVisitTime) {
        this.lastVisitTime = lastVisitTime;
    }

    
}