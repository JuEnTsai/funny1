package com.example.funny1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    TextView textView1;
    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        textView1 = findViewById(R.id.textview1);
        a = 0;
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = a + 1;
                textView1.setText(""+a);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = a - 1;
                textView1.setText(""+a);
            }
        });
    }


}