package myapp.com.tunder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        LocationManager locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }


    private boolean isLocationEnabled() {
        return locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER) ||
                locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);

}



