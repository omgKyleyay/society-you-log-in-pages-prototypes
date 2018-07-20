package com.example.kyle.society_you_empty_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class forgotPassword extends AppCompatActivity {
    TextView mSignIn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);


        mSignIn2 = findViewById(R.id.signInLink_tv2);
        mSignIn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(forgotPassword.this,MainActivity.class ));
            }
        });
    }
}
