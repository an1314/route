package com.srp.project.route.routecustomer.controller;

import com.srp.framework.web.controller.BaseController;
import com.srp.framework.web.domain.AjaxResult;
import com.srp.project.route.routecustomer.entity.SfaRouteCustomer;
import com.srp.project.route.routecustomer.service.SfaRouteCustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SfaRouteCustomerController
 */
@RestController
@RequestMapping("/route/routecustomer")
public class SfaRouteCustomerController extends BaseController {

    @Autowired
    private SfaRouteCustomerService sfaRouteCustomerService;

    @PostMapping("/stores")
    public AjaxResult selectSfaRouteCustomerList(@RequestBody SfaRouteCustomer routeCustomer){
        return AjaxResult.success(sfaRouteCustomerService.selectSfaRouteCustomerList(routeCustomer));
    }
    
}