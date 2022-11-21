package com.example.aquaponics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class Homepage extends AppCompatActivity {

    TextView profile, home, Brassica, Fish, LeafyGreens, FruitVeg, PodsAndSeeds;
    Button start_selling;
    com.google.android.material.imageview.ShapeableImageView brassica, fish, leafy_greens, fruit_veg, pods_and_seeds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        profile = findViewById(R.id.profile);
        home = findViewById(R.id.home);
        start_selling = findViewById(R.id.start_selling);
        brassica = findViewById(R.id.brassica_banner);
        Brassica = findViewById(R.id.textView5);
        fish = findViewById(R.id.fish_banner);
        Fish = findViewById(R.id.textView7);
        leafy_greens = findViewById(R.id.leafy_greens_banner);
        LeafyGreens = findViewById(R.id.textView6);
        fruit_veg = findViewById(R.id.fruit_veg_banner);
        FruitVeg = findViewById(R.id.textView8);
        pods_and_seeds = findViewById(R.id.pods_seeds_banner);
        PodsAndSeeds = findViewById(R.id.textView11);


        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Homepage.this,CustomerProfile.class));
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Homepage.this,Homepage.class));
            }
        });

        start_selling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Homepage.this,RegistrationActivitySeller.class));
            }
        });

        brassica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Homepage.this,Brassica.class));
            }
        });

        Brassica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Homepage.this,Brassica.class));
            }
        });

        fish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Homepage.this,Fish.class));
            }
        });

        Fish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Homepage.this,Fish.class));
            }
        });

        leafy_greens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Homepage.this,LeafyGreens.class));
            }
        });

        LeafyGreens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Homepage.this,LeafyGreens.class));
            }
        });

        fruit_veg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Homepage.this,FruitVeg.class));
            }
        });

        FruitVeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Homepage.this,FruitVeg.class));
            }
        });

        pods_and_seeds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Homepage.this,PodsAndSeeds.class));
            }
        });

        PodsAndSeeds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Homepage.this,PodsAndSeeds.class));
            }
        });
    }

}
