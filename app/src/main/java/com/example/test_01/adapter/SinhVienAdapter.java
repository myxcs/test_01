package com.example.test_01.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test_01.R;
import com.example.test_01.model.SinhVienModel;

import java.util.ArrayList;

public class SinhVienAdapter extends RecyclerView.Adapter<SinhVienAdapter.ViewHolder> {

    private Context context;
    private ArrayList<SinhVienModel> list;

    public SinhVienAdapter(Context context, ArrayList<SinhVienModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = ((Activity)context).getLayoutInflater();
        View view = inflater.inflate(R.layout.item_sinh_vien, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.tvMaSV.setText(list.get(position).getMasv());
        holder.tvTenSV.setText(list.get(position).getTensv());
        holder.tvDiemSV.setText(String.valueOf(list.get(position).getDiem()));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvMaSV, tvTenSV, tvDiemSV;
        ImageView btDelete, btEdit;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvMaSV = itemView.findViewById(R.id.tv_ma_sv);
            tvTenSV = itemView.findViewById(R.id.tv_ten_sv);
            tvDiemSV = itemView.findViewById(R.id.tv_diem_sv);

            btDelete = itemView.findViewById(R.id.bt_delete);
            btEdit = itemView.findViewById(R.id.bt_edit);
        }
    }
}
