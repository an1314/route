package com.srp.project.route.routedetail.entity;

import com.srp.framework.web.controller.BaseController;
import com.srp.framework.web.domain.BaseEntity;

import java.util.Date;
import java.util.List;
import com.srp.project.route.store.entity.SfaStoreForConnection;
/**
 * SfaRouteDetail
 */
public class SfaRouteDetail extends BaseEntity{

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String userCode;

    private String firstUserName;

    private String lastUserName;

    private Date date;

    private Integer sequence;

    private String valid;

    private List<SfaStoreForConnection> stores;

    private List<String> orgCodes;

    private List<String> userCodes;

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

    public String getUserName(){
        return (this.firstUserName == null ? "" : this.firstUserName) + (this.lastUserName  == null ? "" : this.lastUserName);
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
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

    public void setFirstUserName(String firstUserName) {
        this.firstUserName = firstUserName;
    }

    public void setLastUserName(String lastUserName) {
        this.lastUserName = lastUserName;
    }

    
}