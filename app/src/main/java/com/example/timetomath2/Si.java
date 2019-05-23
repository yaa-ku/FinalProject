package com.example.timetomath2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Si extends AppCompatActivity {

    SI my = new SI();
    String que1 = my.printFirst();
    String res1 = my.getFirstResult();
    SI my2 = new SI();
    String que2 = my2.printSecond();
    String res2 = my2.getSecondResult();
    SI my3 = new SI();
    String que3 = my3.printThird();
    String res3 = my3.getThirdResult();
    SI my4 = new SI();
    String que4 = my4.printFourth();
    String res4 = my4.getFourthResult();
    SI my5 = new SI();
    String que5 = my5.printFifth();
    String res5 = my5.getFifthResult();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_si);

        TextView qu1 = (TextView) findViewById(R.id.q1_si);
        TextView qu2 = (TextView) findViewById(R.id.q2_si);
        TextView qu3 = (TextView) findViewById(R.id.q3_si);
        TextView qu4 = (TextView) findViewById(R.id.q4_si);
        TextView qu5 = (TextView) findViewById(R.id.q5_si);
        qu1.setText(que1+" "+res1);
        qu2.setText(que2+" "+res2);
        qu3.setText(que3+" "+res3);
        qu4.setText(que4+" "+res4);
        qu5.setText(que5+" "+res5);
    }

    public void resSi(View view) {
        Intent intent = new Intent(Si.this, SiResult.class);
        startActivity(intent);
    }

    public class SI {

        int value;

        public SI(){
            value = (int)(Math.random()*255);
        }

        public void refresh(){
            value = (int)(Math.random()*255);
        }

        public String printFirst(){
            return value+"(10) = ?(2)";
        }

        public String getFirstResult(){
            return java.lang.Integer.toBinaryString(value);
        }

        public String printSecond(){
            return java.lang.Integer.toBinaryString(value)+"(2) = ?(10)";
        }

        public String getSecondResult(){
            return java.lang.Integer.toString(value);
        }

        public String printThird(){
            return value+"(10) = ?(8)";
        }

        public String getThirdResult(){
            return java.lang.Integer.toOctalString(value);
        }

        public String printFourth(){
            return value+"(10) = ?(16)";
        }

        public String getFourthResult(){
            return java.lang.Integer.toHexString(value);
        }

        public String printFifth(){
            return java.lang.Integer.toBinaryString(value)+"(2) = ?(16)";
        }

        public String getFifthResult(){
            return java.lang.Integer.toHexString(value);
        }
}}
