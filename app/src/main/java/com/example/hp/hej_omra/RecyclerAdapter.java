package com.example.hp.hej_omra;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import static android.support.v7.widget.RecyclerView.*;

/**
 * Created by hp on 4/16/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>
{
    private ArrayList<String> MornAzkar;

    public RecyclerAdapter(ArrayList<String> MorningAzkar) {
        this.MornAzkar = MorningAzkar;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row_item, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        holder.MorAzkarTV.setText(MornAzkar.get(position));
    }

    @Override
    public int getItemCount() {
        return MornAzkar.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView MorAzkarTV;
        public ViewHolder(View view)
        {
            super(view);

            MorAzkarTV = (TextView)view.findViewById(R.id.recyclerTV);
        }
    }
}
