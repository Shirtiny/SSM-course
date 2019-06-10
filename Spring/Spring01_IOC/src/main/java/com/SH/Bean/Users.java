package com.SH.Bean;

import org.springframework.stereotype.Component;

@Component("Users ")
public class Users {
    private String username;
    private String usermail;
    private int userid;
    private String userpassword;
    private ListType list;

    @Override
    public String toString() {
        return "Users{" +
                "username='" + username + '\'' +
                ", usermail='" + usermail + '\'' +
                ", userid=" + userid +
                ", userpassword='" + userpassword + '\'' +
                ", list=" + list +
                '}';
    }

    public Users(String username, String usermail, int userid, String userpassword, ListType list) {
        this.username = username;
        this.usermail = usermail;
        this.userid = userid;
        this.userpassword = userpassword;
        this.list = list;
    }

    public ListType getList() {
        return list;
    }

    public void setList(ListType list) {
        this.list = list;
    }

    public Users() {}
    public Users(String username, String usermail, int userid, String userpassword) {
        this.username = username;
        this.usermail = usermail;
        this.userid = userid;
        this.userpassword = userpassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsermail() {
        return usermail;
    }

    public void setUsermail(String usermail) {
        this.usermail = usermail;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

}
