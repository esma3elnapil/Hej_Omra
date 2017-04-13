package com.example.hp.hej_omra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlSaeyActivity extends AppCompatActivity  implements View.OnClickListener
{
    Button SaeyStart;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_saey);
        SaeyInti();
    }


    private void SaeyInti()
    {

        SaeyStart= (Button) findViewById(R.id.saeyStart);

        SaeyStart.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.saeyStart:
                break;

        }

    }
}
