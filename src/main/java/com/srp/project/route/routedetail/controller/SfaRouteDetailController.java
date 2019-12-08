package com.srp.project.route.routedetail.controller;

import com.srp.framework.web.controller.BaseController;
import com.srp.framework.web.domain.AjaxResult;
import com.srp.project.route.routedetail.entity.SfaRouteDetail;
import com.srp.project.route.routedetail.service.SfaRouteDetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SfaRouteDetailController
 */
@RestController
@RequestMapping("/route/routedetail")
public class SfaRouteDetailController extends BaseController{

    @Autowired
    private SfaRouteDetailService sfaRouteDetailService;

     /**
     * 获取某一周期内计划路线
     * @param routeDetail
     * @return
     */
    @PostMapping("/list")
    public AjaxResult selectSfaRouteDetailList(@RequestBody SfaRouteDetail routeDetail){
        return AjaxResult.success(sfaRouteDetailService.selectSfaRouteDetailList(routeDetail));
    }

}