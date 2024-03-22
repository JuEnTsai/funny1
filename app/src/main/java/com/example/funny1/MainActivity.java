package com.example.funny1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1 = findViewById(R.id.button1);
    Button button2 = findViewById(R.id.button2);
    TextView textView1 = findViewById(R.id.textview1);
    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = 0;
        button1.setOnClickListener(v -> {
                    a = a + 1;
                    textView1.setText(String.valueOf(a));
                });
        button2.setOnClickListener(v -> {
                a = a - 1;
                textView1.setText(String.valueOf(a));
            });
    }


}