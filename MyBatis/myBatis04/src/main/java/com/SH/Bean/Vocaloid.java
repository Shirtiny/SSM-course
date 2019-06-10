package com.SH.Bean;

public class Vocaloid {
   private int id;
   private String name;
   private Boolean sex;
   private String color;
   private Vocaloid_Card card;
    public Vocaloid() {

    }

    @Override
    public String toString() {
        return "Vocaloid{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", color='" + color + '\'' +
                ", card=" + card +
                '}';
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

    public Vocaloid_Card getCard() {
        return card;
    }

    public void setCard(Vocaloid_Card card) {
        this.card = card;
    }

    public Vocaloid(int id, String name, Boolean sex, String color, Vocaloid_Card card) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.color = color;
        this.card = card;
    }
}
