package com.amar.covid19bihar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.amar.covid19bihar.CollectionFood.CollectionofFoodAdmin;
import com.amar.covid19bihar.HealthWorkerAssigning.HealthWorkerAdminHome;
import com.amar.covid19bihar.MigrantLabour.LabourDetailsDB;
import com.amar.covid19bihar.Orphan.OrphanAdminHome;
import com.amar.covid19bihar.Selfassesment.RiskDB;
import com.amar.covid19bihar.Selfassesment.RiskLocation;
import com.amar.covid19bihar.Unorganizedworker.UnorganizedAdmin;

public class AdminHome extends AppCompatActivity {

    Button riskpatient,riskmap,labourdetails,labourmap,unorganizedworker,collectionoffood,healthworker,btnorphan;

    public  static final String FIRST  = "first";
    public  static final String SECOND = "second";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);

        riskpatient = (Button) findViewById(R.id.btnshowdb);
        riskmap = (Button) findViewById(R.id.btnshowmap);
        labourdetails = (Button) findViewById(R.id.btnlabourshowdb);
        labourmap = (Button) findViewById(R.id.btnlabourshowmap);
        unorganizedworker = (Button) findViewById(R.id.btnunorganizedworker);
        collectionoffood = (Button) findViewById(R.id.btncollectionfoodadmin);
        healthworker = (Button) findViewById(R.id.btnhealthworker);
        btnorphan = (Button) findViewById(R.id.btnorphan);
        riskpatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(AdminHome.this, RiskDB.class);
                startActivity(intent);

            }
        });
        riskmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle bundle1 = new Bundle();
                bundle1.putString(FIRST,"first");
                Intent intent = new Intent(AdminHome.this, RiskLocation.class);
                intent.putExtras(bundle1);
                startActivity(intent);


            }
        });

        labourdetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(AdminHome.this, LabourDetailsDB.class);
                startActivity(intent);

            }
        });

        labourmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle2 = new Bundle();
                bundle2.putString(SECOND,"second");
                Intent intent = new Intent(AdminHome.this,RiskLocation.class);
                intent.putExtras(bundle2);
                startActivity(intent);

            }
        });
        unorganizedworker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(AdminHome.this, UnorganizedAdmin.class);
                startActivity(intent);

            }
        });
        collectionoffood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(AdminHome.this, CollectionofFoodAdmin.class);
                startActivity(intent);

            }
        });
        healthworker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(AdminHome.this, HealthWorkerAdminHome.class);
                startActivity(intent);

            }
        });

        btnorphan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(AdminHome.this, OrphanAdminHome.class);
                startActivity(intent);

            }
        });
    }
}
