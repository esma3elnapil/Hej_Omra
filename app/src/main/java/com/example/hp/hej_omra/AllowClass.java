package com.example.hp.hej_omra;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by hp on 4/11/2017.
 */

public class AllowClass extends Fragment
{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes

        View v=    inflater.inflate(R.layout.allowed_ihram, container, false);
        String[]allowed=v.getResources().getStringArray(R.array.mosthbatIhram);
        ListView allow= (ListView) v.findViewById(R.id.allowedLV);
        allow.setAdapter(new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1 , allowed));
        return v;
    }
}
