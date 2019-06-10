package com.SH.Bean;

import java.util.List;

public class team {
    private int team_id;
    private String team_name;
    private   List<Vocaloid> vocaloids;

    public team() {
    }

    public team(int team_id, String team_name, List<Vocaloid> vocaloids) {
        this.team_id = team_id;
        this.team_name = team_name;
        this.vocaloids = vocaloids;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public List<Vocaloid> getVocaloids() {
        return vocaloids;
    }

    public void setVocaloids(List<Vocaloid> vocaloids) {
        this.vocaloids = vocaloids;
    }

    @Override
    public String toString() {
        return "team{" +
                "team_id=" + team_id +
                ", team_name='" + team_name + '\'' +
                ", vocaloids=" + vocaloids +
                '}';
    }
}
