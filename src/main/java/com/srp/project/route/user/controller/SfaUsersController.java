package com.srp.project.route.user.controller;

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

    @PostMapping("/userdist")
    public TableDataInfo selectSfaUsersDictList(@RequestBody SfaUsers sfaUsers){
        startPage();
        List<SfaUsersForDist> userList = sfaUsersService.selectSfaUsersDictList(sfaUsers);
        return getDataTable(userList);
    }
}