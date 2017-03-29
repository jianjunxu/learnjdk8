package com.jayden.basic.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by za-xujianjun on 2017/3/29.
 */
public class AnnAccountDO implements Serializable {
    private static final long serialVersionUID = 6286590867533044248L;
    private long id;
    private String accountAddress;
    private String accountPrivkeyCode;
    private Date accountCreateTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccountAddress() {
        return accountAddress;
    }

    public void setAccountAddress(String accountAddress) {
        this.accountAddress = accountAddress;
    }

    public String getAccountPrivkeyCode() {
        return accountPrivkeyCode;
    }

    public void setAccountPrivkeyCode(String accountPrivkeyCode) {
        this.accountPrivkeyCode = accountPrivkeyCode;
    }

    public Date getAccountCreateTime() {
        return accountCreateTime;
    }

    public void setAccountCreateTime(Date accountCreateTime) {
        this.accountCreateTime = accountCreateTime;
    }

    @Override
    public String toString() {
        return "AnnAccountDO{" +
                "id=" + id +
                ", accountAddress='" + accountAddress + '\'' +
                ", accountPrivkeyCode='" + accountPrivkeyCode + '\'' +
                ", accountCreateTime=" + accountCreateTime +
                '}';
    }
}
