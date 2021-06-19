package com.amar.covid19bihar.ApiInterface;

import com.amar.covid19bihar.RetrofitClass.Covid19Zone;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiZone {

    @GET("zones.json")
    Call<Covid19Zone> getZone();
}
