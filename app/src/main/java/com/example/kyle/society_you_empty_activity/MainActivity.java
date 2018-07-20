package com.example.kyle.society_you_empty_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText mEmail;
    EditText mPassword;
    Button mSignIn;
    Button mSignUp;
    TextView mForgotPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEmail = findViewById(R.id.et_email);
        mPassword = findViewById(R.id.etPassword);
        mSignIn = findViewById(R.id.mainSignIn_btn);
        mSignUp = findViewById(R.id.mainSignUp_btn);
        mSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Sign_up_activity.class));
            }
        });
        mForgotPassword = findViewById(R.id.mainForgotpw_tv);
        mForgotPassword.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, forgotPassword.class));
            }
        });

    }


}
