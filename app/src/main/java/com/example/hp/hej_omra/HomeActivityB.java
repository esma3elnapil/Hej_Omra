package com.example.hp.hej_omra;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

public class HomeActivityB extends AppCompatActivity implements View.OnClickListener {
    private ImageView Hej, Omra, Azkar, Meqat, Hotels, TimeImageView;
    private TextView hejtv, omratv, azkartv, meqattv, hoteltv, anothertv, CityTv, TimeTv;

    Typeface font;

    RequestQueue queue; //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_b);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        inti();
        TimeAndCityVolleyRequest();

    }

    private void TimeAndCityVolleyRequest() {
        final String url = "http://httpbin.org/get?param1=hello";

        // prepare the Request
        JsonObjectRequest getRequest = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        // display response
                        Log.d("Response", response.toString());
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("Error.Response", String.valueOf(error));
                    }
                }
        );

        // add it to the RequestQueue
        getRequest.setShouldCache(false); //34an myrg34 ntayg 2dema
        queue.add(getRequest);
    }

    private void inti() {
        queue = Volley.newRequestQueue(this);
        font = Typeface.createFromAsset(getAssets(), "fonts/jazel.ttf");
        CityTv = (TextView) findViewById(R.id.CityTv);
        TimeTv = (TextView) findViewById(R.id.TimeTv);
        hejtv = (TextView) findViewById(R.id.hjtv);
        omratv = (TextView) findViewById(R.id.omratv);
        azkartv = (TextView) findViewById(R.id.azkartv);
        meqattv = (TextView) findViewById(R.id.meqattv);
        hoteltv = (TextView) findViewById(R.id.hoteltv);
        anothertv = (TextView) findViewById(R.id.anothertv);

        hejtv.setTypeface(font);
        omratv.setTypeface(font);
        azkartv.setTypeface(font);
        meqattv.setTypeface(font);
        hoteltv.setTypeface(font);
        anothertv.setTypeface(font);

        Hej = (ImageView) findViewById(R.id.Hej_imv);
        Omra = (ImageView) findViewById(R.id.Omra_imv);
        Azkar = (ImageView) findViewById(R.id.azkar_id);
        Meqat = (ImageView) findViewById(R.id.meqat_id);
        Hotels = (ImageView) findViewById(R.id.hotels_id);
        TimeImageView = (ImageView) findViewById(R.id.TimeImageView);


        Hej.setOnClickListener(this);
        Omra.setOnClickListener(this);
        Azkar.setOnClickListener(this);
        Meqat.setOnClickListener(this);
        Hotels.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Hej_imv:
                break;

            case R.id.Omra_imv:
                startActivity(new Intent(HomeActivityB.this, ElOmraActivity.class));
                break;

            case R.id.azkar_id:
                break;

            case R.id.meqat_id:
                break;

            case R.id.hotels_id:
                break;
        }

    }
}
