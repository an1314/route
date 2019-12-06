package com.srp.project.route.organization.controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.srp.framework.web.controller.BaseController;
import com.srp.project.route.organization.service.MdOrganizationService;
import java.util.List;
import com.srp.framework.web.domain.AjaxResult;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srp.project.route.organization.entity.MdOrganization;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * MdOrgnazationController
 */
@RestController
@RequestMapping("/route/organization")
public class MdOrgnazationController extends BaseController{

    @Autowired
    private MdOrganizationService mdOrganizationService;

    /**
     * 获取部门列表
     */
    @PreAuthorize("@ss.hasPermi('system:dept:list')")
    @GetMapping("/list")
    public AjaxResult list(MdOrganization mdOrganization)
    {
        List<MdOrganization> mdOrganizations = mdOrganizationService.selectOrganizationList(mdOrganization);
        return AjaxResult.success(mdOrganizations);
    }


    /**
     * 获取部门下拉树列表
     */
    @GetMapping("/treeselect")
    public AjaxResult treeselect(MdOrganization mdOrganization)
    {
        List<MdOrganization> mdOrganizations = mdOrganizationService.selectOrganizationList(mdOrganization);
        List orgs= mdOrganizationService.buildOrganizationTreeSelect(mdOrganizations);
        return AjaxResult.success(orgs);
    }

    
}