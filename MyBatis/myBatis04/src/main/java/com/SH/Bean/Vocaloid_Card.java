package com.SH.Bean;

public class Vocaloid_Card {
    private    String card_name;
    private String favorite;
    private  int card_no;

    public Vocaloid_Card() {
    }
    public Vocaloid_Card(String card_name, String favorite, int card_no) {
        this.card_name = card_name;
        this.favorite = favorite;
        this.card_no = card_no;
    }

    @Override
    public String toString() {
        return "Vocaloid_Card{" +
                "card_name='" + card_name + '\'' +
                ", favorite='" + favorite + '\'' +
                ", card_no=" + card_no +
                '}';
    }

    public String getCard_name() {
        return card_name;
    }

    public void setCard_name(String card_name) {
        this.card_name = card_name;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    public int getCard_no() {
        return card_no;
    }

    public void setCard_no(int card_no) {
        this.card_no = card_no;
    }
}
