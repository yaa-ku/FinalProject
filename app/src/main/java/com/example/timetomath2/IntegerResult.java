package com.example.timetomath2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class IntegerResult extends AppCompatActivity {

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_integer_result);

        right1 = (TextView)findViewById(R.id.textView8);
        right2 = (TextView)findViewById(R.id.textView10);
        right3 = (TextView)findViewById(R.id.textView12);
        right4 = (TextView)findViewById(R.id.textView14);
        right5 = (TextView)findViewById(R.id.textView16);

        your1 = (TextView)findViewById(R.id.textView9);
        your2 = (TextView)findViewById(R.id.textView11);
        your3 = (TextView)findViewById(R.id.textView13);
        your4 = (TextView)findViewById(R.id.textView15);
        your5 = (TextView)findViewById(R.id.textView17);

        Intent intent = getIntent();

        //String r1 = intent.getStringExtra("RIGHT_1");
        String y1 = intent.getStringExtra("YOUR_1");
        //String r2 = intent.getStringExtra("RIGHT_2");
        String y2 = intent.getStringExtra("YOUR_2");
       // String r3 = intent.getStringExtra("RIGHT_3");
        String y3 = intent.getStringExtra("YOUR_3");
       // String r4 = intent.getStringExtra("RIGHT_4");
        String y4 = intent.getStringExtra("YOUR_4");
        //String r5 = intent.getStringExtra("RIGHT_5");
        String y5 = intent.getStringExtra("YOUR_5");

        your1.setText(y1);
        your2.setText(y2);
        your3.setText(y3);
        your4.setText(y4);
        your5.setText(y5);

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
