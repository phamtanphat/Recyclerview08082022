package com.example.recyclerview08082022;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * Created by pphat on 9/23/2022.
 */
public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder>{

    List<Food> foods;

    public FoodAdapter(List<Food> foods) {
        this.foods = foods;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return foods.size();
    }

    class FoodViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView tvCloseTime, tvName, tvAddress, tvCategory, tvSaleOff, tvDistance;
        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.image_view);
            tvAddress = itemView.findViewById(R.id.text_view_address);
            tvName = itemView.findViewById(R.id.text_view_name);
            tvCategory = itemView.findViewById(R.id.text_view_category);
            tvSaleOff = itemView.findViewById(R.id.text_view_sale_off);
            tvDistance = itemView.findViewById(R.id.text_view_distance);
            tvCloseTime = itemView.findViewById(R.id.text_view_title_close_time);
        }
    }
}
