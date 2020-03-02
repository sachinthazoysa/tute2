package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {


    String takeString1, takeString2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent myIntent = new Intent();
        takeString1=myIntent.getStringExtra("value1");
        takeString2=myIntent.getStringExtra("value2");





    }
}
