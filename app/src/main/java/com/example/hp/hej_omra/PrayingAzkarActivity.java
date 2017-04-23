package com.example.hp.hej_omra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class PrayingAzkarActivity extends AppCompatActivity
{
    private ArrayList<String> PrayingAzkar=new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praying_azkar);
        initViews();
    }

    private void initViews() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerPraying_list);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);



        PrayingAzkar.add("Remoo1");
        PrayingAzkar.add("Remoo2");
        PrayingAzkar.add("Remoo3");



        RecyclerView.Adapter adapter = new RecyclerAdapter(PrayingAzkar);
        recyclerView.setAdapter(adapter);
    }
}
