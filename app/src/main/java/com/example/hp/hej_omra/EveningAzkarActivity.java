package com.example.hp.hej_omra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class EveningAzkarActivity extends AppCompatActivity
{
    private ArrayList<String> EvenAzkar=new ArrayList<String>();
  String[]EAzkar;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evening_azkar);
        EAzkar=getResources().getStringArray(R.array.EvenAzkar);
        initViews();
    }
    private void initViews()
    {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerEven_list);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        for(int i=0;i<EAzkar.length;i++)
        {
            EvenAzkar.add(EAzkar[i]);
        }
        RecyclerView.Adapter adapter = new RecyclerAdapter(EvenAzkar);
        recyclerView.setAdapter(adapter);
    }

}
