package com.srp.project.route.store.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import com.srp.common.utils.SecurityUtils;
import com.srp.common.utils.poi.ExcelUtil;
import com.srp.framework.aspectj.lang.annotation.Log;
import com.srp.framework.aspectj.lang.enums.BusinessType;
import com.srp.framework.web.controller.BaseController;
import com.srp.framework.web.domain.AjaxResult;
import com.srp.framework.web.page.TableDataInfo;
import com.srp.project.route.store.entity.SfaStore;
import com.srp.project.route.store.entity.SfaStoreForOrg;
import com.srp.project.route.store.service.SfaStoreService;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SfaStoreController
 */
@RestController
@RequestMapping("/route/store")
public class SfaStoreController extends BaseController {

    @Autowired
    private SfaStoreService sfaStoreService;

    /**
     * 获取门店信息
     * @param sfaStore
     * @return
     */
    @PostMapping("/list")
    public TableDataInfo selectStoreList(@RequestBody SfaStore sfaStore){
        startPage();
        return getDataTable(sfaStoreService.selectStoreList(sfaStore));
    }

     /**
     * 获取门店信息
     * @param sfaStore
     * @return
     */
    @Log(title = "门店管理", businessType = BusinessType.EXPORT)
    @PostMapping("/listexport")
    public AjaxResult selectStoreListExport(@RequestBody SfaStore sfaStore){
        List<SfaStoreForOrg> list = sfaStoreService.selectStoreList(sfaStore);
        ExcelUtil<SfaStoreForOrg> util = new ExcelUtil<SfaStoreForOrg>(SfaStoreForOrg.class);
        return util.exportExcel(list, "门店管理");
    }

    /**
     * 新增门店信息
     * @param sfaStore
     * @return
     */
    @PostMapping("/insert")
    public AjaxResult insert(@RequestBody SfaStore sfaStore){
        if(StringUtils.isEmpty(sfaStore.getStoreCode())){
            sfaStore.setStoreCode("XZ"+LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddhhmmss")) +ThreadLocalRandom.current().nextInt(100, 1000));
        }
        sfaStore.setCreateBy(SecurityUtils.getUsername());
        return toAjax(sfaStoreService.insert(sfaStore));
    }

    /**
     * 修改门店信息
     * @param sfaStore
     * @return
     */
    @PutMapping("/update")

    public AjaxResult update(@RequestBody List<SfaStore> sfaStores){
        return AjaxResult.success(sfaStoreService.update(sfaStores));
    }

    // 删除门店信息
    @DeleteMapping("/delete/{storeCodes}")
    public AjaxResult delete(@PathVariable("storeCodes") List<String> storeCodes){
        return AjaxResult.success(sfaStoreService.delete(storeCodes, SecurityUtils.getUsername(), false));
    }
    
}