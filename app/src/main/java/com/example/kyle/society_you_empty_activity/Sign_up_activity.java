package com.example.kyle.society_you_empty_activity;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Sign_up_activity extends AppCompatActivity {
    TextView mSignIn;
    Button mSignup;
    TextInputEditText mEtPassword;
    TextInputEditText mEtConfirmPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_activity);

        mEtPassword = findViewById(R.id.etPassword);
        mEtConfirmPassword = findViewById(R.id.et_confirmPassword);

        mSignIn = findViewById(R.id.signInLink_tv);
        mSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Sign_up_activity.this, MainActivity.class));
            }
        });
        mSignup = findViewById(R.id.button_Signup);
        mSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //turn into tenerary expression such as:
                //confirmPassword(mEtPassword.toString(), mEtConfirmPassword.toString()) : *go to new activity* ? Toast
                confirmPassword(mEtPassword.toString(), mEtConfirmPassword.toString());
            }
        });
    }
    //Turn confirmPassword to boolean. If true, "Agree and join" button will send to next activity,
    //else show toast
    private void confirmPassword(String password, String confirmedPassword){
        if (!password.equals(confirmedPassword)){
            Toast.makeText(Sign_up_activity.this,"Passwords do not match",Toast.LENGTH_SHORT).show();

        }
    }
}
