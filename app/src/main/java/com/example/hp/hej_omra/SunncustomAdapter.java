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
    String[]sub;
   // int[]pics;
    private static LayoutInflater inflater=null;
    public SunncustomAdapter(AlMekatActivity mekatActivity, String[]sunnnames,String[]s)
    {
        Sunn=sunnnames;
     sub=s;
        con=mekatActivity;

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
        TextView SunntextView,mekat;
       // ImageView SunnimageView;
        View rowView = inflater.inflate(R.layout.mekat_itemlist, null);
        SunntextView= (TextView) rowView.findViewById(R.id.headerTv);
        mekat= (TextView) rowView.findViewById(R.id.subjTV);
       // SunnimageView= (ImageView) rowView.findViewById(R.id.sunnimageView);
        SunntextView.setText(Sunn[i]);
        mekat.setText(sub[i]);
       // SunnimageView.setImageResource(pics[i]);
        return rowView;
    }
}
