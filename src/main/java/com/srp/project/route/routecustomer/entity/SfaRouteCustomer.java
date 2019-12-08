package com.srp.project.route.routecustomer.entity;
import java.util.List;

import com.srp.project.route.store.entity.SfaStoreForConnection;


/**
 * SfaRouteCustomer
 */
public class SfaRouteCustomer {

    private String userCode;

    private String userFirstName;

    private String userLastName;

    private String storeCode;

    private List<SfaStoreForConnection> stores;

    private List<String> orgCodes;

    private List<String> userCodes;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName(){
        return (this.userFirstName == null ? "" : this.userFirstName) + (this.userLastName  == null ? "" : this.userLastName);
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public List<SfaStoreForConnection> getStores() {
        return stores;
    }

    public void setStores(List<SfaStoreForConnection> stores) {
        this.stores = stores;
    }

    public List<String> getOrgCodes() {
        return orgCodes;
    }

    public void setOrgCodes(List<String> orgCodes) {
        this.orgCodes = orgCodes;
    }

    public List<String> getUserCodes() {
        return userCodes;
    }

    public void setUserCodes(List<String> userCodes) {
        this.userCodes = userCodes;
    }

    
}