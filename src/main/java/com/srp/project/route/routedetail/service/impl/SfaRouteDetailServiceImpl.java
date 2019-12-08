package com.srp.project.route.routedetail.service.impl;

import java.util.List;

import com.srp.project.route.routedetail.entity.SfaRouteDetail;
import com.srp.project.route.routedetail.mapper.SfaRouteDetailMapper;
import com.srp.project.route.routedetail.service.SfaRouteDetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * SfaRouteDetailServiceImpl
 */
@Service
public class SfaRouteDetailServiceImpl implements SfaRouteDetailService {

    @Autowired
    private SfaRouteDetailMapper sfaRouteDetailMapper;
    /**
     * 获取某一周期内计划路线
     * @param routeDetail
     * @return
     */
    @Override
    public List<SfaRouteDetail> selectSfaRouteDetailList(SfaRouteDetail routeDetail) {
        return sfaRouteDetailMapper.selectSfaRouteDetailList(routeDetail);
    }

    
}