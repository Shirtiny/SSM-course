package com.SH.Bean;

import java.util.List;

public class Singer {
    int id;
    String name;
    List<Integer> ids;

    @Override
    public String toString() {
        return "Singer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ids=" + ids +
                '}';
    }

    public List<Integer> getIds() {

        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public Singer(int id, String name, List<Integer> ids) {
        this.id = id;
        this.name = name;
        this.ids = ids;
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

    public Singer(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Singer() {


    }
}
