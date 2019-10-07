package com.example.demo.nowvn.Frame;

import android.widget.BaseAdapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.demo.nowvn.R;

public class BaseFragment  extends Fragment {
    public void addFragment(BaseFragment fragment){
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(R.id.fragment_container,fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
