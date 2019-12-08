package com.srp.project.route.routeact.mapper;

import java.util.List;

import com.srp.project.route.routeact.entity.SfaRouteAct;
import com.srp.project.route.routeact.entity.SfaRouteActForUser;

/**
 * 实际拜访计划数据层
 */
public interface SfaRouteActMapper {

    /**
     * 通过组织架构获取某一时间段人员的拜访分布情况
     * @param routeact
     * @return
     */
    public List<SfaRouteActForUser> selectSfaRouteActForUserList(SfaRouteAct routeact);    

    /**
     * 通过组织架构人员获取人员某一时间段拜访门店分布情况
     * @param routeact
     * @return
     */
    public List<SfaRouteAct> selectSfaRouteActList(SfaRouteAct routeact);
}