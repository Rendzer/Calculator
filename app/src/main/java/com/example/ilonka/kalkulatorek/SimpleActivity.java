package com.example.ilonka.kalkulatorek;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;


public class SimpleActivity extends AppCompatActivity implements View.OnClickListener {
    double valueOne = 0, valueTwo = 0;
    boolean add, sub, mul, div, e_q;
    String text, value;
    TextView textView;
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0;
    Button buttonAdd, buttonSub, buttonMul, buttonDiv, buttonEqual, buttonClear, buttonReverse, buttonBackspace, buttonDot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        init();
        onInitListener();
    }

    void init() {
        textView = findViewById(R.id.textView2);
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
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSub = findViewById(R.id.buttonSub);
        buttonMul = findViewById(R.id.buttonMul);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonReverse = findViewById(R.id.buttonReverse);
        buttonClear = findViewById(R.id.buttonClear);
        buttonEqual = findViewById(R.id.buttonEqual);
        buttonBackspace = findViewById(R.id.buttonBackspace);
        buttonDot = findViewById(R.id.buttonDot);

    }

    void onInitListener() {
        textView.setOnClickListener(this);
        textView.setText("0");
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
        buttonAdd.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonReverse.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
        buttonBackspace.setOnClickListener(this);
        buttonClear.setOnClickListener(this);
        buttonDot.setOnClickListener(this);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("value", textView.getText() + "");
        outState.putDouble("valueOne", valueOne);
        outState.putDouble("valueTwo", valueTwo);
        outState.putBoolean("div", div);
        outState.putBoolean("mul", mul);
        outState.putBoolean("add", add);
        outState.putBoolean("sub", sub);
        outState.putBoolean("eq", e_q);
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        text = savedInstanceState.getString("value");
        textView.setText(text);
        double firstValue = savedInstanceState.getDouble("valueOne", valueOne);
        valueOne = firstValue;
        double secondValue = savedInstanceState.getDouble("valueTwo", valueTwo);
        valueTwo = secondValue;

        Boolean _add = savedInstanceState.getBoolean("add", add);
        add = _add;
        Boolean _sub = savedInstanceState.getBoolean("sub", sub);
        sub = _sub;
        Boolean _mul = savedInstanceState.getBoolean("mul", mul);
        mul = _mul;
        Boolean _div = savedInstanceState.getBoolean("div", div);
        div = _div;
        Boolean _eq = savedInstanceState.getBoolean("eq", e_q);
        e_q = _eq;

        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button0: {
                enterNumber("0");
                break;
            }
            case R.id.button1: {
                enterNumber("1");
                break;
            }
            case R.id.button2: {
                enterNumber("2");
                break;
            }
            case R.id.button3: {
                enterNumber("3");
                break;
            }
            case R.id.button4: {
                enterNumber("4");
                break;
            }
            case R.id.button5: {
                enterNumber("5");
                break;
            }
            case R.id.button6: {
                enterNumber("6");
                break;
            }
            case R.id.button7: {
                enterNumber("7");
                break;
            }
            case R.id.button8: {
                enterNumber("8");
                break;
            }
            case R.id.button9: {
                enterNumber("9");
                break;
            }
            case R.id.buttonBackspace: {
                enterBackspace();
                break;
            }
            case R.id.buttonClear: {
                enterClear();
                break;
            }
            case R.id.buttonReverse: {
                enterReverse();
                break;
            }
            case R.id.buttonDiv: {
                add=false;
                sub=false;
                mul=false;
                text = textView.getText() + "";
                if (text.contains("Infinity") || text.isEmpty() || text.equals(".") || text.contains("NaN") || text.equals("-")) {
                    textView.setText("0");
                }
                valueOne = 0 + Double.parseDouble(textView.getText() + "");
                div = true;
                textView.setText("0");
                break;
            }
            case R.id.buttonMul: {
                add = false;
                sub = false;
                div = false;
                text = textView.getText() + "";
                if (text.contains("Infinity") || text.isEmpty() || text.equals(".") || text.contains("NaN") || text.equals("-")) {
                    textView.setText("0");
                }
                valueOne = 0 + Double.parseDouble(textView.getText() + "");
                mul = true;
                textView.setText("0");
                break;
            }
            case R.id.buttonSub: {
                add=false;
                div=false;
                mul=false;
                text = textView.getText() + "";
                if (text.contains("Infinity") || text.isEmpty() || text.equals(".") || text.contains("NaN") || text.equals("-")) {
                    textView.setText("0");
                }
                valueOne = 0 + Double.parseDouble(textView.getText() + "");
                sub = true;
                textView.setText("0");
                break;
            }
            case R.id.buttonAdd: {
                sub=false;
                div=false;
                mul=false;
                text = textView.getText() + "";
                if (text.contains("Infinity") || text.isEmpty() || text.equals(".") || text.contains("NaN")) {
                    textView.setText("0");
                }
                valueOne = 0 + Double.parseDouble(textView.getText() + "");
                add = true;
                textView.setText("0");
                break;
            }
            case R.id.buttonEqual: {
                text = textView.getText() + "";
                int len = textView.length();
                if (text.isEmpty() || text.equals(".") || text.contains("NaN") || text.equals("-") || text.equals("-0") || text.equals("0.")) {
                    textView.setText("0");
                } else {
                    if (!text.endsWith(".")) {
                        valueTwo = 0 + Double.parseDouble(textView.getText() + "");
                    } else textView.setText(text.substring(0, len - 1));
                }
                if (add) {
                    if (text != ".") {
                        value = String.valueOf(valueOne + valueTwo);
                        value = String.valueOf(new BigDecimal(value).setScale(2, BigDecimal.ROUND_CEILING));
                        textView.setText(value + "");
                        valueOne = 0;
                        valueTwo = 0;
                        e_q = true;
                        add = false;
                    } else textView.setText(valueOne + "");
                }
                if (sub) {
                    if (text != ".") {
                        value = String.valueOf(valueOne - valueTwo);
                        value = String.valueOf(new BigDecimal(value).setScale(2, BigDecimal.ROUND_CEILING));
                        textView.setText(value + "");
                        valueOne = 0;
                        valueTwo = 0;
                        e_q = true;
                        sub = false;
                    } else textView.setText(valueOne + "");
                }
                if (mul) {
                    value = String.valueOf(valueOne * valueTwo);
                    value = String.valueOf(new BigDecimal(value).setScale(2, BigDecimal.ROUND_CEILING));
                    textView.setText(value);
                    valueOne = 0;
                    valueTwo = 0;
                    e_q = true;
                    mul = false;
                }
                if (div) {
                    if (text != ".") {
                        if (valueTwo == 0) {
                            Toast.makeText(getApplicationContext(), "Division by 0 is not allowed!", Toast.LENGTH_SHORT).show();
                        } else if (valueTwo != 0) {
                            value = String.valueOf(valueOne / valueTwo);
                            value = String.valueOf(new BigDecimal(value).setScale(2, BigDecimal.ROUND_CEILING));
                            textView.setText(value);
                            valueOne = 0;
                            valueTwo = 0;
                            e_q = true;
                            div = false;
                        }
                    } else textView.setText(valueOne + "");
                }
            }
            case R.id.buttonDot: {
                enterDot();
                break;
            }


        }
    }

    void enterNumber(String number) {
        text = textView.getText() + "";
        if (text.length() < 18) {
            if (text.contains("Infinity") || text.contains("NaN") || text.equals("0")) {
                textView.setText(number.toString());
            } else textView.setText(textView.getText() + number);
        } else textView.setText(number);
        if (e_q) {
            textView.setText(number);
            e_q = false;
        }
        if (text.equals("-0") || e_q == true) textView.setText(number);
        if (text.equals("-")) {
            number = String.valueOf(-1 * Double.parseDouble(text));
            textView.setText(number);
        }
    }

    void enterBackspace() {
        text = textView.getText() + "";
        if (text.contains("Infinity") || text.contains("NaN")) textView.setText("0");
        int len = textView.length();
        if (textView.length() == 1)
            textView.setText("0");
        else if (textView.length() != 0)
            textView.setText(text.substring(0, len - 1));
    }

    void enterDot() {
        text = textView.getText() + "";
        if (!text.contains(".")) {
            if (!text.startsWith(".")) {
                textView.setText(textView.getText() + ".");
            } else textView.setText("0");
        }
    }

    void enterClear() {
        textView.setText("0");
    }

    void enterReverse() {
        text = textView.getText() + "";
        if (text.contains("Infinity") || text.contains("NaN")) {
            textView.setText("0");
        }
        if (!text.startsWith("-")) {
            textView.setText("-" + textView.getText());
        } else {
            if (text.startsWith("-0")) {
                textView.setText("0");
            } else {
                double number = -1 * Double.parseDouble(textView.getText() + "");
                textView.setText(number + "");
            }
        }
    }


}
