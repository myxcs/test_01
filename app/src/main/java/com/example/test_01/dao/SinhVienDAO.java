package com.example.test_01.dao;

import android.content.ContentValues;
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
               list.add(new SinhVienModel(cursor.getString(0), cursor.getString(1), cursor.getFloat(2)));
           }while (cursor.moveToNext());
        }
        return list;
    }

    //thêm sinh viên
    public boolean addSV(SinhVienModel sinhVienModel){
        SQLiteDatabase sqliteDatabase = dbHelper.getWritableDatabase();

        //tạo một values và thêm dữ liệu vào
        ContentValues values = new ContentValues();
        values.put("MASV", sinhVienModel.getMasv());
        values.put("TENSV", sinhVienModel.getTensv());
        values.put("DIEM", sinhVienModel.getDiem());

        long check = sqliteDatabase.insert("SINHVIEN", null, values);
        if(check == -1){
            return false;
        }
        return true;
    }


    //chỉnh sửa thông tin sản phẩm
    public boolean updateSV(SinhVienModel sinhVienModel){
        SQLiteDatabase sqliteDatabase = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("MASV", sinhVienModel.getMasv());
        values.put("TENSV", sinhVienModel.getTensv());
        values.put("DIEM", sinhVienModel.getDiem());

        int check = sqliteDatabase.update("SINHVIEN", values, "MASV=?", new String[]{sinhVienModel.getMasv()});
        if(check == 0){
            return false;
        }
        return true;
    }
    public boolean deleteSV(String masv){
        SQLiteDatabase sqliteDatabase = dbHelper.getWritableDatabase();
        int check = sqliteDatabase.delete("SINHVIEN", "MASV=?", new String[]{masv});
        if(check == 0){
            return false;
        }
        return true;
    }
}
