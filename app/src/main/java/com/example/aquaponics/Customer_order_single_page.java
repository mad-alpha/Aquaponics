package com.example.aquaponics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Customer_order_single_page extends AppCompatActivity {

    TextView back, home, profile, cart, hamburger;
    Button view_details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_order_single_page);

        back = findViewById(R.id.back);
        home = findViewById(R.id.home);
        profile = findViewById(R.id.profile);
        cart = findViewById(R.id.imageView3);
        hamburger = findViewById(R.id.hamburger);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Customer_order_single_page.this, Customer_order_listing.class));
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Customer_order_single_page.this,Homepage.class));
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Customer_order_single_page.this,CustomerProfile.class));
            }
        });

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Customer_order_single_page.this, Customer_order_listing.class));
            }
        });

        hamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Customer_order_single_page.this, hamburger.class));
            }
        });

    }
}
