package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {
    Button btn;
    EditText ed1 ;
    EditText ed2 ;
    String v1,v2;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        btn = findViewById(R.id.button);

        ed1 = findViewById(R.id.editText3);
        ed2 = findViewById(R.id.editText4);

    }

    @Override
    protected void onResume() {
        super.onResume();


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1=ed1.getText().toString();
                v2=ed2.getText().toString();

                Intent intent=new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("Value1",v1);
                intent.putExtra("Value2",v2);


            }
        });

    }
}
