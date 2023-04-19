package com.example.urbanroofapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button Move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Move = findViewById(R.id.Move);
        Move.setOnClickListener(v ->  {
            Intent intent = new Intent(this, Login.class);
            startActivity(intent);

        });
    }

}