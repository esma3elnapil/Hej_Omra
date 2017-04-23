package com.example.hp.hej_omra;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ElectronicSebhaActivity extends AppCompatActivity implements View.OnClickListener
{
    Button Increment,Reset;
    private static int InitialValue=0;
    TextView ScreenTV;
    SharedPreferences sharedpreferences;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronic_sebha);
        Increment= (Button) findViewById(R.id.incrementBT);
        Reset= (Button) findViewById(R.id.resetBT);
        ScreenTV= (TextView) findViewById(R.id.screen);


        Increment.setOnClickListener(this);
        Reset.setOnClickListener(this);


        sharedpreferences = getSharedPreferences("mypref",
                Context.MODE_PRIVATE);
        if (sharedpreferences.contains("value")) {
            ScreenTV.setText(sharedpreferences.getString("value", ""));
        }


    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.incrementBT:
                InitialValue++;
                ScreenTV.setText(Integer.toString(InitialValue));
                Save();
                break;


            case R.id.resetBT:
                InitialValue=0;
              ScreenTV.setText(Integer.toString(InitialValue));
                break;

        }

    }
    public void Save() {
        String n = ScreenTV.getText().toString();


        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString("value", n);
        editor.commit();
    }

}
