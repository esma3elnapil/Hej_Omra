package com.example.hp.hej_omra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class WagebatAlHejActivity extends AppCompatActivity
{
    ImageView IhramFMeqatIM,WokofArafaNightIM,MabeetMozalfaIM,MabeetMenneIM,RamiGamratIM,HalqIm,TawafWadaaIM;
    TextView IhramFMeqatTV,WokofArafaNightTV,MabeetMozalfaTV,MabeetMenneTV,RamiGamratTV,HalqTV,TawafWadaaTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wagebat_al_hej);
        wagebatIniti();
    }
    private void wagebatIniti()
    {
        IhramFMeqatIM= (ImageView) findViewById(R.id.ihramFmeqatimageView);
        WokofArafaNightIM= (ImageView) findViewById(R.id.WArafaNightimageView);
        MabeetMozalfaIM= (ImageView) findViewById(R.id.mabeetmozdlafaimageView);
        MabeetMenneIM= (ImageView) findViewById(R.id.mabeetBmannaimageView);
        RamiGamratIM= (ImageView) findViewById(R.id.ramiGamratimageView);
        HalqIm= (ImageView) findViewById(R.id.HalqTaqseerimageView);
        TawafWadaaIM= (ImageView) findViewById(R.id.TawafWadaaimageView);


        IhramFMeqatTV= (TextView) findViewById(R.id.ihramFmeqattextView);
       WokofArafaNightTV = (TextView) findViewById(R.id.wokofArafatextView);
        MabeetMozalfaTV= (TextView) findViewById(R.id.mabeetMozdalfatextView);
        MabeetMenneTV= (TextView) findViewById(R.id.mabeetBmannatextView);
        RamiGamratTV= (TextView) findViewById(R.id.ramiGamarattextView);
        HalqTV= (TextView) findViewById(R.id.HalqTaqseertextView);
        TawafWadaaTV= (TextView) findViewById(R.id.tawafWadaatextView);

    }
}
