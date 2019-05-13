package com.example.aaliyakhan.locationservices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Home extends AppCompatActivity implements View.OnClickListener {
    CardView truck,raw,map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
        truck.setOnClickListener(this);
        raw.setOnClickListener(this);
        map.setOnClickListener(this);
    }
    void init()
    {
        truck=findViewById(R.id.truckcard);
        raw=findViewById(R.id.rawcard);
        map=findViewById(R.id.mapcard);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.truckcard:
                startActivity(new Intent(Home.this,BookTruck.class));
                break;
            case R.id.rawcard:
                startActivity(new Intent(Home.this,BookRawMaterials.class));
                break;
            case R.id.mapcard:
                startActivity(new Intent(Home.this,MapActivity.class));
                break;
        }
    }
}
