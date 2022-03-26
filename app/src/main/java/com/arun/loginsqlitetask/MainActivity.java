package com.arun.loginsqlitetask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvToSignup = (TextView) findViewById(R.id.tvtoSignUp);
        tvToSignup.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, SignUp.class));
        });
    }
}