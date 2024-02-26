package com.example.test_01.adapter;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test_01.R;
import com.example.test_01.dao.SinhVienDAO;
import com.example.test_01.model.SinhVienModel;

import java.util.ArrayList;

public class SinhVienAdapter extends RecyclerView.Adapter<SinhVienAdapter.ViewHolder> {

    private Context context;
    private ArrayList<SinhVienModel> list;
    private SinhVienDAO sinhVienDAO;

    public SinhVienAdapter(Context context, ArrayList<SinhVienModel> list, SinhVienDAO sinhVienDAO) {
        this.context = context;
        this.list = list;
        this.sinhVienDAO = sinhVienDAO;
    }

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

        //sửa sản phẩm
        holder.btEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialogUpdate(list.get(holder.getAdapterPosition()));

            }
        });

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
    private void showDialogUpdate(SinhVienModel sinhVienModel) {

        //build dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        LayoutInflater inflater = ((Activity)context).getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_update, null);
        builder.setView(view);

        //hien thi dialog
        AlertDialog alertDialog = builder.create();
        alertDialog.setCancelable(false);
        alertDialog.show();
        alertDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

        //ánh xạ
        EditText edtMaSV = view.findViewById(R.id.ed_ma_sv);
        EditText edtTenSV = view.findViewById(R.id.ed_ten_sv);
        EditText edtDiemSV = view.findViewById(R.id.ed_diem_sv);

        Button btnUpdate = view.findViewById(R.id.btn_update);
        Button btnCancel = view.findViewById(R.id.btn_cancel);

        //đưa dữ liệu vào sv cần sửa
        edtMaSV.setText(sinhVienModel.getMasv());
        edtTenSV.setText(sinhVienModel.getTensv());
        edtDiemSV.setText(String.valueOf(sinhVienModel.getDiem()));

        //xử lý sửa
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String maSV = edtMaSV.getText().toString();
                String tenSV = edtTenSV.getText().toString();
                String diemSV = edtDiemSV.getText().toString();

                if (tenSV.isEmpty() || diemSV.isEmpty() || maSV.isEmpty()) {
                    Toast.makeText(context, "Vui lòng nhập đủ dữ liệu", Toast.LENGTH_SHORT).show();
                }
                if (Float.parseFloat(diemSV) < 0 || Float.parseFloat(diemSV) > 10) {
                    Toast.makeText(context, "Điểm của sinh viên phải nằm trong khoảng từ 1 - 10", Toast.LENGTH_SHORT).show();
                }
                else {
                    SinhVienModel updateSinhVienModel = new SinhVienModel(maSV, tenSV, Float.parseFloat(diemSV));
                    boolean check = sinhVienDAO.updateSV(updateSinhVienModel);

                    if (check) {
                        Toast.makeText(context, "Sửa thành công", Toast.LENGTH_SHORT).show();

                        //load lại danh sách sản phẩm sau khi sửa
                        list.clear();
                        list = sinhVienDAO.getDs();
                        notifyDataSetChanged();

                        alertDialog.dismiss();
                    }
                    else {
                        Toast.makeText(context, "Sửa thất bại", Toast.LENGTH_SHORT).show();
                        alertDialog.dismiss();
                    }

                }
            }
        });

        //xử lý hủy
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.dismiss();
            }
        });
    }
}
