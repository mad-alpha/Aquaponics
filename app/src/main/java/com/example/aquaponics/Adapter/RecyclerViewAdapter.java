package com.example.aquaponics.Adapter;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aquaponics.Model.HomepageProduct;
import com.example.aquaponics.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>  {

    private Context context;
    private List<HomepageProduct> homepageProductList;

    public RecyclerViewAdapter(Context context, List<HomepageProduct> homepageProductList) {
        this.context = context;
        this.homepageProductList = homepageProductList;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.homepage_product, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        HomepageProduct homepageProduct = homepageProductList.get(position);

        holder.id = homepageProduct.getId();
        Picasso
                .get()
                .load(homepageProduct.getImage())
                .fit()
                .into(holder.imageView);
        holder.textView.setText(homepageProduct.getName());
    }

    @Override
    public int getItemCount() {
        return homepageProductList.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder implements View.OnClickListener {
        private Integer id;
        private ImageView imageView;
        private TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }

        @Override
        public void onClick(View view) {
            Log.d("myapp_debug", "");
        }
    }
}
