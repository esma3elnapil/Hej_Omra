package com.example.hp.hej_omra;

import android.Manifest;
import android.animation.ObjectAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.renderscript.Sampler;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class AlTawafActivity extends AppCompatActivity
{
    private Button TawafStart,TawafDone;

    private TextView datatv;
    private BroadcastReceiver broadcastReceiver;

    String startpoint =" ";
    int counter=0;
    ProgressBar mprogressBar;

    static String InsideThisArray[]={"10.0 10.0","2","3","4"};




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_tawaf);
        TawafDone= (Button) findViewById(R.id.tawafDone);
        TawafStart= (Button) findViewById(R.id.twafStart);
        datatv = (TextView)findViewById(R.id.datatv);

       if (!RunTimePermissionsMethod()){
           EnableButtons();
       }




        mprogressBar = (ProgressBar) findViewById(R.id.circular_progress_bar);
        ObjectAnimator anim = ObjectAnimator.ofInt(mprogressBar, "progress", 0, 100);
        anim.setDuration(15000);
        anim.setInterpolator(new DecelerateInterpolator());
        anim.start();


    }

    @Override
    protected void onResume() {
        super.onResume();
        if (broadcastReceiver == null){
            broadcastReceiver = new BroadcastReceiver() {
                @Override
                public void onReceive(Context context, Intent intent) {

                    //this is where the activity Receives location data
                    String Coordinates = (String) intent.getExtras().get("coordinates");

                                                        //                    if (startpoint.equals(" ")){
                                    //                        startpoint = Coordinates;
                                    //                        datatv.setText("Gooo on");
                                    //                        datatv.append("\n" + "start point is : "+startpoint);
                                    //                        datatv.append("\n" +"Counter = "+ counter);
                                    //                    }else {
                                    //                        if (Coordinates.equals(startpoint)){
                                    //                            counter = counter+1;
                                    //                            String count = String.valueOf(counter);
                                    //                            datatv.setText("\n"+"Counter = "+ count +"\n"+" Coordinates = "+ Coordinates);
                                    //                            datatv.append("\n"+"start point is : "+startpoint);
                                    //                        }else {
                                    //                            Toast.makeText(getApplicationContext(),"keep Going",Toast.LENGTH_SHORT).show();
                                    //                            datatv.setText(Coordinates);
                                    //                            datatv.append("\n" + counter);
                                    //
                                    //                        }
                                    //                    }

                    if (IsThisTheStartLocation(InsideThisArray,Coordinates)) {
                        Toast.makeText(getApplicationContext()," You Have Reached The Start Point",Toast.LENGTH_SHORT).show();
                        counter = counter + 1 ;
                        Toast.makeText(getApplicationContext(),"You Have Finished One Roll Around Kaaba",Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(getApplicationContext(),"Keep Going ",Toast.LENGTH_SHORT).show();
                    }

                }
            };
        }
        registerReceiver(broadcastReceiver, new IntentFilter("location_update_intent"));
    }

    public static boolean IsThisTheStartLocation(String[] CoordinatesArray, String Coordinates) {
        for(String Index: CoordinatesArray){
            if(Index.equals(Coordinates))
                return true;
        }
        return false;
    }

    //unregister the broadcastReceiver to save memory
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (broadcastReceiver != null){
            unregisterReceiver(broadcastReceiver);
        }
    }


    private void EnableButtons() {

        TawafStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AlTawafActivity.this,GPS_Service.class);
                startService(i);
                Toast.makeText(getApplicationContext(),"GPS Service Started",Toast.LENGTH_SHORT).show();
            }
        });

        TawafDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AlTawafActivity.this,GPS_Service.class);
                stopService(i);
                Toast.makeText(getApplicationContext(),"GPS Service Stoped",Toast.LENGTH_SHORT).show();
                counter=0;
                Toast.makeText(getApplicationContext(),"Counter = 0 ",Toast.LENGTH_SHORT).show();
                startpoint=" ";
            }
        });

    }


    // make a runtime permission for phones newer than api 23
    private boolean RunTimePermissionsMethod() {

        if (Build.VERSION.SDK_INT >= 23 && ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED){
            requestPermissions(new String[]{Manifest.permission.ACCESS_COARSE_LOCATION , Manifest.permission.ACCESS_FINE_LOCATION},100);
            return true;
        }
        return false;
    }

    // handle run time permission result
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode == 100){
            if ( grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_GRANTED){
                EnableButtons();
            }else {RunTimePermissionsMethod();}
        }
    }

    // handle Buttons Actions
//    @Override
//    public void onClick(View view)
//    {
//        switch (view.getId())
//        {
//            case R.id.tawafDone:
//                startActivity(new Intent(AlTawafActivity.this,MaqamEbrahimActivity.class));
//                break;
//
//            case R.id.twafStart:
//                break;
//
//        }
//
//    }
}
