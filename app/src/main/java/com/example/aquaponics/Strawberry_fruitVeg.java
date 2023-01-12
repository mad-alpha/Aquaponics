package com.example.aquaponics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Strawberry_fruitVeg extends AppCompatActivity {

    TextView back, home, profile, hamburger, Tomato, cart;
    com.google.android.material.imageview.ShapeableImageView tomato;
    FrameLayout frame_layout;
    Button add_to_cart_main, add_to_cart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.strawberry_fv);

        back = findViewById(R.id.back);
        home = findViewById(R.id.home);
        profile = findViewById(R.id.profile_brassica);
        hamburger = findViewById(R.id.hamburger);
        tomato = findViewById(R.id.tomato_banner);
        Tomato = findViewById(R.id.pdt1_name);
        frame_layout = findViewById(R.id.frameLayout5);
        add_to_cart = findViewById(R.id.add_to_cart_pdt1);
        add_to_cart_main = findViewById(R.id.add_to_cart);
        cart = findViewById(R.id.imageView3);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Strawberry_fruitVeg.this, FruitVeg.class));
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Strawberry_fruitVeg.this,Homepage.class));
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Strawberry_fruitVeg.this,CustomerProfile.class));
            }
        });

        hamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Strawberry_fruitVeg.this,hamburger.class));
            }
        });

        tomato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Strawberry_fruitVeg.this,Tomato_fruitVeg.class));
            }
        });

        Tomato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Strawberry_fruitVeg.this,Tomato_fruitVeg.class));
            }
        });

        frame_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Strawberry_fruitVeg.this,Tomato_fruitVeg.class));
            }
        });

        add_to_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Strawberry_fruitVeg.this, Customer_order_listing.class));
            }
        });

        add_to_cart_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Strawberry_fruitVeg.this, Customer_order_listing.class));
            }
        });

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Strawberry_fruitVeg.this, Customer_order_listing.class));
            }
        });
    }
}
