package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
        // https://stackoverflow.com/questions/15037465/converting-edittext-to-int-android
        int firstNum = Integer.parseInt(((EditText)findViewById(R.id.firstNumber)).getText().toString());
        int secondNum = Integer.parseInt(((EditText)findViewById(R.id.secondNumber)).getText().toString());

        // https://www.geeksforgeeks.org/how-to-apply-one-listener-to-multiple-buttons-in-android/
        // https://stackoverflow.com/questions/9092712/switch-case-statement-error-case-expressions-must-be-constant-expression

        int id = view.getId();
        if (id == R.id.addition) {
            goToActivity((double) firstNum + secondNum);
        }
        else if (id == R.id.subtraction) {
            goToActivity((double) firstNum - secondNum);
        }
        else if (id == R.id.multiplication) {
            goToActivity((double) firstNum * secondNum);
        }
        else if (id == R.id.division) {
            if (secondNum == 0) {
                Toast.makeText(MainActivity.this, "You can not divide by 0, please enter another number", Toast.LENGTH_LONG).show();
            }
            else {
                goToActivity((double) firstNum / secondNum);
            }
        }
    }

    public void goToActivity(double result) {
        Intent intent = new Intent(this, results.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}