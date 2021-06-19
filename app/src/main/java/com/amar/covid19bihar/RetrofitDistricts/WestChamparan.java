package com.amar.covid19bihar.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class WestChamparan {

    @SerializedName("active")
    private  int westChamparanactive;
    @SerializedName("confirmed")
    private  int westChamparanconfirmed;
    @SerializedName("deceased")
    private int westChamparandeceased;
    @SerializedName("recovered")
    private  int westChamparanrecovered;

    public WestChamparan(int westChamparanactive, int westChamparanconfirmed, int westChamparandeceased, int westChamparanrecovered) {
        this.westChamparanactive = westChamparanactive;
        this.westChamparanconfirmed = westChamparanconfirmed;
        this.westChamparandeceased = westChamparandeceased;
        this.westChamparanrecovered = westChamparanrecovered;
    }

    public int getWestChamparanactive() {
        return westChamparanactive;
    }

    public void setWestChamparanactive(int westChamparanactive) {
        this.westChamparanactive = westChamparanactive;
    }

    public int getWestChamparanconfirmed() {
        return westChamparanconfirmed;
    }

    public void setWestChamparanconfirmed(int westChamparanconfirmed) {
        this.westChamparanconfirmed = westChamparanconfirmed;
    }

    public int getWestChamparandeceased() {
        return westChamparandeceased;
    }

    public void setWestChamparandeceased(int westChamparandeceased) {
        this.westChamparandeceased = westChamparandeceased;
    }

    public int getWestChamparanrecovered() {
        return westChamparanrecovered;
    }

    public void setWestChamparanrecovered(int westChamparanrecovered) {
        this.westChamparanrecovered = westChamparanrecovered;
    }
}
