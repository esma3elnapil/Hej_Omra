package com.example.hp.hej_omra;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AnwaaAlHejActivity extends AppCompatActivity
{
TextView AnwaaTXT;
    ImageView AnwaaIMG;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anwaa_al_hej);
        AnwaaIMG= (ImageView) findViewById(R.id.anwaaIMG);
        AnwaaTXT= (TextView) findViewById(R.id.anwaaTXT);
         AnwaaIMG.setImageResource(R.drawable.ifada);
        String data = readTextFile(this, R.raw.anwaa);
        AnwaaTXT.setText(data);
    }
    public static String readTextFile(Context ctx, int resId)
    {
        InputStream inputStream = ctx.getResources().openRawResource(resId);

        InputStreamReader inputreader = new InputStreamReader(inputStream);
        BufferedReader bufferedreader = new BufferedReader(inputreader);
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        try
        {
            while (( line = bufferedreader.readLine()) != null)
            {
                stringBuilder.append(line);
                stringBuilder.append('\n');
            }
        }
        catch (IOException e)
        {
            return null;
        }
        return stringBuilder.toString();
    }
}
