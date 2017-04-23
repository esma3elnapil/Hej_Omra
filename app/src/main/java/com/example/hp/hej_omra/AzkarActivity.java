package com.example.hp.hej_omra;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AzkarActivity extends AppCompatActivity implements View.OnClickListener
{
    ImageView MornAzkarIM,EvenAzkarIM,SleepingAzkarIM,PrayingAzkarIM,QuraanClaimIM,PropheticClaimIM,ElecSebhaIM;
    TextView MornAzkarTV,EvenAzkarTV,SleepingAzkarTV,PrayingAzkarTV,QuraanClaimTV,PropheticClaimTV,ElecSebhaTV;
    Typeface font;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azkar);
       AzkarInit();

    }
    private void AzkarInit()
    {

        font = Typeface.createFromAsset(getAssets(), "fonts/jazel.ttf");
        MornAzkarIM= (ImageView) findViewById(R.id.azkarM_id);
        EvenAzkarIM= (ImageView) findViewById(R.id.azkarE_id);
        SleepingAzkarIM= (ImageView) findViewById(R.id.azkarS_id);
        PrayingAzkarIM= (ImageView) findViewById(R.id.azkarP_id);
        QuraanClaimIM= (ImageView) findViewById(R.id.adeyaQur_id);
        PropheticClaimIM= (ImageView) findViewById(R.id.adeyaPro_id);
        ElecSebhaIM= (ImageView) findViewById(R.id.sebhaIM);

        MornAzkarTV= (TextView) findViewById(R.id.azkarMtv);
        EvenAzkarTV= (TextView) findViewById(R.id.azkarEtv);
        SleepingAzkarTV= (TextView) findViewById(R.id.azkarStv);
        PrayingAzkarTV= (TextView) findViewById(R.id.azkarPtv);
        QuraanClaimTV= (TextView) findViewById(R.id.adeyaQurtv);
        PropheticClaimTV= (TextView) findViewById(R.id.adeyaProtv);
        ElecSebhaTV= (TextView) findViewById(R.id.sebhaTV);


        MornAzkarTV.setTypeface(font);
        EvenAzkarTV.setTypeface(font);
        SleepingAzkarTV.setTypeface(font);
        PrayingAzkarTV.setTypeface(font);
        QuraanClaimTV.setTypeface(font);
        PropheticClaimTV.setTypeface(font);
        ElecSebhaTV.setTypeface(font);

        MornAzkarIM.setOnClickListener(this);
        SleepingAzkarIM.setOnClickListener(this);
        EvenAzkarIM.setOnClickListener(this);
        PrayingAzkarIM.setOnClickListener(this);
        QuraanClaimIM.setOnClickListener(this);
        PropheticClaimIM.setOnClickListener(this);
        ElecSebhaIM.setOnClickListener(this);





    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.azkarM_id:
                startActivity(new Intent(AzkarActivity.this,MorningAzkarActivity.class));
                break;

            case R.id.azkarS_id:
                startActivity(new Intent(AzkarActivity.this,SleepingAzkarActivity.class));
                break;

            case R.id.azkarE_id:
                startActivity(new Intent(AzkarActivity.this,EveningAzkarActivity.class));
                break;

            case R.id.azkarP_id:
                startActivity(new Intent(AzkarActivity.this,PrayingAzkarActivity.class));
                break;

            case R.id.adeyaPro_id:
                startActivity(new Intent(AzkarActivity.this,ProrheticAdeyaActivity.class));
                break;

            case R.id.adeyaQur_id:
                startActivity(new Intent(AzkarActivity.this,QuraanAdeyaActivity.class));
                break;

            case R.id.sebhaIM:
                startActivity(new Intent(AzkarActivity.this,ElectronicSebhaActivity.class));
                break;


        }

    }
}
