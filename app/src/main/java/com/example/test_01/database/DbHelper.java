package com.example.test_01.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {
    //tạo database sql
    public DbHelper(Context context){
        super(context, "SINHVIEN.db", null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        //tạo table
     String createSinhVien = "CREATE TABLE SINHVIEN (" +
             "MASV TEXT PRIMARY KEY," +
             "TENSV TEXT," +
             "DIEM FLOAT)";
     sqLiteDatabase.execSQL(createSinhVien);
        //tạo data mẫu
        String addSinhVien = "INSERT INTO SINHVIEN VALUES" +
                " ('PH36461', 'Nguyễn Quang Thái', 10)," +
                " ('PH36462', 'Trần Văn A', 8), " +
                "('PH36463', 'Trần Văn B', 7)," +
                " ('PH36466', 'Trần Văn C', 9)," +
                " ('PH36434', 'Trần Văn D', 8.5)";
        sqLiteDatabase.execSQL(addSinhVien);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
       if (oldVersion != newVersion) {
           sqLiteDatabase.execSQL("DROP TABLE IF EXISTS SINHVIEN");
           onCreate(sqLiteDatabase);
       }
    }
}
