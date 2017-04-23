package com.example.hp.hej_omra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class AlMekatActivity extends AppCompatActivity
{
    ListView mekatList;
    String[]mekatHeader,mekatSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_mekat);
        mekatList= (ListView) findViewById(R.id.mekatListview);
        mekatHeader=getResources().getStringArray(R.array.mekatHeader);
        mekatSub=getResources().getStringArray(R.array.mekatSubjevt);
        mekatList.setAdapter(new SunncustomAdapter( this,mekatHeader,mekatSub));

    }
}
