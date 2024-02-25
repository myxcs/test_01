package com.example.test_01.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {
    //tạo database sql
    private Context context;
    private static final String DATABASE_NAME = "SINHVIEN.DB";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_USER = "USER";

    //tạo constructor
    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        //tạo table
        String Sinhvien = "CREATE TABLE SINHVIEN (MASV INTEGER PRIMARY KEY AUTOINCREMENT, TENSV TEXT, DIEMSV INTEGER)";
        sqLiteDatabase.execSQL(Sinhvien);


        //tạo data mẫu
        String InsertSinhvien = "INSERT INTO SINHVIEN VALUES (1, 'Nguyễn Quang Thái', 10), (2, 'Trần Văn A', 8), (3, 'Trần Văn B', 7), (4, 'Trần Văn C', 9), (5, 'Trần Văn D', 8)";
        sqLiteDatabase.execSQL(InsertSinhvien);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
       if (i != i1) {
           sqLiteDatabase.execSQL("DROP TABLE IF EXISTS SINHVIEN");
           onCreate(sqLiteDatabase);
       }
    }
}
