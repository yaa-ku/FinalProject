package com.example.timetomath2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CommonFractions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_fractions);
    }

    public void resCom(View view) {
        Intent intent = new Intent(CommonFractions.this, CommonFractionsResult.class);
        startActivity(intent);
    }
}
