package com.SH.Bean;

public class User {
    private String uname;
    private String upassword;
    private int uid;
    private UserCard ucard;//User的卡

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", upassword='" + upassword + '\'' +
                ", uid=" + uid +
                ", ucard=" + ucard +
                '}';
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public UserCard getUcard() {
        return ucard;
    }

    public void setUcard(UserCard ucard) {
        this.ucard = ucard;
    }

    public User(String uname, String upassword, int uid, UserCard ucard) {
        this.uname = uname;
        this.upassword = upassword;
        this.uid = uid;
        this.ucard = ucard;
    }
}
