package com.example.aquaponics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Customer_address_listing extends AppCompatActivity {

    TextView back, home, profile, cart, hamburger, basicProfile, manageAddress, myOrders, logOut, icon;
    Button add_address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_address_listing);

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
        add_address = findViewById(R.id.add_address_btn);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Customer_address_listing.this, CustomerProfile.class));
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Customer_address_listing.this,Homepage.class));
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Customer_address_listing.this,CustomerProfile.class));
            }
        });

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Customer_address_listing.this, Customer_order_listing.class));
            }
        });

        hamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Customer_address_listing.this, hamburger.class));
            }
        });

        basicProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Customer_address_listing.this, CustomerProfile.class));
            }
        });

        manageAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Customer_address_listing.this, Customer_address_listing.class));
            }
        });

        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Customer_address_listing.this, LoginActivity.class));
            }
        });

        icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Customer_address_listing.this, LoginActivity.class));
            }
        });

        add_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Customer_address_listing.this, Customer_add_address.class));
            }
        });

        myOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Customer_address_listing.this, Customer_order_listing.class));
            }
        });
    }
}
