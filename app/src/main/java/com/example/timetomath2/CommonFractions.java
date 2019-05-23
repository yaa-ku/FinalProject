package com.example.timetomath2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CommonFractions extends AppCompatActivity {

    CommonFractionTest myCom = new CommonFractionTest();
    CommonFractionTest myCom2 = new CommonFractionTest();
    CommonFractionTest myCom3 = new CommonFractionTest();

String que1 = myCom.printFirst(myCom2);
int res1_num = myCom.getFirstResultNum(myCom2);
int res1_den = myCom.getFirstResultDen(myCom2);

    CommonFractionTest myCom4 = new CommonFractionTest(myCom2, myCom3);
    String que2 = myCom4.printSecond(myCom2, myCom3);
    int res2_num = myCom4.getSecondResultNum(myCom2, myCom3);
    int res2_den = myCom4.getSecondResultDen(myCom2, myCom3);

    CommonFractionTest myCom5 = new CommonFractionTest(10);
    CommonFractionTest myCom6 = new CommonFractionTest();
    CommonFractionTest myCom7 = new CommonFractionTest(10);
    String que3 = myCom5.printThird(myCom6, myCom7);
    int res3_num = myCom5.getThirdResultNum(myCom6, myCom7);
    int res3_den = myCom5.getThirdResultDen(myCom6, myCom7);

    CommonFractionTest myCom8 = new CommonFractionTest();
    CommonFractionTest myCom9 = new CommonFractionTest();
    CommonFractionTest myCom10 = new CommonFractionTest();
    String que4 = myCom8.printFourth(myCom9, myCom10);
    int res4_num = myCom8.getFourthResultNum(myCom9, myCom10);
    int res4_den = myCom8.getFourthResultDen(myCom9, myCom10);

    CommonFractionTest myCom11 = new CommonFractionTest(10);
    CommonFractionTest myCom12 = new CommonFractionTest();
    CommonFractionTest myCom13 = new CommonFractionTest();
    CommonFractionTest myCom14 = new CommonFractionTest(10);
    String que5 = myCom11.printFifth(myCom12, myCom13, myCom14);
    int res5_num = myCom11.getFifthResultNum(myCom12, myCom13, myCom14);
    int res5_den = myCom11.getFifthResultDen(myCom12, myCom13, myCom14);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_fractions);

        TextView qu1 = (TextView) findViewById(R.id.q1_com);
        TextView qu2 = (TextView) findViewById(R.id.q2_com);
        TextView qu3 = (TextView) findViewById(R.id.q3_com);
        TextView qu4 = (TextView) findViewById(R.id.q4_com);
        TextView qu5 = (TextView) findViewById(R.id.q5_com);
        qu1.setText(que1+" "+res1_num+" "+res1_den);
        qu2.setText(que2+" "+res2_num+" "+res2_den);
        qu3.setText(que3+" "+res3_num+" "+res3_den);
        qu4.setText(que4+" "+res4_num+" "+res4_den);
        qu5.setText(que5+" "+res5_num+" "+res5_den);
    }

    public void resCom(View view) {
        Intent intent = new Intent(CommonFractions.this, CommonFractionsResult.class);
        startActivity(intent);
    }

    public class CommonFractionTest {

        public int numerator;
        public int denominator = 1;

        public CommonFractionTest(){
            numerator=(int)(Math.random()*200)-100;
            denominator=(int)(Math.random()*99)+1;
            this.normalization();
        }

        public CommonFractionTest(CommonFractionTest b, CommonFractionTest c){
            this.changeNumerator();
            b.changeNumerator();
            c.changeNumerator();
            int den=(int)(Math.random()*99)+1;
            this.denominator=den;
            b.denominator=den;
            c.denominator=den;

        }

        public CommonFractionTest(int koef){
            numerator=(int)(Math.random()*20)-10;
            denominator=(int)(Math.random()*9)+1;
            this.normalization();
        }

        public CommonFractionTest(int numerator, int denominator){
            if(denominator == 0){
                System.out.println("Denominator can't be zero. Choose another one.");
                return;
            }
            this.numerator = numerator * (denominator < 0 ? -1 : 1);
            this.denominator = Math.abs(denominator);
            this.normalization();
        }

        public CommonFractionTest(CommonFractionTest a){
            this.numerator = a.numerator;
            this.denominator= a.numerator;
        }


        public void copy(CommonFractionTest a){
            this.numerator = a.numerator;
            this.denominator= a.numerator;
        }

        public void refresh(){
            numerator=(int)(Math.random()*200)-100;
            denominator=(int)(Math.random()*99)+1;
            this.normalization();
        }

        public void refresh(int koef){
            numerator=(int)(Math.random()*20)-10;
            denominator=(int)(Math.random()*9)+1;
            this.normalization();
        }

        public void changeNumerator(){
            numerator=(int)(Math.random()*200)-100;
            this.normalization();
        }

        public void changeDenominator(){
            denominator=(int)(Math.random()*99)+1;
        }

        public void changeToOneDenominator(CommonFractionTest b, CommonFractionTest c){
            this.changeNumerator();
            b.changeNumerator();
            c.changeNumerator();
            int den=(int)(Math.random()*99)+1;
            this.denominator=den;
            b.denominator=den;
            c.denominator=den;

        }

        public int gcd(int numerator, int denominator){
            while (numerator != 0 && denominator != 0) {
                if (numerator > denominator) {
                    numerator %= denominator;
                } else {
                    denominator %= numerator;
                }
            }
            return numerator + denominator;
        }


        public void normalization(){
            int n = gcd(Math.abs(numerator), Math.abs(denominator));
            numerator /= n;
            denominator /= n;
        }

        public String toString(){ // вывод дроби на печать
            return new String(numerator + "/" + denominator);
        }

        public String toStringMinus(){
            int a = numerator*-1;
            return new String(a + "/" + denominator);
        }

        public CommonFractionTest sumFractionTo(CommonFractionTest obj){ //сложение дробей
            return new CommonFractionTest(this.numerator * obj.denominator + obj.numerator * this.denominator, this.denominator * obj.denominator);
        }

        public CommonFractionTest multiply(CommonFractionTest v){
            //умножение на уже существующую дробь
            int resN;
            int resD;
            resN = numerator*v.numerator;
            resD = denominator*v.denominator;

            return new CommonFractionTest(resN,resD);
        }

        public CommonFractionTest divide(CommonFractionTest v){
            //деление на уже существующую дробь
            int resN;
            int resD;
            resN = numerator*v.denominator;
            resD = denominator*v.numerator;

            return new CommonFractionTest(resN,resD);
        }

        public CommonFractionTest substraction(CommonFractionTest v){
            //вычитание уже существующей дроби
            int num = v.numerator;
            int den = v.denominator;
            int resN=0;
            int resD=1;
            if (denominator!=den){ //если знаменатели не равны
                resN=numerator*den;//то приводим к одному знаменателю
                resD=denominator*den;
                num*=denominator;
                den*=denominator;
            }
            else{
                resD=denominator;
                resN=numerator;
            }
            resN-=num;

            return new CommonFractionTest(resN,resD);
        }

        public String printFirst(CommonFractionTest b){
            String res;

            res = this.toString();
            if(b.numerator>0){
                res=res+" + "+b.toString();
            }
            else{
                res=res+" - "+b.toStringMinus();
            }
            return res;
        }

        public int getFirstResultNum(CommonFractionTest b){
            CommonFractionTest res;
            res = this.sumFractionTo(b);
            return res.numerator;
        }

        public int getFirstResultDen(CommonFractionTest b){
            CommonFractionTest res;
            res = this.sumFractionTo(b);
            return res.denominator;
        }

        public String printSecond(CommonFractionTest b, CommonFractionTest c){
            String res;

            res = this.toString();
            if(b.numerator>0){
                res=res+" + "+b.toString();
            }
            else{
                res=res+" - "+b.toStringMinus();
            }
            if(c.numerator>0){
                res=res+" + "+c.toString();
            }
            else{
                res=res+" - "+c.toStringMinus();
            }
            return res;
        }

        public int getSecondResultNum(CommonFractionTest b, CommonFractionTest c){
            CommonFractionTest res;
            res = this.sumFractionTo(b);
            res = res.sumFractionTo(c);
            return res.numerator;
        }

        public int getSecondResultDen(CommonFractionTest b, CommonFractionTest c){
            CommonFractionTest res;
            res = this.sumFractionTo(b);
            res = res.sumFractionTo(c);
            return res.denominator;
        }

        public String printThird(CommonFractionTest b, CommonFractionTest c){
            String res;

            res = this.toString();
            if(b.numerator>0){
                res=res+" + "+b.toString();
            }
            else{
                res=res+" - "+b.toStringMinus();
            }
            if(c.numerator>-1){
                res=res+" * "+c.toString();}
            else{
                res=res+" * ("+c.toString()+")";}
            return res;
        }
        public int getThirdResultNum(CommonFractionTest b, CommonFractionTest c){
            CommonFractionTest res;
            res = b.multiply(c);
            res = res.sumFractionTo(this);
            return res.numerator;
        }

        public int getThirdResultDen(CommonFractionTest b, CommonFractionTest c){
            CommonFractionTest res;
            res = b.multiply(c);
            res = this.sumFractionTo(res);
            return res.denominator;
        }

        public String printFourth(CommonFractionTest b, CommonFractionTest c){
            String res;

            res = this.toString();
            res=res+" * ("+b.toString()+")";
            if(c.numerator>-1){
                res=res+" / "+c.toString();}
            else{
                res=res+" / ("+c.toString()+")";}
            return res;
        }

        public int getFourthResultNum(CommonFractionTest b, CommonFractionTest c){
            CommonFractionTest res;
            res=this.multiply(b);
            res=res.divide(c);
            return res.numerator;
        }

        public int getFourthResultDen(CommonFractionTest b, CommonFractionTest c){
            CommonFractionTest res;
            res=this.multiply(b);
            res=res.divide(c);
            return res.denominator;
        }

        public String printFifth(CommonFractionTest b, CommonFractionTest c, CommonFractionTest d){
            String res;
            res = this.toString()+" * ("+b;
            if(c.numerator>0){
                res=res+" + "+c.toString()+") / ("+d.toString()+")";
            }
            else{
                res=res+" - "+c.toStringMinus()+") / ("+d.toString()+")";}
            return res;
        }

        public int getFifthResultNum(CommonFractionTest b, CommonFractionTest c, CommonFractionTest d){
            CommonFractionTest res;
            res=b.sumFractionTo(c);
            res=this.multiply(res);
            res=res.divide(d);
            return res.numerator;
        }

        public int getFifthResultDen(CommonFractionTest b, CommonFractionTest c, CommonFractionTest d){
            CommonFractionTest res;
            res=b.sumFractionTo(c);
            res=this.multiply(res);
            res=res.divide(d);
            return res.denominator;
        }}
}
