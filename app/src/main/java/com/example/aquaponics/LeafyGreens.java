package com.example.aquaponics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LeafyGreens extends AppCompatActivity {

    TextView back, home, profile, hamburger, Kale, cart, Basil, Lettuce, BokChoy;
    com.google.android.material.imageview.ShapeableImageView kale, lettuce, basil, bok_choy;
    FrameLayout frame_layout1, frame_layout2, frame_layout3, frame_layout4;
    Button add_to_cart1, add_to_cart2, add_to_cart3, add_to_cart4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leafy_greens);

        back = findViewById(R.id.back);
        home = findViewById(R.id.home);
        profile = findViewById(R.id.profile_leafy_greens);
        hamburger = findViewById(R.id.hamburger);
        kale = findViewById(R.id.kale_banner);
        basil = findViewById(R.id.basil_banner);
        lettuce = findViewById(R.id.lettuce_banner);
        bok_choy = findViewById(R.id.bok_choy_banner);
        Kale = findViewById(R.id.pdt1_name);
        Basil = findViewById(R.id.pdt3_name);
        Lettuce = findViewById(R.id.pdt2_name);
        BokChoy = findViewById(R.id.pdt4_name);
        frame_layout1 = findViewById(R.id.frameLayout5);
        frame_layout2 = findViewById(R.id.frameLayout6);
        frame_layout3 = findViewById(R.id.frameLayout7);
        frame_layout4 = findViewById(R.id.frameLayout8);
        add_to_cart1 = findViewById(R.id.add_to_cart_pdt1);
        add_to_cart2 = findViewById(R.id.add_to_cart_pdt2);
        add_to_cart3 = findViewById(R.id.add_to_cart_pdt3);
        add_to_cart4 = findViewById(R.id.add_to_cart_pdt4);
        cart = findViewById(R.id.imageView3);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LeafyGreens.this, Homepage.class));
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LeafyGreens.this,Homepage.class));
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LeafyGreens.this,CustomerProfile.class));
            }
        });

        hamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LeafyGreens.this, Customer_order_listing.class));
            }
        });

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LeafyGreens.this, Customer_order_listing.class));
            }
        });

        add_to_cart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LeafyGreens.this, Customer_order_listing.class));
            }
        });

        add_to_cart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LeafyGreens.this, Customer_order_listing.class));
            }
        });

        add_to_cart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LeafyGreens.this, Customer_order_listing.class));
            }
        });

        add_to_cart4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LeafyGreens.this, Customer_order_listing.class));
            }
        });

        kale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LeafyGreens.this,Kale_leafy_green.class));
            }
        });

        lettuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LeafyGreens.this,Lettuce_leafy_green.class));
            }
        });

        basil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LeafyGreens.this,Basil_leafy_green.class));
            }
        });

        bok_choy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LeafyGreens.this,Bok_choy_leafy_green.class));
            }
        });

        Kale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LeafyGreens.this,Kale_leafy_green.class));
            }
        });

        Lettuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LeafyGreens.this,Lettuce_leafy_green.class));
            }
        });

        Basil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LeafyGreens.this,Basil_leafy_green.class));
            }
        });

        BokChoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LeafyGreens.this,Bok_choy_leafy_green.class));
            }
        });

        frame_layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LeafyGreens.this,Kale_leafy_green.class));
            }
        });

        frame_layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LeafyGreens.this,Lettuce_leafy_green.class));
            }
        });

        frame_layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LeafyGreens.this,Basil_leafy_green.class));
            }
        });

        frame_layout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LeafyGreens.this,Bok_choy_leafy_green.class));
            }
        });
    }
}
