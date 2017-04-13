package com.example.hp.hej_omra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MaqamEbrahimActivity extends AppCompatActivity implements View.OnClickListener
{
    TextView Maqam_Tv;
    ImageView Maqam_Im;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maqam_ebrahim);
        Maqam_Im= (ImageView) findViewById(R.id.Maqam_Im);
        Maqam_Tv= (TextView) findViewById(R.id.Maqam_Tv);



    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {


        }

    }
}
