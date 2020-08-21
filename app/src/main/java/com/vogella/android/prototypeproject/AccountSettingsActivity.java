package com.vogella.android.prototypeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.SettingInjectorService;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Set;

public class AccountSettingsActivity extends AppCompatActivity {
    Button button, button1, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_settings_activity);
        button = findViewById(R.id.button20);
        button1 = findViewById(R.id.button39);
        button2 = findViewById(R.id.button42);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(AccountSettingsActivity.this, NewPassActivity.class);
                startActivity(intent);

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(AccountSettingsActivity.this, DeleteAccountActivity.class);
                startActivity(intent);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(AccountSettingsActivity.this, SettingsActivity.class);
                startActivity(intent);

            }
        });



    }
}
