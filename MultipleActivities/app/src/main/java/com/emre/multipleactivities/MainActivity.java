package com.emre.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    String userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
    }
    public void changeActivity(View view){
            userName = editText.getText().toString();

            Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
            intent.putExtra("userInput", userName);
            startActivity(intent);
    }
}
