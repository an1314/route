package com.srp.project.route.routeact.service;

import java.util.List;

import com.srp.project.route.routeact.entity.SfaRouteAct;
import com.srp.project.route.routeact.entity.SfaRouteActForUser;

/**
 * 实际拜访逻辑层
 */
public interface SfaRouteActService {

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