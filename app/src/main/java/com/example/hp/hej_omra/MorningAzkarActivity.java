package com.example.hp.hej_omra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class MorningAzkarActivity extends AppCompatActivity
{
    private ArrayList <String>MorningAzkar=new ArrayList<String>();
    String[]Mazkar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morning_azkar);
        initViews();
    }


    private void initViews()
    {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_list);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        Mazkar=getResources().getStringArray(R.array.morninngAzkar);
        for(int i =0;i<Mazkar.length;i++)
        {
            MorningAzkar.add(Mazkar[i]);

        }


/*
        MorningAzkar.add("Remoo1");
        MorningAzkar.add("Remoo2");
        MorningAzkar.add("Remoo3");
        MorningAzkar.add("Remoo4");
        MorningAzkar.add("Remoo5");
        MorningAzkar.add("Remoo6");
        MorningAzkar.add("Remoo7");
        MorningAzkar.add("Remoo8");
        MorningAzkar.add("Remoo9");
        MorningAzkar.add("Remoo10");
        MorningAzkar.add("Remoo11");
        MorningAzkar.add("Remoo12");
*/

        RecyclerView.Adapter adapter = new RecyclerAdapter(MorningAzkar);
        recyclerView.setAdapter(adapter);
    }
}
