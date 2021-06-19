package com.amar.covid19bihar.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class Sitamarhi {

    @SerializedName("active")
    private  int sitamarhiactive;
    @SerializedName("confirmed")
    private  int sitamarhiconfirmed;
    @SerializedName("deceased")
    private int sitamarhideceased;
    @SerializedName("recovered")
    private  int sitamarhirecovered;

    public Sitamarhi(int sitamarhiactive, int sitamarhiconfirmed, int sitamarhideceased, int sitamarhirecovered) {
        this.sitamarhiactive = sitamarhiactive;
        this.sitamarhiconfirmed = sitamarhiconfirmed;
        this.sitamarhideceased = sitamarhideceased;
        this.sitamarhirecovered = sitamarhirecovered;
    }

    public int getSitamarhiactive() {
        return sitamarhiactive;
    }

    public void setSitamarhiactive(int sitamarhiactive) {
        this.sitamarhiactive = sitamarhiactive;
    }

    public int getSitamarhiconfirmed() {
        return sitamarhiconfirmed;
    }

    public void setSitamarhiconfirmed(int sitamarhiconfirmed) {
        this.sitamarhiconfirmed = sitamarhiconfirmed;
    }

    public int getSitamarhideceased() {
        return sitamarhideceased;
    }

    public void setSitamarhideceased(int sitamarhideceased) {
        this.sitamarhideceased = sitamarhideceased;
    }

    public int getSitamarhirecovered() {
        return sitamarhirecovered;
    }

    public void setSitamarhirecovered(int sitamarhirecovered) {
        this.sitamarhirecovered = sitamarhirecovered;
    }
}
