package com.SH.Bean;

import org.springframework.format.annotation.DateTimeFormat;


import java.util.Date;

public class UserCard {
    private int cid;
    private String cname;

//    @Past
    @DateTimeFormat(pattern = "yyyy-MM-dd")//输入时，生日以yyyy-mm-dd的形式接收，存放注入时，以国际化的原样显示
    private Date cbirthday;


    public UserCard() {

    }

    public UserCard(int cid, String cname, Date cbirthday) {
        this.cid = cid;
        this.cname = cname;
        this.cbirthday = cbirthday;
    }

    @Override
    public String toString() {
        return "UserCard{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", cbirthday=" + cbirthday +
                '}';
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Date getCbirthday() {
        return cbirthday;
    }

    public void setCbirthday(Date cbirthday) {
        this.cbirthday = cbirthday;
    }
}
