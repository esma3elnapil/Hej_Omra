package com.example.hp.hej_omra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ArkanAlHejActivity extends AppCompatActivity implements View.OnClickListener
{
    CheckBox IhramCB,WokofArafaCB,TawafIfadaCB,SaeeyCB;
    ImageView IhramIM,WokofArafaIM,TawafIfadaIM,SaeeyIM;
    TextView IhramTV,WokofArafaTV,TawafIfadaTV,SaeeyTV;
    Button ResetHej;
    ProgressBar AlhejProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arkan_al_hej);
        ArkanIniti();
    }

    private void ArkanIniti(){
        IhramCB= (CheckBox) findViewById(R.id.ihramcheckBox);
        WokofArafaCB= (CheckBox) findViewById(R.id.wokofArafacheckBox);
        TawafIfadaCB= (CheckBox) findViewById(R.id.tawafIfadacheckBox);
        SaeeyCB= (CheckBox) findViewById(R.id.saeeycheckBox);
        AlhejProgress= (ProgressBar) findViewById(R.id.AlhejprogressBar);
        IhramCB.setOnClickListener(this);
        TawafIfadaCB.setOnClickListener(this);
        WokofArafaCB.setOnClickListener(this);
        SaeeyCB.setOnClickListener(this);

        ResetHej= (Button) findViewById(R.id.ResetHejButton);
        ResetHej.setOnClickListener(this);


        IhramTV= (TextView) findViewById(R.id.iharmtextView);
        SaeeyTV= (TextView) findViewById(R.id.saeeytextView);
        TawafIfadaTV= (TextView) findViewById(R.id.tawafIfadatextView);
        WokofArafaTV= (TextView) findViewById(R.id.wokofArafatextView);

        IhramIM= (ImageView) findViewById(R.id.ihramimageView);
        SaeeyIM= (ImageView) findViewById(R.id.saeeyimageView);
        TawafIfadaIM= (ImageView) findViewById(R.id.tawafIfadaimageView);
        WokofArafaIM= (ImageView) findViewById(R.id.wokofArafaimageView);




    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId()){
            case R.id.ihramcheckBox:

                break;

            case R.id.wokofArafacheckBox:

                break;

            case R.id.tawafIfadacheckBox:

                break;

            case R.id.saeeycheckBox:

                break;

            case R.id.ResetHejButton:

                break;
        }

    }
}
