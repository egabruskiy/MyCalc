package com.example.ewgengabruskiy.mycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1, button2, button3, button4, button5, button6, button7,
            button8, button9, button0, buttonMin, buttonDiv, buttonPlus, buttonMulti,
            buttonEqual;
    private TextView textView;
    private double a;
    private double b;
    private int countNumb = 0;
    private char operator;
    private int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            //numbers
            case R.id.button1:
                setNumber(1);
                break;
            case R.id.button2:
                setNumber(2);
                break;
            case R.id.button3:
                setNumber(3);
                break;
            case R.id.button4:
                setNumber(4);
                break;
            case R.id.button5:
                setNumber(5);
                break;
            case R.id.button6:
                setNumber(6);
                break;
            case R.id.button7:
                setNumber(7);
                break;
            case R.id.button8:
                setNumber(8);
                break;
            case R.id.button9:
                setNumber(9);
                break;
            case R.id.button0:
                setNumber(0);
                break;

                //maths
            case R.id.buttonPlus:
                operator = '+';
                handleNumber();
                break;
            case R.id.buttonMulti:
                operator = '*';
                handleNumber();
                break;
            case R.id.buttonMin:
                operator = '-';
                handleNumber();
                break;
            case R.id.buttonDiv:
                operator = '/';
                handleNumber();
                break;

            case R.id.buttonEqual:
                handleNumber();

                if (operator == '+') {
                    textView.setText(String.valueOf(a + b));
                    countNumb = 0;
                }
                if (operator == '-') {
                    textView.setText(String.valueOf(a - b));
                    countNumb = 0;
                }
                if (operator == '*') {
                    textView.setText(String.valueOf(multiply(a, b)));
                    countNumb = 0;
                }
                if (operator == '/') {
                    if (b != 0) {
                        textView.setText(String.valueOf(a / b));
                    } else textView.setText("Error");
                    countNumb = 0;
                }
                break;
        }

    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    private void setNumber(int number) {
        if(clickCount == 0) {
            textView.setText("");
            clickCount++;
            textView.append(String.valueOf(number));
        }else textView.append(String.valueOf(number));

    }
    private void handleNumber() {
        clickCount = 0;
        if (countNumb == 0) {
            a = Double.valueOf(textView.getText().toString());
            ++countNumb;
        }else b = Double.valueOf(textView.getText().toString());
        }

        private void initUI(){
            button1 = findViewById(R.id.button1);
            button2 = findViewById(R.id.button2);
            button3 = findViewById(R.id.button3);
            button4 = findViewById(R.id.button4);
            button5 = findViewById(R.id.button5);
            button6 = findViewById(R.id.button6);
            button7 = findViewById(R.id.button7);
            button8 = findViewById(R.id.button8);
            button9 = findViewById(R.id.button9);
            button0 = findViewById(R.id.button0);
            buttonMin = findViewById(R.id.buttonMin);
            buttonDiv = findViewById(R.id.buttonDiv);
            buttonPlus = findViewById(R.id.buttonPlus);
            buttonMulti = findViewById(R.id.buttonMulti);
            buttonEqual = findViewById(R.id.buttonEqual);
            textView = findViewById(R.id.textView);
            button1.setOnClickListener(this);
            button2.setOnClickListener(this);
            button3.setOnClickListener(this);
            button4.setOnClickListener(this);
            button5.setOnClickListener(this);
            button6.setOnClickListener(this);
            button7.setOnClickListener(this);
            button8.setOnClickListener(this);
            button9.setOnClickListener(this);
            button0.setOnClickListener(this);
            buttonMin.setOnClickListener(this);
            buttonDiv.setOnClickListener(this);
            buttonMulti.setOnClickListener(this);
            buttonPlus.setOnClickListener(this);
            buttonEqual.setOnClickListener(this);
        }
    }