package com.test.simplecalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button add;
    private Button mul;
    private Button div;
    private Button eq;
    private Button sus;
    private Button mod;
    private Button point;
    private Button clear;
    private EditText results;

    private final char ADDITION = '+';
    private final char MUL = '*';
    private final char DIVISION = '/';
    private final char SOUS = '-';
    private final char MODULO = '%';
    private final char EQUAL = '=';


    private double num1;
    private double num2;
    private char ACTION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpUIViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText(results.getText().toString() + "0");
            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText(results.getText().toString() + ".");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText(results.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText(results.getText().toString() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText(results.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText(results.getText().toString() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText(results.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText(results.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText(results.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText(results.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText(results.getText().toString() + "9");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(results.getText().toString());
                computed();
                ACTION = ADDITION;
                results.setText(null);


            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(results.getText().toString());
                computed();
                ACTION = DIVISION;
                results.setText(null);

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(results.getText().toString());
                computed();
                ACTION = MUL;
                results.setText(null);

            }
        });

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(results.getText().toString());
                computed();
                ACTION = MODULO;
                results.setText(null);

            }
        });

        sus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(results.getText().toString());
                computed();
                ACTION = SOUS;
                results.setText(null);
            }
        });

        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computed();
                ACTION = EQUAL;
                results.setText(String.valueOf(num1));


            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                results.setText(null);
                num1 = 0.0;
                num2 = 0.0;


            }
        });


    }
    public void setUpUIViews(){

        two = (Button)findViewById(R.id.button2);
        three = (Button)findViewById(R.id.button3);
        four = (Button)findViewById(R.id.button4);
        five = (Button)findViewById(R.id.button5);
        six = (Button)findViewById(R.id.button6);
        seven = (Button)findViewById(R.id.button7);
        eight = (Button)findViewById(R.id.button8);
        nine = (Button)findViewById(R.id.button9);
        one = (Button)findViewById(R.id.button1);
        zero = (Button)findViewById(R.id.button0);

        add = (Button)findViewById(R.id.buttonPlus);
        eq = (Button)findViewById(R.id.buttonEq);
        mul = (Button)findViewById(R.id.buttonX);
        div = (Button)findViewById(R.id.buttonDiv);
        sus = (Button)findViewById(R.id.buttonSub);
        mod = (Button)findViewById(R.id.buttonPercent);
        point = (Button)findViewById(R.id.buttonPoint);
        clear = (Button)findViewById(R.id.buttonClear);


        results =  (EditText)findViewById(R.id.results);
    }

    public void computed (){



        num2 = Double.parseDouble(results.getText().toString());

           switch (ACTION){
               case ADDITION :
                   num1 = num1 + num2;
                   break;
               case DIVISION :
//                   if (num2 > 0 ){
                       num1 = num1 / num2;
                       break;
//                   }else {
//                       computed();
//                   }

               case SOUS :
                   num1 = num1 - num2;
                   break;
               case MUL :
                   num1 = num1 * num2;
                   break;
               case MODULO :
                   num1 = num1 % num2;
                   break;
               case  EQUAL :
                   break;
           }



    }
}
