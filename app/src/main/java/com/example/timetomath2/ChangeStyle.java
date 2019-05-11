package com.example.timetomath2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChangeStyle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_style);
    }

    public void onBack5(View view) {
        Intent intent = new Intent(ChangeStyle.this, Settings.class);
        startActivity(intent);
    }
}
