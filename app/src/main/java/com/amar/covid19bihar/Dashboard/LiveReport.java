package com.amar.covid19bihar.Dashboard;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19bihar.Adapters.LiveDataAdapter;
import com.amar.covid19bihar.ApiInterface.ApiCovid19;
import com.amar.covid19bihar.Apiclients.ApiClient;
import com.amar.covid19bihar.R;
import com.amar.covid19bihar.RetrofitClass.Covid19Main;
import com.amar.covid19bihar.RetrofitClass.StateWise;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LiveReport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_report);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.live_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ApiCovid19 apiService =
                ApiClient.getClient().create(ApiCovid19.class);

        Call<Covid19Main> call = apiService.getReport();
        call.enqueue(new Callback<Covid19Main>() {
            @Override
            public void onResponse(Response<Covid19Main> response) {

                List<StateWise> state = response.body().getState();


                recyclerView.setAdapter(new LiveDataAdapter(state,R.layout.live_state,getApplicationContext()));

            }

            @Override
            public void onFailure(Throwable t) {

            }
        });


    }
}
