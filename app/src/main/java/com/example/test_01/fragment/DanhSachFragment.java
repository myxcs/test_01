package com.example.test_01.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.test_01.R;
import com.example.test_01.adapter.SinhVienAdapter;
import com.example.test_01.dao.SinhVienDAO;
import com.example.test_01.model.SinhVienModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;


public class DanhSachFragment extends Fragment {

    //ánh xạ recyclerView, floating button trong fragment_danh_sach
    private RecyclerView recyclerView;
    private FloatingActionButton floatAdd;

    private SinhVienDAO sinhVienDAO;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_danh_sach, container, false);

        recyclerView = view.findViewById(R.id.recycler_view);
        floatAdd = view.findViewById(R.id.float_add);

        //lấy danh sách
        sinhVienDAO = new SinhVienDAO(getContext());
        ArrayList<SinhVienModel> list = sinhVienDAO.getDs();

        //hiện thị
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        SinhVienAdapter sinhVienAdapter = new SinhVienAdapter(getContext(), list);
        recyclerView.setAdapter(sinhVienAdapter);


        return view;
    }
}