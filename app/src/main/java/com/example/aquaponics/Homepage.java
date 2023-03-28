package com.example.aquaponics;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.aquaponics.Adapter.HomepageCategoryRecyclerViewAdapter;
import com.example.aquaponics.Model.Category;
import com.example.aquaponics.Model.GetCategoriesResponseArray;
import com.example.aquaponics.Model.HomepageCategory;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Homepage extends AppCompatActivity {
    Gson gson;
    RecyclerView recyclerView;
    HomepageCategoryRecyclerViewAdapter homepageCategoryRecyclerViewAdapter;
    ArrayList<HomepageCategory> homepageCategoryArrayList;
    RequestQueue requestQueue;
    TextView profile, home, hamburger, cart;
    Button start_selling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
        gson = new Gson();
        requestQueue = Volley.newRequestQueue(Homepage.this);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        homepageCategoryArrayList = new ArrayList<>();

        profile = findViewById(R.id.profile);
        home = findViewById(R.id.home);
        start_selling = findViewById(R.id.start_selling);
        hamburger = findViewById(R.id.hamburger);
        cart = findViewById(R.id.imageView3);

        requestQueue.add(new StringRequest(Request.Method.POST,
                Constants.HOST_URL + "/api/categories",
                response -> {
                    GetCategoriesResponseArray getCategoriesResponseArray = gson.fromJson(response, GetCategoriesResponseArray.class);
                    if(Objects.nonNull(getCategoriesResponseArray) && Objects.nonNull(getCategoriesResponseArray.getData())) {
                        for(int i = 0; i < getCategoriesResponseArray.getData().length ; ++i) {
                            Category category = getCategoriesResponseArray.getData()[i];
                            homepageCategoryArrayList.add(
                                    new HomepageCategory(category.getId(), category.getSmall_picture_url(), category.getName())
                            );
                        }
                    }
                    homepageCategoryRecyclerViewAdapter = new HomepageCategoryRecyclerViewAdapter(Homepage.this, homepageCategoryArrayList);
                    recyclerView.setAdapter(homepageCategoryRecyclerViewAdapter);
                },
                error -> {
                    Log.e("myapp_error", error.toString());
                    error.printStackTrace();
                    Toast.makeText(Homepage.this, "Something went wrong!", Toast.LENGTH_SHORT).show();
                }) {
            @Override
            public Map<String, String> getHeaders() {
                Map<String,String> params = new HashMap<>();
                params.put("Accept","application/json");
                return params;
            }
        });


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

        hamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Homepage.this,hamburger.class));
            }
        });

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Homepage.this, Customer_order_listing.class));
            }
        });
    }

}
