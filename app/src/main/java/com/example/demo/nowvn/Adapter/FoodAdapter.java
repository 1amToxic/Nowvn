package com.example.demo.nowvn.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demo.nowvn.R;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.MyViewHolder> {
    private List<Food> foodList;
    private Context context;
    private LayoutInflater inflater;

    public FoodAdapter(List<Food> foodList, Context context) {
        this.foodList = foodList;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvName,tvAddress,tvPrice;
        ImageView imageFood;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvNameFood);
            tvAddress = itemView.findViewById(R.id.tvAddress);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            imageFood = itemView.findViewById(R.id.imageFood);
        }
    }
    @NonNull
    @Override
    public FoodAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =inflater.inflate(R.layout.xml_row_food,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodAdapter.MyViewHolder holder, int position) {
        Food food = foodList.get(position);
        holder.imageFood.setImageResource(food.getIdImage());
        holder.tvName.setText(food.getName());
        holder.tvAddress.setText(food.getAddress());
        holder.tvPrice.setText(food.getPrice());
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }


}
