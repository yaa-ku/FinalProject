package com.example.timetomath2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CommonFractionsResult extends AppCompatActivity {

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
                setContentView(R.layout.activity_common_fractions_result);
                break;
            case "2":
                setContentView(R.layout.activity_common_fractions_result2);
                break;
            default: setContentView(R.layout.activity_common_fractions_result);
        }

        right1 = (TextView)findViewById(R.id.textView42);
        right2 = (TextView)findViewById(R.id.textView43);
        right3 = (TextView)findViewById(R.id.textView45);
        right4= (TextView)findViewById(R.id.textView47);
        right5 = (TextView)findViewById(R.id.textView49);

        your1 = (TextView)findViewById(R.id.textView19);
        your2 = (TextView)findViewById(R.id.textView44);
        your3 = (TextView)findViewById(R.id.textView46);
        your4 = (TextView)findViewById(R.id.textView48);
        your5 = (TextView)findViewById(R.id.textView50);

        total = (TextView) findViewById(R.id.textView31124);

        Intent intent = getIntent();

        String r1_n = intent.getStringExtra("RIGHT_1N");
        String y1_n = intent.getStringExtra("YOUR_1N");
        String r2_n = intent.getStringExtra("RIGHT_2N");
        String y2_n = intent.getStringExtra("YOUR_2N");
        String r3_n = intent.getStringExtra("RIGHT_3N");
        String y3_n = intent.getStringExtra("YOUR_3N");
        String r4_n= intent.getStringExtra("RIGHT_4N");
        String y4_n= intent.getStringExtra("YOUR_4N");
        String r5_n= intent.getStringExtra("RIGHT_5N");
        String y5_n= intent.getStringExtra("YOUR_5N");

        String r1_d = intent.getStringExtra("RIGHT_1D");
        String y1_d= intent.getStringExtra("YOUR_1D");
        String r2_d= intent.getStringExtra("RIGHT_2D");
        String y2_d= intent.getStringExtra("YOUR_2D");
        String r3_d = intent.getStringExtra("RIGHT_3D");
        String y3_d = intent.getStringExtra("YOUR_3D");
        String r4_d = intent.getStringExtra("RIGHT_4D");
        String y4_d = intent.getStringExtra("YOUR_4D");
        String r5_d = intent.getStringExtra("RIGHT_5D");
        String y5_d= intent.getStringExtra("YOUR_5D");

        your1.setText("Your answer: "+" "+y1_n+" / "+y1_d);
        your2.setText("Your answer: "+" "+y2_n+" / "+y2_d);
        your3.setText("Your answer: "+" "+y3_n+" / "+y3_d);
        your4.setText("Your answer: "+" "+y4_n+" / "+y4_d);
        your5.setText("Your answer: "+" "+y5_n+" / "+y5_d);

        right1.setText("Right answer: "+" "+r1_n+" / "+r1_d);
        right2.setText("Right answer: "+" "+r2_n+" / "+r2_d);
        right3.setText("Right answer: "+" "+r3_n+" / "+r3_d);
        right4.setText("Right answer: "+" "+r4_n+" / "+r4_d);
        right5.setText("Right answer: "+" "+r5_n+" / "+r5_d);

        if((r1_n.equals(y1_n))&&(r1_d.equals(y1_d))){
            score++;
        }

        if((r2_n.equals(y2_n))&&(r2_d.equals(y2_d))){
            score++;
        }

        if((r3_n.equals(y3_n))&&(r3_d.equals(y3_d))){
            score++;
        }

        if((r4_n.equals(y4_n))&&(r4_d.equals(y4_d))){
            score++;
        }

        if((r5_n.equals(y5_n))&&(r5_d.equals(y5_d))){
            score++;
        }

        total.setText("Total score: "+score);

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
