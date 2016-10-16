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
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.data;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {

    Location location = null; // location
    Context c= this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        final TextView lat = (TextView) findViewById(R.id.latitude);
        final TextView longit = (TextView) findViewById(R.id.longitude);

        Gps mygp= new Gps(c);

        lat.setText(Integer.toString((int)mygp.getLocation().getLatitude()));
        longit.setText(Integer.toString((int)mygp.getLocation().getLongitude()));


    }

}



