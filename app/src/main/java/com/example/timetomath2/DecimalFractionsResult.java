package com.example.timetomath2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DecimalFractionsResult extends AppCompatActivity {

    public SharedPreferences sPref;
    public SharedPreferences.Editor editor;

    TextView right1;
    TextView right2;
    TextView right3;
    TextView right4;
    TextView right5;

    TextView your1;
    TextView your2;
    TextView your3;
    TextView your4;
    TextView your5;

    TextView total;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sPref = getSharedPreferences("app_settings", Context.MODE_PRIVATE);
        editor = sPref.edit();
        switch(sPref.getString("app_theme","")){
            case "1":
                setContentView(R.layout.activity_decimal_fractions_result);
                break;
            case "2":
                setContentView(R.layout.activity_decimal_fractions_result2);
                break;
            default: setContentView(R.layout.activity_decimal_fractions_result);
        }

        right1 = (TextView)findViewById(R.id.textView23);
        right2 = (TextView)findViewById(R.id.textView25);
        right3 = (TextView)findViewById(R.id.textView27);
        right4 = (TextView)findViewById(R.id.textView29);
        right5 = (TextView)findViewById(R.id.textView31);

        your1 = (TextView)findViewById(R.id.textView24);
        your2 = (TextView)findViewById(R.id.textView26);
        your3 = (TextView)findViewById(R.id.textView28);
        your4 = (TextView)findViewById(R.id.textView30);
        your5 = (TextView)findViewById(R.id.textView32);

        total = (TextView) findViewById(R.id.textView33);

        Intent intent = getIntent();

        String r1 = intent.getStringExtra("RIGHT_1");
        String y1 = intent.getStringExtra("YOUR_1");
        String r2 = intent.getStringExtra("RIGHT_2");
        String y2 = intent.getStringExtra("YOUR_2");
        String r3 = intent.getStringExtra("RIGHT_3");
        String y3 = intent.getStringExtra("YOUR_3");
        String r4 = intent.getStringExtra("RIGHT_4");
        String y4 = intent.getStringExtra("YOUR_4");
        String r5 = intent.getStringExtra("RIGHT_5");
        String y5 = intent.getStringExtra("YOUR_5");

        your1.setText("Your answer:"+" "+y1);
        your2.setText("Your answer:"+" "+y2);
        your3.setText("Your answer:"+" "+y3);
        your4.setText("Your answer:"+" "+y4);
        your5.setText("Your answer:"+" "+y5);

        right1.setText("Right answer"+" "+r1);
        right2.setText("Right answer"+" "+r2);
        right3.setText("Right answer"+" "+r3);
        right4.setText("Right answer"+" "+r4);
        right5.setText("Right answer"+" "+r5);

        if(r1.equals(y1)){
            score++;
        }

        if(r2.equals(y2)){
            score++;
        }

        if(r3.equals(y3)){
            score++;
        }

        if(r4.equals(y4)){
            score++;
        }

        if(r5.equals(y5)){
            score++;
        }

        total.setText("Total score: "+score);
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
