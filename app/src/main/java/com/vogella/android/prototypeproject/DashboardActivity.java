package com.vogella.android.prototypeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DashboardActivity extends AppCompatActivity {
Button button, button2;
Button menuBut1, menuBut2, menuBut3,menuBut5,menuBut6;
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_activity);
            button = findViewById(R.id.button7);
            button2 = findViewById(R.id.button8);
            menuBut1 = findViewById(R.id.button10);
            menuBut2 = findViewById(R.id.button11);
            menuBut3 = findViewById(R.id.button12);

            menuBut5 = findViewById(R.id.button14);
        menuBut6 = findViewById(R.id.button21);
            imageView = findViewById(R.id.imageView7);

        imageView.setVisibility(View.GONE);
        menuBut1.setVisibility(View.GONE);
        menuBut2.setVisibility(View.GONE);
        menuBut3.setVisibility(View.GONE);

        menuBut5.setVisibility(View.GONE);
        menuBut6.setVisibility(View.GONE);






            button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                button.setVisibility(View.GONE);
                button2.setVisibility(View.VISIBLE);
                menuBut1.setVisibility(View.VISIBLE);
                menuBut2.setVisibility(View.VISIBLE);
                menuBut3.setVisibility(View.VISIBLE);

                menuBut5.setVisibility(View.VISIBLE);
                menuBut6.setVisibility(View.VISIBLE);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                imageView.setVisibility(View.GONE);
                button.setVisibility(View.VISIBLE);
                button2.setVisibility(View.GONE);
                menuBut1.setVisibility(View.GONE);
                menuBut2.setVisibility(View.GONE);
                menuBut3.setVisibility(View.GONE);

                menuBut5.setVisibility(View.GONE);
                menuBut6.setVisibility(View.GONE);


            }
        });

        menuBut1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, ChoseVehicleActivity.class);
                startActivity(intent);

            }
        });
        menuBut2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, DiagnosErrorActivity.class);
                startActivity(intent);

            }
        });
        menuBut3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, DiagnosHistoryActivity.class);
                startActivity(intent);

            }
        });

        menuBut5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, HelpActivity.class);
                startActivity(intent);

            }
        });
        menuBut6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, SettingsActivity.class);
                startActivity(intent);

            }
        });






    }
}
