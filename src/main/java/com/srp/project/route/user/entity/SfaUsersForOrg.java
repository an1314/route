package com.srp.project.route.user.entity;

import com.srp.framework.aspectj.lang.annotation.Excel;

/**
 * SfaUsersForOrg
 */
public class SfaUsersForOrg {

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
    @Excel(name = "业代账号")
    private String userCode; // 业代账号
    @Excel(name = "业代姓名")
    private String userName;
    private String firstUserName;
    private String lastUserName;
    @Excel(name = "业代手机")
    private String tel; // 业代手机
    private String managerCode; // 主管账号
    @Excel(name = "主管姓名")
    private String managerUserName;
    private String managerFirstUserName;
    private String managerLastUserName;
    @Excel(name = "主管手机")
    private String managerTel; // 主管手机

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

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
 
    public String getUserName() {
        return (this.firstUserName == null ? "" : this.firstUserName)
                + (this.lastUserName == null ? "" : this.lastUserName);
    }

    public void setFirstUserName(String firstUserName) {
        this.firstUserName = firstUserName;
        this.userName = this.userName == null ? firstUserName : firstUserName + this.userName;
    }

    public void setLastUserName(String lastUserName) {
        this.lastUserName = lastUserName;
        this.userName = this.userName == null ? lastUserName : this.userName + lastUserName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getManagerCode() {
        return managerCode;
    }

    public void setManagerCode(String managerCode) {
        this.managerCode = managerCode;
    }

    public String getManagerUserName() {
        return (this.managerFirstUserName == null ? "" : this.managerFirstUserName)
                + (this.managerLastUserName == null ? "" : this.managerLastUserName);
    }

    public void setManagerFirstUserName(String managerFirstUserName) {
        this.managerFirstUserName = managerFirstUserName;
        this.managerUserName = this.managerUserName == null ? managerFirstUserName : managerFirstUserName + this.managerUserName;
    }

    public void setManagerLastUserName(String managerLastUserName) {
        this.managerLastUserName = managerLastUserName;
        this.managerUserName = this.managerUserName == null ? managerLastUserName : this.managerUserName + managerLastUserName;
    }

    public String getManagerTel() {
        return managerTel;
    }

    public void setManagerTel(String managerTel) {
        this.managerTel = managerTel;
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

}