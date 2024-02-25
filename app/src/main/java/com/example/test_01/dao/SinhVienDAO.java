package com.example.test_01.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.test_01.database.DbHelper;
import com.example.test_01.model.SinhVienModel;

import java.util.ArrayList;

public class SinhVienDAO {
    private DbHelper dbHelper;
    public SinhVienDAO(Context context)
    {
        dbHelper = new DbHelper(context);

    }

    //lấy danh sách sản phẩm
    public ArrayList<SinhVienModel> getDs(){
        SQLiteDatabase sqLiteDatabase = dbHelper.getReadableDatabase();
        ArrayList<SinhVienModel> list = new ArrayList<>();
        Cursor cursor =  sqLiteDatabase.rawQuery("SELECT * FROM SINHVIEN", null);
        if(cursor.getCount()>0){
           cursor.moveToFirst();
           do {
               list.add(new SinhVienModel(cursor.getString(0), cursor.getString(1), cursor.getInt(2)));
           }while (cursor.moveToNext());
        }
        return list;
    }
}
