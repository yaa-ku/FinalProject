package com.example.timetomath2;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Placeholder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStart(View view) {
        Intent intent = new Intent(MainActivity.this, startGame.class);
        startActivity(intent);
    }

    public void onSettings(View view) {
        Intent intent = new Intent(MainActivity.this, Settings.class);
        startActivity(intent);
    }

    public void onInfo(View view) {
        Intent intent = new Intent (MainActivity.this, mainTheory.class);
        startActivity(intent);
    }

    public void onTheory(View view) {
        Intent intent = new Intent(MainActivity.this, MainTheoryTheory.class);
        startActivity(intent);
    }
}
