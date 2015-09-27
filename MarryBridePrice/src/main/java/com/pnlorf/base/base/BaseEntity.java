package com.pnlorf.base.base;

import com.pnlorf.base.system.entity.SysUser;

import javax.annotation.Generated;
import java.util.Date;

/**
 * Created by 冰诺莫语 on 2015/9/27.
 */
public class BaseEntity {

    protected Long id = System.currentTimeMillis();

    protected Date insertTime = new Date();

    protected SysUser insertUser;

    protected Date lastUpdateTime;

    protected SysUser lastUpdateUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public SysUser getInsertUser() {
        return insertUser;
    }

    public void setInsertUser(SysUser insertUser) {
        this.insertUser = insertUser;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public SysUser getLastUpdateUser() {
        return lastUpdateUser;
    }

    public void setLastUpdateUser(SysUser lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }
}
