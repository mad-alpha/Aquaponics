package com.example.aquaponics;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity {

    RequestQueue requestQueue;
    Button login;
    EditText username, password;
    TextView register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        requestQueue = Volley.newRequestQueue(LoginActivity.this);

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
                startActivity(new Intent(LoginActivity.this, Homepage.class));
                requestQueue.add(new StringRequest(Request.Method.POST,
                        Constants.HOST_URL + "/api/login",
                        response -> {
                            Log.d("myapp_debug", response);
                            startActivity(new Intent(LoginActivity.this, Homepage.class));
                        },
                        error -> {
                            Log.e("myapp_error", error.toString());
                            error.printStackTrace();
                            Toast.makeText(LoginActivity.this, "Something went wrong!", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(LoginActivity.this, Homepage.class));
                        }) {
                        @Override
                        protected Map<String,String> getParams(){
                            Map<String,String> params = new HashMap<>();
                            params.put("username", username.getText().toString());
                            params.put("password", password.getText().toString());
                            return params;
                        }
                        @Override
                        public Map<String, String> getHeaders() {
                            Map<String,String> params = new HashMap<>();
                            params.put("Accept","application/json");
                            return params;
                        }
                });
            }
        });
    }
}
