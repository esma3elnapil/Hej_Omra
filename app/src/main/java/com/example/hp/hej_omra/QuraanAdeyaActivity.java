package com.example.hp.hej_omra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class QuraanAdeyaActivity extends AppCompatActivity
{
    private ArrayList<String> QuraanAdeya=new ArrayList<String>();
    String[]quraan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quraan_adeya);
        initViews();
    }
    private void initViews() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerQuraan_list);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

      quraan=getResources().getStringArray(R.array.quraanAdeeya);
        for(int i =0;i<quraan.length;i++)
        {
            QuraanAdeya.add(quraan[i]);

        }





        RecyclerView.Adapter adapter = new RecyclerAdapter(QuraanAdeya);
        recyclerView.setAdapter(adapter);
    }
}
