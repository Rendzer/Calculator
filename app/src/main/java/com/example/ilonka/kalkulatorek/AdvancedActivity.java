package com.example.ilonka.kalkulatorek;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;


public class AdvancedActivity extends AppCompatActivity implements View.OnClickListener {
    double valueOne = 0, valueTwo = 0;
    boolean add, sub, mul, div, x_y, e_q;
    String text, value;
    TextView textView;
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0;
    Button buttonAdd, buttonSub, buttonMul, buttonDiv, buttonEqual, buttonClear, buttonReverse, buttonBackspace, buttonDot;
    Button buttonSin, buttonCos, buttonTn, buttonLn, buttonSqrt, buttonX2, buttonXy, buttonLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);
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
        buttonSin = findViewById(R.id.buttonSin);
        buttonCos = findViewById(R.id.buttonCos);
        buttonTn = findViewById(R.id.buttonTn);
        buttonLn = findViewById(R.id.buttonLn);
        buttonSqrt = findViewById(R.id.buttonSqrt);
        buttonX2 = findViewById(R.id.buttonX2);
        buttonXy = findViewById(R.id.buttonXy);
        buttonLog = findViewById(R.id.buttonLog);
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
        buttonSin.setOnClickListener(this);
        buttonCos.setOnClickListener(this);
        buttonTn.setOnClickListener(this);
        buttonLn.setOnClickListener(this);
        buttonSqrt.setOnClickListener(this);
        buttonX2.setOnClickListener(this);
        buttonXy.setOnClickListener(this);
        buttonLog.setOnClickListener(this);
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
        outState.putBoolean("xy", x_y);
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
        Boolean _xy = savedInstanceState.getBoolean("xy", x_y);
        x_y = _xy;
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
            case R.id.buttonSin: {
                sinFunction();
                break;
            }
            case R.id.buttonCos: {
                cosFunction();
                break;
            }
            case R.id.buttonTn: {
                tnFunction();
                break;
            }
            case R.id.buttonLn: {
                lnFunction();
                break;
            }
            case R.id.buttonSqrt: {
                sqrtFunction();
                break;
            }
            case R.id.buttonX2: {
                x2Function();
                break;
            }
            case R.id.buttonXy: {
                add=false;
                sub=false;
                div=false;
                mul=false;
                text = textView.getText() + "";
                if (text.contains("Infinity") || text.isEmpty() || text.equals(".") || text.contains("NaN") || text.equals("-")) {
                    textView.setText("0");
                }
                valueOne = 0 + Double.parseDouble(textView.getText() + "");
                x_y = true;
                textView.setText("0");
                break;
            }
            case R.id.buttonLog: {
                logFunction();
                break;
            }
            case R.id.buttonDiv: {
                add=false;
                sub=false;
                mul=false;
                x_y = false;
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
                x_y = false;
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
                x_y = false;
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
                x_y=false;
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
                    } else  textView.setText(text.substring(0, len - 1));
                }
                if (add) {
                    if (text != ".") {
                        value = String.valueOf(valueOne + valueTwo);
                        value = String.valueOf(new BigDecimal(value).setScale(2,BigDecimal.ROUND_CEILING));
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
                        value = String.valueOf(new BigDecimal(value).setScale(2,BigDecimal.ROUND_CEILING));
                        textView.setText(value + "");
                        valueOne = 0;
                        valueTwo = 0;
                        e_q = true;
                        sub = false;
                    } else textView.setText(valueOne + "");
                }
                if (mul) {
                            value = String.valueOf(valueOne * valueTwo);
                            value = String.valueOf(new BigDecimal(value).setScale(2,BigDecimal.ROUND_CEILING));
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
                            value = String.valueOf(new BigDecimal(value).setScale(2,BigDecimal.ROUND_CEILING));
                            textView.setText(value);
                            valueOne = 0;
                            valueTwo = 0;
                            e_q = true;
                            div = false;
                        }
                    } else textView.setText(valueOne + "");
                }
                if (x_y) {
                    if (valueOne == 0) {
                        textView.setText("0");
                    } else if (valueOne != 0 && text != ".") {
                        value = String.valueOf(Math.pow(valueOne, valueTwo));
                        value = String.valueOf(new BigDecimal(value).setScale(2,BigDecimal.ROUND_CEILING));
                        textView.setText(value);
                        valueOne = 0;
                        valueTwo = 0;
                        e_q = true;
                        x_y = false;
                    } else textView.setText("1");
                }
                break;
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

    public void sinFunction() {
        text = textView.getText() + "";
        value = String.valueOf(Math.sin(Double.valueOf(text.toString())));
        value = String.valueOf(new BigDecimal(value).setScale(6,BigDecimal.ROUND_CEILING));
        textView.setText(value);
    }

    public void cosFunction() {
        text = textView.getText() + "";
        value = String.valueOf(Math.cos(Double.valueOf(text.toString())));
        value = String.valueOf(new BigDecimal(value).setScale(6,BigDecimal.ROUND_CEILING));
        textView.setText(value);
    }

    public void tnFunction() {
        text = textView.getText() + "";
        value = String.valueOf(Math.tan(Double.valueOf(text.toString())));
        value = String.valueOf(new BigDecimal(value).setScale(6,BigDecimal.ROUND_CEILING));
        textView.setText(value);
    }

    public void logFunction() {
        text = textView.getText() + "";
        if (text.equals("0") || text.startsWith("-", 0)) {
            Toast.makeText(getApplicationContext(), "Log <= 0!", Toast.LENGTH_SHORT).show();
            textView.setText("0");
            //}
        } else {
            value = String.valueOf(Math.log10(Double.valueOf(text.toString())));
            value = String.valueOf(new BigDecimal(value).setScale(6, BigDecimal.ROUND_CEILING));
            textView.setText(value);
        }

        /*
        text = textView.getText() + "";
        if (!text.startsWith("-", 0)) {
            if (!text.equals("0")) {
                value = String.valueOf(Math.log(Double.valueOf(text.toString())));
                value = String.valueOf(new BigDecimal(value).setScale(6, BigDecimal.ROUND_CEILING));
                textView.setText(value);
            } else {
                Toast.makeText(getApplicationContext(), "Log = 0!", Toast.LENGTH_SHORT).show();
                textView.setText("0");
            }
        }
        else {
            Toast.makeText(getApplicationContext(), "Log < 0!", Toast.LENGTH_SHORT).show();
            textView.setText("0");
        }
        */
    }

    public void lnFunction() {
        text = textView.getText() + "";
            if (text.equals("0") || text.startsWith("-", 0)) {
                Toast.makeText(getApplicationContext(), "Ln <= 0!", Toast.LENGTH_SHORT).show();
                textView.setText("0");
            //}
        } else {
            value = String.valueOf(Math.log(Double.valueOf(text.toString())));
            value = String.valueOf(new BigDecimal(value).setScale(6, BigDecimal.ROUND_CEILING));
            textView.setText(value);
        }


        /*
        text = textView.getText() + "";
        if (!text.startsWith("-", 0)) {
            if (!text.equals("0")) {
                value = String.valueOf(Math.log(Double.valueOf(text.toString())));
                value = String.valueOf(new BigDecimal(value).setScale(6, BigDecimal.ROUND_CEILING));
                textView.setText(value);
            } else {
                Toast.makeText(getApplicationContext(), "Ln = 0!", Toast.LENGTH_SHORT).show();
                textView.setText("0");
            }
        }
        else {
            Toast.makeText(getApplicationContext(), "Ln < 0!", Toast.LENGTH_SHORT).show();
            textView.setText("0");
        }
        */

    }

    public void sqrtFunction() {
        text = textView.getText() + "";
        if (!text.startsWith("-", 0)) {
            value = String.valueOf(Math.sin(Double.valueOf(text.toString())));
            value = String.valueOf(new BigDecimal(value).setScale(6, BigDecimal.ROUND_CEILING));
        }
        else {
            Toast.makeText(getApplicationContext(), "Sqrt < 0!", Toast.LENGTH_SHORT).show();
            textView.setText("0");
        }
    }

    public void x2Function() {
        text = textView.getText() + "";
        value = String.valueOf(Math.pow(Double.valueOf(text.toString()),2));
        value = String.valueOf(new BigDecimal(value).setScale(6,BigDecimal.ROUND_CEILING));
        textView.setText(value);
    }

}
