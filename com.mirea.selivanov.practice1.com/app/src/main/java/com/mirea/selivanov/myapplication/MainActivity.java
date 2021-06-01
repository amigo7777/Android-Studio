package com.mirea.selivanov.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        TextView myTextView = (TextView) findViewById(R.id.text);
        myTextView.setText("New text in MIREA");

        Button button =(Button) findViewById(R.id.on);
        button.setText("MireaButton");

        CheckBox checkBox = findViewById(R.id.checkbox);checkBox.setChecked(true);
    }
}