package com.SH.Bean;

public class User {
    private String uname;
    private String upassword;
    private String usex;
    private int uid;
    private UserCard ucard;

    public User() {
    }

    public User(String uname, String upassword, String usex, int uid, UserCard ucard) {
        this.uname = uname;
        this.upassword = upassword;
        this.usex = usex;
        this.uid = uid;
        this.ucard = ucard;
    }

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", upassword='" + upassword + '\'' +
                ", usex='" + usex + '\'' +
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

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
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
}
