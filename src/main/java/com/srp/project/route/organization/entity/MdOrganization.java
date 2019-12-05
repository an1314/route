package com.srp.project.route.organization.entity;

import com.srp.framework.web.domain.BaseEntity;
import java.util.List;
import java.util.ArrayList;

/**
 * MdOrganization
 */
public class MdOrganization extends BaseEntity {

    private static final long serialVersionUID = 1L;
    
    private String orgId;

    private String orgCode;

    private String orgNameCn;

    private String orgNameEn;

    private String orgLevel;
    
    private String orgType;

    private String parent;

    private String fullPath;

    private String buCode;

    private String isDeleted;

    private String cityTier;

    private List<MdOrganization> children = new ArrayList<MdOrganization>();

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public String getOrgNameCn() {
        return orgNameCn;
    }

    public void setOrgNameCn(String orgNameCn) {
        this.orgNameCn = orgNameCn == null ? null : orgNameCn.trim();
    }

    public String getOrgNameEn() {
        return orgNameEn;
    }

    public void setOrgNameEn(String orgNameEn) {
        this.orgNameEn = orgNameEn == null ? null : orgNameEn.trim();
    }

    public String getOrgLevel() {
        return orgLevel;
    }

    public void setOrgLevel(String orgLevel) {
        this.orgLevel = orgLevel == null ? null : orgLevel.trim();
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType == null ? null : orgType.trim();
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent == null ? null : parent.trim();
    }

    public String getFullPath() {
        return fullPath;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath == null ? null : fullPath.trim();
    }

    public String getBuCode() {
        return buCode;
    }

    public void setBuCode(String buCode) {
        this.buCode = buCode == null ? null : buCode.trim();
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted == null ? null : isDeleted.trim();
    }

    public String getCityTier() {
        return cityTier;
    }

    public void setCityTier(String cityTier) {
        this.cityTier = cityTier == null ? null : cityTier.trim();
    }

    public List<MdOrganization> getChildren() {
        return children;
    }

    public void setChildren(List<MdOrganization> children) {
        this.children = children;
    }

}