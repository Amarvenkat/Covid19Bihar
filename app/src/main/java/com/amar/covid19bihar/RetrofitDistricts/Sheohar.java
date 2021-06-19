package com.amar.covid19bihar.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class Sheohar {

    @SerializedName("active")
    private  int sheoharactive;
    @SerializedName("confirmed")
    private  int sheoharconfirmed;
    @SerializedName("deceased")
    private int sheohardeceased;
    @SerializedName("recovered")
    private  int sheoharrecovered;

    public Sheohar(int sheoharactive, int sheoharconfirmed, int sheohardeceased, int sheoharrecovered) {
        this.sheoharactive = sheoharactive;
        this.sheoharconfirmed = sheoharconfirmed;
        this.sheohardeceased = sheohardeceased;
        this.sheoharrecovered = sheoharrecovered;
    }

    public int getSheoharactive() {
        return sheoharactive;
    }

    public void setSheoharactive(int sheoharactive) {
        this.sheoharactive = sheoharactive;
    }

    public int getSheoharconfirmed() {
        return sheoharconfirmed;
    }

    public void setSheoharconfirmed(int sheoharconfirmed) {
        this.sheoharconfirmed = sheoharconfirmed;
    }

    public int getSheohardeceased() {
        return sheohardeceased;
    }

    public void setSheohardeceased(int sheohardeceased) {
        this.sheohardeceased = sheohardeceased;
    }

    public int getSheoharrecovered() {
        return sheoharrecovered;
    }

    public void setSheoharrecovered(int sheoharrecovered) {
        this.sheoharrecovered = sheoharrecovered;
    }
}
