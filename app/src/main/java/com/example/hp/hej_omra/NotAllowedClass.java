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

public class NotAllowedClass extends Fragment
{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes

            View ve=    inflater.inflate(R.layout.notallowe_ihram_frag, container, false);
        String[]Notallowed=ve.getResources().getStringArray(R.array.mahzuratList);
        ListView allow= (ListView) ve.findViewById(R.id.NotallowedLV);
        allow.setAdapter(new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1 , Notallowed));

        return ve;
    }
}
