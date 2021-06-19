package com.amar.covid19bihar.RetrofitClass;

import com.google.gson.annotations.SerializedName;

public class TelanganaStateWise {


   @SerializedName("Bihar")
   private Telangana telangana;

   public TelanganaStateWise(Telangana telangana) {
       this.telangana = telangana;
   }

   public Telangana getTelangana() {
       return telangana;
   }

   public void setTelangana(Telangana telangana) {
       this.telangana = telangana;
   }
}
