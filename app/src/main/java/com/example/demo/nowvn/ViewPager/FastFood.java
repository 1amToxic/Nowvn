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
public class FastFood extends Fragment {


    public FastFood() {
        // Required empty public constructor
    }
    List<Food> foodList = new ArrayList<>();
    RecyclerView recyclerView;
    FoodAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.xml_fast_food, container, false);
        prepareFood();
        adapter  = new FoodAdapter(foodList,getContext());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        return view;
    }
    public void prepareFood(){
        Food food = new Food("Banh Duc nong","Ao sen","15000",R.drawable.banhducnong);
        foodList.add(food);
        food = new Food("Banh trang","Nguyen Van Troi","10000",R.drawable.banhtrang);
        foodList.add(food);
        food = new Food("Cha Cuon","Ao sen","10000",R.drawable.chacuon);
        foodList.add(food);
        food = new Food("Mon nuong","Nguyen Van Loc","30000",R.drawable.monnuong);
        foodList.add(food);
    }
}
