package com.vogella.android.prototypeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SettingsActivity extends AppCompatActivity {

    Button button1, button2, button3,button4,button5,button6,button7,button8;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);

        button1 = findViewById(R.id.button22);
        button2 = findViewById(R.id.button23);
        button3 = findViewById(R.id.button24);
        button4 = findViewById(R.id.button25);
        button5 = findViewById(R.id.button26);
        button6 = findViewById(R.id.button27);
        button7 = findViewById(R.id.button28);
        button8 = findViewById(R.id.button29);
        back = findViewById(R.id.button33);





        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(SettingsActivity.this, DashboardActivity.class);
                startActivity(intent);

                // MainActivity.this.startActivity(activityChangeIntent);
            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(SettingsActivity.this, DefaultVehicleActivity.class);
                startActivity(intent);

                // MainActivity.this.startActivity(activityChangeIntent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(SettingsActivity.this, AccountSettingsActivity.class);
                startActivity(intent);

                // MainActivity.this.startActivity(activityChangeIntent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(SettingsActivity.this, LanguageActivity.class);
                startActivity(intent);

                // MainActivity.this.startActivity(activityChangeIntent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(SettingsActivity.this, NotifActivity.class);
                startActivity(intent);

                // MainActivity.this.startActivity(activityChangeIntent);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(SettingsActivity.this, DistanceSettingsActivity.class);
                startActivity(intent);

                // MainActivity.this.startActivity(activityChangeIntent);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(SettingsActivity.this, DistanceSettingsActivity.class);
                startActivity(intent);

                // MainActivity.this.startActivity(activityChangeIntent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(SettingsActivity.this, TemperatureActivity.class);
                startActivity(intent);

                // MainActivity.this.startActivity(activityChangeIntent);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(SettingsActivity.this, AboutActivity.class);
                startActivity(intent);

                // MainActivity.this.startActivity(activityChangeIntent);
            }
        });



    }
}
