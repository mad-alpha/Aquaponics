package com.example.aquaponics;

import android.annotation.SuppressLint;
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
import com.example.aquaponics.Adapter.ProductsRecyclerViewAdapter;
import com.example.aquaponics.Model.CategoryProduct;
import com.example.aquaponics.Model.GetProductResponseArray;
import com.example.aquaponics.Model.HomepageCategory;
import com.example.aquaponics.Model.ProductDetails;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Products extends AppCompatActivity {
    Gson gson;
    RecyclerView recyclerView;
    ProductsRecyclerViewAdapter productsRecyclerViewAdapter;
    ArrayList<CategoryProduct> categoryProductArrayList;
    RequestQueue requestQueue;
    TextView profile, home, hamburger, cart, category_text_view, back;
    Button start_selling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.products);
        gson = new Gson();
        requestQueue = Volley.newRequestQueue(Products.this);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        categoryProductArrayList = new ArrayList<>();

        back = findViewById(R.id.back);
        profile = findViewById(R.id.profile);
        home = findViewById(R.id.home);
        start_selling = findViewById(R.id.start_selling);
        hamburger = findViewById(R.id.hamburger);
        cart = findViewById(R.id.imageView3);
        category_text_view = findViewById(R.id.textView4);

        String categoryId = getIntent().getStringExtra("category_id");
        String categoryName = getIntent().getStringExtra("category_name");
        String heading = "Products Of " + categoryName;

        category_text_view.setText(heading);

        requestQueue.add(new StringRequest(Request.Method.POST,
                Constants.HOST_URL + "/api/category/products",
                response -> {
                    GetProductResponseArray getProductDetailsResponseArray = gson.fromJson(response, GetProductResponseArray.class);
                    if(Objects.nonNull(getProductDetailsResponseArray) && Objects.nonNull(getProductDetailsResponseArray.getData())) {
                        for(int i = 0; i < getProductDetailsResponseArray.getData().length ; ++i) {
                            ProductDetails productDetails = getProductDetailsResponseArray.getData()[i];
                            categoryProductArrayList.add(
                                    new CategoryProduct(productDetails.getId(),
                                            productDetails.getSmall_picture_url(),
                                            productDetails.getName(),
                                            productDetails.getProductpackages().length > 0 ? productDetails.getProductpackages()[0].getMarket_price() : "NA",
                                            productDetails.getProductpackages().length > 0 ? productDetails.getProductpackages()[0].getUnit_name() : "NA",
                                            productDetails.getProductpackages().length > 0 ?productDetails.getProductpackages()[0].getStock() : "0")
                            );
                        }
                    }
                    productsRecyclerViewAdapter = new ProductsRecyclerViewAdapter(Products.this, categoryProductArrayList);
                    recyclerView.setAdapter(productsRecyclerViewAdapter);
                },
                error -> {
                    Log.e("myapp_error", error.toString());
                    error.printStackTrace();
                    Toast.makeText(Products.this, "Something went wrong!", Toast.LENGTH_SHORT).show();
                }) {
            @Override
            protected Map<String,String> getParams(){
                Map<String,String> params = new HashMap<>();
                params.put("category_id", categoryId);
                return params;
            }
            @Override
            public Map<String, String> getHeaders() {
                Map<String,String> params = new HashMap<>();
                params.put("Accept","application/json");
                return params;
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Products.this, Homepage.class));
            }
        });


        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Products.this,CustomerProfile.class));
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Products.this,Homepage.class));
            }
        });

        start_selling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Products.this,RegistrationActivitySeller.class));
            }
        });

        hamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Products.this,hamburger.class));
            }
        });

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Products.this, Customer_order_listing.class));
            }
        });
    }

}
