package com.example.hp.hej_omra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class SunnAlHejActivity extends AppCompatActivity
{
    ListView SunnListView;
    String[]SunnArr;
    int[]SunnPics={R.drawable.arafa,R.drawable.arafa,R.drawable.arafa,R.drawable.arafa,
            R.drawable.arafa,R.drawable.arafa,R.drawable.arafa,R.drawable.arafa};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunn_al_hej);

        SunnListView= (ListView) findViewById(R.id.sunnListView);
        SunnArr=getResources().getStringArray(R.array.sunnArray);
        SunnListView.setAdapter(new SunncustomAdapter( this,SunnArr,SunnPics));
    }
}
