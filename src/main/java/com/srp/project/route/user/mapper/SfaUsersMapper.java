package com.srp.project.route.user.mapper;
import java.util.List;
import com.srp.project.route.user.entity.SfaUsers;
import com.srp.project.route.user.entity.SfaUsersForDist;

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
}