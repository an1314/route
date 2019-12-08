package com.srp.project.route.user.controller;

import com.srp.common.utils.poi.ExcelUtil;
import com.srp.framework.aspectj.lang.annotation.Log;
import com.srp.framework.aspectj.lang.enums.BusinessType;
import com.srp.framework.web.controller.BaseController;
import com.srp.framework.web.domain.AjaxResult;
import com.srp.framework.web.page.TableDataInfo;
import com.srp.project.route.user.entity.SfaUsers;
import com.srp.project.route.user.service.SfaUsersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.srp.project.route.user.entity.SfaUsersForDist;
import com.srp.project.route.user.entity.SfaUsersForOrg;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * SfaUsersController
 */
@RestController
@RequestMapping("/route/users")
public class SfaUsersController extends BaseController{

    @Autowired
    private SfaUsersService sfaUsersService;

    /**
     * 查询用户信息用于字典
     * @param sfaUsers
     * @return
     */
    @PostMapping("/userdist")
    public TableDataInfo selectSfaUsersDictList(@RequestBody SfaUsers sfaUsers){
        startPage();
        List<SfaUsersForDist> userList = sfaUsersService.selectSfaUsersDictList(sfaUsers);
        return getDataTable(userList);
    }

    @PostMapping("/userinfosum")
    public AjaxResult selectUsersInfoSum(@RequestBody SfaUsers sfaUsers){
        return AjaxResult.success(sfaUsersService.selectUsersInfoSum(sfaUsers));
    }


    @PostMapping("/noloaginuser")
    public TableDataInfo selectNoLoginUser(@RequestBody SfaUsers sfaUsers){
        startPage();
        return getDataTable(sfaUsersService.selectNoLoginUser(sfaUsers));
    }

    @Log(title = "未登录人员列表", businessType = BusinessType.EXPORT)
    @PostMapping("/noloaginuserexport")
    public AjaxResult selectNoLoginUserExport(@RequestBody SfaUsers sfaUsers)
    {
        List<SfaUsersForOrg> list = sfaUsersService.selectNoLoginUser(sfaUsers);
        ExcelUtil<SfaUsersForOrg> util = new ExcelUtil<SfaUsersForOrg>(SfaUsersForOrg.class);
        return util.exportExcel(list, "未登录人员列表");
    }
}