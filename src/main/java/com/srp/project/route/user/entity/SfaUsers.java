package com.srp.project.route.user.entity;

import com.srp.framework.web.domain.BaseEntity;
import java.util.List;

/**
 * SfaUsers
 */
public class SfaUsers extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String code;

    private String password;

    private String firstName;

    private String lastName;

    private String tel;

    private String position;

    private Integer groupId;

    private String orgCode;

    private String managerCode;

    private Boolean valid;

    private String name;

    private List<String> orgCodes;
    

    public void SetName(String name){
        this.name = name == null? null : name.trim();
    }

    public String getName(){
        return this.name != null ? this.name : ((this.firstName == null ? "" : this.firstName) + (this.lastName  == null ? "" : this.lastName));
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : code.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public String getManagerCode() {
        return managerCode;
    }

    public void setManagerCode(String managerCode) {
        this.managerCode = managerCode == null ? null : managerCode.trim();
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public List<String> getOrgCodes() {
        return orgCodes;
    }

    public void setOrgCodes(List<String> orgCodes) {
        this.orgCodes = orgCodes;
    }
    
    
}