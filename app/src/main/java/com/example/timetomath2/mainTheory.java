package com.example.timetomath2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mainTheory extends AppCompatActivity {
    public SharedPreferences sPref;
    public SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sPref = getSharedPreferences("app_settings", Context.MODE_PRIVATE);
        editor = sPref.edit();
        switch(sPref.getString("app_theme","")){
            case "1":
                setContentView(R.layout.activity_main_theory);
                break;
            case "2":
                setContentView(R.layout.activity_main_theory2);
                break;
            default: setContentView(R.layout.activity_main_theory);
        }}

    public void onBack(View view) {
        Intent intent = new Intent(mainTheory.this, MainActivity.class);
        startActivity(intent);
    }
}
