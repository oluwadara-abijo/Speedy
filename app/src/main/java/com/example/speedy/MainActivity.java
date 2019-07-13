package com.example.speedy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //UI elements
        Button aboutButton = findViewById(R.id.btn_about_alc);
        Button profileButton = findViewById(R.id.btn_my_profile);

        aboutButton.setOnClickListener(v -> gotoAboutPage());
        profileButton.setOnClickListener(v -> gotoProfilePage());

    }

    private void gotoAboutPage() {
        Intent aboutIntent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(aboutIntent);
        startActivity(aboutIntent);
    }

    private void gotoProfilePage() {
        Intent profileIntent = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(profileIntent);
        startActivity(profileIntent);
    }
}
