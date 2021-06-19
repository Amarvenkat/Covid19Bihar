package com.amar.covid19bihar.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class Supaul {

    @SerializedName("active")
    private  int supaulactive;
    @SerializedName("confirmed")
    private  int supaulconfirmed;
    @SerializedName("deceased")
    private int supauldeceased;
    @SerializedName("recovered")
    private  int supaulrecovered;

    public Supaul(int supaulactive, int supaulconfirmed, int supauldeceased, int supaulrecovered) {
        this.supaulactive = supaulactive;
        this.supaulconfirmed = supaulconfirmed;
        this.supauldeceased = supauldeceased;
        this.supaulrecovered = supaulrecovered;
    }

    public int getSupaulactive() {
        return supaulactive;
    }

    public void setSupaulactive(int supaulactive) {
        this.supaulactive = supaulactive;
    }

    public int getSupaulconfirmed() {
        return supaulconfirmed;
    }

    public void setSupaulconfirmed(int supaulconfirmed) {
        this.supaulconfirmed = supaulconfirmed;
    }

    public int getSupauldeceased() {
        return supauldeceased;
    }

    public void setSupauldeceased(int supauldeceased) {
        this.supauldeceased = supauldeceased;
    }

    public int getSupaulrecovered() {
        return supaulrecovered;
    }

    public void setSupaulrecovered(int supaulrecovered) {
        this.supaulrecovered = supaulrecovered;
    }
}
