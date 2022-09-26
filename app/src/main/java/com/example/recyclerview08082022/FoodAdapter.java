package com.example.recyclerview08082022;

import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Calendar;
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
        // Khởi tạo ra layout
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.layout_item_food, parent, false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        holder.bind(foods.get(position));
    }

    @Override
    public int getItemCount() {
        return foods.size();
    }

    class FoodViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView tvCloseTime, tvName, tvAddress, tvCategory, tvSaleOff, tvDistance;
        List<CategoryEnum> categoryList;
        int hourCurrent, minutesCurrent;
        Calendar calendar;

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

        public void bind(Food food) {
            img.setImageResource(food.getImage());
            tvName.setText(food.getName());
            tvAddress.setText(food.getAddress());
            tvDistance.setText(String.format(">%.1f km", food.getDistance()));

            // Category
            categoryList = food.getCategoryEnums();
            if (categoryList == null || categoryList.size() == 0) {
                tvCategory.setVisibility(View.GONE);
            } else {
                if (categoryList.size() == 1) {
                    tvCategory.setText(food.getCategoryEnums().get(0).toString());
                } else {
                    SpannableStringBuilder builder = new SpannableStringBuilder();
                    for (int i = 0; i < food.getCategoryEnums().size(); i++) {
                        if (i == food.getCategoryEnums().size() - 1) {
                            builder.append(food.getCategoryEnums().get(i).toString());
                        } else {
                            builder.append(food.getCategoryEnums().get(i).toString() + "/");
                        }
                    }
                    tvCategory.setVisibility(View.VISIBLE);
                    tvCategory.setText(builder);
                }
            }

            // Discount
            if (!food.getSaleOff().isEmpty()) {
                tvSaleOff.setVisibility(View.VISIBLE);
                tvSaleOff.setText(food.getSaleOff());
            } else {
                tvSaleOff.setVisibility(View.GONE);
            }

            // Close time
            calendar = Calendar.getInstance();
            hourCurrent = calendar.get(Calendar.HOUR_OF_DAY);
            minutesCurrent = calendar.get(Calendar.MINUTE);

            int timeOpen = convertTimeToMinus(food.getHourOpenTime(), food.getMinuteOpenTime());
            int timeClose = convertTimeToMinus(food.getHourCloseTime(), food.getMinuteCloseTime());
            int timeCurrent = convertTimeToMinus(hourCurrent, minutesCurrent);

            if (!checkCurrentTimeOver(timeOpen, timeCurrent, timeClose)) {
                tvCloseTime.setVisibility(View.GONE);
            } else {
                tvCloseTime.setVisibility(View.VISIBLE);
            }
        }
    }

    private int convertTimeToMinus(int hour, int minutes) {
        return hour * 60 + minutes;
    }

    private boolean checkCurrentTimeOver(int timeOpen, int timeCurrent, int timeClose) {
        return timeCurrent >= timeClose || timeCurrent < timeOpen;
    }
}
