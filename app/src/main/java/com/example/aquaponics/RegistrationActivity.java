package com.example.aquaponics;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class RegistrationActivity extends AppCompatActivity {

    Button Register;
    EditText name, phoneNumber, email, password, againPassword;
    TextView login_here;
    FirebaseAuth auth;
    FirebaseDatabase database;
    String emailPattern = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$";

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
        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();

        login_here.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegistrationActivity.this,LoginActivity.class));
            }
        });

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createUser();
            }
        });

    }

    private void createUser() {
        String userName = name.getText().toString();
        String userPhone = phoneNumber.getText().toString();
        String userEmail = email.getText().toString();
        String userPassword = password.getText().toString();
        String userPasswordAgain = againPassword.getText().toString();

        if(TextUtils.isEmpty(userName)){
            Toast.makeText(this, "Name is empty!", Toast.LENGTH_SHORT).show();
            return;
        }

        if(TextUtils.isEmpty(userPhone)){
            Toast.makeText(this, "Phone number is empty!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (phoneNumber.length() != 10) {
            Toast.makeText(this, "Invalid phone number", Toast.LENGTH_SHORT).show();
            return;
        }

        if(TextUtils.isEmpty(userEmail)){
            Toast.makeText(this, "Email is empty!", Toast.LENGTH_SHORT).show();
            return;
        }else if (!userEmail.matches(emailPattern))

        if(TextUtils.isEmpty(userPassword)){
            Toast.makeText(this, "Password is empty!", Toast.LENGTH_SHORT).show();
            return;
        }

        if(userPassword.length() < 6){
            Toast.makeText(this, "Password length must be greater than 6 letters", Toast.LENGTH_SHORT).show();
            return;
        }

        if(TextUtils.isEmpty(userPasswordAgain)){
            Toast.makeText(this, "Enter password again", Toast.LENGTH_SHORT).show();
            return;
        }

        if(!userPasswordAgain.equals(userPassword)) {
            Toast.makeText(this, "Password does not match", Toast.LENGTH_SHORT).show();
            return;
        }

        //CreateUser
        auth.createUserWithEmailAndPassword(userEmail, userPassword)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){

                            UserModel user = new UserModel(userName, userEmail, userPhone, userPassword);
                            String id = task.getResult().getUser().getUid();
                            database.getReference().child("Users").child(id).setValue(user);


                            Toast.makeText(RegistrationActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(RegistrationActivity.this, "Authentication Failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}
