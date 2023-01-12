package com.example.aquaponics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Fish extends AppCompatActivity {

    TextView back, home, profile, hamburger, Rohu, Common_carp, cart;
    com.google.android.material.imageview.ShapeableImageView rohu, common_carp;
    FrameLayout frame_layout1, frame_layout2;
    Button add_to_cart1, add_to_cart2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fish);

        back = findViewById(R.id.back);
        home = findViewById(R.id.home);
        profile = findViewById(R.id.profile_fish);
        hamburger = findViewById(R.id.hamburger);
        rohu = findViewById(R.id.rohu_banner);
        Rohu = findViewById(R.id.pdt1_name);
        common_carp = findViewById(R.id.common_carp_banner);
        Common_carp = findViewById(R.id.pdt2_name);
        frame_layout1 = findViewById(R.id.frameLayout5);
        frame_layout2 = findViewById(R.id.frameLayout6);
        add_to_cart1 = findViewById(R.id.add_to_cart_pdt1);
        add_to_cart2 = findViewById(R.id.add_to_cart_pdt2);
        cart = findViewById(R.id.imageView3);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Fish.this, Homepage.class));
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Fish.this,Homepage.class));
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Fish.this,CustomerProfile.class));
            }
        });

        hamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Fish.this,hamburger.class));
            }
        });

        rohu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Fish.this,Rohu_fish.class));
            }
        });

        Rohu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Fish.this,Rohu_fish.class));
            }
        });

        Common_carp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Fish.this,Common_carp_fish.class));
            }
        });

        common_carp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Fish.this,Common_carp_fish.class));
            }
        });

        frame_layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Fish.this,Rohu_fish.class));
            }
        });

        frame_layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Fish.this,Common_carp_fish.class));
            }
        });

        add_to_cart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Fish.this, Customer_order_listing.class));
            }
        });

        add_to_cart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Fish.this, Customer_order_listing.class));
            }
        });

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Fish.this, Customer_order_listing.class));
            }
        });
    }
}
