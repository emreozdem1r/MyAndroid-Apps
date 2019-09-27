package com.emre.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView showArea;
    EditText age;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        age = findViewById(R.id.age);
        showArea = findViewById(R.id.showArea);
        sharedPreferences = this.getSharedPreferences("com.emre.sharedpreference", Context.MODE_PRIVATE);

        int storedAge = sharedPreferences.getInt("storedAge", 0);
        if(storedAge == 0){
            showArea.setText("");
        }else{
            showArea.setText("Your age: " + storedAge);
        }
    }
    public void showAge(View view){
        if(!age.getText().toString().matches("")){
            int userAge = Integer.parseInt(age.getText().toString());
            showArea.setText("Your age: "+ userAge);

            sharedPreferences.edit().putInt("storedAge",userAge).apply();

        }
        else{
            showArea.setText("Please enter your age!");
        }
    }
    public void delete(View view){
        int storedData = sharedPreferences.getInt("storedAge", 0);

        if(storedData != 0){
            sharedPreferences.edit().remove("storedData").apply();
            showArea.setText("Your age");
        }

    }
}
