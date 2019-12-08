package com.srp.project.route.routeact.service.impl;

import java.util.List;

import com.srp.project.route.routeact.entity.SfaRouteAct;
import com.srp.project.route.routeact.entity.SfaRouteActForUser;
import com.srp.project.route.routeact.mapper.SfaRouteActMapper;
import com.srp.project.route.routeact.service.SfaRouteActService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 拜访计划逻辑的具体实现
 */
@Service
public class SfaRouteActServiceImpl implements SfaRouteActService {

    @Autowired
    private SfaRouteActMapper sfaRouteActMapper;

    /**
     * 通过组织架构获取某一时间段人员的拜访分布情况
     */
    @Override
    public List<SfaRouteActForUser> selectSfaRouteActForUserList(SfaRouteAct routeact) {
        
        return sfaRouteActMapper.selectSfaRouteActForUserList(routeact);
    }


    /**
     * 通过组织架构人员获取人员某一时间段拜访门店分布情况
     * @param routeact
     * @return
     */
    @Override
    public List<SfaRouteAct> selectSfaRouteActList(SfaRouteAct routeact){
        return sfaRouteActMapper.selectSfaRouteActList(routeact);
    }

    
}