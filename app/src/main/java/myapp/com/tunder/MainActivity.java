package myapp.com.tunder;

import myapp.com.tunder.Gps;

import myapp.com.*;
import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import static android.R.attr.data;

public class MainActivity extends AppCompatActivity {

    Location location = null; // location
    Context c= this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        Gps mygp= new Gps(c);

        Toast.makeText(c, "Latitude is: "+Double.toString(mygp.getLocation().getLatitude()) + " \nLongitude is: " +
                        Double.toString(mygp.getLocation().getLongitude()),
                Toast.LENGTH_LONG).show();




    }

}



