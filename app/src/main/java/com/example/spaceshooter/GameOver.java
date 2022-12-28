package com.example.spaceshooter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GameOver extends AppCompatActivity {

    TextView tvPoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        tvPoints = findViewById(R.id.tvPoints);
        tvPoints.setText(""+getIntent().getExtras().getInt("points"));

    }

    public void restart(View view) {
        startActivity(new Intent(getApplicationContext(),StartUp.class));
        finish();
    }

    public void exit(View view) {
        finishAffinity();
    }
}