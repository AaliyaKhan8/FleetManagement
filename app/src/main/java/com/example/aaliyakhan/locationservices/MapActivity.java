package com.example.aaliyakhan.locationservices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.here.android.mpa.common.GeoCoordinate;
import com.here.android.mpa.common.OnEngineInitListener;
import com.here.android.mpa.mapping.Map;
import com.here.android.mpa.mapping.SupportMapFragment;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SupportMapFragment mapFragment = (SupportMapFragment)
                getSupportFragmentManager().findFragmentById(R.id.mapFragment);
          mapFragment.init(new OnEngineInitListener() {
            @Override
            public void onEngineInitializationCompleted(
                    OnEngineInitListener.Error error) {
                if (error == OnEngineInitListener.Error.NONE) {
                    Map map = mapFragment.getMap();
                    map.setCenter(new GeoCoordinate(49.196261,-123.004773),Map.Animation.LINEAR);
                } else {
                    System.out.println("ERROR: Cannot initialize SupportMapFragment");
                }
            }
        });
    }
}
