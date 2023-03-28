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

import com.example.aquaponics.Model.HomepageCategory;
import com.example.aquaponics.Products;
import com.example.aquaponics.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class HomepageCategoryRecyclerViewAdapter extends RecyclerView.Adapter<HomepageCategoryRecyclerViewAdapter.ViewHolder>  {

    private Context context;
    private List<HomepageCategory> homepageCategoryList;

    public HomepageCategoryRecyclerViewAdapter(Context context, List<HomepageCategory> homepageCategoryList) {
        this.context = context;
        this.homepageCategoryList = homepageCategoryList;
    }

    @NonNull
    @Override
    public HomepageCategoryRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.homepage_product, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        HomepageCategory homepageCategory = homepageCategoryList.get(position);

        holder.idTextView.setText(String.valueOf(homepageCategory.getId()));
        Picasso
                .get()
                .load(homepageCategory.getImage())
                .fit()
                .placeholder(R.drawable.placeholder_image)
                .into(holder.imageView);
        holder.textView.setText(homepageCategory.getName());
    }

    @Override
    public int getItemCount() {
        return homepageCategoryList.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView idTextView;
        private ImageView imageView;
        private TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
            idTextView = itemView.findViewById(R.id.idTextView);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(view.getContext(), Products.class);
            intent.putExtra("category_id", ((TextView)view.findViewById(R.id.idTextView)).getText().toString());
            intent.putExtra("category_name", ((TextView)view.findViewById(R.id.textView)).getText().toString());
            view.getContext().startActivity(intent);
        }
    }
}
