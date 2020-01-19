package com.just.shiro.dto;

/**
 * Created by justGeeker
 * 2020/1/16 16:01
 * 416467337@qq.com
 */
public class UserQuery {
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
