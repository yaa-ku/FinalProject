package com.example.timetomath2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DecimalFractions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decimal_fractions);
    }

    public void resDec(View view) {
        Intent intent = new Intent(DecimalFractions.this, DecimalFractionsResult.class);
        startActivity(intent);
    }
}
