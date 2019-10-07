package com.example.demo.nowvn.Frame;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.demo.nowvn.Adapter.Food;
import com.example.demo.nowvn.Adapter.FoodAdapter;
import com.example.demo.nowvn.Adapter.FragmentPagerAdapter;
import com.example.demo.nowvn.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends BaseFragment {


    public FoodFragment() {
        // Required empty public constructor
    }
    List <Food> foodList = new ArrayList<>();
    RecyclerView recyclerView;
    FoodAdapter foodAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.xml_fragment_food, container, false);

        ViewPager viewPager = view.findViewById(R.id.viewPager);
        FragmentPagerAdapter adapter = new FragmentPagerAdapter(this,getActivity().getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        TabLayout tabLayout  = view.findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
        //prepareFoodList();
//        recyclerView = view.findViewById(R.id.recyclerFoo);
//        foodAdapter  = new FoodAdapter(foodList,getContext());
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext().getApplicationContext());
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
//        recyclerView.setAdapter(foodAdapter);
        return view;
    }
    public void prepareFoodList(){
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
        food = new Food("Banh trang","Nguyen Van Troi","10000",R.drawable.banhtrang);
        foodList.add(food);
        food = new Food("Cha Cuon","Ao sen","10000",R.drawable.chacuon);
        foodList.add(food);
        food = new Food("Mon nuong","Nguyen Van Loc","30000",R.drawable.monnuong);
        foodList.add(food);
    }

}
