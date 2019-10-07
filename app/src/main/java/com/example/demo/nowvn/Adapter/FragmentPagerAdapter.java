package com.example.demo.nowvn.Adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.demo.nowvn.Frame.FoodFragment;
import com.example.demo.nowvn.R;
import com.example.demo.nowvn.ViewPager.Drink;
import com.example.demo.nowvn.ViewPager.FastFood;

import java.util.ArrayList;
import java.util.List;

public class FragmentPagerAdapter extends androidx.fragment.app.FragmentPagerAdapter {
        List<Fragment> listFragment;
        List<String> listTitle;
        public FragmentPagerAdapter(FoodFragment context, @NonNull FragmentManager fm) {
            super(fm);
           // mcontext = context;
           listFragment = new ArrayList<>();
           listTitle = new ArrayList<>();
           listFragment.add(new FastFood());
           listFragment.add(new Drink());
           listTitle.add("FastFood");
           listTitle.add("Drink");
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return  listFragment.get(position);

        }

        @Override
        public int getCount() {
            return listFragment.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return listTitle.get(position);
        }
}
