package com.example.aquaponics;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.aquaponics.Model.GetProductResponse;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SingleProduct extends AppCompatActivity {

    Gson gson;
    RequestQueue requestQueue;
    TextView back, home, profile, hamburger, cart, category, productName, productCategory, price, productOverview, productDelivery, productUnitDescription;
    ImageView productBanner;
    Button inStockButton, addToCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_product);
        gson = new Gson();
        requestQueue = Volley.newRequestQueue(SingleProduct.this);

        back = findViewById(R.id.back);
        home = findViewById(R.id.home);
        profile = findViewById(R.id.profile_brassica);
        hamburger = findViewById(R.id.hamburger);
        cart = findViewById(R.id.imageView3);

        category = findViewById(R.id.heading);
        productBanner = findViewById(R.id.product_banner);
        productName = findViewById(R.id.pdt_name);
        productCategory = findViewById(R.id.pdt_category);
        inStockButton = findViewById(R.id.in_stock_btn);
        price = findViewById(R.id.price_cabbage);
        productOverview = findViewById(R.id.pdt_overview_cont);
        productDelivery = findViewById(R.id.pdt_delivery_cont); // not given in api response. using hardcoded value for now.
        addToCart = findViewById(R.id.add_to_cart);
        productUnitDescription = findViewById(R.id.pdt_ud_cont);




        int productId = Integer.parseInt(getIntent().getStringExtra("product_id"));
//        Log.d("myapp_debug", "Aakash product id is -> " + Constants.HOST_URL + "/api/products/" + productId);

        requestQueue.add(new StringRequest(Request.Method.POST,
                Constants.HOST_URL + "/api/products/" + productId,
                response -> {
                    GetProductResponse getProductResponse = gson.fromJson(response, GetProductResponse.class);
                    if(Objects.nonNull(getProductResponse) && Objects.nonNull(getProductResponse.getData())) {
                        String pricePerUnit  = "₹" + getProductResponse.getData().getProductpackages()[0].getMarket_price() + " per " + getProductResponse.getData().getProductpackages()[0].getUnit_name();
                        category.setText(getProductResponse.getData().getCategory().getName());
                        productName.setText(getProductResponse.getData().getName());
                        productCategory.setText(getProductResponse.getData().getCategory().getName());
                        inStockButton.setText(getProductResponse.getData().getIs_available() == 1 ? "IN STOCK" : "OUT OF STOCK");
                        price.setText(pricePerUnit);
                        productOverview.setText(getProductResponse.getData().getDetails());
                        addToCart.setEnabled(getProductResponse.getData().getIs_available() == 1);
                        productUnitDescription.setText(getProductResponse.getData().getUnit_desc());
                        Picasso
                                .get()
                                .load(getProductResponse.getData().getLarge_picture_url())
                                .fit()
                                .placeholder(R.drawable.placeholder_image)
                                .into(productBanner);
                    }
                },
                error -> {
                    Log.e("myapp_error", error.toString());
                    error.printStackTrace();
                    Toast.makeText(SingleProduct.this, "Something went wrong!", Toast.LENGTH_SHORT).show();
                }) {
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
                startActivity(new Intent(SingleProduct.this, Homepage.class));
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SingleProduct.this, Homepage.class));
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SingleProduct.this, CustomerProfile.class));
            }
        });

        hamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SingleProduct.this, hamburger.class));
            }
        });

        addToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(addToCart.isEnabled()){
                    startActivity(new Intent(SingleProduct.this, Customer_order_listing.class));
                }else{
                    Toast.makeText(SingleProduct.this,"Out of Stock", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
