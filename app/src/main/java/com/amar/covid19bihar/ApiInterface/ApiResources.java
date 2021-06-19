package com.amar.covid19bihar.ApiInterface;

import com.amar.covid19bihar.RetrofitClass.Covid19Resources;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiResources {

    @GET("resources/resources.json")
    Call<Covid19Resources> getResourse();
}
