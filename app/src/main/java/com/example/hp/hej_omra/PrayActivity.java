package com.example.hp.hej_omra;

import android.graphics.Typeface;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class PrayActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView City_TextView, Fagr_TextView, Sunrise_TextView, Duhr_TextView, Asr_TextView
            , Sunset_TextView, Maghrib_TextView, Isha_TextView, Imsak_TextView, Midnight_TextView,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10;
    RequestQueue queue;
    JsonObjectRequest getRequest;
    Typeface font;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pray);

        inti();
        TimeAndCityVolleyRequest();

    }

    private void inti() {
        queue = Volley.newRequestQueue(this);

        font = Typeface.createFromAsset(getAssets(), "fonts/jazel.ttf");

        Fagr_TextView = (TextView) findViewById(R.id.fajrtv);
        City_TextView = (TextView) findViewById(R.id.citytv);
        Sunrise_TextView = (TextView) findViewById(R.id.sunrisetv);
        Duhr_TextView = (TextView) findViewById(R.id.duhrtv);
        Asr_TextView = (TextView) findViewById(R.id.asrtv);
        Sunset_TextView = (TextView) findViewById(R.id.sunsettv);
        Maghrib_TextView = (TextView) findViewById(R.id.maghribtv);
        Isha_TextView = (TextView) findViewById(R.id.ishatv);
        Imsak_TextView = (TextView) findViewById(R.id.imsaktv);
        Midnight_TextView = (TextView) findViewById(R.id.midbighttv);
        f1 = (TextView) findViewById(R.id.f1);
        f2 = (TextView) findViewById(R.id.f2);
        f3 = (TextView) findViewById(R.id.f3);
        f4 = (TextView) findViewById(R.id.f4);
        f5 = (TextView) findViewById(R.id.f5);
        f6 = (TextView) findViewById(R.id.f6);
        f7 = (TextView) findViewById(R.id.f7);
        f8 = (TextView) findViewById(R.id.f8);
        f9 = (TextView) findViewById(R.id.f9);
        f10 = (TextView) findViewById(R.id.f10);
        // FONT
        City_TextView.setTypeface(font);
        Fagr_TextView.setTypeface(font);
        Sunrise_TextView.setTypeface(font);
        Duhr_TextView.setTypeface(font);
        Asr_TextView.setTypeface(font);
        Sunset_TextView.setTypeface(font);
        Maghrib_TextView.setTypeface(font);
        Isha_TextView.setTypeface(font);
        Imsak_TextView.setTypeface(font);
        Midnight_TextView.setTypeface(font);
        f1.setTypeface(font);
        f2.setTypeface(font);
        f3.setTypeface(font);
        f4.setTypeface(font);
        f5.setTypeface(font);
        f6.setTypeface(font);
        f7.setTypeface(font);
        f8.setTypeface(font);
        f9.setTypeface(font);
        f10.setTypeface(font);
        // OnClick
        Fagr_TextView.setOnClickListener(this);
        Sunrise_TextView.setOnClickListener(this);
        Duhr_TextView.setOnClickListener(this);
        Asr_TextView.setOnClickListener(this);
        Sunset_TextView.setOnClickListener(this);
        Maghrib_TextView.setOnClickListener(this);
        Isha_TextView.setOnClickListener(this);
        Imsak_TextView.setOnClickListener(this);
        Midnight_TextView.setOnClickListener(this);

    }

    private void TimeAndCityVolleyRequest() {
        final String url = "http://api.aladhan.com/timingsByCity?city=Makkah&country=sudia&method=4";
        // prepare the Request
        getRequest = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        // display response
                        try {
                            JSONObject jsonObject = response.getJSONObject("data");

                            JSONObject timings = jsonObject.getJSONObject("timings");

                            String Fajr = timings.getString("Fajr");
                            String Sunrise = timings.getString("Sunrise");
                            String Dhuhr = timings.getString("Dhuhr");
                            String Asr = timings.getString("Asr");
                            String Sunset = timings.getString("Sunset");
                            String Maghrib = timings.getString("Maghrib");
                            String Isha = timings.getString("Isha");
                            String Imsak = timings.getString("Imsak");
                            String Midnight = timings.getString("Midnight");

                            JSONObject date = jsonObject.getJSONObject("date");

                            String readable = date.getString("readable");
                            String timestamp = date.getString("timestamp");

                            City_TextView.setText("Makkah");
                            Fagr_TextView.setText(Fajr);
                            Sunrise_TextView.setText(Sunrise);
                            Duhr_TextView.setText(Dhuhr);
                            Asr_TextView.setText(Asr);
                            Sunset_TextView.setText(Sunset);
                            Maghrib_TextView.setText(Maghrib);
                            Isha_TextView.setText(Isha);
                            Imsak_TextView.setText(Imsak);
                            Midnight_TextView.setText(Midnight);


                            Toast.makeText(getApplicationContext(),Fajr.toString(),Toast.LENGTH_LONG).show();


                        } catch (JSONException e) {
                            e.printStackTrace();
                            Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_SHORT).show();
                            queue.add(getRequest);


                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getApplicationContext(),"Error.Response :"+error.toString(),Toast.LENGTH_LONG).show();
                        queue.add(getRequest);

                    }
                }
        );

        //34an myrg34 results 2dema
        getRequest.setShouldCache(false);
        // add it to the RequestQueue
        queue.add(getRequest);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.fajrtv:
                break;

            case R.id.citytv:
                break;

            case R.id.sunrisetv:
                break;

            case R.id.duhrtv:
                break;

            case R.id.asrtv:
                break;

            case R.id.sunsettv:
                break;

            case R.id.maghribtv:
                break;

            case R.id.ishatv:
                break;

            case R.id.imsaktv:
                break;

            case R.id.midbighttv:
                break;

        }
    }
}
