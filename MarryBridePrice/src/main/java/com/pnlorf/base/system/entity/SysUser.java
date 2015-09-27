package com.pnlorf.base.system.entity;

import com.pnlorf.base.base.BaseEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * 系统用户
 * Created by 冰诺莫语 on 2015/9/27.
 */
public class SysUser extends BaseEntity implements UserDetails, Cloneable {

    private static final Logger logger = LoggerFactory.getLogger(SysUser.class);

    /**
     * 用户名，即昵称
     */
    private String nickName;

    /**
     * 密码
     */
    private String password;

    /**
     * 账号
     */
    private String username;

    /**
     * 权限
     */
    private Collection<GrantedAuthority> authorities;
    /**
     * 账号未过期
     */
    private boolean accountNonExpired = true;
    /**
     * 账号未锁定
     */
    private boolean accountNonLocked = true;

    /**
     * 证书未过期
     */
    private boolean credentialsNonExpired = true;

    /**
     * 是否启用
     */
    private boolean enabled;
    /**
     * 用户描述
     */
    private String userDesc;

    public SysUser() {
    }

    public SysUser(String nickName, String password, String username,
                   Collection<GrantedAuthority> authorities, boolean accountNonExpired,
                   boolean accountNonLocked, boolean credentialsNonExpired, boolean enabled, String userDesc) {
        this.nickName = nickName;
        this.password = password;
        this.username = username;
        this.authorities = authorities;
        this.accountNonExpired = accountNonExpired;
        this.accountNonLocked = accountNonLocked;
        this.credentialsNonExpired = credentialsNonExpired;
        this.enabled = enabled;
        this.userDesc = userDesc;
    }


    public String getNickName() {
        return nickName;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public Object cloneMe() {
        try {
            return this.clone();
        } catch (CloneNotSupportedException e) {
            logger.warn("克隆异常", e);
        }
        return null;
    }
}
