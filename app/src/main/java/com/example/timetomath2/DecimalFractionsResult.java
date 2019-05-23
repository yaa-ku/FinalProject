package com.example.timetomath2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DecimalFractionsResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decimal_fractions_result);
    }

    public void onDecInfo(View view) {
        Intent intent = new Intent(DecimalFractionsResult.this, DecomalFractionsInfo.class);
        startActivity(intent);
    }

    public void onMenuDec(View view) {
        Intent intent = new Intent(DecimalFractionsResult.this, MainActivity.class);
        startActivity(intent);
    }
}
