package com.example.ilonka.kalkulatorek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonSimpleActivity;
    Button buttonAdvancedActivity;
    Button buttonAboutActivity;
    Button buttonExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSimpleActivity = findViewById(R.id.button);
        buttonSimpleActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSimpleActivity();
            }
        });

        buttonAdvancedActivity = findViewById(R.id.button1);
        buttonAdvancedActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAdvancedActivity();
            }
        });

        buttonAboutActivity = findViewById(R.id.button2);
        buttonAboutActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutActivity();
            }
        });

        buttonExit = findViewById(R.id.button3);
        buttonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exitActivity();
            }
        });
    }

    public void openSimpleActivity() {
        Intent intent = new Intent(this, SimpleActivity.class);
        startActivity(intent);
    }

    public void openAdvancedActivity() {
        Intent intent = new Intent(this, AdvancedActivity.class);
        startActivity(intent);
    }

    public void openAboutActivity() {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

    public void exitActivity() {
        System.exit(0);
    }

}