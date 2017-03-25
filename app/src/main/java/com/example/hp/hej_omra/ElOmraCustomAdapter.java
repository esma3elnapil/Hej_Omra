package com.example.hp.hej_omra;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by hp on 3/13/2017.
 */

public class ElOmraCustomAdapter extends BaseAdapter
{
    Context con;
    String[]name;
    int[]pic;
    private static LayoutInflater inflater=null;
    public ElOmraCustomAdapter( ElOmraActivity showActivity,String[]resnames,int[]respics)
    {
        name=resnames;
        pic=respics;
        con=showActivity;
        inflater = (LayoutInflater)con.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return name.length;
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
    public View getView(final int i, View view, ViewGroup viewGroup)
    {

        final TextView namee;
        ImageView image;
        final CheckBox checkBox;
        View rowView = inflater.inflate(R.layout.omra_itemlist, null);
        namee= (TextView) rowView.findViewById(R.id.itemlist_TV);
        image= (ImageView) rowView.findViewById(R.id.itemlist_ImV);

        checkBox = (CheckBox) rowView.findViewById(R.id.OmracheckBox);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    SharedPreferences sharedPreferences = con.getSharedPreferences("OmraSteps",0);
                    SharedPreferences.Editor editor= sharedPreferences.edit();
                    editor.putBoolean("EhramDone",true);
                    editor.apply();
                    Toast.makeText(con,"ehram true",Toast.LENGTH_SHORT).show();
                }else if (!isChecked){
                    SharedPreferences sharedPreferences = con.getSharedPreferences("OmraSteps",0);
                    SharedPreferences.Editor editor= sharedPreferences.edit();
                    editor.putBoolean("EhramDone",false);
                    editor.apply();
                    Toast.makeText(con,"ehram false",Toast.LENGTH_SHORT).show();
                }
            }
        });

        //املاهم من الداتا بيز -- لا :P
        namee.setText(name[i]);
        image.setImageResource(pic[i]);
        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                switch (i)
                {
                    case 0:
                        Intent in=new Intent(con,AlEhramActivity.class);
                        con.startActivity(in);
                        break;
                    case 1:
                        Intent in2=new Intent(con,E_MosqueActivity.class);
                        con.startActivity(in2);
                        break;
                    case 2:
                        Intent in3=new Intent(con,AlTawafActivity.class);
                        con.startActivity(in3);

                        break;
                    case 3:
                        Intent in4=new Intent(con,MaqamEbrahimActivity.class);

                          con.startActivity(in4);
                        break;
                    case 4:
                        Intent in5=new Intent(con,AlSaeyActivity.class);
                        con.startActivity(in5);
                        break;
                    case 5:
                        Intent in6=new Intent(con,AlTahlolActivity.class);
                        con.startActivity(in6);
                        break;

                }


            }
        });

        return rowView;
    }

}
