package com.srp.project.route.routeact.entity;

import com.srp.framework.web.domain.BaseEntity;
import com.srp.project.route.store.entity.SfaStoreForConnection;

import java.util.Date;
import java.util.List;

/**
 * SfaRouteAct
 */
public class SfaRouteAct extends BaseEntity{

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String userCode;

    private String firstUserName;

    private String lastUserName;

    private String storeCode;

    private String storeName;

    private Date date;

    private String visitType;

    private Boolean valid;

    private Integer orgId;

    private Double lon;

    private Double lat;

    private Date outStoreTime;

    private Date inStoreTime;

    private List<String> orgCodes;

    private List<String> userCodes;

    private List<SfaStoreForConnection> stores;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }


    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getVisitType() {
        return visitType;
    }

    public void setVisitType(String visitType) {
        this.visitType = visitType;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
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

    public Date getOutStoreTime() {
        return outStoreTime;
    }

    public void setOutStoreTime(Date outStoreTime) {
        this.outStoreTime = outStoreTime;
    }

    public Date getInStoreTime() {
        return inStoreTime;
    }

    public void setInStoreTime(Date inStoreTime) {
        this.inStoreTime = inStoreTime;
    }

    public List<String> getOrgCodes() {
        return orgCodes;
    }

    public void setOrgCodes(List<String> orgCodes) {
        this.orgCodes = orgCodes;
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

    public List<String> getUserCodes() {
        return userCodes;
    }

    public void setUserCodes(List<String> userCodes) {
        this.userCodes = userCodes;
    }

    public List<SfaStoreForConnection> getStores() {
        return stores;
    }

    public void setStores(List<SfaStoreForConnection> stores) {
        this.stores = stores;
    }

    
}