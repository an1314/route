package com.srp.project.route.organization.mapper;
import java.util.List;
import com.srp.project.route.organization.entity.MdOrganization;

/**
 * 组织架构 数据层
 */
public interface MdOrganizationMapper {

     /**
     * 查询组织架构数据
     * 
     * @param organization 组织架构信息
     * @return 组织架构信息集合
     */
    public List<MdOrganization> selectMdOrganizationList(MdOrganization organization);
    
}