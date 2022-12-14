package com.example.aquaponics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivitySeller extends AppCompatActivity {

    Button Register;
    EditText name, phoneNumber, email, password, againPassword;
    TextView login_here;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Register = findViewById(R.id.register_btn);
        name = findViewById(R.id.name_register_seller);
        phoneNumber = findViewById(R.id.number_register_seller);
        email = findViewById(R.id.email_register_seller);
        password = findViewById(R.id.password_register_seller);
        againPassword = findViewById(R.id.againpassword_register_seller);
        login_here = findViewById(R.id.LoginHereSeller);

        login_here.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegistrationActivitySeller.this,LoginActivitySeller.class));
            }
        });

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

}
