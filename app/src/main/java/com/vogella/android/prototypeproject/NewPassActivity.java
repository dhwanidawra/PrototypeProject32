package com.vogella.android.prototypeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class NewPassActivity extends AppCompatActivity {
    Button button, button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_pass_activity);
        button = findViewById(R.id.button41);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(NewPassActivity.this, AccountSettingsActivity.class);
                startActivity(intent);

            }
        });




    }
}
