package com.example.timetomath2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CommonFractionsResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_fractions_result);
    }

    public void onComInfo(View view) {
        Intent intent = new Intent(CommonFractionsResult.this, CommonFractionsInfo.class);
        startActivity(intent);
    }

    public void onMenuCom(View view) {
        Intent intent = new Intent(CommonFractionsResult.this, MainActivity.class);
        startActivity(intent);
    }
}
