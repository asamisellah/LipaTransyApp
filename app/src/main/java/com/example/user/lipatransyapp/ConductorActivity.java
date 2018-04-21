package com.example.user.lipatransyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ConductorActivity extends AppCompatActivity {
    EditText etMnumber, etPassword;
    Button login;
    String cNumber;
    String passwd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conductor);

        etMnumber = findViewById(R.id.etMnumber);
        etPassword = findViewById(R.id.etPassword);
        login = findViewById(R.id.login);


        cNumber = etMnumber.getText().toString().trim();
        passwd = etPassword.getText().toString();



    }
}
