package com.example.aquaponics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Rohu_fish extends AppCompatActivity {

    TextView back, home, profile, hamburger, Common_carp, cart;
    com.google.android.material.imageview.ShapeableImageView common_carp;
    FrameLayout frame_layout;
    Button add_to_cart_main, add_to_cart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rohu_fish);

        back = findViewById(R.id.back);
        home = findViewById(R.id.home);
        profile = findViewById(R.id.profile_brassica);
        hamburger = findViewById(R.id.hamburger);
        common_carp = findViewById(R.id.common_carp_banner);
        Common_carp = findViewById(R.id.pdt2_name);
        frame_layout = findViewById(R.id.frameLayout8);
        add_to_cart = findViewById(R.id.add_to_cart_pdt2);
        add_to_cart_main = findViewById(R.id.add_to_cart);
        cart = findViewById(R.id.imageView3);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Rohu_fish.this, Fish.class));
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Rohu_fish.this,Homepage.class));
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Rohu_fish.this,CustomerProfile.class));
            }
        });

        hamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Rohu_fish.this,hamburger.class));
            }
        });

        common_carp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Rohu_fish.this,Common_carp_fish.class));
            }
        });

        Common_carp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Rohu_fish.this,Common_carp_fish.class));
            }
        });

        frame_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Rohu_fish.this,Common_carp_fish.class));
            }
        });

        add_to_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Rohu_fish.this, Customer_order_listing.class));
            }
        });

        add_to_cart_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Rohu_fish.this, Customer_order_listing.class));
            }
        });

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Rohu_fish.this, Customer_order_listing.class));
            }
        });
    }
}
