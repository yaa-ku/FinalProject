package com.example.timetomath2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainTheoryTheory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_theory_theory);
    }

    public void onBack3(View view) {
        Intent intent = new Intent(MainTheoryTheory.this, MainActivity.class);
        startActivity(intent);
    }
}
