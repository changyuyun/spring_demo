package com.ityun.domain;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
    private int uid;

    @NotNull(message = "username不能是空")
    @Size(min = 2, max = 5, message = "username大于2 and 小于5")
    private String username;

    @NotNull(message = "email不能是空")
    @Email(message = "email格式错误")
    private String email;

    public User() {
    }

    public User(int uid, String username, String email) {
        this.uid = uid;
        this.username = username;
        this.email = email;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
