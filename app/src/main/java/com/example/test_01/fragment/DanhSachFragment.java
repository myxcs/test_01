package com.example.test_01.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.test_01.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class DanhSachFragment extends Fragment {

    //ánh xạ recyclerView, floating button trong fragment_danh_sach
    private RecyclerView recyclerView;
    private FloatingActionButton floatAdd;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_danh_sach, container, false);

        recyclerView = view.findViewById(R.id.recycler_view);
        floatAdd = view.findViewById(R.id.float_add);


        return view;
    }
}