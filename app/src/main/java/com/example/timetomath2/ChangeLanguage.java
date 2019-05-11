package com.example.timetomath2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChangeLanguage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_language);
    }

    public void onBack6(View view) {
        Intent intent = new Intent(ChangeLanguage.this, Settings.class);
        startActivity(intent);
    }
}
