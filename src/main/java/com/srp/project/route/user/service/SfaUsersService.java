package com.srp.project.route.user.service;

import com.srp.project.route.user.entity.SfaUsersForDist;
import com.srp.project.route.user.entity.SfaUsersInfoSum;

import java.util.List;
import com.srp.project.route.user.entity.SfaUsers;
import com.srp.project.route.user.entity.SfaUsersForOrg;

/**
 * SfaUsersService
 */
public interface SfaUsersService {

    /**
     * 获取人员数据作为字典
     * @param sfauser
     * @return
     */
    public List<SfaUsersForDist> selectSfaUsersDictList(SfaUsers sfauser);

    /**
     * 获取用户的各种信息汇总
     * @param sfaUsers 
     * @return 
     */
    public SfaUsersInfoSum selectUsersInfoSum(SfaUsers sfaUsers);


     /**
     * 查询未登录人员
     * @param sfaUsers
     * @return
     */
    public List<SfaUsersForOrg> selectNoLoginUser(SfaUsers sfaUsers);
}