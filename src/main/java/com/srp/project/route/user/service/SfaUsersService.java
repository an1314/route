package com.srp.project.route.user.service;
import com.srp.project.route.user.entity.SfaUsersForDist;
import  java.util.List;
import com.srp.project.route.user.entity.SfaUsers;

/**
 * SfaUsersService
 */
public interface SfaUsersService {

    public List<SfaUsersForDist> selectSfaUsersDictList(SfaUsers sfauser);
}