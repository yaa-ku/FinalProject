package com.example.timetomath2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mainTheory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_theory);
    }

    public void onBack(View view) {
        Intent intent = new Intent(mainTheory.this, MainActivity.class);
        startActivity(intent);
    }
}
