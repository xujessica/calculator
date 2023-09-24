package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class results extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results_activity);

        textView = (TextView) findViewById(R.id.total);
        Intent intent = getIntent();
        double result = intent.getDoubleExtra("result", 0);

        // https://stackoverflow.com/questions/8137218/trim-double-to-2-decimal-places
        DecimalFormat df = new DecimalFormat("#.##");
        textView.setText("" + df.format(result));
    }
}