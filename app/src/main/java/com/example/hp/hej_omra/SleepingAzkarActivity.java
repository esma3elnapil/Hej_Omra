package com.example.hp.hej_omra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class SleepingAzkarActivity extends AppCompatActivity
{
    private ArrayList<String> SleepingAzkar=new ArrayList<String>();
    String[]Sleep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleeping_azkar);
        initViews();
    }
    private void initViews() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerSleeping_list);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        Sleep=getResources().getStringArray(R.array.SleepAzkar);
        for(int i =0;i<Sleep.length;i++)
        {
            SleepingAzkar.add(Sleep[i]);

        }



        RecyclerView.Adapter adapter = new RecyclerAdapter(SleepingAzkar);
        recyclerView.setAdapter(adapter);
    }
}
