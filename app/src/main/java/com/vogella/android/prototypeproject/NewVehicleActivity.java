package com.vogella.android.prototypeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewVehicleActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_vehicle_activity);

        button = findViewById(R.id.button15);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(NewVehicleActivity.this, VehicleAddedActivity.class);
                startActivity(intent);

                // MainActivity.this.startActivity(activityChangeIntent);
            }
        });


    }
}
