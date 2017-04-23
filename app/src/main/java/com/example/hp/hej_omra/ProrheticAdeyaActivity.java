package com.example.hp.hej_omra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ProrheticAdeyaActivity extends AppCompatActivity
{
    private ArrayList<String> PropheticAdeya=new ArrayList<String>();
    String[]ProphAdeya;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prorhetic_adeya);
        initViews();
    }
    private void initViews() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerProphet_list);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

      ProphAdeya=getResources().getStringArray(R.array.proheticAdeeya);
        for(int i=0;i<ProphAdeya.length;i++){
            PropheticAdeya.add(ProphAdeya[i]);
        }



        RecyclerView.Adapter adapter = new RecyclerAdapter(PropheticAdeya);
        recyclerView.setAdapter(adapter);
    }

}
