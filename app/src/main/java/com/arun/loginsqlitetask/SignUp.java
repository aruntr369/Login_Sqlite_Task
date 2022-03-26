package com.arun.loginsqlitetask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class SignUp extends AppCompatActivity {

    TextInputEditText email,username,password;
    TextView toLogin;
    Button btnsignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        toLogin =(TextView) findViewById(R.id.tvBackLogin);
        toLogin.setOnClickListener(view -> {
            startActivity(new Intent(SignUp.this,MainActivity.class));
        });


    }

}
