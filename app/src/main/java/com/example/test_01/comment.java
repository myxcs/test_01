package com.example.test_01;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.test_01.fragment.DanhSachFragment;
import com.example.test_01.fragment.ThongTinFragment;
import com.google.android.material.tabs.TabLayout;

public class comment {
    //tạo database
    //tạo package
    //tạo class
    //database - DbHelper
    //extend SQLiteOpenHelper cho class DbHelper
    //implement onCreate và onUpgrade cho class DbHelper
    //tạo constructor cho class DbHelper va truyền vào context

//    private Context context;
//    private static final String DATABASE_NAME = "sinhvien.db";
//    private static final int DATABASE_VERSION = 1;
//    public DbHelper(Context context) {
//        super(context, DATABASE_NAME, null, DATABASE_VERSION);
//        this.context = context;
//    }

    //b2 xử lý
    //xử lý trong onCreate

//    @Override
//    public void onCreate(SQLiteDatabase sqLiteDatabase) {
//
//        String Sinhvien = "CREATE TABLE SINHVIEN (MASV INTEGER PRIMARY KEY AUTOINCREMENT, TENSV TEXT, DIEMSV INTEGER)";
//        sqLiteDatabase.execSQL(Sinhvien);

    //    //tạo data mẫu
    //        String InsertSinhvien = "INSERT INTO SINHVIEN VALUES (1, 'Nguyễn Quang Thái', 10), (2, 'Trần Văn A', 8), (3, 'Trần Văn B', 7), (4, 'Trần Văn C', 9), (5, 'Trần Văn D', 8)";
    //        sqLiteDatabase.execSQL(InsertSinhvien);
//    }

    //xử lý trong onUpgrade
//    @Override
//    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
//        if (i != i1) {
//            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS SINHVIEN");
//            onCreate(sqLiteDatabase);
//        }
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
    //               list.add(new SinhVienModel(cursor.getInt(0), cursor.getString(1), cursor.getFloat(2)));
    //           }while (cursor.moveToNext());
    //        }
    //        return list;
    //    }



}
