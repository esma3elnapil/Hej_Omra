package com.example.hp.hej_omra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ElOmraActivity extends AppCompatActivity
{
    ListView OmraListView;
    String[]OmraList;

int []ListPics={R.drawable.azkar,R.drawable.hej,R.drawable.hotels,R.drawable.meqat,R.drawable.omra,R.drawable.splash};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_el_omra);
        OmraListView= (ListView) findViewById(R.id.elomra_lV);
        OmraList=getResources().getStringArray(R.array.OmraListView);
        OmraListView.setAdapter(new ElOmraCustomAdapter(this,OmraList,ListPics));
    }
}