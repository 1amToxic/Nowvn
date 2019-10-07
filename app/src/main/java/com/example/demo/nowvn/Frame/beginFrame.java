package com.example.demo.nowvn.Frame;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.demo.nowvn.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class beginFrame extends BaseFragment implements View.OnClickListener {


    public beginFrame() {
        // Required empty public constructor
    }

    Button btnStart;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.xml_begin_frame, container, false);
        btnStart = view.findViewById(R.id.btnStart);
        btnStart.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        addFragment(new FoodFragment());
    }
}
