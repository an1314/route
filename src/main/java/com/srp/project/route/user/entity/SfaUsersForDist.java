package com.srp.project.route.user.entity;

/**
 * SfaUsersForDist
 */
public class SfaUsersForDist {

    private String code;

    private String firstName;

    private String lastName;

    public void setCode(String code){
        this.code = code == null ? null: code.trim();
    }

    public void firstName(String firstName){
        this.firstName = firstName == null ? null : firstName.trim();
    }

    public void lastName(String lastName){
        this.lastName = lastName == null ? null : lastName.trim();
    }

    public String getValue(){
        return this.code;
    }

    public String getLabel(){
        return (this.firstName == null ? "" : this.firstName) + (this.lastName  == null ? "" : this.lastName) ;
    }
}