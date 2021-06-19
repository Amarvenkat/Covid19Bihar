package com.amar.covid19bihar.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class Sheikhpura {

    @SerializedName("active")
    private  int sheikhpuraactive;
    @SerializedName("confirmed")
    private  int sheikhpuraconfirmed;
    @SerializedName("deceased")
    private int sheikhpuradeceased;
    @SerializedName("recovered")
    private  int sheikhpurarecovered;

    public Sheikhpura(int sheikhpuraactive, int sheikhpuraconfirmed, int sheikhpuradeceased, int sheikhpurarecovered) {
        this.sheikhpuraactive = sheikhpuraactive;
        this.sheikhpuraconfirmed = sheikhpuraconfirmed;
        this.sheikhpuradeceased = sheikhpuradeceased;
        this.sheikhpurarecovered = sheikhpurarecovered;
    }

    public int getSheikhpuraactive() {
        return sheikhpuraactive;
    }

    public void setSheikhpuraactive(int sheikhpuraactive) {
        this.sheikhpuraactive = sheikhpuraactive;
    }

    public int getSheikhpuraconfirmed() {
        return sheikhpuraconfirmed;
    }

    public void setSheikhpuraconfirmed(int sheikhpuraconfirmed) {
        this.sheikhpuraconfirmed = sheikhpuraconfirmed;
    }

    public int getSheikhpuradeceased() {
        return sheikhpuradeceased;
    }

    public void setSheikhpuradeceased(int sheikhpuradeceased) {
        this.sheikhpuradeceased = sheikhpuradeceased;
    }

    public int getSheikhpurarecovered() {
        return sheikhpurarecovered;
    }

    public void setSheikhpurarecovered(int sheikhpurarecovered) {
        this.sheikhpurarecovered = sheikhpurarecovered;
    }
}
