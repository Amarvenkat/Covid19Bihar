package com.amar.covid19bihar.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class Vaishali {

    @SerializedName("active")
    private  int vaishaliactive;
    @SerializedName("confirmed")
    private  int vaishaliconfirmed;
    @SerializedName("deceased")
    private int vaishalideceased;
    @SerializedName("recovered")
    private  int vaishalirecovered;

    public Vaishali(int vaishaliactive, int vaishaliconfirmed, int vaishalideceased, int vaishalirecovered) {
        this.vaishaliactive = vaishaliactive;
        this.vaishaliconfirmed = vaishaliconfirmed;
        this.vaishalideceased = vaishalideceased;
        this.vaishalirecovered = vaishalirecovered;
    }

    public int getVaishaliactive() {
        return vaishaliactive;
    }

    public void setVaishaliactive(int vaishaliactive) {
        this.vaishaliactive = vaishaliactive;
    }

    public int getVaishaliconfirmed() {
        return vaishaliconfirmed;
    }

    public void setVaishaliconfirmed(int vaishaliconfirmed) {
        this.vaishaliconfirmed = vaishaliconfirmed;
    }

    public int getVaishalideceased() {
        return vaishalideceased;
    }

    public void setVaishalideceased(int vaishalideceased) {
        this.vaishalideceased = vaishalideceased;
    }

    public int getVaishalirecovered() {
        return vaishalirecovered;
    }

    public void setVaishalirecovered(int vaishalirecovered) {
        this.vaishalirecovered = vaishalirecovered;
    }
}
