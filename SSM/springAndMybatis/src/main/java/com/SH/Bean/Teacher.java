package com.SH.Bean;

public class Teacher {
    private int tid;
    private String tname;
    private String tmail;




    public Teacher() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", tmail='" + tmail + '\'' +
                '}';
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTmail() {
        return tmail;
    }

    public void setTmail(String tmail) {
        this.tmail = tmail;
    }

    public Teacher(int tid, String tname, String tmail) {
        this.tid = tid;
        this.tname = tname;
        this.tmail = tmail;
    }
}
