package com.example.hp.hej_omra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class E_MosqueActivity extends AppCompatActivity implements View.OnClickListener
{
    ImageView E_MosqueImV;

    TextView E_mosTv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e__mosque);

        E_MosqueImV= (ImageView) findViewById(R.id.E_M_ImV);
        E_mosTv= (TextView) findViewById(R.id.E_M_tv);

    }

    @Override
    public void onClick(View view)
    {


    }
}
