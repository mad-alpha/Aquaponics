package com.example.aquaponics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Cabbage extends AppCompatActivity {

    TextView back, home, profile, hamburger, Cabbage, cart;
    com.google.android.material.imageview.ShapeableImageView brassica;
    FrameLayout frame_layout;
    Button add_to_cart_main, add_to_cart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cabbage_brassica);

        back = findViewById(R.id.back);
        home = findViewById(R.id.home);
        profile = findViewById(R.id.profile_brassica);
        hamburger = findViewById(R.id.hamburger);
        brassica = findViewById(R.id.brassica_banner2);
        Cabbage = findViewById(R.id.pdt_name1);
        frame_layout = findViewById(R.id.frameLayout8);
        add_to_cart = findViewById(R.id.add_to_cart1);
        add_to_cart_main = findViewById(R.id.add_to_cart);
        cart = findViewById(R.id.imageView3);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Cabbage.this, Brassica.class));
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Cabbage.this,Homepage.class));
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Cabbage.this,CustomerProfile.class));
            }
        });

        hamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Cabbage.this,hamburger.class));
            }
        });

        brassica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Cabbage.this,Cabbage.class));
            }
        });

        Cabbage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Cabbage.this,Cabbage.class));
            }
        });

        frame_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Cabbage.this,Cabbage.class));
            }
        });

        add_to_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Cabbage.this, Customer_order_listing.class));
            }
        });

        add_to_cart_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Cabbage.this, Customer_order_listing.class));
            }
        });

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Cabbage.this, Customer_order_listing.class));
            }
        });
    }
}
