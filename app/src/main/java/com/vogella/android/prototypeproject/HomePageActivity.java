package com.vogella.android.prototypeproject;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageView;

public class HomePageActivity extends AppCompatActivity {
    Button button, button1;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage_activity);

        button = findViewById(R.id.button6);
        button1 = findViewById(R.id.button35);
        imageView = findViewById(R.id.imageView19);
        imageView.setVisibility(View.INVISIBLE);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            button1.setVisibility(View.VISIBLE);
            imageView.setVisibility(View.VISIBLE);
                // MainActivity.this.startActivity(activityChangeIntent);
            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                button1.setVisibility(View.INVISIBLE);
                imageView.setVisibility(View.INVISIBLE);
                Intent intent = new Intent(HomePageActivity.this, DashboardActivity.class);
                startActivity(intent);

                // MainActivity.this.startActivity(activityChangeIntent);
            }
        });

    }
}
