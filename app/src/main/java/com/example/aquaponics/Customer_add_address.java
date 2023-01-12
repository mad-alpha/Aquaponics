package com.example.aquaponics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Customer_add_address extends AppCompatActivity {

    TextView back, home, profile, cart, hamburger, basicProfile, manageAddress, myOrders, logOut, icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_add_address);

        back = findViewById(R.id.back);
        home = findViewById(R.id.home);
        profile = findViewById(R.id.profile);
        cart = findViewById(R.id.imageView3);
        hamburger = findViewById(R.id.hamburger);
        basicProfile = findViewById(R.id.textView19);
        manageAddress = findViewById(R.id.textView20);
        myOrders = findViewById(R.id.textView21);
        logOut = findViewById(R.id.textView22);
        icon = findViewById(R.id.icon);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Customer_add_address.this, Customer_address_listing.class));
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Customer_add_address.this,Homepage.class));
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Customer_add_address.this,CustomerProfile.class));
            }
        });

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Customer_add_address.this, Customer_order_listing.class));
            }
        });

        hamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Customer_add_address.this, hamburger.class));
            }
        });

        basicProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Customer_add_address.this, CustomerProfile.class));
            }
        });

        manageAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Customer_add_address.this, Customer_address_listing.class));
            }
        });

        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Customer_add_address.this, LoginActivity.class));
            }
        });

        icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Customer_add_address.this, LoginActivity.class));
            }
        });

        myOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Customer_add_address.this, Customer_order_listing.class));
            }
        });
    }
}
