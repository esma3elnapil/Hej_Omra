package com.example.hp.hej_omra;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by hp on 4/7/2017.
 */

public class mahzuratCustomAdapter extends BaseAdapter
{
    String[]MahList;
    Context C;
    int[]MahPics;
    private static LayoutInflater inflater=null;
    public mahzuratCustomAdapter( MahzuratAlHejActivity mahzuratAlHejActivities,String[]list,int[]Pics)
    {
        MahList=list;
        MahPics=Pics;
        C=mahzuratAlHejActivities;
        inflater = (LayoutInflater)C.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }
    @Override
    public int getCount() {
        return MahList.length;
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
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        View rowView = inflater.inflate(R.layout.mahzurat_itemlist, null);
        TextView mahText= (TextView) rowView.findViewById(R.id.mahText);
        ImageView MahImg= (ImageView) rowView.findViewById(R.id.mahimageView);
        mahText.setText(MahList[i]);
        MahImg.setImageResource(MahPics[i]);

        return rowView;
    }
}
