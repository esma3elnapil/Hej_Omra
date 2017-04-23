package com.example.hp.hej_omra;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import android.widget.ImageView;
import android.widget.TextView;

public class HomeActivityB extends AppCompatActivity implements View.OnClickListener {
    private ImageView Hej, Omra, Azkar, Meqat, Hotels,prayImageView;
    private TextView hejtv, omratv, azkartv, meqattv, hoteltv, anothertv , OmraStepstextView,HejStepstextView;

    Typeface font;
    private SharedPreferences OmraPref , HejPref;
    private int OmraProgressCounter = 0 ;
    private int HejProgressCounter = 0 ;


    SharedPreferences DataPref;
    public static final String MY_PREFS_NAME = "MyPrefsFile";


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
        OmraProgressCounter = 0 ;
        HejProgressCounter = 0 ;

        OmraPref = getSharedPreferences("OmraSteps", 0);
        HejPref = getSharedPreferences("HejSteps", 0);
        //------------------------------------------------ Omra
        if (OmraPref.contains("EhramDone")) {
            boolean EhramDone = OmraPref.getBoolean("EhramDone", false);
            if (EhramDone) {
                OmraProgressCounter = OmraProgressCounter + 1;
            }
        }

        if (OmraPref.contains("MasjedDone")) {
            boolean MasjedDone = OmraPref.getBoolean("MasjedDone", false);
            if (MasjedDone) {
                OmraProgressCounter = OmraProgressCounter + 1;
            }
        }


        if (OmraPref.contains("TawafDone")) {
            boolean TawafDone = OmraPref.getBoolean("TawafDone", false);
            if (TawafDone) {
                OmraProgressCounter = OmraProgressCounter + 1;
            }
        }

        if (OmraPref.contains("MakamDone")) {
            boolean MakamDone = OmraPref.getBoolean("MakamDone", false);
            if (MakamDone) {
                OmraProgressCounter = OmraProgressCounter + 1;
            }
        }

        if (OmraPref.contains("AlsaeyDone")) {
            boolean AlsaeyDone = OmraPref.getBoolean("AlsaeyDone", false);
            if (AlsaeyDone) {
                OmraProgressCounter = OmraProgressCounter + 1;
            }
        }

        if (OmraPref.contains("TahalolDone")) {
            boolean TahalolDone = OmraPref.getBoolean("TahalolDone", false);
            if (TahalolDone){
                OmraProgressCounter = OmraProgressCounter + 1;
            }
        }
        if (OmraProgressCounter == 6){
        OmraStepstextView.setBackgroundResource(R.drawable.greentextviewstyle);
            OmraStepstextView.setVisibility(View.VISIBLE);
            OmraStepstextView.setText(String.valueOf(OmraProgressCounter));

        }else if( OmraProgressCounter == 0 ){
            OmraStepstextView.setVisibility(View.INVISIBLE);
        }else {
            OmraStepstextView.setBackgroundResource(R.drawable.yellowtextviewstyle);
            OmraStepstextView.setVisibility(View.VISIBLE);
            OmraStepstextView.setText(String.valueOf(OmraProgressCounter));
        }
        //------------------------------------------- Hej
        if (HejPref.contains("EhramDone")) {
            boolean EhramDone = HejPref.getBoolean("EhramDone", false);
            if (EhramDone) {
                HejProgressCounter = HejProgressCounter + 1;
            }
        }

        if (HejPref.contains("WokofArafaDone")) {
            boolean WokofArafaDone = HejPref.getBoolean("WokofArafaDone", false);
            if (WokofArafaDone) {
                HejProgressCounter = HejProgressCounter + 1;
            }
        }

        if (HejPref.contains("TawafIfadaDone")) {
            boolean TawafIfadaDone = HejPref.getBoolean("TawafIfadaDone", false);
            if (TawafIfadaDone) {
                HejProgressCounter = HejProgressCounter + 1;
            }
        }

        if (HejPref.contains("SaeeyDone")) {
            boolean SaeeyDone = HejPref.getBoolean("SaeeyDone", false);
            if (SaeeyDone){
                HejProgressCounter = HejProgressCounter + 1;
            }
        }
        if (HejProgressCounter == 4){
            HejStepstextView.setBackgroundResource(R.drawable.greentextviewstyle);
            HejStepstextView.setVisibility(View.VISIBLE);
            HejStepstextView.setText(String.valueOf(HejProgressCounter));

        }else if( HejProgressCounter == 0 ){
            HejStepstextView.setVisibility(View.INVISIBLE);
        }else {
            HejStepstextView.setBackgroundResource(R.drawable.yellowtextviewstyle);
            HejStepstextView.setVisibility(View.VISIBLE);
            HejStepstextView.setText(String.valueOf(HejProgressCounter));
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
        OmraStepstextView =(TextView)findViewById(R.id.OmraStepstextView);
        HejStepstextView=(TextView)findViewById(R.id.HejStepstextView);

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
                startActivity(new Intent(HomeActivityB.this,AzkarActivity.class));
                break;

            case R.id.meqat_id:
                startActivity(new Intent(HomeActivityB.this,AlMekatActivity.class));
                break;

            case R.id.hotels_id:


                    startActivity(new Intent(HomeActivityB.this, DataActivity.class));


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
