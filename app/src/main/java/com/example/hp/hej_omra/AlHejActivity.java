package com.example.hp.hej_omra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AlHejActivity extends AppCompatActivity implements View.OnClickListener
{
    ImageView ArkanAhejIm,WagebatAlhejIm,SunnAlhejIm,MahzuratAlhejIm,AlhadiIm,AnwaaAlhejIm;
    TextView  ArkanAhejTV,WagebatAlhejTV,SunnAlhejTV,MahzuratAlhejTV,AlhadiTV,AnwaaAlhejTV;
    LinearLayout Arkan,Wagebat,Sunn,Mahzurat,Hadi,Anwaa;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_hej);
        HejInti();
    }
    private void HejInti()
    {
        ArkanAhejIm= (ImageView) findViewById(R.id.ArHejimageView);
        WagebatAlhejIm= (ImageView) findViewById(R.id.WahejimageView);
        SunnAlhejIm= (ImageView) findViewById(R.id.SuHejimageView);
        MahzuratAlhejIm= (ImageView) findViewById(R.id.MahHejimageView);
        AlhadiIm= (ImageView) findViewById(R.id.HadiimageView);
        AnwaaAlhejIm= (ImageView) findViewById(R.id.AnwHejimageView);

        ArkanAhejTV= (TextView) findViewById(R.id.ArHejtextView);
        WagebatAlhejTV= (TextView) findViewById(R.id.WaHejtextView);
        SunnAlhejTV= (TextView) findViewById(R.id.SuHejtextView);
        MahzuratAlhejTV= (TextView) findViewById(R.id.MahHejtextView);
        AlhadiTV= (TextView) findViewById(R.id.HaditextView);
        AnwaaAlhejTV= (TextView) findViewById(R.id.AnwHejtextView);

        Arkan= (LinearLayout) findViewById(R.id.Arkan);
        Wagebat= (LinearLayout) findViewById(R.id.wagebat);
        Sunn= (LinearLayout) findViewById(R.id.Sunn);
        Mahzurat= (LinearLayout) findViewById(R.id.Mahzurat);
        Hadi= (LinearLayout) findViewById(R.id.Hadi);
        Anwaa= (LinearLayout) findViewById(R.id.Anwaa);

        Arkan.setOnClickListener(this);
        Wagebat.setOnClickListener(this);
        Mahzurat.setOnClickListener(this);
        Anwaa.setOnClickListener(this);
        Sunn.setOnClickListener(this);
        Hadi.setOnClickListener(this);








    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId()){
            case R.id.Arkan:
                startActivity(new Intent(AlHejActivity.this,ArkanAlHejActivity.class));

                break;

            case R.id.wagebat:
                startActivity(new Intent(AlHejActivity.this,WagebatAlHejActivity.class));
                break;

            case R.id.Mahzurat:
                startActivity(new Intent(AlHejActivity.this,MahzuratAlHejActivity.class));
                break;

            case R.id.Sunn:
                startActivity(new Intent(AlHejActivity.this,SunnAlHejActivity.class));
                break;

            case R.id.Hadi:
                startActivity(new Intent(AlHejActivity.this,AlHadiActivity.class));
                break;

            case R.id.Anwaa:
                startActivity(new Intent(AlHejActivity.this,AnwaaAlHejActivity.class));
                break;
        }

    }
}
