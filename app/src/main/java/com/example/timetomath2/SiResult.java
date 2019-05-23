package com.example.timetomath2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SiResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_si_result);
    }

    public void onSiInfo(View view) {
        Intent intent = new Intent(SiResult.this, SiInfo.class);
        startActivity(intent);
    }

    public void onMenuSi(View view) {
        Intent intent = new Intent(SiResult.this, MainActivity.class);
        startActivity(intent);
    }
}
