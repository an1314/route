package com.srp.project.route.user.entity;

/**
 * 用户的各种信息汇总
 */
public class SfaUsersInfoSum {

    // 用户总人数
    private Integer sfaNum;
    
    // 用户登录人数
    private Integer loginNum;

    // 用户拜访人数
    private Integer visitNum;

    public Integer getSfaNum() {
        return sfaNum;
    }

    public void setSfaNum(Integer sfaNum) {
        this.sfaNum = sfaNum;
    }

    public Integer getLoginNum() {
        return loginNum;
    }

    public void setLoginNum(Integer loginNum) {
        this.loginNum = loginNum;
    }

    public Integer getVisitNum() {
        return visitNum;
    }

    public void setVisitNum(Integer visitNum) {
        this.visitNum = visitNum;
    }

    
}