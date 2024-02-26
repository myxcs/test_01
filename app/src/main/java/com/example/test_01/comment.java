package com.example.test_01;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.test_01.adapter.SinhVienAdapter;
import com.example.test_01.fragment.DanhSachFragment;
import com.example.test_01.fragment.ThongTinFragment;
import com.example.test_01.model.SinhVienModel;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class comment {
    //tạo database
    //tạo package
    //tạo class
    //database - DbHelper
    //extend SQLiteOpenHelper cho class DbHelper
    //implement onCreate và onUpgrade cho class DbHelper
    //tạo constructor cho class DbHelper va truyền vào context

    //b1 tạo database
    //    //tạo database sql
    //    public DbHelper(Context context){
    //        super(context, "SINHVIEN.db", null, 1);
    //    }





    //b2 xử lý
    //xử lý trong onCreate

    // //tạo table
    //     String createSinhVien = "CREATE TABLE SINHVIEN (" +
    //             "MASV TEXT PRIMARY KEY," +
    //             "TENSV TEXT," +
    //             "DIEM INTEGER)";
    //     sqLiteDatabase.execSQL(createSinhVien);
    //        //tạo data mẫu
    //        String addSinhVien = "INSERT INTO SINHVIEN VALUES" +
    //                " ('PH36461', 'Nguyễn Quang Thái', 10)," +
    //                " ('PH36462', 'Trần Văn A', 8), " +
    //                "('PH36463', 'Trần Văn B', 7)," +
    //                " ('PH36466', 'Trần Văn C', 9)," +
    //                " ('PH36434', 'Trần Văn D', 8)";
    //        sqLiteDatabase.execSQL(addSinhVien);
    //
    //    }

    //xử lý trong onUpgrade
//  @Override
//    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
//       if (oldVersion != newVersion) {
//           sqLiteDatabase.execSQL("DROP TABLE IF EXISTS SINHVIEN");
//           onCreate(sqLiteDatabase);
//       }
//    }

    //b3 tạo giao diện
    //trong activity_main


//    <?xml version="1.0" encoding="utf-8"?>
//<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
//    xmlns:app="http://schemas.android.com/apk/res-auto"
//    xmlns:tools="http://schemas.android.com/tools"
//    android:orientation="vertical"
//    android:layout_width="match_parent"
//    android:background="#673AB7"
//    android:layout_height="match_parent"
//    tools:context=".MainActivity">
//
//    <com.google.android.material.tabs.TabLayout
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:id="@+id/tab_layout">
//        <com.google.android.material.tabs.TabItem
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:text="Danh sách sinh viên"/>
//        <com.google.android.material.tabs.TabItem
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:text="Thông tin"/>
//    </com.google.android.material.tabs.TabLayout>
//
//    <androidx.viewpager2.widget.ViewPager2
//    android:layout_width="match_parent"
//    android:layout_height="match_parent"
//    android:id="@+id/view_pager"/>
//
//</LinearLayout>


    //b4 tạo fragment
    //tạo Adapter cho view_pager
    //cho Adapter kế thừa FragmentStateAdapter
    //implement createFragment(int position) và getItemCount()

//    @NonNull
//    @Override
//    public Fragment createFragment(int position) {
//        switch (position){
//            case 0:
//                return new DanhSachFragment();
//            case 1:
//                return new ThongTinFragment();
//            default:
//                return new DanhSachFragment();
//        };
//    }
//
//    @Override
//    public int getItemCount() {
//        return 2; //số lượng fragment
//    }

    //tạo contructor matching super cho class FragmentStateAdapter
    //fragmentActivity

//b5 ánh xạ TabLayout, ViewPager2,Adapter vào MainActivity
    //set Adapter cho view_pager
    //set tabLayout.addOnTabSelectedListener

//            tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//        @Override
//        public void onTabSelected(TabLayout.Tab tab) {
//            viewPager2.setCurrentItem(tab.getPosition());
//        }
//
//        @Override
//        public void onTabUnselected(TabLayout.Tab tab) {
//
//        }
//
//        @Override
//        public void onTabReselected(TabLayout.Tab tab) {
//
//        }
//
//    });

    //b6 update callback cho viewPager2

    //viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
    //            @Override
    //            public void onPageSelected(int position) {
    //                super.onPageSelected(position);
    //                tabLayout.selectTab(tabLayout.getTabAt(position));
    //            }
    //        });

//b7 tạo floating button và recycler view trong fragment_danh_sach

//<?xml version="1.0" encoding="utf-8"?>
//<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
//    xmlns:tools="http://schemas.android.com/tools"
//    android:layout_width="match_parent"
//    android:layout_height="match_parent"
//    android:background="#F44336"
//    tools:context=".fragment.DanhSachFragment">
//
//   <androidx.recyclerview.widget.RecyclerView
//       android:layout_width="match_parent"
//       android:layout_height="match_parent"
//       android:id="@+id/recycler_view"/>
//
//    <com.google.android.material.floatingactionbutton.FloatingActionButton
//        android:layout_width="wrap_content"
//        android:layout_height="wrap_content"
//        android:layout_alignParentBottom="true"
//        android:layout_alignParentEnd="true"
//        android:layout_margin="30dp"
//        android:id="@+id/float_add"
//        android:src="@drawable/ic_add"/>
//
//</RelativeLayout>

//ánh xạ recyclerView, floating button trong fragment_danh_sach

    //b8 tạo SinhVienDAO

    //  private DbHelper dbHelper;
    //    public SinhVienDAO(Context context)
    //    {
    //        dbHelper = new DbHelper(context);
    //
    //    }


    //b9 tạo model sinh viên
    //tạo contractor  và getter setter cho SinhVienModel


    //b10 lấy danh sách sinh viên


    //public ArrayList<SinhVienModel> getDs(){
    //        SQLiteDatabase sqLiteDatabase = dbHelper.getReadableDatabase();
    //        ArrayList<SinhVienModel> list = new ArrayList<>();
    //        Cursor cursor =  sqLiteDatabase.rawQuery("SELECT * FROM SINHVIEN", null);
    //        if(cursor.getCount()>0){
    //           cursor.moveToFirst();
    //           do {
    //                 list.add(new SinhVienModel(cursor.getString(0), cursor.getString(1), cursor.getFloat(2)));
    //           }while (cursor.moveToNext());
    //        }
    //        return list;
    //    }


    //b11 tạo một layout item_sinh_vien sử dụng CardView
    //mẫu

    //<?xml version="1.0" encoding="utf-8"?>
    //<androidx.cardview.widget.CardView xmlns:android="http://schemas.android.com/apk/res/android"
    //    android:layout_width="match_parent"
    //    android:layout_height="wrap_content"
    //    xmlns:app="http://schemas.android.com/apk/res-auto"
    //    app:cardCornerRadius="15sp"
    //    android:layout_margin="10dp">
    //
    //    <LinearLayout
    //        android:weightSum="2"
    //        android:layout_width="match_parent"
    //        android:layout_height="match_parent"
    //        android:orientation="horizontal">
    //
    //        <LinearLayout
    //            android:layout_weight="1"
    //            android:layout_width="match_parent"
    //            android:layout_height="match_parent"
    //            android:layout_marginLeft="20dp"
    //            android:orientation="vertical">
    //            <TextView
    //                android:layout_width="wrap_content"
    //                android:layout_height="wrap_content"
    //                android:id="@+id/tv_masv"
    //                android:text="Mã sinh viên"
    //                android:textSize="20dp"
    //                android:textColor="@color/black"
    //                />
    //            <TextView
    //                android:layout_marginVertical="5dp"
    //                android:layout_width="wrap_content"
    //                android:layout_height="wrap_content"
    //                android:id="@+id/tv_tensv"
    //                android:text="Tên sinh viên"
    //                android:textStyle="bold"
    //                android:textSize="20dp"
    //                android:textColor="@color/black"
    //                />
    //            <TextView
    //                android:layout_width="wrap_content"
    //                android:layout_height="wrap_content"
    //                android:id="@+id/tv_diem"
    //                android:text="Điểm"
    //                android:textSize="20dp"
    //                android:textColor="@color/black"
    //                />
    //        </LinearLayout>
    //
    //        <LinearLayout
    //            android:layout_weight="1"
    //            android:layout_width="match_parent"
    //            android:layout_height="match_parent"
    //            android:gravity="end"
    //            android:orientation="horizontal">
    //
    //            <ImageView
    //                android:id="@+id/bt_delete"
    //                android:layout_gravity="center_vertical"
    //                android:layout_width="30dp"
    //                android:layout_height="30dp"
    //                android:src="@drawable/ic_delete"/>
    //            <ImageView
    //                android:id="@+id/bt_edit"
    //                android:layout_margin="20dp"
    //                android:layout_gravity="center_vertical"
    //                android:layout_width="30dp"
    //                android:layout_height="30dp"
    //                android:src="@drawable/ic_edit"/>
    //        </LinearLayout>
    //
    //    </LinearLayout>
    //</androidx.cardview.widget.CardView>


    //b12 tạo adapter cho recyclerView (SinhVienAdapter)
    //tạo class ViewHolder extends RecyclerView.ViewHolder
    //thêm constructor match super

    //b13 public class SinhVienAdapter extends RecyclerView.Adapter<SinhVienAdapter.ViewHolder>
    //implement all method

    //tạo context và arryList cho SinhVienAdapter

    //    private Context context;
    //    private ArrayList<SinhVienModel> list;
    //
    //    public SinhVienAdapter(Context context, ArrayList<SinhVienModel> list) {
    //        this.context = context;
    //        this.list = list;
    //    }

    //b14trong phần ViewHolder onCreateViewHolder

    //        LayoutInflater inflater = ((Activity)context).getLayoutInflater();
    //        View view = inflater.inflate(R.layout.item_sinh_vien, parent, false);
    //
    //        return new ViewHolder(view);

    //b15 ánh xạ trong phần ViewHolder

    //   public class ViewHolder extends RecyclerView.ViewHolder {
    //
    //        TextView tvMaSV, tvTenSV, tvDiemSV;
    //        ImageView btDelete, btEdit;
    //
    //        public ViewHolder(@NonNull View itemView) {
    //            super(itemView);
    //
    //            tvMaSV = itemView.findViewById(R.id.tv_ma_sv);
    //            tvTenSV = itemView.findViewById(R.id.tv_ten_sv);
    //            tvDiemSV = itemView.findViewById(R.id.tv_diem_sv);
    //
    //            btDelete = itemView.findViewById(R.id.bt_delete);
    //            btEdit = itemView.findViewById(R.id.bt_edit);
    //        }
    //    }

    //b16 trong phần getItemCount
   //@Override
    //    public int getItemCount() {
    //        return list.size();
    //    }

    //b17 trong phần onBindViewHolder
    //@Override
    //    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    //
    //        holder.tvMaSV.setText(list.get(position).getMasv());
    //        holder.tvTenSV.setText(list.get(position).getTensv());
    //        holder.tvDiemSV.setText(String.valueOf(list.get(position).getDiem()));
    //    }

    //b18 thêm SinhVienDAO vào DanhSachFragment

    //private SinhVienDAO sinhVienDAO;

    //b19   lấy danh sách

//    sinhVienDAO = new SinhVienDAO(getContext());

    //b20    tạo hàm lấy dữ liệu và load loại data trong DanhSachFragment

//    private void loadData() {
//        //lấy dữ liệu tu database
//        ArrayList<SinhVienModel> list = sinhVienDAO.getDs();
//
//        //hiện thị
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
//        recyclerView.setLayoutManager(linearLayoutManager);
//        SinhVienAdapter sinhVienAdapter = new SinhVienAdapter(getContext(), list);
//        recyclerView.setAdapter(sinhVienAdapter);
//    }

//b21 tạo dialog thêm sử dụng cardView


    //<?xml version="1.0" encoding="utf-8"?>
    //<androidx.cardview.widget.CardView xmlns:android="http://schemas.android.com/apk/res/android"
    //    xmlns:app="http://schemas.android.com/apk/res-auto"
    //    app:cardCornerRadius="10dp"
    //    android:layout_width="match_parent"
    //    android:layout_height="wrap_content">
    //
    //    <LinearLayout
    //        android:orientation="vertical"
    //        android:layout_width="match_parent"
    //        android:layout_height="match_parent">
    //        <TextView
    //            android:layout_width="match_parent"
    //            android:layout_height="wrap_content"
    //            android:text="Thêm Sinh Viên"
    //            android:gravity="center"
    //            android:textSize="30dp"
    //            android:textStyle="bold"/>
    //
    //        <EditText
    //            android:layout_marginTop="20dp"
    //            android:id="@+id/ed_ma_sv"
    //            android:layout_marginHorizontal="20dp"
    //            android:hint="Mã sinh viên"
    //            android:layout_width="match_parent"
    //            android:layout_height="wrap_content" />
    //
    //        <EditText
    //            android:id="@+id/ed_ten_sv"
    //            android:layout_marginHorizontal="20dp"
    //            android:hint="Tên sinh viên"
    //            android:layout_width="match_parent"
    //            android:layout_height="wrap_content"
    //            />
    //        <EditText
    //            android:id="@+id/ed_diem_sv"
    //            android:layout_marginHorizontal="20dp"
    //            android:hint="Điểm"
    //            android:layout_width="match_parent"
    //            android:layout_height="wrap_content"
    //            />
    //
    //        <LinearLayout
    //            android:layout_marginVertical="20dp"
    //            android:layout_marginHorizontal="10dp"
    //            android:layout_marginTop="30dp"
    //            android:layout_gravity="center"
    //            android:layout_width="match_parent"
    //            android:layout_height="wrap_content"
    //            android:weightSum="2"
    //            android:orientation="horizontal">
    //
    //            <Button
    //                android:backgroundTint="#4CAF50"
    //                android:layout_gravity="center"
    //                android:layout_weight="1"
    //                android:id="@+id/bt_them"
    //                android:layout_marginHorizontal="50dp"
    //                android:text="Thêm"
    //                android:layout_width="wrap_content"
    //                android:layout_height="wrap_content"/>
    //            <Button
    //                android:layout_weight="1"
    //                android:layout_gravity="center"
    //                android:backgroundTint="#FF9800"
    //                android:layout_marginHorizontal="50dp"
    //                android:id="@+id/bt_huy"
    //                android:text="Hủy"
    //                android:layout_width="wrap_content"
    //                android:layout_height="wrap_content"/>
    //
    //        </LinearLayout>
    //
    //
    //
    //    </LinearLayout>
    //
    //</androidx.cardview.widget.CardView>


    //b22 tạo hàm hiện thị dialog, ánh xạ và xử lí trong DanhSachFragment vào gọi hàm này trong floatAdd
  //    private void showDialogAdd() {
    //        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
    //        LayoutInflater inflater = getLayoutInflater();
    //        View view = inflater.inflate(R.layout.dialog_add, null);
    //        builder.setView(view);
    //
    //        AlertDialog alertDialog = builder.create();
            // ngăn người dùng nhấn ra ngoài
    //        alertDialog.setCancelable(false);
    //        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    //        alertDialog.show();
    //
    //        //ánh xạ và xử lí
    //        EditText edMaSV = view.findViewById(R.id.ed_ma_sv);
    //        EditText edTenSV = view.findViewById(R.id.ed_ten_sv);
    //        EditText edDiemSV = view.findViewById(R.id.ed_diem_sv);
    //        Button btThem = view.findViewById(R.id.bt_them);
    //        Button btHuy = view.findViewById(R.id.bt_huy);
    //
    //        //xử lý btThem
    //        btThem.setOnClickListener(new View.OnClickListener() {
    //            @Override
    //            public void onClick(View v) {
    //                String maSV = edMaSV.getText().toString();
    //                String tenSV = edTenSV.getText().toString();
    //                String diemSV = edDiemSV.getText().toString();
    //
    //                if (tenSV.isEmpty() || diemSV.isEmpty() || maSV.isEmpty()) {
    //                    Toast.makeText(getContext(), "Vui lòng nhập đủ dữ liệu", Toast.LENGTH_SHORT).show();
    //                }
    //                if (Float.parseFloat(diemSV) < 0 || Float.parseFloat(diemSV) > 10) {
    //                    Toast.makeText(getContext(), "Điểm của sinh viên phải nằm trong khoảng từ 1 - 10", Toast.LENGTH_SHORT).show();
    //                }
    //                else {
    //                    SinhVienModel sinhVienModel = new SinhVienModel(maSV, tenSV, Float.parseFloat(diemSV));
    //                    boolean check = sinhVienDAO.addSV(sinhVienModel);
    //                    if (check) {
    //                        Toast.makeText(getContext(), "Thêm thành công", Toast.LENGTH_SHORT).show();

                          //dùng hàm loadData() trong DanhSachFragment để load lai dữ liệu
    //                        loadData();
    //                        alertDialog.dismiss();
    //                    }
    //                    else {
    //                        Toast.makeText(getContext(), "Thêm thất bại", Toast.LENGTH_SHORT).show();
    //                    }
    //                }
    //            }
    //        });
    //
    //        //xử lý btHuy
    //        btHuy.setOnClickListener(new View.OnClickListener() {
    //            @Override
    //            public void onClick(View v) {
    //                alertDialog.dismiss();
    //            }
    //        });
    //    }

    //b23 thực hiện chỉnh sửa
    // tạo một dialog chỉnh sửa dựa theo dialog thêm
    //
    //b24 trong phần SinhVienDAO tạo thêm một hàm để sửa thông tin Sinh viên

    //public boolean updateSV(SinhVienModel sinhVienModel){
    //        SQLiteDatabase sqliteDatabase = dbHelper.getWritableDatabase();
    //        ContentValues values = new ContentValues();
    //        values.put("MASV", sinhVienModel.getMasv());
    //        values.put("TENSV", sinhVienModel.getTensv());
    //        values.put("DIEM", sinhVienModel.getDiem());
    //
    //        int check = sqliteDatabase.update("SINHVIEN", values, "MASV=?", new String[]{sinhVienModel.getMasv()});
    //        if(check == 0){
    //            return false;
    //        }
    //        return true;
    //    }

    //b25 hiện thị dialog sửa
    //trong phần SinhVienAdapter ở phần onBindViewHolder gọi tới nút sửa
    //
    // holder.btEdit.setOnClickListener(new View.OnClickListener() {
    //            @Override
    //            public void onClick(View view) {
    //                showDialogUpdate(list.get(holder.getAdapterPosition()));

    //                  //hàm này phải sử dụng list.get(holder.getAdapterPosition()) để lấy vị trí
    //            }
    //        });


    //b26 tạo hàm showDialogUpdate để thực hiện hiện thị và chỉnh sửa
    //
    //    private void showDialogUpdate(SinhVienModel sinhVienModel) {
    //
    //        //build dialog
    //        AlertDialog.Builder builder = new AlertDialog.Builder(context);
    //        LayoutInflater inflater = ((Activity)context).getLayoutInflater();
    //        View view = inflater.inflate(R.layout.dialog_update, null);
    //        builder.setView(view);
    //
    //        //hien thi dialog
    //        AlertDialog alertDialog = builder.create();
    //        alertDialog.setCancelable(false);
    //        alertDialog.show();
    //        alertDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
    //
    //        //ánh xạ
    //        EditText edtMaSV = view.findViewById(R.id.ed_ma_sv);
    //        EditText edtTenSV = view.findViewById(R.id.ed_ten_sv);
    //        EditText edtDiemSV = view.findViewById(R.id.ed_diem_sv);
    //
    //        Button btnUpdate = view.findViewById(R.id.btn_update);
    //        Button btnCancel = view.findViewById(R.id.btn_cancel);
    //
    //        //đưa dữ liệu vào sv cần sửa
    //        edtMaSV.setText(sinhVienModel.getMasv());
    //        edtTenSV.setText(sinhVienModel.getTensv());
    //        edtDiemSV.setText(String.valueOf(sinhVienModel.getDiem()));
    //
    //        //xử lý sửa
    //        btnUpdate.setOnClickListener(new View.OnClickListener() {
    //            @Override
    //            public void onClick(View view) {
    //                String maSV = edtMaSV.getText().toString();
    //                String tenSV = edtTenSV.getText().toString();
    //                String diemSV = edtDiemSV.getText().toString();
    //
    //                if (tenSV.isEmpty() || diemSV.isEmpty() || maSV.isEmpty()) {
    //                    Toast.makeText(context, "Vui lòng nhập đủ dữ liệu", Toast.LENGTH_SHORT).show();
    //                }
    //                if (Float.parseFloat(diemSV) < 0 || Float.parseFloat(diemSV) > 10) {
    //                    Toast.makeText(context, "Điểm của sinh viên phải nằm trong khoảng từ 1 - 10", Toast.LENGTH_SHORT).show();
    //                }
    //                else {
    //                    SinhVienModel updateSinhVienModel = new SinhVienModel(maSV, tenSV, Float.parseFloat(diemSV));
    //                    boolean check = sinhVienDAO.updateSV(updateSinhVienModel);
    //
    //                    if (check) {
    //                        Toast.makeText(context, "Sửa thành công", Toast.LENGTH_SHORT).show();
    //
    //                        //load lại danh sách sản phẩm sau khi sửa
    //                        list.clear();
    //                        list = sinhVienDAO.getDs();
    //                        notifyDataSetChanged();
    //
    //                        alertDialog.dismiss();
    //                    }
    //                    else {
    //                        Toast.makeText(context, "Sửa thất bại", Toast.LENGTH_SHORT).show();
    //                        alertDialog.dismiss();
    //                    }
    //
    //                }
    //            }
    //        });
    //
    //        //xử lý hủy
    //        btnCancel.setOnClickListener(new View.OnClickListener() {
    //            @Override
    //            public void onClick(View view) {
    //                alertDialog.dismiss();
    //            }
    //        });
    //    }

    //b27 lưu ý, vì phần sửa cần phần SinhVienDAO

    //nên ta thêm phầm này vào trong phần SinhVienAdapter
    // private SinhVienDAO sinhVienDAO;

    //ta thực hiện khởi to lại constructor trong phần SinhVienAdapter
    //
    //  public SinhVienAdapter(Context context, ArrayList<SinhVienModel> list, SinhVienDAO sinhVienDAO) {
    //        this.context = context;
    //        this.list = list;
    //        this.sinhVienDAO = sinhVienDAO;
    //    }

    //trong hàm loadData() ở DanhSachFragment ta thay đổi

    //SinhVienAdapter sinhVienAdapter = new SinhVienAdapter(getContext(), list, sinhVienDAO);


    //b28 xóa Sinh viên
    //trong phầm SinhVienDAO hàm deleteSV()

    //    public boolean deleteSV(String masv){
    //        SQLiteDatabase sqliteDatabase = dbHelper.getWritableDatabase();
    //        int check = sqliteDatabase.delete("SINHVIEN", "MASV=?", new String[]{masv});
    //        if(check == 0){
    //            return false;
    //        }
    //        return true;
    //    }

    //b29 trong phần SinhVienAdapter thực hiện sự kiện nút delete để xóa
    //
    //holder.btDelete.setOnClickListener(new View.OnClickListener() {
    //            @Override
    //            public void onClick(View view) {

    //                //tạo hàm showDialogDelete để hiện thị và thực hiện  xóa Sv
    //                                showDialogDelete(list.get(holder.getAdapterPosition()).getTensv(), list.get(holder.getAdapterPosition()).getMasv());
    //            }
    //        });

    //b30 tạo hàm showDialogDelete và hàm loadDanhSach()

    //    private void showDialogDelete(String tenSV, String maSV) {
    //
    //        //build dialog
    //        AlertDialog.Builder builder = new AlertDialog.Builder(context);
    //        builder.setTitle("Thông báo");
    //        builder.setMessage("Xóa sinh viên "+tenSV+" ?");
    //    //add vector icon
     //       builder.setIcon(R.drawable.ic_caution);
    //        builder.setCancelable(false);
    //
    //        //setPositiveButton và setNegativeButton
    //
    //        builder.setPositiveButton("Xóa", new DialogInterface.OnClickListener() {
    //            @Override
    //            public void onClick(DialogInterface dialogInterface, int i) {
    //                boolean check = sinhVienDAO.deleteSV(maSV);
    //                if (check) {
    //                    Toast.makeText(context, "Xóa thành công", Toast.LENGTH_SHORT).show();
    //                    //load lại danh sách
    //                    loadDanhSach();
    //
    //                } else {
    //                    Toast.makeText(context, "Xóa không thành công", Toast.LENGTH_SHORT).show();
    //                }
    //            }
    //        });
    //        builder.setNegativeButton("Hủy", null);
    //        AlertDialog alertDialog = builder.create();
    //        alertDialog.show();
    //
    //
    //    }

    //hàm loadDanhSach

    // private void loadDanhSach() {
    //            list.clear();
    //            list = sinhVienDAO.getDs();
    //            notifyDataSetChanged();
    //        }

    //cautious !!!
    //app bị lỗi phần chỉnh sửa do nó sử dụng id để sửa, nhớ fix ở nhưng phiên bản sau









}
