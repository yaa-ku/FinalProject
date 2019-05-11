package com.example.timetomath2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void onBack2(View view) {
        Intent intent = new Intent (Settings.this, MainActivity.class);
        startActivity(intent);
    }

    public void onLanguageClick(View view) {
        Intent intent = new Intent(Settings.this, ChangeLanguage.class);
        startActivity(intent);
    }

    public void onStyleClick(View view) {
        Intent intent = new Intent(Settings.this, ChangeStyle.class);
        startActivity(intent);
    }
}
