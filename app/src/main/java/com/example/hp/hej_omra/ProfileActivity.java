package com.example.hp.hej_omra;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity
{
    TextView profileData;
    Button Edit,Back;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        profileData= (TextView) findViewById(R.id.profiletxt);

        SharedPreferences sharedPref = getSharedPreferences("MY_SHARED_PREF", MODE_PRIVATE);
        String CName=sharedPref.getString("companyName","");
        String CMob=sharedPref.getString("companyMob","");
        String HName=sharedPref.getString("hajName","");
        String HMob=sharedPref.getString("hajMob","");
        String Hotel=sharedPref.getString("hotel","");
        String id=sharedPref.getString("id","");
        String autho=sharedPref.getString("authorization","");
        String nationality=sharedPref.getString("nationality","");
        String Mcamp=sharedPref.getString("menaCamp","");
        String Mcat=sharedPref.getString("menaCategory","");
        String ACamp=sharedPref.getString("arfaCamp","");
        String ACat=sharedPref.getString("arafaCategory","");
        String Tent=sharedPref.getString("tent","");
        String other=sharedPref.getString("other","");


        profileData.setText(HName+"\n"+
        HMob+"\n"+
                CName+"\n"+
                CMob+"\n"+
                Hotel+"\n"+
                id+"\n"+
                autho+"\n"+
                nationality+"\n"+
                Mcamp+"     "+Mcat+"\n"+
                ACamp+"     "+ACat+"\n"+
                Tent+"\n"+
                other+"\n"

        );




        Edit= (Button) findViewById(R.id.edit);
        Edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProfileActivity.this,DataActivity.class));
            }
        });

      Back= (Button) findViewById(R.id.back);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProfileActivity.this,HomeActivityB.class));
            }
        });
    }

}
