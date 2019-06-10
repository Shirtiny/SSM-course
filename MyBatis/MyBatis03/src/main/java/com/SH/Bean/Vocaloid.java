package com.SH.Bean;

public class Vocaloid {
    int id;
    String name;
    Boolean sex;
    String color;
    Singer singer;

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public Vocaloid(int id, String name, Boolean sex, String color, Singer singer) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.color = color;
        this.singer = singer;
    }

    public Vocaloid() {

    }

    public Vocaloid(int id, String name, Boolean sex, String color) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vocaloid{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", color='" + color + '\'' +
                '}';
    }
}
