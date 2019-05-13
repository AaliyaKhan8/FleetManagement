package com.example.aaliyakhan.locationservices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class BookRawMaterials extends AppCompatActivity {
    Spinner rawmaterialspinner;
    ArrayAdapter adapter;
    Button bookraw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_raw_materials);
        init();
        String[] rawmaterialplace={"Thambaram","CMBT","T.Nagar","Adyar"};
        adapter=new ArrayAdapter(BookRawMaterials.this,android.R.layout.simple_list_item_1,rawmaterialplace);
        rawmaterialspinner.setAdapter(adapter);
        bookraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(BookRawMaterials.this, "Raw Materials Booked", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(BookRawMaterials.this,Home.class));
            }
        });
    }
    void init()
    {
        rawmaterialspinner=findViewById(R.id.rawmaterialplace);
        bookraw=findViewById(R.id.bookraw);
    }
}
