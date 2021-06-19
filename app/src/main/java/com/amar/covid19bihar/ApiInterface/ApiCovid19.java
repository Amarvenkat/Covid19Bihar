package com.amar.covid19bihar.ApiInterface;

import com.amar.covid19bihar.RetrofitClass.Covid19Main;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiCovid19 {

    @GET("data.json")
    Call<Covid19Main> getReport();
}
