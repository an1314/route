package com.srp.project.route.store.service;

import java.util.List;

import com.srp.project.route.store.entity.SfaStore;
import com.srp.project.route.store.entity.SfaStoreForOrg;

/**
 * SfaStoreService
 */
public interface SfaStoreService {

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
    public Integer delete(List<String> storeCodes, String createBy);
}