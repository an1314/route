package com.srp.project.route.store.service.impl;

import java.util.List;

import com.srp.project.route.store.entity.SfaStore;
import com.srp.project.route.store.entity.SfaStoreForOrg;
import com.srp.project.route.store.mapper.SfaStoreMapper;
import com.srp.project.route.store.service.SfaStoreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * SfaStoreServiceImpl
 */
@Service
public class SfaStoreServiceImpl implements SfaStoreService {

    @Autowired
    private SfaStoreMapper sfaStoreMapper;

    /**
     * 获取门店数据
     * @param sfaStore
     * @return
     */
    @Override
    public List<SfaStoreForOrg> selectStoreList(SfaStore sfaStore) {
       
        return sfaStoreMapper.selectStoreList(sfaStore);
    }

    /**
     * 添加门店数据
     * @param sfaStore
     * @return
     */
    @Override
    public Integer insert(SfaStore sfaStore){
        return sfaStoreMapper.insert(sfaStore);
    }

    /**
     * 修改门店数据
     * @param sfaStore
     * @return
     */
    @Override
    public Integer update(SfaStore sfaStore){
        return sfaStoreMapper.update(sfaStore);
    }


    /**
     * 批量删除门店数据
     * @param sfaStore
     * @return
     */
    @Override
    public Integer delete(List<String> storeCodes, String updateBy, boolean storeStatus){
        return sfaStoreMapper.delete(storeCodes, updateBy, storeStatus);
    }

    
}