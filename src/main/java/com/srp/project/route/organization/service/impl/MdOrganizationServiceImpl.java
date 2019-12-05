package com.srp.project.route.organization.service.impl;

import com.srp.project.route.organization.service.MdOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.srp.project.route.organization.entity.MdOrganization;
import com.srp.project.route.organization.mapper.MdOrganizationMapper;
import java.util.ArrayList;
import java.util.Iterator;
import com.srp.framework.web.domain.TreeSelect;
import java.util.stream.Collectors;
/**
 * MdOrganizationServiceImpl
 */
@Service
public class MdOrganizationServiceImpl implements MdOrganizationService{

    @Autowired
    private MdOrganizationMapper organizationMapper;

    /**
     * 查询部门管理数据
     * 
     * @param organization 部门信息
     * @return 部门信息集合
     */
    @Override
    public List<MdOrganization> selectOrganizationList(MdOrganization organization)
    {
        return organizationMapper.selectMdOrganizationList(organization);
    }

    /**
     * 构建前端所需要树结构
     * 
     * @param organizations 部门列表
     * @return 树结构列表
     */
    @Override
    public List<MdOrganization> buildOrganizationTree(List<MdOrganization> organizations)
    {
        List<MdOrganization> returnList = new ArrayList<MdOrganization>();
        for (Iterator<MdOrganization> iterator = organizations.iterator(); iterator.hasNext();)
        {
            MdOrganization t = (MdOrganization) iterator.next();
            // 根据传入的某个父节点ID,遍历该父节点的所有子节点
            if (t.getParent().equals("0"))
            {
                recursionFn(organizations, t);
                returnList.add(t);
            }
        }
        if (returnList.isEmpty())
        {
            returnList = organizations;
        }
        return returnList;
    }

    /**
     * 构建前端所需要下拉树结构
     * 
     * @param organizations 部门列表
     * @return 下拉树结构列表
     */
    @Override
    public List<TreeSelect> buildOrganizationTreeSelect(List<MdOrganization> organizations)
    {
        List<MdOrganization> organizationTrees = buildOrganizationTree(organizations);
        return organizationTrees.stream().map(TreeSelect::new).collect(Collectors.toList());
    }
    /**
     * 递归列表
     */
    private void recursionFn(List<MdOrganization> list, MdOrganization t)
    {
        // 得到子节点列表
        List<MdOrganization> childList = getChildList(list, t);
        t.setChildren(childList);
        for (MdOrganization tChild : childList)
        {
            if (hasChild(list, tChild))
            {
                // 判断是否有子节点
                Iterator<MdOrganization> it = childList.iterator();
                while (it.hasNext())
                {
                    MdOrganization n = (MdOrganization) it.next();
                    recursionFn(list, n);
                }
            }
        }
    }

    /**
     * 得到子节点列表
     */
    private List<MdOrganization> getChildList(List<MdOrganization> list, MdOrganization t)
    {
        List<MdOrganization> tlist = new ArrayList<MdOrganization>();
        Iterator<MdOrganization> it = list.iterator();
        while (it.hasNext())
        {
            MdOrganization n = (MdOrganization) it.next();
            if ( t.getOrgId().equals(n.getParent()))
            {
                tlist.add(n);
            }
        }
        return tlist;
    }

    /**
     * 判断是否有子节点
     */
    private boolean hasChild(List<MdOrganization> list, MdOrganization t)
    {
        return getChildList(list, t).size() > 0 ? true : false;
    }
}