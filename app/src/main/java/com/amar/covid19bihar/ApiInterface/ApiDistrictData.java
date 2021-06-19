package com.amar.covid19bihar.ApiInterface;

import com.amar.covid19bihar.RetrofitClass.TelanganaStateWise;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiDistrictData {

    @GET("state_district_wise.json")
    Call<TelanganaStateWise> getDistrictData();

}
