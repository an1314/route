package com.srp.project.route.user.service.impl;

import java.util.List;

import com.srp.project.route.user.entity.SfaUsers;
import com.srp.project.route.user.entity.SfaUsersForDist;
import com.srp.project.route.user.entity.SfaUsersInfoSum;
import com.srp.project.route.user.mapper.SfaUsersMapper;
import com.srp.project.route.user.service.SfaUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.srp.project.route.user.entity.SfaUsersForOrg;

/**
 * SfaUsersService
 */
@Service
public class SfaUsersServiceImpl implements SfaUsersService {

    @Autowired
    private SfaUsersMapper sfaUsersMapper;

    /**
     * 查询人员数据用于字典
     */
    @Override
    public List<SfaUsersForDist> selectSfaUsersDictList(SfaUsers sfauser) {
        return sfaUsersMapper.selectSfaUsersDictList(sfauser);
    }

    /**
     * 查询用户各项信息汇总
     */
    @Override
    public SfaUsersInfoSum selectUsersInfoSum(SfaUsers sfaUsers) {

        return sfaUsersMapper.selectUsersInfoSum(sfaUsers);
    }


     /**
     * 查询未登录人员
     * @param sfaUsers
     * @return
     */
    @Override
    public List<SfaUsersForOrg> selectNoLoginUser(SfaUsers sfaUsers){
        return sfaUsersMapper.selectNoLoginUser(sfaUsers);
    }
    
}