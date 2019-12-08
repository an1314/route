package com.srp.project.route.routedetail.mapper;

import java.util.List;

import com.srp.project.route.routedetail.entity.SfaRouteDetail;

/**
 * SfaRouteDetailMapper
 */
public interface SfaRouteDetailMapper {

    /**
     * 获取某一周期内计划路线
     * @param routeDetail
     * @return
     */
    public List<SfaRouteDetail> selectSfaRouteDetailList(SfaRouteDetail routeDetail);
}