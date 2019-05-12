package com.example.timetomath2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChangeStyle extends AppCompatActivity {
    public SharedPreferences sPref;
    public SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sPref = getSharedPreferences("app_settings", Context.MODE_PRIVATE);
        editor = sPref.edit();
        switch(sPref.getString("app_theme","")){
            case "1":
                setContentView(R.layout.activity_change_style);
                break;
            case "2":
                setContentView(R.layout.activity_change_style2);
                break;
                default: setContentView(R.layout.activity_change_style);
    }}


    public void onBack5(View view) {
        Intent intent = new Intent(ChangeStyle.this, Settings.class);
        startActivity(intent);
    }


    public void onFirstTheme(View view) {
        editor.putString("app_theme","1");
        editor.apply();
        recreate();
    }

    public void onSecondTheme(View view) {
            editor.putString("app_theme", "2");
            editor.apply();
            recreate();

        }

}


