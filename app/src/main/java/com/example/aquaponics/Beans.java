package com.example.aquaponics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Beans extends AppCompatActivity {

    TextView back, home, profile, cart, beans, hamburger;
    com.google.android.material.imageview.ShapeableImageView bean;
    FrameLayout frame_layout1;
    Button add_to_cart_main, add_to_cart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beans_pods_and_seeds);

        back = findViewById(R.id.back);
        home = findViewById(R.id.home);
        profile = findViewById(R.id.profile_brassica);
        hamburger = findViewById(R.id.hamburger);
        cart = findViewById(R.id.imageView3);
        beans = findViewById(R.id.pdt_name1);
        bean = findViewById(R.id.beans_banner);
        frame_layout1 = findViewById(R.id.frameLayout8);
        add_to_cart = findViewById(R.id.add_to_cart_pdt1);
        add_to_cart_main = findViewById(R.id.add_to_cart);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Beans.this, PodsAndSeeds.class));
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Beans.this,Homepage.class));
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Beans.this,CustomerProfile.class));
            }
        });

        hamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Beans.this, hamburger.class));
            }
        });

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Beans.this, Customer_order_listing.class));
            }
        });

        beans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Beans.this,Beans.class));
            }
        });

        bean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Beans.this,Beans.class));
            }
        });

        frame_layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Beans.this,Beans.class));
            }
        });

        add_to_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Beans.this, Customer_order_listing.class));
            }
        });
    }
}
