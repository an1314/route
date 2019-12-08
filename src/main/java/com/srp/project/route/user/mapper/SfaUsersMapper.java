package com.srp.project.route.user.mapper;
import java.util.List;
import com.srp.project.route.user.entity.SfaUsers;
import com.srp.project.route.user.entity.SfaUsersForDist;
import com.srp.project.route.user.entity.SfaUsersForOrg;
import com.srp.project.route.user.entity.SfaUsersInfoSum;

/**
 * 人员数据层
 */
public interface SfaUsersMapper {

    /**
     * 获取人员数据作为字典
     * @param sfauser 查询参数
     * @return 人员的字典对象
     */
    public List<SfaUsersForDist> selectSfaUsersDictList(SfaUsers sfauser);

    /**
     * 获取用户的各种信息汇总
     * @param sfaUsers 查询参数
     * @return 用户各种信息汇总
     */
    public SfaUsersInfoSum selectUsersInfoSum(SfaUsers sfaUsers);


    /**
     * 查询未登录人员
     * @param sfaUsers
     * @return
     */
    public List<SfaUsersForOrg> selectNoLoginUser(SfaUsers sfaUsers);
}