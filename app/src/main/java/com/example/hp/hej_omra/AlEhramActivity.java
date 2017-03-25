package com.example.hp.hej_omra;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlEhramActivity extends AppCompatActivity implements View.OnClickListener
{
    Button IharmDoneBt;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_ehram);
        IharmDoneBt= (Button) findViewById(R.id.bt);
        IharmDoneBt.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.bt:
                SharedPreferences sharedPreferences = getSharedPreferences("OmraSteps",0);
                SharedPreferences.Editor editor= sharedPreferences.edit();
                editor.putBoolean("EhramDone",true);
                if (editor.commit()){
                    startActivity(new Intent(AlEhramActivity.this, ElOmraActivity.class));
                }else{
                    editor.commit();
                    startActivity(new Intent(AlEhramActivity.this, ElOmraActivity.class));
                }
                break;
        }

    }
}
