package com.example.hp.hej_omra;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import android.widget.ImageView;
import android.widget.TextView;

public class HomeActivityB extends AppCompatActivity implements View.OnClickListener {
   private ImageView Hej,Omra,Azkar,Meqat,Hotels,TimeImageView;
    private TextView hejtv,omratv,azkartv,meqattv,hoteltv,anothertv,CityTv,TimeTv;

    Typeface font ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_b);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        inti();
        TimeAndCityVolleyRequest();

    }

    private void TimeAndCityVolleyRequest() {

    }

    private  void inti()
    {
        font = Typeface.createFromAsset(getAssets(),"fonts/jazel.ttf");
        CityTv = (TextView)findViewById(R.id.CityTv);
        TimeTv = (TextView)findViewById(R.id.TimeTv);
        hejtv = (TextView)findViewById(R.id.hjtv);
        omratv = (TextView)findViewById(R.id.omratv);
        azkartv = (TextView)findViewById(R.id.azkartv);
        meqattv = (TextView)findViewById(R.id.meqattv);
        hoteltv = (TextView)findViewById(R.id.hoteltv);
        anothertv = (TextView)findViewById(R.id.anothertv);

        hejtv.setTypeface(font);
        omratv.setTypeface(font);
        azkartv.setTypeface(font);
        meqattv.setTypeface(font);
        hoteltv.setTypeface(font);
        anothertv.setTypeface(font);

        Hej= (ImageView) findViewById(R.id.Hej_imv);
        Omra= (ImageView) findViewById(R.id.Omra_imv);
        Azkar= (ImageView) findViewById(R.id.azkar_id);
        Meqat= (ImageView) findViewById(R.id.meqat_id);
        Hotels= (ImageView) findViewById(R.id.hotels_id);
        TimeImageView= (ImageView) findViewById(R.id.TimeImageView);


        Hej.setOnClickListener(this);
        Omra.setOnClickListener(this);
        Azkar.setOnClickListener(this);
        Meqat.setOnClickListener(this);
        Hotels.setOnClickListener(this);

    }
    @Override
    public void onClick(View view)
    {
        switch (view.getId()){
            case R.id.Hej_imv:
                break;

            case R.id.Omra_imv:
                startActivity(new Intent(HomeActivityB.this,ElOmraActivity.class));
                break;

            case R.id.azkar_id:
                break;

            case R.id.meqat_id:
                break;

            case R.id.hotels_id:
                break;
        }

    }
}
