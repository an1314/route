package com.srp.project.route.routecustomer.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.srp.project.route.routeact.entity.SfaRouteAct;
import com.srp.project.route.routeact.entity.SfaRouteActForUser;
import com.srp.project.route.routeact.service.SfaRouteActService;
import com.srp.project.route.routecustomer.entity.SfaRouteCustomer;
import com.srp.project.route.routecustomer.mapper.SfaRouteCustomerMapper;
import com.srp.project.route.routecustomer.service.SfaRouteCustomerService;
import com.srp.project.route.user.entity.SfaUsers;
import com.srp.project.route.user.entity.SfaUsersForDist;
import com.srp.project.route.user.service.SfaUsersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * SfaRouteCustomerServiceImpl
 */
@Service
public class SfaRouteCustomerServiceImpl implements SfaRouteCustomerService {

    @Autowired
    private SfaRouteCustomerMapper sfaRouteCustomerMapper;
    @Autowired
    private SfaUsersService sfaUsersservice;

     /**
     * 获取用户覆盖
     * @param routeCustomer 查询参数
     * @return 门店分布信息
     */
	@Override
	public List<SfaRouteCustomer> selectSfaRouteCustomerList(SfaRouteCustomer routeCustomer) {

        List<String> orgCodes = routeCustomer.getOrgCodes();
       
        // 如果用户code没传，获取当前组织架构下所有用户
        if(routeCustomer.getUserCodes() == null || routeCustomer.getUserCodes().size() == 0){
            SfaUsers sfaUsers = new SfaUsers();
            sfaUsers.setOrgCodes(orgCodes);
            List<SfaUsersForDist> susers = sfaUsersservice.selectSfaUsersDictList(sfaUsers);
            routeCustomer.setUserCodes(susers.stream().map(SfaUsersForDist::getValue).collect(Collectors.toList()));
        }
        
		return sfaRouteCustomerMapper.selectSfaRouteCustomerList(routeCustomer);
	}

    
    
    
}