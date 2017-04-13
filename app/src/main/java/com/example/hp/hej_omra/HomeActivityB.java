package com.example.hp.hej_omra;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class HomeActivityB extends AppCompatActivity implements View.OnClickListener {
    private ImageView Hej, Omra, Azkar, Meqat, Hotels,prayImageView;
    private TextView hejtv, omratv, azkartv, meqattv, hoteltv, anothertv , StepstextView;

    Typeface font;
    SharedPreferences Pref;
    int ProgressCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_b);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        inti();
        CheckProgress();

    }

    @Override
    protected void onResume() {
        super.onResume();
        CheckProgress();
    }

    private void CheckProgress(){
        ProgressCounter = 0 ;
        Pref = getSharedPreferences("OmraSteps", 0);
        if (Pref.contains("EhramDone")) {
            boolean EhramDone = Pref.getBoolean("EhramDone", false);
            if (EhramDone) {
                ProgressCounter = ProgressCounter + 1;
            }
        }

        if (Pref.contains("MasjedDone")) {
            boolean MasjedDone = Pref.getBoolean("MasjedDone", false);
            if (MasjedDone) {
                ProgressCounter = ProgressCounter + 1;
            }
        }


        if (Pref.contains("TawafDone")) {
            boolean TawafDone = Pref.getBoolean("TawafDone", false);
            if (TawafDone) {
                ProgressCounter = ProgressCounter + 1;
            }
        }

        if (Pref.contains("MakamDone")) {
            boolean MakamDone = Pref.getBoolean("MakamDone", false);
            if (MakamDone) {
                ProgressCounter = ProgressCounter + 1;
            }
        }

        if (Pref.contains("AlsaeyDone")) {
            boolean AlsaeyDone = Pref.getBoolean("AlsaeyDone", false);
            if (AlsaeyDone) {
                ProgressCounter = ProgressCounter + 1;
            }
        }

        if (Pref.contains("TahalolDone")) {
            boolean TahalolDone = Pref.getBoolean("TahalolDone", false);
            if (TahalolDone){
                ProgressCounter = ProgressCounter + 1;
            }
        }
        if (ProgressCounter == 6){
        StepstextView.setBackgroundResource(R.drawable.greentextviewstyle);
            StepstextView.setVisibility(View.VISIBLE);
            StepstextView.setText(String.valueOf(ProgressCounter));

        }else if( ProgressCounter == 0 ){
            StepstextView.setVisibility(View.INVISIBLE);
        }else {
            StepstextView.setBackgroundResource(R.drawable.yellowtextviewstyle);
            StepstextView.setVisibility(View.VISIBLE);
            StepstextView.setText(String.valueOf(ProgressCounter));
        }


    }


    private void inti() {

        font = Typeface.createFromAsset(getAssets(), "fonts/jazel.ttf");

        hejtv = (TextView) findViewById(R.id.hjtv);
        omratv = (TextView) findViewById(R.id.omratv);
        azkartv = (TextView) findViewById(R.id.azkartv);
        meqattv = (TextView) findViewById(R.id.meqattv);
        hoteltv = (TextView) findViewById(R.id.hoteltv);
        anothertv = (TextView) findViewById(R.id.anothertv);
        StepstextView=(TextView)findViewById(R.id.StepstextView);

        hejtv.setTypeface(font);
        omratv.setTypeface(font);
        azkartv.setTypeface(font);
        meqattv.setTypeface(font);
        hoteltv.setTypeface(font);
        anothertv.setTypeface(font);

        Hej = (ImageView) findViewById(R.id.Hej_imv);
        Omra = (ImageView) findViewById(R.id.Omra_imv);
        Azkar = (ImageView) findViewById(R.id.azkar_id);
        Meqat = (ImageView) findViewById(R.id.meqat_id);
        Hotels = (ImageView) findViewById(R.id.hotels_id);
        prayImageView= (ImageView) findViewById(R.id.another);



        Hej.setOnClickListener(this);
        Omra.setOnClickListener(this);
        Azkar.setOnClickListener(this);
        Meqat.setOnClickListener(this);
        Hotels.setOnClickListener(this);
        prayImageView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Hej_imv:
                startActivity(new Intent(HomeActivityB.this,AlHejActivity.class));
                break;

            case R.id.Omra_imv:
                startActivity(new Intent(HomeActivityB.this, ElOmraActivity.class));
                break;
            case R.id.omratv:
                startActivity(new Intent(HomeActivityB.this, ElOmraActivity.class));
                break;

            case R.id.azkar_id:
                break;

            case R.id.meqat_id:
                break;

            case R.id.hotels_id:
                break;
            case R.id.another:
                startActivity(new Intent(HomeActivityB.this, PrayActivity.class));
                break;
            case R.id.anothertv:
                startActivity(new Intent(HomeActivityB.this, PrayActivity.class));
                break;
        }

    }
}
