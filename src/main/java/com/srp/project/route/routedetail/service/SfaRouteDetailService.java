package com.srp.project.route.routedetail.service;

import java.util.List;
import com.srp.project.route.routedetail.entity.SfaRouteDetail;

/**
 * SfaRouteDetailService
 */
public interface SfaRouteDetailService {

    /**
     * 获取某一周期内计划路线
     * @param routeDetail
     * @return
     */
    public List<SfaRouteDetail> selectSfaRouteDetailList(SfaRouteDetail routeDetail);
}