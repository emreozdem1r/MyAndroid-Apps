package com.emre.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);
    }
    public void sum(View view) {
        if (num1.getText().toString().matches("") || num2.getText().toString().matches("")) {
            result.setText("Alanlar boş geçilemez!");
        } else {
            int number1 = Integer.parseInt(num1.getText().toString());
            int number2 = Integer.parseInt(num2.getText().toString());

            int sum = number1 + number2;
            result.setText("Result: " + sum);
        }
    }
    public void sub(View view){
        if (num1.getText().toString().matches("") || num2.getText().toString().matches("")) {
            result.setText("Alanlar boş geçilemez!");
        } else {
            int number1 = Integer.parseInt(num1.getText().toString());
            int number2 = Integer.parseInt(num2.getText().toString());

            int sub = number1 - number2;
            result.setText("Result: " + sub);
        }
    }
    public void mult(View view){
        if (num1.getText().toString().matches("") || num2.getText().toString().matches("")) {
            result.setText("Alanlar boş geçilemez!");
        } else {
            int number1 = Integer.parseInt(num1.getText().toString());
            int number2 = Integer.parseInt(num2.getText().toString());

            int mult = number1 * number2;
            result.setText("Result: " + mult);
        }
    }
    public void div(View view){
        if (num1.getText().toString().matches("") || num2.getText().toString().matches("")) {
            result.setText("Alanlar boş geçilemez!");
        } else {
            int number1 = Integer.parseInt(num1.getText().toString());
            int number2 = Integer.parseInt(num2.getText().toString());

            int div;
            if (number2 != 0) {
                div = number1 / number2;
                result.setText("Result: " + div);
            } else
                result.setText("Sıfıra bölme hatası!");
        }
    }
}
