package com.example.test_01.fragment;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

        //lấy danh sách và load data lên recyclerView
        sinhVienDAO = new SinhVienDAO(getContext());
         loadData();

        //xử lý floating button
        floatAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogAdd();
             }
        });


        return view;
    }

    private void loadData() {
        //lấy dữ liệu tu database
        ArrayList<SinhVienModel> list = sinhVienDAO.getDs();

        //hiện thị
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        SinhVienAdapter sinhVienAdapter = new SinhVienAdapter(getContext(), list, sinhVienDAO);
        recyclerView.setAdapter(sinhVienAdapter);
    }

    private void showDialogAdd() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_add, null);
        builder.setView(view);

        AlertDialog alertDialog = builder.create();
        alertDialog.setCancelable(false);
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        alertDialog.show();

        //ánh xạ và xử lí
        EditText edMaSV = view.findViewById(R.id.ed_ma_sv);
        EditText edTenSV = view.findViewById(R.id.ed_ten_sv);
        EditText edDiemSV = view.findViewById(R.id.ed_diem_sv);
        Button btThem = view.findViewById(R.id.bt_them);
        Button btHuy = view.findViewById(R.id.bt_huy);

        //xử lý btThem
        btThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String maSV = edMaSV.getText().toString();
                String tenSV = edTenSV.getText().toString();
                String diemSV = edDiemSV.getText().toString();

                if (tenSV.isEmpty() || diemSV.isEmpty() || maSV.isEmpty()) {
                    Toast.makeText(getContext(), "Vui lòng nhập đủ dữ liệu", Toast.LENGTH_SHORT).show();
                }
                if (Float.parseFloat(diemSV) < 0 || Float.parseFloat(diemSV) > 10) {
                    Toast.makeText(getContext(), "Điểm của sinh viên phải nằm trong khoảng từ 1 - 10", Toast.LENGTH_SHORT).show();
                }
                else {
                    SinhVienModel sinhVienModel = new SinhVienModel(maSV, tenSV, Float.parseFloat(diemSV));
                    boolean check = sinhVienDAO.addSV(sinhVienModel);
                    if (check) {
                        Toast.makeText(getContext(), "Thêm thành công", Toast.LENGTH_SHORT).show();
                        loadData();
                        alertDialog.dismiss();
                    }
                    else {
                        Toast.makeText(getContext(), "Thêm thất bại", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        //xử lý btHuy
        btHuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });
    }
}