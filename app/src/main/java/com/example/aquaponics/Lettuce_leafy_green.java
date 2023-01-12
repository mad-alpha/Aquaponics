package com.example.aquaponics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Lettuce_leafy_green extends AppCompatActivity {

    TextView back, home, profile, hamburger, Kale, Basil, Bok_choy, cart;
    com.google.android.material.imageview.ShapeableImageView kale, basil, bok_choy;
    FrameLayout frame_layout1, frame_layout2, frame_layout3;
    Button add_to_cart_main, add_to_cart1, add_to_cart2, add_to_cart3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lettuce_leafy_greens);

        back = findViewById(R.id.back);
        home = findViewById(R.id.home);
        profile = findViewById(R.id.profile_brassica);
        hamburger = findViewById(R.id.hamburger);
        Kale = findViewById(R.id.pdt1_name);
        Basil = findViewById(R.id.pdt3_name);
        Bok_choy = findViewById(R.id.pdt4_name);
        kale = findViewById(R.id.kale_banner);
        basil = findViewById(R.id.basil_banner);
        bok_choy = findViewById(R.id.bok_choy_banner);
        frame_layout1 = findViewById(R.id.frameLayout6);
        frame_layout2 = findViewById(R.id.frameLayout7);
        frame_layout3 = findViewById(R.id.frameLayout10);
        add_to_cart1 = findViewById(R.id.add_to_cart_pdt1);
        add_to_cart2 = findViewById(R.id.add_to_cart_pdt3);
        add_to_cart3 = findViewById(R.id.add_to_cart_pdt4);
        add_to_cart_main = findViewById(R.id.add_to_cart);
        cart = findViewById(R.id.imageView3);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lettuce_leafy_green.this, LeafyGreens.class));
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lettuce_leafy_green.this,Homepage.class));
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lettuce_leafy_green.this,CustomerProfile.class));
            }
        });

        hamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lettuce_leafy_green.this,hamburger.class));
            }
        });

        Kale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lettuce_leafy_green.this,Kale_leafy_green.class));
            }
        });

        Basil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lettuce_leafy_green.this,Basil_leafy_green.class));
            }
        });

        Bok_choy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lettuce_leafy_green.this,Bok_choy_leafy_green.class));
            }
        });

        kale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lettuce_leafy_green.this,Kale_leafy_green.class));
            }
        });

        basil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lettuce_leafy_green.this,Basil_leafy_green.class));
            }
        });

        bok_choy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lettuce_leafy_green.this,Bok_choy_leafy_green.class));
            }
        });

        frame_layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lettuce_leafy_green.this,Kale_leafy_green.class));
            }
        });

        frame_layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lettuce_leafy_green.this,Basil_leafy_green.class));
            }
        });

        frame_layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lettuce_leafy_green.this,Bok_choy_leafy_green.class));
            }
        });

        add_to_cart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lettuce_leafy_green.this, Customer_order_listing.class));
            }
        });

        add_to_cart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lettuce_leafy_green.this, Customer_order_listing.class));
            }
        });

        add_to_cart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lettuce_leafy_green.this, Customer_order_listing.class));
            }
        });

        add_to_cart_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lettuce_leafy_green.this, Customer_order_listing.class));
            }
        });

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lettuce_leafy_green.this, Customer_order_listing.class));
            }
        });
    }
}
