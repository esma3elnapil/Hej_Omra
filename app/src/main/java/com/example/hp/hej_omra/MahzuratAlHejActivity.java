package com.example.hp.hej_omra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class MahzuratAlHejActivity extends AppCompatActivity
{
    ListView MahzuratListView;
    String[]mahzuArray;
    int[]mahzuPics={R.drawable.sun,R.drawable.sun,R.drawable.sun,R.drawable.sun,R.drawable.sun,R.drawable.sun,R.drawable.sun};


    @Override

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahzurat_al_hej);
        MahzuratListView= (ListView) findViewById(R.id.mahzuratList);
        mahzuArray=getResources().getStringArray(R.array.mahzuratList);
        MahzuratListView.setAdapter(new mahzuratCustomAdapter( this,mahzuArray,mahzuPics));
    }
}
