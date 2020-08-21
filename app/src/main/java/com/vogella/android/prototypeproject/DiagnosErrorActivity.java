package com.vogella.android.prototypeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DiagnosErrorActivity extends AppCompatActivity {
    Button button, button1, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diagnos_error_activity);
        button = findViewById(R.id.button16);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(DiagnosErrorActivity.this, DashboardActivity.class);
                startActivity(intent);

            }
        });
        button1 = findViewById(R.id.button13);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(DiagnosErrorActivity.this, DiagnosHistoryActivity.class);
                startActivity(intent);

            }
        });
        button2 = findViewById(R.id.button36);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(DiagnosErrorActivity.this, ErrorListActivity.class);
                startActivity(intent);

            }
        });


    }
}
