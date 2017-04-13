package com.example.hp.hej_omra;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by hp on 3/30/2017.
 */

public class SunncustomAdapter extends BaseAdapter
{
    Context con;
    String[]Sunn;
    int[]pics;
    private static LayoutInflater inflater=null;
    public SunncustomAdapter(SunnAlHejActivity sunnAlHejActivity, String[]sunnnames,int[]sunnpics)
    {
        Sunn=sunnnames;
        pics=sunnpics;
        con=sunnAlHejActivity;

        inflater = (LayoutInflater)con.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return Sunn.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView( int i, View view, ViewGroup viewGroup)
    {
        TextView SunntextView;
        ImageView SunnimageView;
        View rowView = inflater.inflate(R.layout.sunn_itemlist, null);
        SunntextView= (TextView) rowView.findViewById(R.id.sunntextView);
        SunnimageView= (ImageView) rowView.findViewById(R.id.sunnimageView);
        SunntextView.setText(Sunn[i]);
        SunnimageView.setImageResource(pics[i]);
        return rowView;
    }
}
