package com.example.timetomath2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Integer extends AppCompatActivity {

    public SharedPreferences sPref;
    public SharedPreferences.Editor editor;

    EditText ans1;
    EditText ans2;
    EditText ans3;
    EditText ans4;
    EditText ans5;


    IntegerTest myInt = new IntegerTest(-101,101);
    IntegerTest myInt2 = new IntegerTest(-101,101);
    IntegerTest myInt3 = new IntegerTest(-101,101);
    IntegerTest myInt4 = new IntegerTest(-1001,1001);
    String que1 = myInt.printFirst(myInt2, myInt3);
    String res1 = myInt.getFirstResult(myInt2, myInt3);
    IntegerTest myInt5 = new IntegerTest(-101,101);
    IntegerTest myInt6 = new IntegerTest(-101,101);
    IntegerTest myInt7 = new IntegerTest(-101,101);
    String que2 = myInt5.printSecond(myInt6, myInt7);
    String res2 = myInt5.getSecondResult(myInt6, myInt7);
    IntegerTest myInt8 = new IntegerTest(-101,101);
    IntegerTest myInt10 = new IntegerTest(-101,101);
    IntegerTest myInt9 = new IntegerTest(myInt10);
    String que3 = myInt8.printThird(myInt9, myInt10);
    String res3 = myInt8.getThirdResult(myInt9, myInt10);
    IntegerTest myInt11 = new IntegerTest(-1001,1001);
    IntegerTest myInt12 = new IntegerTest(-1001,1001);
    IntegerTest myInt13 = new IntegerTest(-1001,1001);
    IntegerTest myInt14 = new IntegerTest(-1001,1001);
    String que4 = myInt11.printFourth(myInt12, myInt13,myInt14);
    String res4 = myInt11.getFourthResult(myInt12, myInt13,myInt14);
    IntegerTest myInt15 = new IntegerTest(-1001,1001);
    IntegerTest myInt17 = new IntegerTest(-1001,1001);
    IntegerTest myInt16 = new IntegerTest(myInt17);
    IntegerTest myInt18 = new IntegerTest(-1001,1001);
    String que5 = myInt15.printFourth(myInt16, myInt17,myInt18);
    String res5 = myInt15.getFourthResult(myInt16, myInt17,myInt18);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        sPref = getSharedPreferences("app_settings", Context.MODE_PRIVATE);
        editor = sPref.edit();
        switch(sPref.getString("app_theme","")){
            case "1":
                setContentView(R.layout.activity_integer);
                break;
            case "2":
                setContentView(R.layout.activity_integer2);
                break;
            default: setContentView(R.layout.activity_integer);
        }

        ans1 = (EditText) findViewById(R.id.res1_int);
        ans2 = (EditText) findViewById(R.id.res2_int);
        ans3 = (EditText) findViewById(R.id.res3_int);
        ans4 = (EditText) findViewById(R.id.res4_int);
        ans5 = (EditText) findViewById(R.id.res5_int);

        TextView qu1 = (TextView) findViewById(R.id.q1_int);
        TextView qu2 = (TextView) findViewById(R.id.q2_int);
        TextView qu3 = (TextView) findViewById(R.id.q3_int);
        TextView qu4 = (TextView) findViewById(R.id.q4_int);
        TextView qu5 = (TextView) findViewById(R.id.q5_int);
        qu1.setText(que1);
        qu2.setText(que2);
        qu3.setText(que3);
        qu4.setText(que4);
        qu5.setText(que5);


    }

    public void onBack11(View view) {
        Intent intent = new Intent(Integer.this, IntegerResult.class);

        intent.putExtra("RIGHT_1",res1);
        intent.putExtra("YOUR_1", ans1.getText().toString());
        intent.putExtra("RIGHT_2",res2);
        intent.putExtra("YOUR_2", ans2.getText().toString());
        intent.putExtra("RIGHT_3",res3);
        intent.putExtra("YOUR_3", ans3.getText().toString());
        intent.putExtra("RIGHT_4",res4);
        intent.putExtra("YOUR_4", ans4.getText().toString());
        intent.putExtra("RIGHT_5",res5);
        intent.putExtra("YOUR_5", ans5.getText().toString());


        startActivity(intent);
    }


    public class IntegerTest {

        public int currentInt;

        public IntegerTest(int height){ //от 0 до height
            currentInt=(int)(Math.random()*height+1);
        }

        public IntegerTest(IntegerTest fromInt){
            int curr=(int)(Math.random()*200)-100;
            currentInt=fromInt.getNumber()*curr;
        }

        public IntegerTest(int height, int bottom){ //от bottom до height, на один больше и меньше
            currentInt=(int)(Math.random()*(height-bottom)+bottom);
        }
        public int getNumber(){ //возвращает значение
            return currentInt;
        }

        public void printNumber(){ //печатает значение
            System.out.println(currentInt);
            return;
        }
        public void changeNumber(int height){ //изменяет значение от 0 до height
            currentInt=(int)(Math.random()*height);
        }
        public void changeNumber(int height,int bottom){ //изменяет значение от bottom до height, на один больше и меньше
            currentInt=(int)(Math.random()*(height-bottom)+bottom);
        }

        public void changeNumberFrom(IntegerTest fromInt){
            int curr=(int)(Math.random()*200)-100;
            currentInt=fromInt.getNumber()*curr;
        }

        public String getFirstResult(IntegerTest bInt, IntegerTest cInt){
            int res, a, b, c;
            a = IntegerTest.this.getNumber();
            b = bInt.getNumber();
            c = cInt.getNumber();

            res = a + b +c;
            return String.valueOf(res);
        }

        public String printFirst(IntegerTest bInt, IntegerTest cInt){
            int a, b, c;
            String res;

            a = IntegerTest.this.getNumber();
            b = bInt.getNumber();
            c = cInt.getNumber();
            res="("+String.valueOf(a);
            if (b>-1){
                res=res+" + "+b;
            }
            else{
                res=res+" - "+b*-1;
            }

            if (c>-1){
                res=res+") + "+c;
            }
            else{
                res=res+") - "+c*-1;
            }

            return res+"=";

        }

        public String getSecondResult(IntegerTest bInt, IntegerTest cInt){
            int res, a, b, c;
            a = IntegerTest.this.getNumber();
            b = bInt.getNumber();
            c = cInt.getNumber();

            res= a*(b+c);
            return String.valueOf(res);
        }

        public String printSecond(IntegerTest bInt, IntegerTest cInt){
            int a, b, c;
            String res;
            a = IntegerTest.this.getNumber();
            b = bInt.getNumber();
            c = cInt.getNumber();

            res= String.valueOf(a)+"*("+String.valueOf(b);
            if (c>-1){
                res=res+" + "+c+")";
            }
            else{
                res=res+" - "+c*-1+")";
            }
            return res+"=";

        }

        public String getThirdResult(IntegerTest bInt, IntegerTest cInt){
            int res, a, b, c;
            a = IntegerTest.this.getNumber();
            b = bInt.getNumber();
            c = cInt.getNumber();

            res = b/c;
            res+= a;
            return String.valueOf(res);
        }

        public String printThird(IntegerTest bInt, IntegerTest cInt){
            int a, b, c;
            String res;
            a = IntegerTest.this.getNumber();
            b = bInt.getNumber();
            c = cInt.getNumber();

            res=String.valueOf(a);
            if (b>-1){
                res=res+" + "+b;
            }
            else{
                res=res+" - "+b*-1;
            }

            res=res+"/"+String.valueOf(c);
            return res+"=";
        }

        public String getFourthResult(IntegerTest bInt, IntegerTest cInt, IntegerTest dInt){
            int res, a, b, c, d;
            a = IntegerTest.this.getNumber();
            b = bInt.getNumber();
            c = cInt.getNumber();
            d = dInt.getNumber();

            res= a+b+c+d;
            return String.valueOf(res);
        }

        public String printFourth(IntegerTest bInt, IntegerTest cInt, IntegerTest dInt){
            int a, b, c, d;
            String res;
            a = IntegerTest.this.getNumber();
            b = bInt.getNumber();
            c = cInt.getNumber();
            d = dInt.getNumber();

            res=String.valueOf(a);
            if (b>-1){
                res=res+" + "+b;
            }
            else{
                res=res+" - "+b*-1;
            }

            if (c>-1){
                res=res+" + "+c;
            }
            else{
                res=res+" - "+c*-1;
            }

            if (d>-1){
                res=res+" + "+d;
            }
            else{
                res=res+" - "+d*-1;
            }
            return res+"=";
        }

        public String getFifthResult(IntegerTest bInt, IntegerTest cInt, IntegerTest dInt){
            int res, a, b, c, d;
            a = IntegerTest.this.getNumber();
            b = bInt.getNumber();
            c = cInt.getNumber();
            d = dInt.getNumber();

            res = b/c;
            res = (a+res)*d;
            return String.valueOf(res);
        }

        public String printFifth(IntegerTest bInt, IntegerTest cInt, IntegerTest dInt){
            int a, b, c, d;
            String res;
            a = IntegerTest.this.getNumber();
            b = bInt.getNumber();
            c = cInt.getNumber();
            d = dInt.getNumber();

            res="("+String.valueOf(a);
            if (b>-1){
                res=res+" + "+b;
            }
            else{
                res=res+" - "+b*-1;
            }
            res=res+"/"+String.valueOf(c)+")*";
            if(d>-1){
                res=res+String.valueOf(d);
            }
            else{
                res=res+"("+String.valueOf(d)+")";
            }
            return res+"=";

        }}
}
