package com.example.demo.nowvn.ViewPager;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.demo.nowvn.Adapter.Food;
import com.example.demo.nowvn.Adapter.FoodAdapter;
import com.example.demo.nowvn.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Drink extends Fragment {


    public Drink() {
        // Required empty public constructor
    }
    List<Food> foodList  = new ArrayList<>();
    RecyclerView recyclerView;
    FoodAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.xml_drink, container, false);
        recyclerView = view.findViewById(R.id.recyclerDrink);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        return view;
    }
    public void prepareDrink(){
        Food food = new Food("Bia","Ao Sen","40000",R.drawable.bia);
        foodList.add(food);
        food = new Food("Chanh leo","Nguyen Van Loc","10000",R.drawable.chanhleo);
        foodList.add(food);
        food = new Food("Che do den","Ao sen","8000",R.drawable.chedoden);
        foodList.add(food);
        food = new Food("Che thap cam","Ao sen ","10000",R.drawable.chee);
        foodList.add(food);
        food = new Food("Kem","Nguyen Van Troi","5000",R.drawable.kem);
        foodList.add(food);
        food = new Food("Royal tea","CircleK","40000",R.drawable.royaltea);
        foodList.add(food);
        food = new Food("Tra chanh","Cong truog","15000",R.drawable.trachanh);
        foodList.add(food);
        food = new Food("Tao pho","Cong truog","5000",R.drawable.taopho);
        foodList.add(food);
    }
}
