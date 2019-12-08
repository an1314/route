package com.srp.project.route.routecustomer.mapper;

import java.util.List;
import com.srp.project.route.routecustomer.entity.SfaRouteCustomer;
/**
 * SfaRouteCustomerMapper
 */
public interface SfaRouteCustomerMapper {

    /**
     * 获取用户覆盖
     * @param routeCustomer 查询参数
     * @return 门店分布信息
     */
    public List<SfaRouteCustomer> selectSfaRouteCustomerList(SfaRouteCustomer routeCustomer);
}