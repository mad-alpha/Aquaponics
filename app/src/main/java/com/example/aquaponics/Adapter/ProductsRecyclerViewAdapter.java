package com.example.aquaponics.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aquaponics.Model.CategoryProduct;
import com.example.aquaponics.R;
import com.example.aquaponics.SingleProduct;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ProductsRecyclerViewAdapter extends RecyclerView.Adapter<ProductsRecyclerViewAdapter.ViewHolder>  {

    private Context context;
    private List<CategoryProduct> categoryProducts;

    public ProductsRecyclerViewAdapter(Context context, List<CategoryProduct> categoryProductList) {
        this.context = context;
        this.categoryProducts = categoryProductList;
    }

    @NonNull
    @Override
    public ProductsRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_card, parent, false);
        return new ProductsRecyclerViewAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductsRecyclerViewAdapter.ViewHolder holder, int position) {
        CategoryProduct categoryProduct = categoryProducts.get(position);

        holder.idTextView.setText(String.valueOf(categoryProduct.getId()));
        Picasso
                .get()
                .load(categoryProduct.getImage())
                .fit()
                .placeholder(R.drawable.placeholder_image)
                .into(holder.imageView);
        holder.product_name.setText(categoryProduct.getName());
        String productUnitsAvailable = categoryProduct.getUnitsAvailable() + " units";
        holder.product_unit_available.setText(productUnitsAvailable);
        String productPrice = "₹" + categoryProduct.getPrice() + " per " + categoryProduct.getPriceUnit();
        holder.product_price.setText(productPrice);
    }

    @Override
    public int getItemCount() {
        return categoryProducts.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView idTextView;
        private ImageView imageView;
        private TextView product_name;
        private TextView product_price;
        private TextView product_unit_available;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            imageView = itemView.findViewById(R.id.imageView);
            product_name = itemView.findViewById(R.id.product_name);
            idTextView = itemView.findViewById(R.id.idTextView);
            product_price = itemView.findViewById(R.id.product_price);
            product_unit_available = itemView.findViewById(R.id.product_unit_available);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(view.getContext(), SingleProduct.class);
            intent.putExtra("product_id", ((TextView)view.findViewById(R.id.idTextView)).getText().toString());
            view.getContext().startActivity(intent);
        }
    }
}
