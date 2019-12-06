package com.srp.project.route.user.service.impl;

import java.util.List;

import com.srp.project.route.user.entity.SfaUsers;
import com.srp.project.route.user.entity.SfaUsersForDist;
import com.srp.project.route.user.mapper.SfaUsersMapper;
import com.srp.project.route.user.service.SfaUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    
}