package com.example.timetomath2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Placeholder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public SharedPreferences sPref;
    public SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sPref = getSharedPreferences("app_settings", Context.MODE_PRIVATE);
        editor = sPref.edit();
        switch(sPref.getString("app_theme","")){
            case "1":
                setContentView(R.layout.activity_main);
                break;
            case "2":
                setContentView(R.layout.activity_main2);
                break;
            default: setContentView(R.layout.activity_main);
        }}


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
