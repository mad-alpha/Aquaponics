package com.example.aquaponics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FruitVeg extends AppCompatActivity {

    TextView back, home, profile, hamburger, Tomato, Strawberry, cart;
    com.google.android.material.imageview.ShapeableImageView tomato, strawberry;
    FrameLayout frame_layout1, frame_layout2;
    Button add_to_cart1, add_to_cart2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fruit_veg);

        back = findViewById(R.id.back);
        home = findViewById(R.id.home);
        profile = findViewById(R.id.profile_fruit_veg);
        hamburger = findViewById(R.id.hamburger);
        tomato = findViewById(R.id.tomato_banner);
        Tomato = findViewById(R.id.pdt1_name);
        strawberry = findViewById(R.id.strawberry_banner);
        Strawberry = findViewById(R.id.pdt2_name);
        frame_layout1 = findViewById(R.id.frameLayout5);
        frame_layout2 = findViewById(R.id.frameLayout6);
        add_to_cart1 = findViewById(R.id.add_to_cart_pdt1);
        add_to_cart2 = findViewById(R.id.add_to_cart_pdt2);
        cart = findViewById(R.id.imageView3);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FruitVeg.this, Homepage.class));
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FruitVeg.this,Homepage.class));
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FruitVeg.this,CustomerProfile.class));
            }
        });

        hamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FruitVeg.this,hamburger.class));
            }
        });

        tomato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FruitVeg.this,Tomato_fruitVeg.class));
            }
        });

        Tomato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FruitVeg.this,Tomato_fruitVeg.class));
            }
        });

        Strawberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FruitVeg.this,Strawberry_fruitVeg.class));
            }
        });

        strawberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FruitVeg.this,Strawberry_fruitVeg.class));
            }
        });

        frame_layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FruitVeg.this,Tomato_fruitVeg.class));
            }
        });

        frame_layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FruitVeg.this,Strawberry_fruitVeg.class));
            }
        });

        add_to_cart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FruitVeg.this, Customer_order_listing.class));
            }
        });

        add_to_cart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FruitVeg.this, Customer_order_listing.class));
            }
        });

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FruitVeg.this, Customer_order_listing.class));
            }
        });
    }
}
