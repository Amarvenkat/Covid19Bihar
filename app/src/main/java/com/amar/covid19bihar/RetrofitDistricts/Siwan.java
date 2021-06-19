package com.amar.covid19bihar.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class Siwan {

    @SerializedName("active")
    private  int siwanactive;
    @SerializedName("confirmed")
    private  int siwanconfirmed;
    @SerializedName("deceased")
    private int siwandeceased;
    @SerializedName("recovered")
    private  int siwanrecovered;

    public Siwan(int siwanactive, int siwanconfirmed, int siwandeceased, int siwanrecovered) {
        this.siwanactive = siwanactive;
        this.siwanconfirmed = siwanconfirmed;
        this.siwandeceased = siwandeceased;
        this.siwanrecovered = siwanrecovered;
    }

    public int getSiwanactive() {
        return siwanactive;
    }

    public void setSiwanactive(int siwanactive) {
        this.siwanactive = siwanactive;
    }

    public int getSiwanconfirmed() {
        return siwanconfirmed;
    }

    public void setSiwanconfirmed(int siwanconfirmed) {
        this.siwanconfirmed = siwanconfirmed;
    }

    public int getSiwandeceased() {
        return siwandeceased;
    }

    public void setSiwandeceased(int siwandeceased) {
        this.siwandeceased = siwandeceased;
    }

    public int getSiwanrecovered() {
        return siwanrecovered;
    }

    public void setSiwanrecovered(int siwanrecovered) {
        this.siwanrecovered = siwanrecovered;
    }
}
