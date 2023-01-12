package com.example.aquaponics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PodsAndSeeds extends AppCompatActivity {

    TextView back, home, profile, cart, beans;
    com.google.android.material.imageview.ShapeableImageView bean;
    FrameLayout frame_layout1;
    Button add_to_cart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pods_and_seeds);

        back = findViewById(R.id.back);
        home = findViewById(R.id.home);
        profile = findViewById(R.id.profile_pods_and_seeds);
        cart = findViewById(R.id.imageView3);
        beans = findViewById(R.id.pdt_name);
        bean = findViewById(R.id.beans_banner);
        frame_layout1 = findViewById(R.id.frameLayout5);
        add_to_cart = findViewById(R.id.add_to_cart_pdt1);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PodsAndSeeds.this, Homepage.class));
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PodsAndSeeds.this,Homepage.class));
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PodsAndSeeds.this,CustomerProfile.class));
            }
        });

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PodsAndSeeds.this, Customer_order_listing.class));
            }
        });

        beans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PodsAndSeeds.this,Beans.class));
            }
        });

        bean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PodsAndSeeds.this,Beans.class));
            }
        });

        frame_layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PodsAndSeeds.this,Beans.class));
            }
        });

        add_to_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PodsAndSeeds.this, Customer_order_listing.class));
            }
        });
    }
}
