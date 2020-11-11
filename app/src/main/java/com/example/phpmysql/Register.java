package com.example.phpmysql;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {
    EditText username, password;
    Button Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.etUsername);
        password = findViewById(R.id.etPassword);
        Register = findViewById(R.id.btnLogin);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname = username.getText().toString();
                String pass = password.getText().toString();
                backgroundWorker bg = new backgroundWorker(Register.this);
                String type = "register";
                bg.execute(type, uname, pass);
            }
        });
    }
}