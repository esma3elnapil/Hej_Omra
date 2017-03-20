package com.example.hp.hej_omra;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.Settings;

@SuppressWarnings("MissingPermission")
public class GPS_Service extends Service {

    private LocationListener listener;
    private LocationManager locationManager;

    @Override
    public void onCreate() {
        listener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                /*custom intent to send the location updates to the broadcastreciever in the activity
                 location_update_intent is an Intent filter so the broadcastreciever only listen to
                 Intent with this filter */

                Intent locationUpdatesIntent = new Intent ("location_update_intent");
                locationUpdatesIntent.putExtra("coordinates",location.getLongitude() +" "+ location.getLatitude());

                // now every time the location changes the serevice will sendBrodcast location update intent
                sendBroadcast(locationUpdatesIntent);
            }

            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) {

            }

            @Override
            public void onProviderEnabled(String provider) {

            }

            @Override
            public void onProviderDisabled(String provider) {
                // this used to send the user to the settings if GPS is Disabled
                Intent LocationSettingsIntent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                LocationSettingsIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(LocationSettingsIntent);
            }
        };


        // start the location manager
        locationManager = (LocationManager) getApplicationContext().getSystemService(Context.LOCATION_SERVICE);
        // make it check for updates every 3 sec


        //supress this waring
        //noinspection MissingPermission
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,3000,0,listener);


    }

    // destroy the service and delete updates for saving memory
    @Override
    public void onDestroy() {
        super.onDestroy();
        if (locationManager != null) {
            //supress the waring
            locationManager.removeUpdates(listener);
        }
    }

    public GPS_Service() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
