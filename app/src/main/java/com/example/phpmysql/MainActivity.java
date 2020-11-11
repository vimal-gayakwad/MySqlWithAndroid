package com.example.phpmysql;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.etUsername);
        password = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname, pass;
                uname = username.getText().toString();
                pass = password.getText().toString();
                String type = "login";
                backgroundWorker bg = new backgroundWorker(MainActivity.this);
                bg.execute(type, uname, pass);
            }
        });

    }

    public void register(View view) {
        startActivity(new Intent(this, Register.class));
    }
}