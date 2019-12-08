package com.srp.project.route.routeact.controller;

import com.srp.framework.web.controller.BaseController;
import com.srp.framework.web.domain.AjaxResult;
import com.srp.framework.web.page.TableDataInfo;
import com.srp.project.route.routeact.entity.SfaRouteAct;
import com.srp.project.route.routeact.service.SfaRouteActService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 实际拜访接口
 */
@RestController
@RequestMapping("/route/routeact")
public class SfaRouteActController extends BaseController{

    @Autowired
    private SfaRouteActService sfaRouteActService;

    @PostMapping("/listForUser")
    public TableDataInfo selectSfaRouteActForUserList(@RequestBody SfaRouteAct routeact){
        startPage();
        return getDataTable(sfaRouteActService.selectSfaRouteActForUserList(routeact));
    }

    /**
     * 通过组织架构人员获取人员某一时间段拜访门店分布情况
     * @param routeact
     * @return
     */
    @PostMapping("/list")
    public AjaxResult selectSfaRouteActList(@RequestBody SfaRouteAct routeact){
        return AjaxResult.success(sfaRouteActService.selectSfaRouteActList(routeact));
    }
}