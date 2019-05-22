package com.example.timetomath2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IntegerResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_integer_result);
    }

    public void onIntInfo(View view) {
        Intent intent = new Intent(IntegerResult.this, IntegerInfo.class);
        startActivity(intent);
    }

    public void onMenuInt(View view) {
        Intent intent = new Intent(IntegerResult.this, MainActivity.class);
        startActivity(intent);
    }
}
