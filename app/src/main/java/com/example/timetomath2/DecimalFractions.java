package com.example.timetomath2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DecimalFractions extends AppCompatActivity {

    public SharedPreferences sPref;
    public SharedPreferences.Editor editor;

    EditText ans1;
    EditText ans2;
    EditText ans3;
    EditText ans4;
    EditText ans5;

    DecimalFractionsTest myCom = new DecimalFractionsTest(3);
    DecimalFractionsTest myCom2 = new DecimalFractionsTest(3);
    DecimalFractionsTest myCom3 = new DecimalFractionsTest(3);
    String que1=myCom.printFirst(myCom2, myCom3);
    String res1= myCom.getFirstResult(myCom2, myCom3);
    DecimalFractionsTest myCom4 = new DecimalFractionsTest(2);
    DecimalFractionsTest myCom5 = new DecimalFractionsTest(2);
    String que2=myCom4.printSecond(myCom5);
    String res2= myCom4.getSecondResult(myCom5);
    DecimalFractionsTest myCom6 = new DecimalFractionsTest(1);
    DecimalFractionsTest myCom7 = new DecimalFractionsTest(1);
    String que3=myCom6.printThird(myCom7);
    String res3= myCom6.getThirdResult(myCom7);
    DecimalFractionsTest myCom8 = new DecimalFractionsTest(3);
    DecimalFractionsTest myCom9 = new DecimalFractionsTest(1);
    DecimalFractionsTest myCom10 = new DecimalFractionsTest(1);
    String que4=myCom8.printFourth(myCom9,myCom10);
    String res4= myCom8.getFourthResult(myCom9,myCom10);
    DecimalFractionsTest myCom11 = new DecimalFractionsTest(2);
    DecimalFractionsTest myCom12 = new DecimalFractionsTest(2);
    String que5=myCom11.printFifth(myCom12);
    String res5= myCom11.getFifthResult(myCom12);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sPref = getSharedPreferences("app_settings", Context.MODE_PRIVATE);
        editor = sPref.edit();
        switch(sPref.getString("app_theme","")){
            case "1":
                setContentView(R.layout.activity_decimal_fractions);
                break;
            case "2":
                setContentView(R.layout.activity_decimal_fractions2);
                break;
            default: setContentView(R.layout.activity_decimal_fractions);
        }

        TextView q1 = (TextView) findViewById(R.id.q1_dec);
        TextView q2 = (TextView) findViewById(R.id.q2_dec);
        TextView q3 = (TextView) findViewById(R.id.q3_dec);
        TextView q4 = (TextView) findViewById(R.id.q4_dec);
        TextView q5 = (TextView) findViewById(R.id.q5_dec);

        q1.setText(que1+" "+res1);
        q2.setText(que2+" "+res2);
        q3.setText(que3+" "+res3);
        q4.setText(que4+" "+res4);
        q5.setText(que5+" "+res5);

        ans1 = (EditText) findViewById(R.id.res1_dec);
        ans2 = (EditText) findViewById(R.id.res2_dec);
        ans3 = (EditText) findViewById(R.id.res3_dec);
        ans4 = (EditText) findViewById(R.id.res4_dec);
        ans5 = (EditText) findViewById(R.id.res5_dec);

        TextView qu1 = (TextView) findViewById(R.id.q1_dec);
        TextView qu2 = (TextView) findViewById(R.id.q2_dec);
        TextView qu3 = (TextView) findViewById(R.id.q3_dec);
        TextView qu4 = (TextView) findViewById(R.id.q4_dec);
        TextView qu5 = (TextView) findViewById(R.id.q5_dec);
        qu1.setText(que1);
        qu2.setText(que2);
        qu3.setText(que3);
        qu4.setText(que4);
        qu5.setText(que5);

    }

    public void resDec(View view) {
        Intent intent = new Intent(DecimalFractions.this, DecimalFractionsResult.class);

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

    public class DecimalFractionsTest {

        double value;
        int curr;

        public DecimalFractionsTest(int koef){
            if (koef==1){
                value=((Math.random()*200)-100);
                value=(int)(value*10);
                value=(double)(value/10);
            }
            if (koef==2){
                value=((Math.random()*200)-100);
                value=(int)(value*100);
                value=(double)(value/100);
            }
            if (koef==3){
                value=((Math.random()*200)-100);
                value=(int)(value*1000);
                value=(double)(value/1000);
            }
        }

        public void refresh(int koef){
            if (koef==1){
                value=((Math.random()*200)-100);
                value=(int)(value*10);
                value=(double)(value/10);
            }
            if (koef==2){
                value=((Math.random()*200)-100);
                value=(int)(value*100);
                value=(double)(value/100);
            }
            if (koef==3){
                value=((Math.random()*200)-100);
                value=(int)(value*1000);
                value=(double)(value/1000);
            }
        }

        public double getValue(){
            return value;
        }

        public String printFirst(DecimalFractionsTest b,DecimalFractionsTest c){
            String res;
            res=String.valueOf(this.getValue());
            if (b.getValue()>-1){
                res=res+" + "+b.getValue();
            }
            else {
                res=res+" - "+b.getValue()*-1;
            }
            if (c.getValue()>-1){
                res=res+" + "+c.getValue();
            }
            else {
                res=res+" - "+c.getValue()*-1;
            }
            return res+" = ";
        }

        public String getFirstResult(DecimalFractionsTest b,DecimalFractionsTest c){
            double res;
            res=this.getValue()+b.getValue()+c.getValue();
            res=res*1000;
            res=(int)res;
            res=res/1000;
            return String.valueOf(res);
        }

        public String printSecond(DecimalFractionsTest b){
            String res;
            res=this.getValue()+" * "+b.getValue();
            return res+" = ";
        }

        public String getSecondResult(DecimalFractionsTest b){
            double res;
            res=this.getValue()*b.getValue();
            res=res*10000;
            res=(int)res;
            res=res/10000;
            return String.valueOf(res);
        }

        public String printThird(DecimalFractionsTest b){
            String res;
            res=this.getValue()+" / "+b.getValue();
            return res+" = ";
        }

        public String getThirdResult(DecimalFractionsTest b){
            double res;
            res=this.getValue()/b.getValue();
            res=res*1000;
            res=(int)res;
            res=res/1000;
            return String.valueOf(res);
        }

        public String printFourth(DecimalFractionsTest b, DecimalFractionsTest c){
            String res;
            if(b.getValue()>-1){
                res=this.getValue()+" + "+b.getValue()+" * ";}
            else{
                res=this.getValue()+" - "+b.getValue()*-1+" * ";}
            if (c.getValue()>-1){
                res=res+c.getValue();
            }
            else{
                res=res+"("+c.getValue()+")";
            }
            return res+" = ";
        }

        public String getFourthResult(DecimalFractionsTest b, DecimalFractionsTest c){
            double res;
            res=b.getValue()*c.getValue();
            res=this.getValue()+res;
            res=res*1000;
            res=(int)res;
            res=res/1000;
            return String.valueOf(res);
        }
        public String printFifth(DecimalFractionsTest b){
            String res;
            curr=(int)(Math.random()*20)-10;
            res="("+this.getValue();
            if(b.getValue()>-1){
                res=res+" + "+b.getValue()+") / ";}
            else{
                res=res+" - "+b.getValue()*-1+") / ";}
            if(curr>-1){
                res=res+curr;
            }
            else{
                res=res+"("+curr+")";
            }
            return res+" = ";

        }

        public String getFifthResult(DecimalFractionsTest b){
            double res;
            res=this.getValue()+b.getValue();
            res=res/curr;
            res=res*1000;
            res=(int)res;
            res=res/1000;
            return String.valueOf(res);
        }}

}
