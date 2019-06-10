package com.SH.Bean;

public class student {
    int sId;
    String sName;
    int sAge;
    String sHome;
   boolean sexNum;

    public student() {//注意要有无参构造
    }

    public student(int sId, String sName, int sAge, String sHome) {
        this.sId = sId;
        this.sName = sName;
        this.sAge = sAge;
        this.sHome = sHome;
    }

    @Override
    public String toString() {
        return "student{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", sAge=" + sAge +
                ", sHome='" + sHome + '\'' +
                ", sexNum=" + sexNum +
                '}';
    }

    public student(String sName, int sAge, String sHome, boolean sexNum) {
        this.sName = sName;
        this.sAge = sAge;
        this.sHome = sHome;
        this.sexNum = sexNum;
    }

    public student(int sId, String sName, int sAge, String sHome, boolean sexNum) {
        this.sId = sId;
        this.sName = sName;
        this.sAge = sAge;
        this.sHome = sHome;
        this.sexNum = sexNum;
    }

    public student(String sName, int sAge, String sHome) {
        this.sName = sName;
        this.sAge = sAge;
        this.sHome = sHome;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsAge() {
        return sAge;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    public String getsHome() {
        return sHome;
    }

    public void setsHome(String sHome) {
        this.sHome = sHome;
    }

    public boolean isSexNum() {
        return sexNum;
    }

    public void setSexNum(boolean sexNum) {
        this.sexNum = sexNum;
    }
}
