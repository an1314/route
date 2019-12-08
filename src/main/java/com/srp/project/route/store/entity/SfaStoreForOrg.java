package com.srp.project.route.store.entity;

import com.srp.framework.web.domain.BaseEntity;
import com.srp.framework.aspectj.lang.annotation.Excel;

/**
 * Store
 */
public class SfaStoreForOrg extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Excel(name = "大区群")
    private String largeRegionGroup; // 大区群
    private String largeRegionGroupCode;
    @Excel(name = "大区")
    private String largeRegion; // 大区
    private String largeRegionCode;
    @Excel(name = "小区")
    private String smallRegion; // 小区
    private String smallRegionCode;
    @Excel(name = "单元")
    private String unit; // 单元
    private String unitCode;
    @Excel(name = "DOM")
    private String dom; // DOM
    private String domCode;
    @Excel(name = "DSS")
    private String dss; // DSS
    private String dssCode;

    @Excel(name = "门店编号")
    private String storeCode;
    @Excel(name = "门店名称")
    private String storeName;
    @Excel(name = "SFACODE")
    private String sfaCode;
    @Excel(name = "门店状态", readConverterExp = "true=有效,false=无效")
    private Boolean storeStatus;
    @Excel(name = "门店类型")
    private String storeType;
   
    @Excel(name = "门店地址")
    private String storeAddress;
    @Excel(name = "经度")
    private Double longitude;
    @Excel(name = "纬度")
    private Double latitude;
    

    private String orgCode;

    

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

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getLargeRegionGroup() {
        return largeRegionGroup;
    }

    public void setLargeRegionGroup(String largeRegionGroup) {
        this.largeRegionGroup = largeRegionGroup;
    }

    public String getLargeRegionGroupCode() {
        return largeRegionGroupCode;
    }

    public void setLargeRegionGroupCode(String largeRegionGroupCode) {
        this.largeRegionGroupCode = largeRegionGroupCode;
    }

    public String getLargeRegion() {
        return largeRegion;
    }

    public void setLargeRegion(String largeRegion) {
        this.largeRegion = largeRegion;
    }

    public String getLargeRegionCode() {
        return largeRegionCode;
    }

    public void setLargeRegionCode(String largeRegionCode) {
        this.largeRegionCode = largeRegionCode;
    }

    public String getSmallRegion() {
        return smallRegion;
    }

    public void setSmallRegion(String smallRegion) {
        this.smallRegion = smallRegion;
    }

    public String getSmallRegionCode() {
        return smallRegionCode;
    }

    public void setSmallRegionCode(String smallRegionCode) {
        this.smallRegionCode = smallRegionCode;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getDom() {
        return dom;
    }

    public void setDom(String dom) {
        this.dom = dom;
    }

    public String getDomCode() {
        return domCode;
    }

    public void setDomCode(String domCode) {
        this.domCode = domCode;
    }

    public String getDss() {
        return dss;
    }

    public void setDss(String dss) {
        this.dss = dss;
    }

    public String getDssCode() {
        return dssCode;
    }

    public void setDssCode(String dssCode) {
        this.dssCode = dssCode;
    }
    
    // 处理org字符串
    public void setOrgs(String orgs) {
        String[] orglist = orgs.split(",", -1);
        String orgLevel = orglist[0];
        String orgType = orglist[1];
        if ("4".equals(orgLevel)) {
            if ("0".equals(orgType)) {
                setUnitCode(orglist[2]);
                setUnit(orglist[3]);
            } else if ("1".equals(orgType)) {
                setDomCode(orglist[2]);
                setDom(orglist[3]);
            }

            setSmallRegionCode(orglist[4]);
            setSmallRegion(orglist[5]);
            setLargeRegionCode(orglist[6]);
            setLargeRegion(orglist[7]);
            setLargeRegionGroupCode(orglist[8]);
            setLargeRegionGroup(orglist[9]);
        } else if ("5".equals(orgLevel)) {
            setDssCode(orglist[2]);
            setDss(orglist[3]);
            setDomCode(orglist[4]);
            setDom(orglist[5]);
            setSmallRegionCode(orglist[6]);
            setSmallRegion(orglist[7]);
            setLargeRegionCode(orglist[8]);
            setLargeRegion(orglist[9]);
            setLargeRegionGroupCode(orglist[10]);
            setLargeRegionGroup(orglist[11]);
        }
    }

    public String getStoreType() {
        return storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

}
