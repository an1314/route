package com.srp.project.route.organization.service;

import java.util.List;
import com.srp.project.route.organization.entity.MdOrganization;
import com.srp.framework.web.domain.TreeSelect;
/**
 * MdOrganizationService
 */
public interface MdOrganizationService {

     /**
     * 查询组织架构管理数据
     * 
     * @param dept 组织架构信息
     * @return 组织架构信息集合
     */
    public List<MdOrganization> selectOrganizationList(MdOrganization dept);

    /**
     * 构建前端所需要树结构
     * 
     * @param depts 组织架构列表
     * @return 树结构列表
     */
    public List<MdOrganization> buildOrganizationTree(List<MdOrganization> depts);

    /**
     * 构建前端所需要下拉树结构
     * 
     * @param depts 组织架构列表
     * @return 下拉树结构列表
     */
    public List<TreeSelect> buildOrganizationTreeSelect(List<MdOrganization> depts);
}