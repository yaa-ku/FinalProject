package com.example.timetomath2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class startGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game);
    }

    public void onBack4(View view) {
        Intent intent = new Intent(startGame.this, MainActivity.class);
        startActivity(intent);
    }
}
