package com.jayden.basic.domain;

import java.io.Serializable;

/**
 * Created by za-xujianjun on 2017/3/29.
 */
public class UserDO implements Serializable {
    private static final long serialVersionUID = -8398263068002402390L;

    private long id;
    private String userName;
    private String pass;
    private String address;
    private String alias;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
