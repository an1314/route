package com.srp.project.route.store.mapper;

import java.util.List;

import com.srp.project.route.store.entity.SfaStore;
import com.srp.project.route.store.entity.SfaStoreForOrg;

import org.apache.ibatis.annotations.Param;

/**
 * SfaStoreMapper
 */
public interface SfaStoreMapper {

    /**
     * 获取门店数据
     * @param sfaStore
     * @return
     */
    public List<SfaStoreForOrg> selectStoreList(SfaStore sfaStore);

    /**
     * 添加门店数据
     * @param sfaStore
     * @return
     */
    public Integer insert(SfaStore sfaStore);

    /**
     * 修改门店数据
     * @param sfaStore
     * @return
     */
    public Integer update(SfaStore sfaStore);


    /**
     * 批量删除门店数据
     * @param sfaStore
     * @return
     */
    public Integer delete(@Param("storeCodes") List<String> storeCodes, @Param("updateBy") String updateBy, @Param("storeStatus") boolean storeStatus);
}