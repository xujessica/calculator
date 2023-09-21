package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class results extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results_activity);

        textView = (TextView) findViewById(R.id.total);
        Intent intent = getIntent();
        int result = intent.getIntExtra("result", 0);
        textView.setText("The total is " + result);
    }
}