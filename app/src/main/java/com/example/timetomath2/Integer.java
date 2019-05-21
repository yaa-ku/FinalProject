package com.example.timetomath2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Integer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_integer);
    }

    public void onBack11(View view) {
        Intent intent = new Intent(Integer.this, IntegerResult.class);
        startActivity(intent);
    }
}
