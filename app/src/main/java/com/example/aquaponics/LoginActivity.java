package com.example.aquaponics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    Button login;
    EditText username, password;
    TextView register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.login_btn_seller);
        username = findViewById(R.id.username_login_seller);
        password = findViewById(R.id.password_login_seller);
        register = findViewById(R.id.LoginHereSeller);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,RegistrationActivity.class));
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("Kisaan1") &&
                        password.getText().toString().equals("Kisaan1")) {
                    startActivity(new Intent(LoginActivity.this, Homepage.class));
                } else {
                    Toast.makeText(LoginActivity.this, "Wrong credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
