package com.vogella.android.prototypeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ChoseVehicleActivity extends AppCompatActivity {
Button button, button1, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vehicle_activity);
        button = findViewById(R.id.button9);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ChoseVehicleActivity.this, NewVehicleActivity.class);
                startActivity(intent);

            }
        });
        button1 = findViewById(R.id.button50);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ChoseVehicleActivity.this, EditVehicleActivity.class);
                startActivity(intent);

            }
        });
        button2 = findViewById(R.id.button51);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ChoseVehicleActivity.this, DashboardActivity.class);
                startActivity(intent);

            }
        });



    }
}
