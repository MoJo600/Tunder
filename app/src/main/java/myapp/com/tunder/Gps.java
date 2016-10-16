package myapp.com.tunder;


import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;

/**
 * Created by Main on 10/15/2016.
 */

public class Gps implements LocationListener {
    Context myContext;
    Location posizione;
    double latitudine,longitudine;
    LocationManager locationManager;
    public Gps(Context c){
        myContext=c;
        locationManager = (LocationManager)c.getSystemService(Context.LOCATION_SERVICE);
        getLocation();
    }
    public Location getLocation(){

        if (ActivityCompat.checkSelfPermission(myContext, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(myContext, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return null;
        }
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, this);
        if(locationManager!=null){
            posizione=locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
            if(posizione!=null){
                latitudine=posizione.getLatitude();
                longitudine=posizione.getLongitude();
            }
        }
        return posizione;
    }

    public double latitudine(){
        if(posizione!=null){
            latitudine=posizione.getLatitude();
        }
        return latitudine;
    }
    public double longitudine(){
        if(posizione!=null){
            longitudine=posizione.getLongitude();
        }
        return longitudine;
    }
    public void stopGps(){
        if (locationManager!=null){
            if (ActivityCompat.checkSelfPermission(myContext, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(myContext, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                return ;
            }
            locationManager.removeUpdates(Gps.this);
        }
    }
    @Override
    public void onLocationChanged(Location location) {
        // TODO Auto-generated method stub

    }
    @Override
    public void onProviderDisabled(String provider) {
        // TODO Auto-generated method stub

    }
    @Override
    public void onProviderEnabled(String provider) {
        // TODO Auto-generated method stub

    }
    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
        // TODO Auto-generated method stub

    }

}